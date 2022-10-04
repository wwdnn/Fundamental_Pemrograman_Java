package Tugas_3;

public class ManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager[] m = new Manager[3];
		m[1] = new Manager("Antonio Rossi", 2000000, 1, 10, 1989);
		m[0] = new Manager("Maria Bianchi", 1500000, 1, 12, 1991);
		m[2] = new Manager("Isabel Vidal", 3000000, 1, 11, 1993);
		Sortable.shell_sort(m);
	
		System.out.println("-----------MANAGER-----------");
		int i;
		for (i = 0; i < 3; i++)
			m[i].raiseSalary(5);
		for (i = 0; i < 3; i++)
			m[i].print();
	}
}
