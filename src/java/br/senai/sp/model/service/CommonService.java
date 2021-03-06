
package br.senai.sp.model.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;


public class CommonService {
    
    public String getStringData(){
	Calendar data = Calendar.getInstance();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy"); 
        return s.format(data.getTimeInMillis());
    }
    public String getStringData(Calendar data){
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy"); 
        return s.format(data.getTimeInMillis());
    }
    public String getNameDataBase(){
        
        String userPath = System.getProperty("user.dir");
        String partialPath = "/db/";
        Properties properties = new Properties();
	FileInputStream file = null;
        String fileProp = userPath + partialPath + "db.properties";
        
	try {
            file = new FileInputStream(fileProp);
	}
        catch(FileNotFoundException e) {
	    e.printStackTrace();
        }
	try{
	    properties.load(file);
	} 
        catch(IOException e){
            e.printStackTrace();
	}
	return properties.getProperty("database.file");
    }
    
}
