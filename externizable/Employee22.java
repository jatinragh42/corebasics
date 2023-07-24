package in.co.rays.externizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee22 implements Externalizable{

	public int id = 0;
	public String firstname = null;
	public String lastname = null;
	public String salary = null;
	
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(firstname);
		out.writeObject(lastname);
		out.writeObject(salary);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readInt();
		firstname = (String) in.readObject();
		lastname = (String) in.readObject();
		salary = (String) in.readObject();
		
	}
	
	

}
