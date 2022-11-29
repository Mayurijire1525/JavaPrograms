class Employee{
	int empId=100;
	Employee(){
		System.out.println("In constructor");
	}
	public static void main(String[]args){
		Employee emp=new Employee();
		System.out.println(emp.empId);
	}

}
