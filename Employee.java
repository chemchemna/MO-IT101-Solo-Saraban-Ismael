
public class Employee extends Person{
	private double wage;
	private String position;
	
	public Employee(String name, int age, int position) {
	  super(name, age);
	  setPosition(position);
	  setWage(position);
	  
	public String getWage() {
 	   return wage;
    }
    public void setWage(int position) {
 	   this.name = name;
 	    if (position ==1) {
 	    	wage = 75;
 	    }
    } else if (position ==2) {
    	wage = 50;
    }
    
    public String getPosition() {
 	   return position;
    }
    public void setPosition(int position) {
    	if (position ==1) {
 	   this.position = "Manager";
    }
    	else if (position ==2) {
    		this.position = "Service Crew";
    	}
}
