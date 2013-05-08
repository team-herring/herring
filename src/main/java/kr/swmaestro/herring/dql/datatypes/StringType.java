package kr.swmaestro.herring.dql.datatypes;

/**
 * 문자열 타입 상수를 대표하는 데이터 타입 클래스.
 *
 * @author Chiwan Park
 * @since 0.1
 */
public class StringType extends BaseType<String> {
    public StringType() {
        this.setType("string");
    }

    public StringType(String value) {
        this();
        this.setValue(value);
    }
}
