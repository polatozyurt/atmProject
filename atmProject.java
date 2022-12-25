import java.util.Scanner;

public class atmProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		String userName, passWord ; 
		int right = 3 ;
		int select, money ;
		int balance = 1500 ;
		
		while(right>0) {
			System.out.print("Enter the username: ");
			userName = input.next();
			System.out.print("Enter the password: ");
			passWord = input.next();
			if (userName.equals("patika") && passWord.equals("dev123")) {
				System.out.println("Hello, Welcome to Patika Bank !!");
				do {
				System.out.print("1-Cash deposit\n"
						+ "2-Cash withdrawal\n"
						+ "3-Check balance\n"
						+ "4-Exit\n"
						+ "Please select the operation number : ");
				select =input.nextInt();
				if(select == 1) {
					System.out.println("Please enter the amount of money: ");
					money = input.nextInt();
					balance += money ;					
				}
				else if (select == 2) {
					System.out.println("Please enter the amount of money: ");
					money = input.nextInt();
					if(money<=balance) {
						balance -= money ;	
					}
					else {
						System.out.print("You can not make money withdrawals more than your account balance !");
					}
				}
				else if(select==3) {
					System.out.println("Your balance: " + balance);
				}
				
				
				}
				while(select != 4) ;
				System.out.println("Bye bye.");
                break;
				
			}
				
			
			else {
				right-- ;
				if(right>0) {
				System.out.println("Your creditencials does not match. Please try again..");
				System.out.println("Remaining rights:  " + right);
				}
				else {
					System.out.print("Your account has been suspended. Please contact the bank !");
				}
			
		}

	
		
		
		
		
		
		

		
		
		
		
		
		
		
	}

	}
	}
