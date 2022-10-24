public class Main {
    public static void main(String[] args) {

        Employee e1= new Employee("Huri Durna",2000,45,2018);
        e1.toString();

    }
}
class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {
        double tax = 0.0;
        if (this.salary < 1000) {
            System.out.println("Vergi ödemesi bulunmamaktadır.");
        } else {
            tax = (this.salary) * 0.03;
        }
        return tax;
    }

    int bonus() {
        int bonus = 0;
        if (this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;
        } else {
            System.out.println("Bonus ödemesi bulunmamaktadır. !");
        }
        return bonus;
    }

    double raiseSalary() {
        double year = 2021 - this.hireYear;
        double raise = 0.0;
        if (year < 10) {
            raise = this.salary * 0.05;
        } else if (year > 9 && year < 20) {
            raise = this.salary * 0.1;
        } else {
            raise = this.salary * 0.15;
        }
        return raise;
    }

    public String toString() {

        double toplam = this.salary + bonus() - tax();
        double total = this.salary - tax() + bonus() + raiseSalary();

        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + toplam);
        System.out.println("Toplam Maaş: " + total);

        return null;
    }

}