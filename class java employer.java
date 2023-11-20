public class Main {
    public static void main(String[] args) {
         employer emp1 = new employer();
         epm1 .name = "a random name " ;
         emp1 .sales= 20000 ;
         epm1 .bonus_hrs = 42 ;
         epm1 .base_salary = 30000 ;
         //method to provide the first emp information:
         emp1 .info() ;


         employer emp2 = new employer();
         enp2 .name = "another random name" ;
         emp2.sales = 1500 ;
         emp2 .base_hrs = 74 ;
         emp2 .base_salary = 15000 ;
         //method to provide the second emp information:
         emp2.info();


         

        
    }
}


public class employer {
    String name ;

    short sales;

    double base_hrs ;

    String base_salary;


    
    void info(){
        System.out.println ("The player name is:"+name) ;
        System.out.println ("the sales:"+sales) ;
        System.out.println (" the base hours:"+base_hrs) ;
        System.out.println ("the base salary:"+base_salaryZ) ;
    }

}