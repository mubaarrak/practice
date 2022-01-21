
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StreamDemo {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		/*
		 * Employees from Deparment Dev with age greater than 26 and Staying in street
		 * Cst output -> [ Employee{empId=3, empName='Javed', email='js1997@gmail',
		 * address=Address{street='Cst', pinCode=400, city='Mumbai'}, age=36} ]
		 */
		
		
		
		
		Data.departmentList.stream().filter(dept->{dept.getDeptName().equals("Qa");});
		
		
		
		
	}
}

class Data {

	private static List<Employee> empListDev = Arrays.asList(
			new Employee(1, "Rushikesh", "rk1997@gmail", new Address("Appa", 400, "NV"), 24, 50000),
			new Employee(2, "Ritesh", "rp1997@gmail", new Address("Appa", 400, "NV"), 26, 60000),

			new Employee(3, "Javed", "js1997@gmail", new Address("Appa", 400, "NV"), 32, 70000),
			new Employee(3, "Javed", "js1997@gmail", new Address("Cst", 400, "Mumbai"), 36, 80000),

			new Employee(4, "Nikhil", "ns1997@gmail", new Address("Appa", 400, "NV"), 35, 90000));

	private static List<Employee> empListQa = Arrays.asList(
			new Employee(1, "Deepika", "dp1997@gmail", new Address("Appa", 400, "NV"), 24, 70000),
			new Employee(2, "Akshay", "ak1997@gmail", new Address("Appa", 400, "NV"), 26, 60000),

			new Employee(3, "Deepak", "dp1997@gmail", new Address("Appa", 400, "NV"), 32, 50000));

	public static List<Department> departmentList = Arrays.asList(new Department("Dev", empListDev),
			new Department("Qa", empListQa));
}

class Department {
	@Override
	public int hashCode() {
		return Objects.hash(deptName, employees);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(deptName, other.deptName) && Objects.equals(employees, other.employees);
	}

	private String deptName;
	private List<Employee> employees;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department(String deptName, List<Employee> employees) {
		this.deptName = deptName;
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department{" + "deptName='" + deptName + '\'' + ", employees=" + employees + '}';
	}
}

class Employee {

	private int empId;

	private String empName;

	private String email;

	private Address address;

	private int age;
	private int empSal;

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public Employee(int empId, String empName, String email, Address address, int age, int empSal) {
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.address = address;
		this.age = age;
		this.empSal = empSal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee{" + "empId=" + empId + ", empName='" + empName + '\'' + ", email='" + email + '\''
				+ ", address=" + address + ", age=" + age + '}';
	}

	public Employee() {
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}

class Address {
	private String street;
	private int pinCode;
	private String city;

	public Address(String street, int pinCode, String city) {
		this.street = street;
		this.pinCode = pinCode;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	@Override
	public String toString() {
		return "Address{" + "street='" + street + '\'' + ", pinCode=" + pinCode + ", city='" + city + '\'' + '}';
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
