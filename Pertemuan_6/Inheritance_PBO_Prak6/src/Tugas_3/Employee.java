package Tugas_3;

public class Employee{
	private String name;
	private double salary;
	private int hireday;
	private int hiremonth;
	private int hireyear;

	public Employee(String n, double s, int day, int month, int year) {
		name = n;
		salary = s;
		hireday = day;
		hiremonth = month;
		hireyear = year;
	}

	public void print() {
		System.out.println(name + " " + salary + " " + hireYear());
	}

	public void raiseSalary(double byPercent) {
		salary *= 1 + byPercent / 100;
	}

	public int hireYear() {
		return hireyear;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int compare(Sortable temp) {
		Employee eb = (Employee) temp;
		if (salary < eb.salary)
			return -1;
		if (salary > eb.salary)
			return +1;
		return 0;
	}

}
