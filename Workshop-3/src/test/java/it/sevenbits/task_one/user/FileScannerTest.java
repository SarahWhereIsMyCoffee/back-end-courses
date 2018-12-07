package it.sevenbits.task_one.user;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import java.io.IOException;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.any;

public class FileScannerTest {
    private ICollection collection;
    private UserManager userManager;

    @Before
    public void setUp() {
        collection = mock(ICollection.class);
        userManager = new UserManager(collection);
    }

    @Test(expected = UserManagerException.class)
    public void shouldThrowExceptionAtFirst() throws UserManagerException, IOException {
        doThrow(new IOException()).when(collection).get(anyLong());
        userManager.getUserByIndex(0);
    }

    @Test (expected = UserManagerException.class)
    public void shouldThrowExceptionAtSecond() throws UserManagerException, IOException {
        doThrow(new IOException()).when(collection).add(any(User.class));
        userManager.createDefault("Jack");
    }

    @Test
    public void shouldGetUserByIndexSuccessfully() throws UserManagerException, IOException {
        final User userToReturn = new User("Jack", "The Ripper");
        doReturn(userToReturn).when(collection).get(anyLong());
        final User returnedUser = userManager.getUserByIndex(0);
        Assert.assertEquals(userToReturn.getName(), returnedUser.getName());
        Assert.assertEquals(userToReturn.getRole(), returnedUser.getRole());
    }


    @Test
    public void shouldCreateDefaultSuccessfully() throws IOException, UserManagerException {
        Answer<Object> answer = new Answer<Object>() {
            private User user;

            @Override
            public Object answer (final InvocationOnMock invocationOnMock) {
                user = invocationOnMock.getArgument(0);
                Assert.assertEquals(user.getName(), "Jack");
                Assert.assertEquals(user.getRole(), "default");
                return null;
            }
        };

        doAnswer(answer).when(collection).add(any(User.class));
        userManager.createDefault("Jack");
    }
}
