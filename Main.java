
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String name = "Jonathon Manion";
    String timeManagment = "Knowing when I should change up my schedule";
    String personalCommitment = "Knowing when I need to get back to work";
    String KPIMetrics = "number of customers, artists and transactiond made";

    System.out.print("Hello my name is" + name +", the time management strategy I would like to be held accountable\n"
     + "to is " + timeManagment + ", I will personally comit to" + personalCommitment + ",\n"
        + "My business main KPI is" + KPIMetrics + ",");

  }
}