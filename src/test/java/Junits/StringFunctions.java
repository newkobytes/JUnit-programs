package Junits;

import java.util.Scanner;

public class StringFunctions {

	public static boolean IsPalindrome(String name)
	{
		int i = 0;
		int j=name.length()-1;
		while(i<j)
		{
			if(name.charAt(i) != name.charAt(j))
			{
				return false;
			}
		i++;
		j--;
		}
		return true;
		}
	
	}
