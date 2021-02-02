public class CalTest{
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setOperandOne(10.5);
        cal.setOperation("+");
        cal.setOperandTwo(5.2);
        cal.performOperation();
        System.out.println("Result is: " +  cal.getResult());


    }
}