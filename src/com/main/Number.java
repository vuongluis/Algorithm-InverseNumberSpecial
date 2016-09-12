package com.main;

import java.util.ArrayList;
import java.util.Stack;

import javax.naming.spi.DirStateFactory.Result;

@SuppressWarnings("all")
public class Number {
	
	private int number;
	
	public Number(){
	}
	
	public Number(int n){
		number = n;
	}
	public Long convertAnyToBinary(){
		ArrayList<Integer> list = new ArrayList<>();
		String temp = "";
		if(number == 0){
			list.add(0);
		}else{
			do{
				
				if(number%2 == 0 && number == 0)
					break;
				list.add(number%2);
				number = number/2;
			}while(true);
		}
		for(int i = list.size()-1;i>=0;i--){
			temp += list.get(i).toString();
		}
		return Long.parseLong(temp);
	}
	public String convertAnyToHexa(){
		ArrayList<Integer> list = new ArrayList<>();
		String temp = "";
		if(number == 0){
			list.add(0);
		}else{
			do{
				
				if(number%16 == 0 && number == 0)
					break;
				list.add(number%16);
				number = number/16;
			}while(true);
		}
		for(int i = list.size()-1;i>=0;i--){
			switch(list.get(i)){
				case 10:
					temp += "A";
					continue;
				case 11:
					temp += "B";
					continue;
				case 12:
					temp += "C";
					continue;
				case 13:
					temp += "D";
					continue;
				case 14:
					temp += "E";
					continue;
				case 15:
					temp += "F";
					continue;
			}
			temp += list.get(i).toString();
		}
		return temp;
	}
	public long convertAnyToOctan(){
		ArrayList<Integer> list = new ArrayList<>();
		String temp = "";
		if(number == 0){
			list.add(0);
		}else{
			do{
				
				if(number%8 == 0 && number == 0)
					break;
				list.add(number%8);
				number = number/8;
			}while(true);
		}
		for(int i = list.size()-1;i>=0;i--){
			temp += list.get(i).toString();
		}
		return Long.parseLong(temp);
	}
	public long getSumDigit(){
		long result = 0;
		char[] temp = String.valueOf(number).toCharArray();
		for(int index = 0;index < temp.length; index++){
			result += Integer.parseInt(String.valueOf(temp[index]));
		}
		return result;
	}
	public boolean checkPrime(int m){
		int count = 0;
		boolean result = true;
		if(m == 0 || m == 1){
			result = false;
		}else{
			for(int i = 1;i<=m;i++){
				if(m%i == 0){
					count++;
				}
			}
			result = (count == 2)?true:false;
		}
		return result;
	}
	public ArrayList<Integer> getPrimeAnalys(){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1;i<number;i++){
			if(checkPrime(i)){
				list.add(i);
			}
		}
		return list;
	}
	public String RowFibonacci(int n){
		String outStr = "";
		int count = 2;
		if(n == 1){
			outStr = "1";
		}else if(n == 2){
			outStr = "1";
		}else if(n > 2){
			int f0 = 1,f1=1,f2;
			while(true){
				f2 = f0+f1;
				f0 = f1;
				f1 = f2;
				count++;
				outStr = String.valueOf(f2);
				if(count == n+1){
					break;
				}
			}
		}
		return outStr;
	}
	public boolean checkSymmetryNumber(int n){
		boolean result = false;
		String outStr = String.valueOf(n);
		String temp1 = "",temp2 = "";
		char arrStr[] = outStr.toCharArray();
		int j = outStr.length()-1;
		for(int i=0;i<outStr.length();i++){
			temp1 += String.valueOf(arrStr[i]);
			temp2 += String.valueOf(arrStr[j]);
			j--;
			// trong vòng lặp for chứa các phép gán
		}
		result = temp1.equals(temp2);
		return result;
	}
}
