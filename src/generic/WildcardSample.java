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

    /**
     * wildcard를 파라메터로 사용하면 다양한 타입을 넣을 수 있게 된다.
     */
    private void callWildcard2() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard("Hi");
        wildcardMethod(wildcard);
        WildcardGeneric<Integer> wildcard2 = new WildcardGeneric<>();
        wildcard2.setWildcard(1000);
        wildcardMethod(wildcard2);
    }

    /**
     * wildcard타입은 메소드의 매개변수로만 사용한다.
     * 아래와 같이 쓰는 것은 올바르지 않다. 알지도 못하는 타입으로 컴파일하는 것은 불가능.
     */
    private void callWildcard3() {
        WildcardGeneric<?> wildcard = new WildcardGeneric<String>();
       // wildcard.setWildcard("Hi"); //error!
        wildcardMethod(wildcard);
    }

    private void wildcardStringMethod(WildcardGeneric<String> wildcard) {
        String value = wildcard.getWildcard();
        System.out.println(value);
    }

    /**
     *
     * instanceof 를 이용하여 Object 타입을 각각 분기할 수 있다.
     */
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
