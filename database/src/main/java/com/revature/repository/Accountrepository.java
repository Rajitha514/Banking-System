package com.revature.repository;

import com.revature.entity.Account;
import com.revature.entity.Tdetails;
import java.util.List; 
import com.revature.entity.AccDetails;

public interface Accountrepository {
	void save(AccDetails accdetails);
	Account load(String accNumber);
	void update(Account account);
	public void tsave(Tdetails tdetails);
	public List<Tdetails> getTransfer();
	public List<AccDetails> getAccDetails(int n1);
	void edit(int n1);
	public void delete(int id);
	public int count();
	public int countAcc();

}
