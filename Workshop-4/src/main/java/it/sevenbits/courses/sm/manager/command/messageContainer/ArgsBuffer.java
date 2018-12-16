package it.sevenbits.courses.sm.manager.command.messageContainer;

public class ArgsBuffer {
    private StringBuilder stringBuilder = new StringBuilder();

    public void setMessage(String message) {
        stringBuilder.setLength(0);
        stringBuilder.append(message);
    }

    public String getMessage() {
        return stringBuilder.toString();
    }
}
