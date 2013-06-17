package org.herring.manager.push.message;

import java.util.UUID;

/**
 * @author Chiwan Park
 * @since 0.1
 */
public abstract class Message<T> {

    private UUID uuid;
    private Type type;
    private T data;

    public enum Type {
        SEARCH_BEGIN, SEARCH_RESULT, SEARCH_END, ERROR
    }

    protected Message(UUID uuid, Type type) {
        setUUID(uuid);
        setType(type);
    }

    public UUID getUUID() {
        return uuid;
    }

    public void setUUID(UUID uuid) {
        this.uuid = uuid;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
