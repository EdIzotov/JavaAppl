package vasya;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;

public class TestClass {
    public static void main(String[] args) {
        RuleBasedNumberFormat ruleBasedNumberFormat = new RuleBasedNumberFormat( new Locale("EN", "US"), RuleBasedNumberFormat.SPELLOUT );
        System.out.println(ruleBasedNumberFormat.format(452345));

    }
}
