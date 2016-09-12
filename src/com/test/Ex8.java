package com.test;

import java.util.Scanner;

import com.exception.SoAmException;
import com.main.Number;

@SuppressWarnings("all")
public class Ex8 {
	public static void main(String[]args){
		boolean cont = false;
		do{
			try{
				System.out.print("Vui lòng nhập số: ");
				int n = Integer.parseInt(new Scanner(System.in).nextLine());
				if(n < 0){
					throw new SoAmException("Số âm không hợp lệ!");
				}
				if(new Number().checkSymmetryNumber(n)){
					System.out.print("Là số thuận nghịch độc");
				}else{
					System.out.print("Không phải là số thuận nghịch độc");
				}
			}catch(NumberFormatException ex){
				System.out.print(ex.getMessage());
				cont = true;
			}catch(SoAmException exx){
				System.out.print(exx.getMessage());
				cont = true;
			}
			System.out.print("\n");
		}while(cont);
	}
}
