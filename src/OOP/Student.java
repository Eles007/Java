package OOP;



public class Student implements Cloneable,Comparable<Student> { 
	private String firstName;
	private String secondName;
	private String patronymic;
	
	
	public Student(String secondName, String firstName, String patronymic) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.patronymic = patronymic;
	}
	
	public Student(String secondName, String firstName) {
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public Student(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}
	
	public String getPatronymic() {
		return patronymic;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	
	public Student clone() throws CloneNotSupportedException{
		return (Student) super.clone();
	}
	
    public int compareTo(Student student) {
    	int result = secondName.compareTo(student.getSecondName());
		if(result == 0) {
			result = firstName.compareTo(student.getFirstName());
	    	if (result == 0 ) {
	    		result = patronymic.compareTo(student.getPatronymic());
	    	}
		}
    	return result;
    }
    
    public String toString() {
    	return secondName + " " + firstName + " " + patronymic;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		return true;
	}
    
}
