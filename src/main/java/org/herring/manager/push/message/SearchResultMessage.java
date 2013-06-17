package org.herring.manager.push.message;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class SearchResultMessage extends Message<List<Map<String, String>>> {

    public SearchResultMessage(UUID uuid) {
        super(uuid, Type.SEARCH_RESULT);
    }

}
