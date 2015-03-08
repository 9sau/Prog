/*

Assumptions:

I have solved the triangle problem using java.

1) All numbers are stored in a multi dimensional array with 100 rows
2) All numbers are integers
3) All numbers are less than 100

*/

import java.util.Random;

public class Triangle
{
	
	private final static int n=99;
	//private static int a[][] = new int[n][];
	private static int a[][] = {
		{6},
		{6,7},
		{5,8,9},
		{6,7,5,8},
		{6,7,5,8,9},
		{6,7,5,8,8,64},
		{6,7,7,5,8,8,64},
		{5,8,7,5,8,8,64,5},
		{6,7,8,7,5,8,8,64,5},
		{6,7,8,7,5,8,8,64,5,1},
		{6,7,2,3,8,7,5,8,8,64,5},
		{6,7,2,3,8,7,5,8,8,64,5,1},
		{5,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,6,7,2,3,8,7,5,8,8,64,5,1,0},
		{6,6,6,7,2,3,8,7,5,8,8,64,5,1,0},
		{6,6,6,6,7,2,3,8,7,5,8,8,64,5,1,0},
		{6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1,0},
		{5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1,0},
		{7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1,0},
		{6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1,0},
		{6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1,0},
		{6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1,0},
		{5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1,0},
		{6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1,0},
		{6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{8,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{8,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,4,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{8,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{7,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{5,8,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,5,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{7,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{5,8,3,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{8,6,7,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,6,7,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,6,7,6,7,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,6,7,6,7,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,9,6,7,6,7,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{5,8,5,4,6,7,6,7,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,5,8,5,4,6,7,6,7,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,5,8,5,4,6,7,6,7,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,5,5,8,5,4,6,7,6,7,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,1,2,5,8,5,4,6,7,6,7,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{5,6,7,1,2,5,8,5,4,6,7,6,7,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,7,6,7,1,2,5,8,5,4,6,7,6,7,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1},
		{6,6,7,6,7,1,2,5,8,5,4,6,7,6,7,6,7,5,8,6,7,9,5,8,6,7,6,7,1,6,6,7,5,8,1,0,6,7,9,5,6,6,5,8,3,6,7,4,6,7,2,1,5,8,2,6,7,7,7,6,7,6,7,6,7,7,6,8,6,7,7,7,8,6,7,6,7,6,5,6,6,6,7,5,6,6,6,6,6,7,2,3,8,7,5,8,8,64,5,1}	
	};

	//private static Random r = new Random();

	/*public static void getInput()
	{
		for(int i=0;i<n;i++)
		{
			a[i] = new int[i+1];

			for(int j=0;j<=i;j++)
			{

				a[i][j] = r.nextInt(100);
			}

		}
	}*/

/*
	public static void printArray()
	{
		for (int i=0;i<n;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

*/
	public static int computeSum()
	{
		int sum = a[0][0];
		int prev = 0;

		for (int i=1;i<n;i++) 
		{
			if(a[i][prev+1]>a[i][prev])
			{
				sum += a[i][prev+1];
				//System.out.println(a[i][prev+1]);
				prev = prev+1;
				
			}

			else
			{
				sum += a[i][prev];
				//System.out.println(a[i][prev]);
			}
		}

		return sum;
	}

	public static void main(String arg[])
	{
		//getInput();
		//printArray();
		int sum = computeSum();
		System.out.println("The Sum is "+sum);
	}
}