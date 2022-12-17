import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many days' temprature? ");
    int numDays = sc.nextInt();
    int sum = 0;
    int[] temps = new int[numDays];
    for(int i=0; i<numDays; i++){
      System.out.print("Day " + (i+1) + "'s high temp: ");
      temps[i] = sc.nextInt();
      sum+=temps[i];
    }
    double average = sum/numDays;
    int above = 0;
    for(int i=0; i<numDays; i++){
      if(temps[i]<average)  above++;
    }
    System.out.println();
    System.out.println("Average Temp = " + average);
    System.out.println(above + " days above average");
    sc.close();
  }
}