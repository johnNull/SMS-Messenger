import java.io.*;
import java.util.*;

public class Reader {
	
	public Reader(){
		
	}
	
	public static void read(ArrayList<Person> p){
		try{
		BufferedReader reader = new BufferedReader(new FileReader("src/Jaunies.txt"));
		String line = null;
		int i = 0;
		while ((line = reader.readLine()) != null) {
			String[] splice = line.split("\\s+");//System.out.println(line);
				p.add(i, new Person());
				p.get(i).setlName(splice[0]);
				p.get(i).setName(splice[1]);
				p.get(i).setCarrier(splice[2]);
				p.get(i).setNumber(splice[3]);
				System.out.println(splice[0]);
				i++;
		}
		reader.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	

}
