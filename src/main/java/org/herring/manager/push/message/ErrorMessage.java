package org.herring.manager.push.message;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class ErrorMessage extends Message<Map<String, Object>> {

    public ErrorMessage(UUID uuid, Boolean reconnect, String message) {
        super(uuid, Type.ERROR);

        Map<String, Object> dataMap = new HashMap<String, Object>();

        dataMap.put("reconnect", reconnect);
        dataMap.put("message", message);

        setData(dataMap);
    }

}
