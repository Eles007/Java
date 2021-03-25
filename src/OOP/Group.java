package OOP;

public class Group implements Cloneable,Comparable<Group>{
	private String specialties;
	private Integer idGroup; 
	private Integer countStudent;
	private Student students;
	
	
	public Group(String specialties, Integer idGroup, Integer countStudent, Student student) {
		this.specialties = specialties;
		this.idGroup = idGroup;
		this.countStudent = countStudent;
		this.students = student;
	}
	
	public Group(String specialties, int idGroup, Student student) {
		this.specialties = specialties;
		this.idGroup = idGroup;
		this.students = student;
	}
	
	public String getSpecialties() {
		return specialties;
	}
	
	public int getIdGroup() {
		return idGroup;
	}
	
	public int getCountStudent() {
		return countStudent;
	}
	
	public Student getStudent() {
		return students;
	}
	
	public void setSpecialties(String specialties) {
		this.specialties = specialties;
	}
	
	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}
	
	public void setCountStudent(int countStudent) {
		this.countStudent = countStudent;
	}
	
	public void setStudent(Student student) {
		this.students = student;
	}
	
	public String toString() {
		return specialties + " " + idGroup + " " + countStudent + " " + students;
	}
	
	public Group clone() throws CloneNotSupportedException {
		return (Group) super.clone();
	}
	
    public int compareTo(Group group) {
    	Integer result = this.idGroup.compareTo(group.getIdGroup());
    	if(result == 0) result = this.countStudent.compareTo(group.getCountStudent());
    	return result;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countStudent == null) ? 0 : countStudent.hashCode());
		result = prime * result + ((idGroup == null) ? 0 : idGroup.hashCode());
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
		Group other = (Group) obj;
		if (countStudent == null) {
			if (other.countStudent != null)
				return false;
		} else if (!countStudent.equals(other.countStudent))
			return false;
		if (idGroup == null) {
			if (other.idGroup != null)
				return false;
		} else if (!idGroup.equals(other.idGroup))
			return false;
		return true;
	}
}
