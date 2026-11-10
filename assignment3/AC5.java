import java.util.*;
class AC5{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
double buy;
double sell;
double diff;
double lp;
double pp;
System.out.print("Enter buy price  :");
  buy=sc.nextDouble();
System.out.print("Enter sell price  :");
  sell=sc.nextDouble();
 if(sell>buy){
   diff=sell-buy;
   pp=diff*buy/100;
 System.out.print("profit percentage is :"+ pp +"%");
}
else if(sell<buy){
    diff=buy-sell;
   lp=diff*buy/100;
 System.out.print("loss percentage is :"+lp+"%");
    }
    else{
      System.out.print("zero profit percentage");
    }
  }

}
