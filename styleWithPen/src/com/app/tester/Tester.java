package com.app.tester;

import static com.app.utils.Utility.populateMap;
import static com.app.utils.Utility.updateByIdAndUpdateStocks;
import static com.app.utils.Utility.validateInput;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.entities.Pen;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner in = new Scanner(System.in)){
			Map<Integer,Pen> penList = new HashMap<>();
			//penList.putAll(,validateInput("cello", "red", "pink", "plastic" ,200 ,"2024-05-01", 3333 ,22));
			penList=populateMap(penList);
			boolean flag = false;
			while(!flag) {
			try {
				System.out.println("1. Add new Pen\r\n"
						+ "2. Update stock of aPen\r\n"
						+ "3. Set discount of 20% for all the pens which are not at all sold in last 3 months\r\n"
						+ "4. Remove Pens which arenever sold once listed in 9 months"+
						"  0. Exit ");
				int choice = in.nextInt();
				switch(choice) {
				case 1:System.out.println("Add pen stock");
				       //Brand brand, String color, String inkColor,Material material, long stock, LocalDate updateDdate,
				       //LocalDate listDate, long price, float discount
				
				       System.out.println("Brand brand, String color, String inkColor,Material material, long stock, LocalDate updateDdate,\r\n"
						+ "			LocalDate listDate, long price, float discount");
				       Pen p1 = validateInput(in.next(),in.next(),in.next(),in.next(),in.nextLong(),in.next(),in.nextLong(),in.nextFloat());
				       penList.put(p1.getId(),p1);
				       
				       System.out.println(p1);
					   break;
				case 2:System.out.println("update stock enter the id of the pen");
				       //take id from the user and then find the stock from the id and then update the stocks
				      updateByIdAndUpdateStocks(in.nextInt(),in.nextLong(),penList);
				       
				      // p2.setStock(choice);
				      //updateStock(in.nextInt());
				       
				        
					break;
				case 3:System.out.println("set discount to 20 ");
				       //pens not sold in last 3 months 
				        //use updated date for it where last updation took place but i will use another list date for it
				penList.values().stream()
                .filter(p -> p.getListDate().isBefore(LocalDate.now().minusMonths(3)))
                .forEach(p -> p.setDiscount(20));
				
				penList.forEach((p,k)->System.out.println(k));
				      
					break;
				case 4:System.out.println("emove Pens which arenever sold once listed in 9 months");
				       penList.values().stream().filter(p->p.getListDate().isBefore(LocalDate.now().minusMonths(9)));
				       
					break;

				case 0:flag=true;
				
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	

}
