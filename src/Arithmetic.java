public class Arithmetic {
    private int numberA;
    private int numberB;

    public Arithmetic(int numberA, int numberB){
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public void sum(){
        System.out.println(numberA + numberB);
    }

    public void multiplication(){
        System.out.println(numberA * numberB);
    }

    public void largestNumber(){
        System.out.println(numberA > numberB ? numberA : numberB);
    }

    public void smallestNumber(){
        System.out.println(numberA < numberB ? numberA : numberB);
    }
}
