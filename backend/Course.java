public class Course(){
	
	public Course(String teacher, int code, List<String> projects, List<String> students){
	teacher="Ms. Apple";
	code=123;
	projects[2]=["project1", "project2"];
	students[3]=["Labiba Chowdhury", "Mahfuza Shovik", "Mishcat Ibrahim"];
	}
	public String getTeacher(){
		return teacher;
	}
	public String getStudent(int id){
		return students.get(id);
	} 
	public String getProject(int projectNumber){
		return projects.get(projectNumber);
	}
	public int getCode(){
		return code;
	}
	public static setTeacher(String nombre){
		teacher=nombre;
	}
	public static setStudents(String nombre){
		students.add(nombre);
		//set course number to position in arraylist in student class
	}
	public static setProjects(String nombre){
		projects.add(nombre);
		//add project properties in project class
	}
	public static addStudents(String nombre){
		//feature to add later
	}
	public static removeStudents(){
		//feature to add later		
	}

}