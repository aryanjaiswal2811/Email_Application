import java.util.Scanner;
public class Email{
    private String firstName;      // implementing encapsulation
    private String lastName;
    private String password;
	private int defaultPassLength = 8;
	private String email;
    private String department;
    private String companySuffix = "xyzcompany.com";
    private int mailBoxCapacity = 500; //default
    private String alternateEmail;
    
    // Constructor to recieve the first name and last name
    public Email(String firstName , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
       // System.out.println("Email Created: " + this.firstName + " " + this.lastName);
        
        // Calling a method asking for department - return the department
        this.department = setDepartment();
        //System.out.println("Department: " + this.department);
		
		// Calling a method to generate a random password
		this.password = randomPassword(defaultPassLength);
		System.out.println("Your password is: " + this.password);
		
		// Combining elements to generate email
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your email is: " + this.email);
    }
    
    // Asking for the department
    private String setDepartment(){
        Scanner in = new Scanner(System.in);
        System.out.println("New worker: " + firstName + ". DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        int dep = in.nextInt();
        if(dep == 1){
        return "Sales";}
        else if(dep == 2){
        return "Dev";}
        else if(dep == 3){
        return "Acct";}
        else{
        return "";}
    }
	
	// Generating a random password
	private String randomPassword(int length){
		String passSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345@$%#";
		char password[] = new char[length];
		for(int i=0;i<length;i++){
			int randNum = (int)(Math.random() * passSet.length());
			password[i] = passSet.charAt(randNum);
		}
		return new String(password);
	}
		// Set the mailbox capacity
		public void setMailboxCapacity(int mailBoxCapacity){
		    this.mailBoxCapacity = mailBoxCapacity;
		}
// 		// Set the alternate email
		public void setAlternateEmail(String alternateEmail){
		    this.alternateEmail = alternateEmail;
		}
// 		// Change Password
		public void changePassword(String password){
		    this.password = password;
		}
		
		public int getMailBoxCapacity(){
		    return mailBoxCapacity; 
		}
		public String getAlternateEmail(){
		    return alternateEmail;
		}
		public String getPassword(){
		    return password;
		}
		public String showInfo(){
		    return "Display Name: " + firstName + " " + lastName + "\nCompany Email: " + email +
		           "\nMailBox Capacity: " +mailBoxCapacity + "mb";
		          }
}