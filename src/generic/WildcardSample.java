package generic;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcard2();
    }

    private void callWildcard() {
     WildcardGeneric<String> wildcard = new WildcardGeneric<>();
     wildcard.setWildcard("Hi");
     //wildcardStringMethod(wildcard);
     wildcardMethod(wildcard);


    }
    private void callWildcard2() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard("Hi");
        wildcardMethod(wildcard);
        WildcardGeneric<Integer> wildcard2 = new WildcardGeneric<>();
        wildcard2.setWildcard(1000);
        wildcardMethod(wildcard2);

    }
    private void wildcardStringMethod(WildcardGeneric<String> wildcard) {
        String value = wildcard.getWildcard();
        System.out.println(value);
    }

    private void wildcardMethod(WildcardGeneric<?> wildcard) {
        Object value = wildcard.getWildcard();
        if(value instanceof String){
            System.out.println(value);
        }
        if(value instanceof Integer){
            System.out.println(String.valueOf(value));
        }

    }
}
