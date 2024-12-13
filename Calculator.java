import java.util.*;
class Conditions{
    public static void main(String[] args){
        System.out.println("Enter the Method you wanted to use in the java calcualtor");
        System.out.println("1.Adding");
        System.out.println("2.Substratction");
        System.out.println("3.Multiplication");
        System.out.println("4.Divide");
        System.out.println("5.Exit:");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==5){
            System.out.println("Exiting the calculator");
            return;
}
            System.out.println("Enter The 1st Number:");
            double num1=sc.nextInt();
            System.out.println("Enter The 2nd Number:");
            double num2=sc.nextInt();

            if (choice==1){
                double num = num1+num2;
                System.out.println(num);
            }
            else if(choice==2){
                double num=num1-num2;
                System.out.println("answer is" + num);
            }
            else if(choice==3){
                double num=num1*num2;
                System.out.println("Answer is=" + num);
            }
            else{
                double num=num1/num2;
                System.out.println("Answer is=" + num);
            }
        }

    }
