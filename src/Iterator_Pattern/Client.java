package Iterator_Pattern;

public class Client {

	public static void main(String[] args) {
			
			System.out.println("*** Get Keyboards through Iterator ***");
			IContainer iContainer = new KeyboardContainer();
			IIterator iIterator = iContainer.createIterator();
			while (iIterator.hasNext()) {
				Object object = iIterator.next();
				System.out.println(object);
			}
			
			
	}

}
