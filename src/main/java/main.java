public class main {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.setBase_salary(50000);
        emp.setHourly_rate(30);
        int wage = emp.calculating_wage(30);
        System.out.println(wage);
    }
}