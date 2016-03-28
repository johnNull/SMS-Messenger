import java.io.*;
public class Writer {
	static String path = "Juanies.txt";
	public Writer(){
		
	}
	
	public Writer(String path){
		this.path = path;
	}
	
	public void write(Person p)
	{
		File file = new File("src/Jaunies.txt");
		//File file = new File("~/workspace/NewSolution/src/Juanies.txt");
		try{
		FileWriter fileWriter = new FileWriter(file, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(p.getlName() + " " + p.getName() + " " + p.getCarrier() +" " + p.getNumber()+ "\n");
		bufferedWriter.close();
		/*
		PrintWriter outputStream = new PrintWriter("Juanies.txt");
		outputStream.println("Reynolds Juan 6314873123 T-Mobile");
		outputStream.close();
		
		PrintWriter outputStream = new PrintWriter("Juanies.txt");
		printer.println("Reynolds Juan 6314873123 T-Mobile");
		*/
				}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

}
