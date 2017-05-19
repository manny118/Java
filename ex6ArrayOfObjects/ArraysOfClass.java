package ex6ArrayOfObjects;

public class ArraysOfClass {

	public static void main(String[] args) {


			
		carClass cc1 = new carClass();
		carClass cc2 = new carClass();
		carClass cc3 = new carClass();
		
		
		carClass[] myCarClass = new carClass[3];
		                                     
		myCarClass[0] = cc1;
		myCarClass[1] = cc2;
		myCarClass[2] = cc3;
		
		
		cc1.setMake("Ford");
		cc1.setModel("Modeo");
		cc1.setEngineSize(1.66);
		
		cc2.setMake("Mercedes");
		cc2.setModel("Mercedes Benz");
		cc2.setEngineSize(2.1);
		
		cc3.setMake("Honda");
		cc3.setModel("Accord");
		cc3.setEngineSize(1.8);
		

		ArraysOfClass acc = new ArraysOfClass();
		acc.printArray(myCarClass);
		
		
		
	}

	
	
	
	
	
	public void printArray(Object [] myCar ){
		
		
		for(int i=0; i<myCar.length; i++){
			
			
			
		}
		
		
		for(int j=0; j<myCar.length; j++){
			
			System.out.println(myCar[j]);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
