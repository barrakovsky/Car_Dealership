import java.sql.Date;

public class SalesPerson {
	
	private String first; 
	private String last; 
	private String address;
	private double bonus; 
	private Date hiringDate; 
	private int employeeID;
	
	
	
	
	
	SalesPerson(int employeeId, String first, String last, String address, double bonus, Date hiringDate){
			
			this.setFirst(first); 
			this.setLast(last);
			this.setAddress(address); 
			this.setBonus(bonus); 
			this.setHiringDate(hiringDate);
			this.setEmployeeID(employeeId);
			
	}
	
	
	
	public void setEmployeeID(int employeeId){
		this.employeeID = employeeId;
	}
	
	public int getEmployeeID(){
		return employeeID; 
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBonus() {
		return this.bonus;
	}

	public void setBonus(double bonus) {
		this.bonus += bonus;
	}

	public Date getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(Date hiringDate) {
		this.hiringDate = hiringDate;
	}
	
	public String toString(){
		
		
		return String.format("%1$-6s||%2$-11s||%3$-10s||%4$-35s||%5$-13s||$%6$,.2f", this.getEmployeeID(), this.getFirst(), this.getLast(), this.getAddress(), this.getHiringDate(), this.getBonus());
	
	}
	
	

}
