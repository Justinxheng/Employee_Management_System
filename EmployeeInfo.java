public class EmployeeInfo {
    
    // ATTRIBUTES
    public int empNum;
    public String firstName;
    public String lastName;
    public String gender; 
    public String workLoc; 
    public double deductRate; 
    
    // CONSTRUCTORS
    
    public EmployeeInfo(int eN, String fN, String lN, String g, String wL, double dR) {
    	empNum = eN;
    	firstName = fN;
    	lastName = lN;
    	gender = g;
    	workLoc = wL;
    	deductRate = dR;
        
    }
        
    // METHODS
    
    public int getEmpNum() {
    	return empNum;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getWorkLoc(){
        return workLoc;
    }
    
    public double getDeductRate(){
        return deductRate;
    }
    
}
