package generic;

public class Bus extends Car{
    public Bus(String name) {
        super(name);
    }

    public void getPassenger(){
        System.out.println("I can transfer many passenger");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
