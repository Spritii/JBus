package twodarray;

import java.util.Objects;

public class User {

	public String name;
	public char gender;
	public int age;
	public long phno;
	public String email;
	public long adhaar;

	public User()
	{
		
	}
	public User(String name, int age, char gender, long phno, String email, long adhaar) {
		
		super();
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phno=phno;
		this.email=email;
		this.adhaar=adhaar;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + ", age=" + age + ", phno=" + phno + ", email=" + email
				+ ", adhaar=" + adhaar + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(adhaar, age, email, gender, name, phno);
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
		return adhaar == other.adhaar && age == other.age && Objects.equals(email, other.email)
				&& gender == other.gender && Objects.equals(name, other.name) && phno == other.phno;
	}
	
	

}
