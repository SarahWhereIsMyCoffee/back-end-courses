package it.sevenbits.courses.sm.manager.command.messageContainer;

public class MessageBuffer {
    private StringBuilder stringBuilder;

    public MessageBuffer() {
        stringBuilder = new StringBuilder();
    }

    public void append(String message) {
        stringBuilder.append(message);
    }

    public void clear() {
        stringBuilder.setLength(0);
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
