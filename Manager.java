import java.sql.Date;

public class Manager {
	
	private String first; 
	private String last; 
	private String address;
	private Date hiringDate; 
	private int employeeId; 
	
	Manager(int employeeId, String first, String last, String address, Date hiringDate)
	{
		this.setFirst(first);
		this.setLast(last);
		this.setAddress(address);
		this.setHiringDate(hiringDate);
		this.setEmployeeId(employeeId);
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

	public Date getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(Date hiringDate) {
		this.hiringDate = hiringDate;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String toString(){
			
			
			return String.format("%1$-6s||%2$-11s||%3$-10s||%4$-35s||%5$-13s\n",  this.getEmployeeId(), this.getFirst(), this.getLast(), this.getAddress(), this.getHiringDate());
		
	}



}
