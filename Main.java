import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
  public String name, serialNumber;
  String value;

  public Inventory(String name, String serialNumber, String value){
    this.name = name;
    this.serialNumber = serialNumber;
    this.value = value;
  }

  public String toString(){
    return name + "," + serialNumber + "," + value;
  }
  
}

class Main {
	public static void main(String[] args) {
      int Numinput = 0;
      ArrayList<Inventory> inventoryList = new ArrayList<>();
      Scanner input = new Scanner(System.in);

    
    do{
			System.out.println("Press 1 to add an item.");
			System.out.println("Press 2 to delete an item.");
			System.out.println("Press 3 to update an item.");
			System.out.println("Press 4 to show all the items.");
			System.out.println("Press 5 to quit the program.");

      Numinput = input.nextInt();
  
      if(Numinput == 1){

        input.nextLine();
        
				System.out.println("Enter the name:");
        String nameInput = input.nextLine();
        
				System.out.println("Enter the serial number:");
        String serialnumberInput = input.next();
        
				System.out.println("Enter the value in dollars (whole number):");
        String valueInput = input.next();

        inventoryList.add(new Inventory(nameInput, serialnumberInput, valueInput));

      }
      if(Numinput == 2){
			  System.out.println("Enter the serial number of the item to delete:");
        String inputSerial = input.next();
        input.nextLine();
        
        for(int i = 0; i < inventoryList.size() ; i++){
          if(inventoryList.get(i).serialNumber.equals(inputSerial)){
            inventoryList.remove(i);
          }  
        }
        
      }
      if(Numinput == 3){
			  System.out.println("Enter the serial number of the item to change:");
        String inputSerialTwo = input.next();
        input.nextLine();
        
        for(int i = 0; i < inventoryList.size(); i++){
          
          if(inventoryList.get(i).serialNumber.equals(inputSerialTwo)){
						System.out.println("Enter the new name:");
            String newChangeOne = input.nextLine();
						System.out.println("Enter the new value in dollars (whole number):");
            String newChangeTwo = input.next();

            inventoryList.get(i).name = newChangeOne;
            inventoryList.get(i).value = newChangeTwo;
          }
          
        }
      }
      if(Numinput == 4){
          for(int i = 0; i < inventoryList.size(); i++){
            System.out.println(inventoryList.get(i));
          }
      }
    }while(Numinput != 5);
	}
}