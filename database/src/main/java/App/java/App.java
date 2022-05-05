package App.java;

import java.util.Scanner;
import com.revature.repository.Accountrepository;
import com.revature.repository.jdbcAccountRepository;
//import com.example.repository.TxnRepository;
//import com.example.repository.TxnRepositoryImpl;
import com.revature.service.txrService;
import com.revature.service.TxrServicelmpl;
import com.revature.entity.AccDetails;
import com.revature.entity.Tdetails;

public class App {

	public static void main(String[] args) {
		
		Accountrepository accountRepository = new jdbcAccountRepository();
		txrService txrService = new TxrServicelmpl(accountRepository);
		Scanner input = new Scanner(System.in);
		while(true)
		{	
		System.out.println("\nSelect 1 for account creation");
		System.out.println("Select 2 for money transfer");
		System.out.println("Select 3 for account details");
		System.out.println("Select 4 for edit account");
		System.out.println("Select 5 to delete account");
		System.out.println("Select 6 to count Accounts");
		System.out.println("Select 7 for transactions");
		System.out.println("Select 8 to count transactions");
		System.out.println("Select 0 to exit");
		int option = input.nextInt();
		if(option!=0) {
		switch(option) {
		case 1:{
		Accountrepository accRepository = new jdbcAccountRepository(); // a.k.a D.A.O
		System.out.println("Enter Name");
		String name0 = input.next();
		System.out.println("Enter phone");
		String phone = input.next();
		System.out.println("Enter address");
		String address0 = input.next();
		System.out.println("Enter opening balance");
		double balance0 = input.nextDouble();
		AccDetails accdetails = new AccDetails(name0,phone,address0,balance0);
		accRepository.save(accdetails);
		break;
		}
		case 2:{
		Accountrepository accRepository = new jdbcAccountRepository();
		System.out.println("Enter from account");
		String fid = input.next();
		System.out.println("Enter to account");
		String tid = input.next();
		System.out.println("Enter the amount");
		double am = input.nextDouble();
		
		Tdetails tdetails = new Tdetails(fid,tid,am);
		accRepository.tsave(tdetails);
		}
		break;
		
		case 3:
		{
			System.out.println("Enter Account id (0 For all account )");
			int n1=input.nextInt();
			accountRepository.getAccDetails(n1).forEach(accdetails->System.out.println(accdetails));
			break;
		}
		case 4:
		{
			System.out.println("Enter Account id");
			int n1=input.nextInt();
			accountRepository.edit(n1);
			break;
		}
		case 5:{	
			System.out.println("Enter Account id)");
			
			
			
			
			
			
			
			
			int n1=input.nextInt();
			accountRepository.delete(n1);
			break;
		}
		case 6:{
			System.out.println(accountRepository.countAcc());
			break;
		}
		case 7:{
			accountRepository.getTransfer().forEach(tdetails->System.out.println(tdetails));
			break;
		}
		case 8:{
			System.out.println(accountRepository.count());
			break;	
		}
		}
		}
		else {
			break;
		}
}
}
}