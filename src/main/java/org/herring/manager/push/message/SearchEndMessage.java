package org.herring.manager.push.message;

import java.util.UUID;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class SearchEndMessage extends Message<String> {

    public SearchEndMessage(UUID uuid) {
        super(uuid, Type.SEARCH_END);
    }

}
