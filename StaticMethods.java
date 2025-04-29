class AdditionCalculator{
	public static void addTwonumbers(int a,int b){
		System.out.println("sum:"+(a+b));
	}
}
class MultiplicationCalculator{
	public static void multiplyTwonumbers(int a,int b){
		System.out.println("Multiply:"+(a*b));
	}
} 
class SquareCalculator{
	public static void SquareTwonumbers(int n){
		System.out.println("Square:"+(n*n));
	}
}
class AverageCalculator{
	public static void averageofThreenumbers(double a, double b, double c){
		System.out.println("Average:"+(a+b+c)/3);
	}
}
class SimpleInterestCalculator{
	public static void CalculateSimpleInterest(double principal,double rate,double time){
		System.out.println("Simple Interest:"+((principal*rate*time)/100));
	}
}
class CubeCalculator{
	public static void CubeofNumber(int n){
		System.out.println("Cube:"+(n*n*n));
	}
}
class RectanglePerimeterCalculator{
	public static void Calculatorperimeter(double length,double breadth){
		System.out.println("Rectangle:"+(2*(length+breadth)));
	}
}
class VolumeCalculator{
	public static void Volumeofcube(double side){
		System.out.println("Cube:"+(side*side*side));
	}
}
class StringConcatenator{
	public static void ConcatenateTwoStrings(String str1,String str2){
		System.out.println("String:"+(str1+str2));
	}
}
class StringLengthFinder{
	public static void findLength(String str){
		System.out.println("Length:"+(str.length()));
	}
}

public class StaticMethods{
	public static void main(String[] args)
	{
		AdditionCalculator.addTwonumbers(10,10);
		MultiplicationCalculator.multiplyTwonumbers(5,4);
		SquareCalculator.SquareTwonumbers(6);
		AverageCalculator.averageofThreenumbers(10.0, 20.0, 30.0);
		SimpleInterestCalculator.CalculateSimpleInterest(1000.0, 5.0, 2.0);
		CubeCalculator.CubeofNumber(3);
		RectanglePerimeterCalculator.Calculatorperimeter(5.0, 3.0 );
		VolumeCalculator.Volumeofcube(4.0);
		StringConcatenator.ConcatenateTwoStrings("Hello", "World");
		StringLengthFinder.findLength("Java");


	}
}