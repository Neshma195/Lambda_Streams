import java.util.Scanner;
import java.util.*;
import java.util.function.BiFunction;
public class AvgNumList
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int noOfInt,avgOfInt;
		ArrayList<Integer> integers=new ArrayList<Integer>();
		BiFunction<Integer,Integer,Integer> biFunction=( a, b)->a+b;
		int sum=0;
		BiFunction<Integer,Integer,Integer> findDiv=(a,b)->a/b;
		System.out.print("Enter number of elements:");
		noOfInt=s.nextInt();
		System.out.println("Enter elements");
		for(int i=1;i<=noOfInt;i++)
		{
			integers.add(s.nextInt());
		}
		for(int num:integers)
		{
			sum=biFunction.apply(sum,num);
		}
		avgOfInt=findDiv.apply(sum,integers.size());
		System.out.println("Average of given integers is : "+avgOfInt);
	}
}