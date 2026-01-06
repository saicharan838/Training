public class NestedIfElse {
    public static void main(String[] args){
        int age=24;
        int salary=25000;
        if(age>=20) {
            if (salary >= 20000) {
                System.out.println("Eligible for Loan");
            }
        }
        else {
            System.out.println("Not eligible for loan");
        }
    }
}
