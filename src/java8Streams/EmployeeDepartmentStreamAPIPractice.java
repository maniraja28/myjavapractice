package java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDepartmentStreamAPIPractice {
	public static void main(String[] args) {
		List<Employee> employeeList = getEmployeeList();// object create
//		System.out.println(employeeList);
		// 1.print all employees
		// employeeList.stream().forEach(employee -> System.out.println(employee));
		// employeeList.stream().forEach( System.out::println);

		// 2.print employee whose age is greater than 28
//		employeeList.stream()
//		.filter(employee -> employee.getAge()>28)
//		.forEach(System.out::println);
		// 3.Print the unique name of all departments in the organization
		employeeList.stream().map(employee -> employee.getDepartment())// all departement names
				.distinct()// unique name purpose we have to choose distinct key word
				.collect(Collectors.toList()).forEach(System.out::println);
		// 4.print the names of all employees who have joined after 2018?
//		employeeList.stream()
//		            .filter(employee -> employee.getYearOfJoining()>2018)
//		            .forEach(System.out::println);
	}

	static List<Employee> getEmployeeList() {// doubt

		List<Employee> employeeList = new ArrayList<Employee>();// object creation

		employeeList.add(new Employee(1, "raja", 26, "male", "Developer", 2022, 60000.25));
		employeeList.add(new Employee(2, "ravi", 27, "male", "Testing", 2022, 40000.34));
		employeeList.add(new Employee(3, "prasad", 29, "male", "support", 2010, 80000.67));
		employeeList.add(new Employee(4, "raviadabala", 26, "male", "admin", 2020, 70000.23));
		employeeList.add(new Employee(5, "prasanth", 30, "male", "adminsupport", 2018, 113000.34));
		employeeList.add(new Employee(5, "prasanth", 30, "male", "adminsupport", 2018, 113000.34));

		return employeeList;

	}

	
}

class Employee {

	private Integer id;// state or data or fields

	private String name;

	private Integer age;

	private String gender;

	private String department;

	private Integer yearOfJoining;

	private Double salary;

	public Employee(Integer id, String name, Integer age, String gender, String department, Integer yearOfJoining,
			Double salary) {// argument constructor
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;

	}

	public Integer getId() {// generate setters and getters method
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(Integer yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {// genereate to string method
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
}
