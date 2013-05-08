package kr.swmaestro.herring.dql.datatypes;

/**
 * 변수를 대표하는 데이터 타입 클래스.
 *
 * @author Chiwan Park
 * @since 0.1
 */
public class VariableType extends BaseType<String> {
    public VariableType() {
        this.setType("variable");
    }

    public VariableType(String varName) {
        this();

        if (varName != null && varName.startsWith("@") == false)
            varName = "@".concat(varName);

        this.setValue(varName);
    }
}
