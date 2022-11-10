public class Main{
public static void main(String[] args){
	System.out.print("身長(m):");
	double height = new java.util.Scanner(System.in).nextDouble();
	System.out.print("体重(kg):");
	double weight = new java.util.Scanner(System.in).nextDouble();
	System.out.print("BMI:");
	double bmi = weight / (height * height);
	System.out.println(String.format("%.2f",bmi));
	}
}
