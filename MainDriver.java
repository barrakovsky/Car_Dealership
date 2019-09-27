/*Name:Bar Rakovsky
* Due Date: 07/21/18
* project 5: Dealerhip project
* 
* In this project we had to write a project to simulate a car dealership. 
* I created a few classes- 
* 	Sales person class- this class hold all the information on the sales person
* 	Manger- this class holds all the information on the manager of the dealership
* 	Dealership- this class has one manager, a few cars and a few sales persons. 
* 	(I do think that if it was a different situation i would do the manager and the sales person under the same employees supper class 
* 	because a manager is also an employee.
* Overall, i checked all my methods and everything that was requested according to the project is implemented and works. 
* Also, all the methods are self explanatory so i didn't put a comment on each method in each class. 
* In the main driver class-(main method)- i created two new method that are responsible to create the array of each class(sales persons and cars)
* so the code will be more readable
* I have two for loops in the main method that are responsible to addthe cars and the sales persons into the array list of the dealership class. 
*/


import java.sql.Date;

public class MainDriver {

	public static void main(String[] args) {
		
		int employeeId = 0; 
		
		
		Manager mg = new Manager(++employeeId, "Matan", "Wolf", "1128 south Bedford st, Los Angeles", Date.valueOf("2018-07-18"));
		
				
		//create cars array. 
		Car[] cAr = createCarsArray();
		
		
		//Organize the sales persons in array so it will be easier to add them 
		SalesPerson[] spAr = createSalesPersonArray(employeeId);
		
		//creating the dealership with one manager associated. 
		Dealership d1 = new  Dealership(1,mg);
		
		//inserting the cars into the array list of cars of the dealership.
		for (int i = 0; i < cAr.length; i++){
			
			d1.addCar(cAr[i]);
			
		}
		
		//inserting the sales persons into the array list of sales persons of the dealership.
		for (int i = 0; i < spAr.length; i++){
			d1.addSalesPerson(spAr[i]);
		}
		
		
		//this to string method will print the state of the dealership class- manger, cars and employees. 
		System.out.println(d1.toString());
		
		
		//test the get person of the month method
		System.out.println(d1.getPersonOfTheMonth());
		
		System.out.println();
		
		//test of remove person 
		d1.removeSalesPerson(spAr[5]);
		System.out.println();
		d1.removeSalesPerson(spAr[1]);
		
		
		System.out.println();
		
		//sold car method- takes in a car that was sold and a sales person the sold the car. 
		//The sales person will get 10% of the price of the car added to his bonus. 
		d1.carSold(cAr[5], spAr[1]);
		
		System.out.println();
		
		System.out.println(d1.toString()); 		
		
	}
	
	public static Car[] createCarsArray(){
		
		Car c1 = new Car("Honda", 24125, 2017, "1HGBH41JXMN109186");
		Car c2 = new Car("Acura", 23000, 2018, "2JHJO91JXMN635131");
		Car c3 = new Car("Alfa Romeo", 20000, 2018, "4FERD56JXMN054306");
		Car c4 = new Car("Aston Martin", 25000, 2018, "5ASHR58JXMN310283");
		Car c5 = new Car("BMW", 40000, 2018, "7BMDR45JXMN818239");
		Car c6 = new Car("Audi", 30000, 2018, "1AUDF89JXMN456789");
		Car c7 = new Car("Hyundai", 19050, 2016, "1HYSE14JXMN101576");
		Car c8 = new Car("Lamborghini", 30500, 2018, "1LAGT67JXMN099578");
		Car c9 = new Car("Suzuki", 18050, 2015, "2SUDC47JXMN123456");
		Car c10 = new Car("Toyota", 20900, 2016, "1TOJK90JXMN457826");
		
		Car[] carsArray = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};
		
		return carsArray; 
		
	}
	
	
	public static SalesPerson[] createSalesPersonArray(int employeeId){
		
		SalesPerson s1 = new SalesPerson(++employeeId, "Doron", "Jon", "1128 south Bedford st, Los Angeles", 200000, Date.valueOf("2017-06-17"));
		SalesPerson s2 = new SalesPerson(++employeeId, "Amanda", "Fuller", "1130 south Bedford st, Los Angeles", 2000, Date.valueOf("2018-01-18"));
		SalesPerson s3 = new SalesPerson(++employeeId, "Dean", "Begim", "1132 south Bedford st, Los Angeles", 0, Date.valueOf("2018-07-18"));
		SalesPerson s4 = new SalesPerson(++employeeId, "Nick", "Vial", "1134 south Bedford st, Los Angeles", 20000, Date.valueOf("2017-12-18"));
		SalesPerson s5 = new SalesPerson(++employeeId, "Nathan", "North", "1140 south Bedford st, Los Angeles", 100000, Date.valueOf("2016-04-18"));
		SalesPerson s6 = new SalesPerson(++employeeId, "Bar", "Rakovsky", "1140 south Bedford st, Los Angeles", 100000, Date.valueOf("2016-04-18"));
		
		SalesPerson[] salesPerArray = {s1, s2, s3, s4, s5, s6 };
		
		return salesPerArray;
	}

}
