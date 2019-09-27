
public class Car {
	
	private String make;
	private double price; 
	private int year; 
	private String vinNumber; 
	
	public Car(String make, double price, int year, String vinNumber)
	{
		this.setMake(make);
		this.setPrice(price);
		this.setYear(year); 
		this.setVinNumber(vinNumber); 
		
	}
	
	
	public void setMake(String make){
		this.make = make; 
	}
	
	public String getMake(){
		return make;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getVinNumber() {
		return vinNumber;
	}


	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}
	
	public String toString(){
		
		return String.format("%1$-15s||%2$-20s||%3$-6s||$%4$,.2f  ", this.getMake(), this.getVinNumber(),  this.getYear(), this.getPrice() );
		
	}
	
	
	
	
}
