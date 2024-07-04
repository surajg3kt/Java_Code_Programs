package Programmes_Interview;

public class remove_Special_Character {

	public static void main(String[] args) 
	{
		String name="Su0$^r87@aj";
		
		String output = name.replaceAll("[^a-zA-Z]", "");
        System.out.println(output);
	}

}
