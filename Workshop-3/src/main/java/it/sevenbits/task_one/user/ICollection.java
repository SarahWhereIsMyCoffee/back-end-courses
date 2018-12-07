package it.sevenbits.task_one.user;

import java.io.IOException;

public interface ICollection {
    void add(User user) throws IOException;
    User get(long index) throws IOException;

}
