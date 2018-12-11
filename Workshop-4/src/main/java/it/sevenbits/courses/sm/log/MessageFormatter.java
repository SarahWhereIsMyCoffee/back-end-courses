package it.sevenbits.courses.sm.log;

import java.util.HashMap;
import java.util.Map;

public class MessageFormatter {
    private Map<String, String> typeMap;

    public MessageFormatter() {
        typeMap = new HashMap<>();

        typeMap.put("MESSAGE", "Part of message: %1$s");
        typeMap.put("TRASH", "Trash received");
        typeMap.put("MESSAGE_START", "Message creating started");
        typeMap.put("MESSAGE_FINISH", "Message creating finished");
    }

    public String getStringFormatByType(String type) {
        return typeMap.get(type);
    }
}
