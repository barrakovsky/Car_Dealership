import java.util.ArrayList;

public class Dealership{

	private ArrayList<SalesPerson> sp = new ArrayList<SalesPerson>(); 
	private ArrayList<Car> cars = new ArrayList<Car>(); 
	private Manager mg; 
	private int dealershipId;
	
	public Dealership(int dealreshipId, Manager mg){
		this.setDealershipId(dealershipId);
		this.setManager(mg);
		
	}
	
	public Manager getManager() {
		return mg;
	}

	public void setManager(Manager mg) {
		this.mg = mg;
	}
	
	
	
	public void addCar(Car another){
		cars.add(another);
		
	}
	
	public void addSalesPerson(SalesPerson s){
		sp.add(s);
		
	}
	
	public void removeSalesPerson(SalesPerson s){
		
		if(sp.contains(s)){
			sp.remove(s);
			
			System.out.println("Employee: " + s.getFirst() + " " + s.getLast() + " was removed from the sales persons of this dealership.");
		}else{
			System.out.println("Employee " + s.getFirst() + " " + s.getLast() +  " doesn't work for this dealrship.");
		}
		
	}
	
	public void carSold (Car c, SalesPerson sp){
		if (cars.contains(c)){
			cars.remove(c); 
			System.out.println("Car " + c.getMake() + ", VIN number: " + c.getVinNumber() + " was sold by " + sp.getFirst() + " " + sp.getLast()); 
			sp.setBonus(c.getPrice()*0.1);
			
		}else{
			System.out.println("Car " + c.getMake() + ", VIN number: " + c.getVinNumber() + " doesn't exsist in this delarship"); 
		}
		
	}

	public void removeCar(Car c){
	
		if (sp.contains(c)){
			sp.remove(c); 
			System.out.println("Car " + c.getMake() + ", VIN number:  " + c.getVinNumber() + " was removed from the dealrship"); 
			
		}else{
			System.out.println("Car " + c.getMake() + ", VIN number: " + c.getVinNumber() + " doesn't exsist in this delarship"); 
		}
		
	}
	
	public String getPersonOfTheMonth()
	{
		double j = 0;
		double k = 0; 
		int temp = 0 ;
		
		for (int i = 0 ; i < sp.size(); i++){
			j = sp.get(i).getBonus();
			
			if (j > k){
				k = j;
				temp = i;
			}
		}
		
		return "The person of the month for this dealership is " + sp.get(temp).getFirst() + " " + sp.get(temp).getLast();
		
		
	}

	public int getDealershipId() {
		return dealershipId;
	}

	public void setDealershipId(int dealershipId) {
		this.dealershipId = dealershipId;
	}
	
	public int carListLength(){
		return this.cars.size();
	}
	
	public int salesListLength(){
		return this.sp.size();
	}
	
	public String toString(){
		
		String str = "Dealership manager:\n\n" +
				 "EMPNO ||FIRST NAME ||LAST NAME ||ADDRESS                            ||HIRING DATE  \n"+
				 "------||-----------||----------||-----------------------------------||-------------\n"+
				 mg.toString()+ "\n\n";
		
		
		
		str += "Dealership Employess:\n\n" +
					 "EMPNO ||FIRST NAME ||LAST NAME ||ADDRESS                            ||HIRING DATE  ||BONUS      \n"+
					 "------||-----------||----------||-----------------------------------||-------------||-----------\n"; 
		
		for (int i = 0; i < sp.size(); i++){
			
			str += sp.get(i).toString() + "\n";
			
		}
		
		
		str += "\nDealership Cars:\n" + 
				"MAKE           ||VIN NUMBER          ||YEAR  ||PRICE        \n" +
				"---------------||--------------------||------||-------------\n";
		
		for (int i = 0; i < cars.size(); i++){
					
					str += cars.get(i).toString() + "\n";
					
				}
		
		
		return str; 
		
	}
	
	

	
}
