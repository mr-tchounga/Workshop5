package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.plaf.synth.SynthProgressBarUI;

public class DAOHelloWorld {

	private static String FileName = "C:\\Users\\23769\\Desktop\\UCAC-ICAM\\X1\\PROSITs\\SEMESTRE 2\\POO\\PROSIT 39 (Programmation Orientée Objet  Langage Java  Langage UML  Cycle de vie)\\WS";
	private static DAOHelloWorld instanceDaoHelloWorld = null;
	private String helloWordMessage = null;
	
	
	private DAOHelloWorld() {
		
	}
	public static void getinstance() {
		
	}
	public static void setinstance (DAOHelloWorld instance) {
		
	}
	public void readfile() throws IOException{
	
		try	(BufferedReader File = new BufferedReader(new FileReader(FileName)) ){
			String Line;
			while( (Line = File.readLine() ) != null) {
				System.out.println(Line);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		   
	} 
    	
	
	public String getHelloWordMessage() {
		return helloWordMessage;
	}
	public void setHelloWordMessage (String helloWordMessage) {
		
	}
	
}
