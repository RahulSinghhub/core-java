package runnable_task;

import java.util.Map;

import com.app.core.Student;

public class Sortt1 implements Runnable {
	private String filename;
	private Map<String, Student> stud;
	
	public Sortt1(String filename,Map<String,Student> stud) {
		super();
		
		this.filename=filename;
		this.stud=stud;
		
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
	}
	}
