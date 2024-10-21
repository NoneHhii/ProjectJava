package Model;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{
	private String name;
	private String password;
	private int flat;
	public User(String name, String password, int flat) {
		super();
		this.name = name;
		this.password = password;
		this.flat = flat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getFlat() {
		return flat;
	}
	public void setFlat(int flat) {
		this.flat = flat;
	}
	@Override
	public int hashCode() {
		return Objects.hash(flat, name, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return flat == other.flat && Objects.equals(name, other.name) && Objects.equals(password, other.password);
	}
	
	
}
