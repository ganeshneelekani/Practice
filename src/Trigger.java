import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Trigger {

	
	
	public static void main(String[] args) {
		
		File file = new File("/Users/gn033604/Desktop/hello.sql");
		 
		  BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		  String st;
		  
		  StringBuffer trigger = new StringBuffer();
		  try {
			while ((st = br.readLine()) != null)
			    
			trigger=trigger.append(st);
			System.out.println(st +"===1====");
			System.out.println(trigger +"===2====");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  
		  String modifiedTriggers = Arrays.stream(trigger.toString().replaceAll(System.lineSeparator(), " ")
                  .replaceAll("CREATE OR REPLACE", "\n/\nCREATE OR REPLACE")
                  .replaceAll("ALTER TRIGGER", "\n/\nALTER TRIGGER").split("\n"))
                  .filter(line -> line.contains("LUTS\"") || line.contains("TXNSCN\""))
                  .collect(Collectors.joining("\n/\n"))
                  .replaceAll("( +)", " ")
                  // "EDITIONABLE" is an Oracle 12 notation that isn't compatible with our Oracle 11 docker image
                  .replace("EDITIONABLE", "").trim();
		
	System.out.println(" PPPPPPPPPPP "+ trigger.toString().replaceAll("CREATE OR REPLACE","\n\n CREATE OR REPLACE"));
	
	System.out.println("===========3===============");
	System.out.println(modifiedTriggers);
	
	}

    

	
	
}
