package kr.swmaestro.herring.dql.datatypes;

/**
 * 데이터 타입의 기본 클래스. 모든 데이터 타입은 이 클래스를 반드시 상속 받아야 한다.
 *
 * @author Chiwan Park
 * @since 0.1
 */
public abstract class BaseType<T> {
    private String type = null;
    private T value = null;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BaseType() {

    }

    public BaseType(BaseType<T> t) {
        this.type = t.getType();
        this.value = t.getValue();
    }

    public boolean isEquivalentType(BaseType<?> t) {
        String type1 = this.getType();
        String type2 = t.getType();

        // 둘 중 하나라도 변수일 경우 타입 추론이 불가능 하므로 쿼리 해석 단계에서는 무조건 동일한 타입으로 간주한다.
        if ("variable".equals(type1) || "variable".equals(type2))
            return true;

        // 타입 비교
        if (type1 != null && type1.equals(type2))
            return true;

        return false;
    }
}
