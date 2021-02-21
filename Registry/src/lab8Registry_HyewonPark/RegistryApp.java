package lab8Registry_HyewonPark;

public class RegistryApp {

	public static void main(String[] args)
	{
		//create the registry object
		Registry theRegistry = new Registry();
		
		//Create an interface
		RegistryCLI theRegistryCLI = new RegistryCLI(theRegistry);
		
		//Display the menu
		theRegistryCLI.doMenu();
	}
}
