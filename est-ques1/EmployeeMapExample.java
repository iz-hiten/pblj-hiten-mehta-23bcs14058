
import java.util.HashMap;
import java.util.Map;   
import java.util.Scanner;

public class EmployeeMapExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> employees = new HashMap<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            employees.put(id, name);
        }

        System.out.println("Iterating using keySet()");
        for (Integer id : employees.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employees.get(id));
        }

        System.out.println(" Iterating using entrySet()");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        sc.close();
    }
}
