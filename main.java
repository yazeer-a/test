import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Are u hungry? 1 for Yes, 2 for No");
        int hungry=sc.nextInt();

        if(hungry==1){
            System.out.println("Eat smtg nice");
        }else{
            System.out.println("Dont eat");
        }

}
}