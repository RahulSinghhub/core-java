package tester;

import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;

import runnable_task.Sortt1;

public class Testforsavedetails {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			//read from a file and writwe it in other
			//first read from the map then write it
			System.out.println("methods has started");
			Map<String,Student> map = populateMap(populateList());
			System.out.println("methods has started");
			Thread t1 = new Thread(new Sortt1(sc.next(), map),"c1");
			//Thread t2 = new Thread(new sortt2filt(sc.next(),sc.next()),"c2");
			System.out.println("methods has started");
			t1.start();
			//t2.start();
			
			//t1.join();
			//t2.join();
			System.out.println("main over....");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
