package ashok.it.controller;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertToJson {

	public static void main(String[] args) {
		Customer customer = new Customer(1,"Arvind Khote","Male");
		
		ObjectMapper object = new  ObjectMapper();
		try {
			object.writeValue(new File("Customer.json"), customer);
		} catch (StreamWriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
