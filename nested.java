import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.next();

        switch(empId){
            case 1:
            System.out.println("Gourav");
            break;
            case 2:
            System.out.println("rudar jat");
            break;
            case 3:
            System.out.println("Rahul");
            break;
            case 4:
            switch (department){
                case "IT":
                System.out.println("IT Department");
                break;
                case "HR":
                System.out.println("HR Department");
                break;
                case "Finance":
                System.out.println("Finance Department");
               
            }
            break;
            default:
            System.out.println("Enter correct EmpId");


        }

    }

}
