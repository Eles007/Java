package OOP;

import java.util.*;

public class Main {

	public static void main(String[] args){
		Student[] students = {
				new Student("Римонов", "Валерий","Римонович"),
				new Student("Вимонов", "Андрей","Aимонович"),
				new Student("Сергеев", "Сергей", "Сергеевич"),
				new Student("Иванов", "Иван","Иванович"),
				new Student("Романов","Илья", "Юрьевич"),
				new Student("Федоровна","Мария", "Алексеевна"),
				new Student("Пилюкова","Света", "Андреевна"),
				new Student("Aтройщий","Арсений", "Александрович"),
				new Student("Aахрушев","Алексей", "Винисович"),
				new Student("Черных","Елизавета", "Даниловна"),
		};
		
		List<Student> stud = new ArrayList<>(Arrays.asList(students));
		
	    System.out.println("-------до сортировки--------");
	    for (Student user : stud) {
	        System.out.println(user);
	    }
	    
	    System.out.println("-------после сортировки-----");
	    Collections.sort(stud);
	    for (Student user : stud) {
	        System.out.println(user);
	    }
	    
	    //клонирование
	    try{
	    	Group group1 = new Group("ВМ", 21, 24, new Student("Римонов", "Валерий","Римонович"));
	    	Group group2 = group1.clone();
	    	System.out.println(group2);
	    }
	    catch(CloneNotSupportedException ex){
	                      
	        System.out.println("Clonable not implemented");
	    }
		
	    //egulas
	    Student stud1 = new Student("Черных","Елизавета", "Даниловна");
	    Student stud2 =new Student("Черных","Елизавета");
	    boolean bool = stud1.equals(stud2);
	    System.out.println(bool);
	    //hushcode
	    if(stud1.hashCode() != stud2.hashCode()) 
	    	System.out.println("HashCode разный " + stud1.hashCode() +" != " + stud2.hashCode());
	    if(stud1.hashCode() == stud2.hashCode()) 
	    	System.out.println("HashCode одинаковый " + stud1.hashCode() +" == " + stud2.hashCode());
	    
	    
	    
	    Group[] group = {
	    		new Group("ВМ", 21, 24, new Student("Римонов", "Валерий","Римонович")),
	    		new Group("ИС", 11, 20, new Student("Вимонов", "Андрей","Вимонович")),
	    		new Group("ПИ", 11, 19, new Student("Сергеев", "Сергей", "Сергеевич")),
	    		new Group("ИС", 31, 15, new Student("Иванов", "Иван","Иванович")),
	    		new Group("ВМ", 21, 24, new Student("Романов","Илья", "Юрьевич")),
	    		new Group("ИС", 21, 26, new Student("Федоровна","Мария", "Алексеевна")),
	    		new Group("ВМ", 31, 14, new Student("Пилюкова","Света", "Андреевна")),
	    		new Group("ИС", 11, 20, new Student("Стройщий","Арсений", "Александрович")),
	    		new Group("ВМ", 21, 24, new Student("Вахрушев","Алексей", "Динисович")),
	    		new Group("ВМ", 31, 14, new Student("Черных","Елизавета", "Даниловна")),
		};
		
		List<Group> grou = new ArrayList<>(Arrays.asList(group));
		
	    System.out.println("-------до сортировки--------");
	    for (Group user : grou) {
	        System.out.println(user);
	    }
	    
	    System.out.println("-------после сортировки-----");
	    Collections.sort(grou);
	    for (Group user : grou) {
	        System.out.println(user);
	    }
	}
	
}
