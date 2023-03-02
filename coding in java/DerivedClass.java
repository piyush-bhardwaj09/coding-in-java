class DerivedClass{
    public static void main(String[] args) {
        System.out.println("Before creating object...");
        FirstProgram myObj = new FirstProgram(10,5);
        myObj.addTwoNumbers();
        myObj.subtractTwoNumbers();
        myObj.multiplyTwoNumbers();
        myObj.divideTwoNumbers();

    }
}