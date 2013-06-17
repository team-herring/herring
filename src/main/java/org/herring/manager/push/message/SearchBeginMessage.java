package org.herring.manager.push.message;

import java.util.UUID;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public class SearchBeginMessage extends Message<String> {

    public SearchBeginMessage(UUID uuid) {
        super(uuid, Type.SEARCH_BEGIN);
    }

}
