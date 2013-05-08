package kr.swmaestro.herring.dql.datatypes;

/**
 * 숫자를 대표하는 데이터 타입 클래스.
 *
 * @author Chiwan Park
 * @since 0.1
 */
public class NumberType extends BaseType<Double> {
    public NumberType() {
        this.setType("number");
    }

    public NumberType(double value) {
        this();
        this.setValue(value);
    }

    public NumberType(String stringValue) {
        this();

        double value = 0.0;

        try {
            value = Double.valueOf(stringValue);
        } catch (NumberFormatException e) {

        } finally {
            this.setValue(value);
        }
    }
}
