package Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Model.User;

public class test {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		FileOutputStream fout = null;
		try{
			User user = new User("Admin", "admin123", 1);
		    fout = new FileOutputStream(new File("user.txt"));
		    oos = new ObjectOutputStream(fout);
		    oos.writeObject(user);
		} catch (Exception ex) {
		    ex.printStackTrace();
		} finally {
		    if(oos != null){
		        try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    } 
		}
	}
}
