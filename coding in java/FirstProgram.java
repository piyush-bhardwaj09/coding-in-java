class FirstProgram{
int a,b=0;
    FirstProgram(int a, int b){
        System.out.println("This is my own calculator\nCreated by Piyush");
        this.a=a;
        this.b=b;
    }
    
    public void addTwoNumbers(){
        System.out.println(this.a+this.b);
    }
public void subtractTwoNumbers(){
    System.out.println(this.a - this.b);
}
public void multiplyTwoNumbers(){
    System.out.println(this.a * this.b);
}
public void divideTwoNumbers(){
    System.out.println(this.a / this.b);
}
}