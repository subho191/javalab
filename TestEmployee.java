package Day3;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEid(1);
        e.setName("SD");
        e.setSallary(25000);

        Employee e1 = new Employee();
        e1.setEid(2);
        e1.setName("SD");
        e1.setSallary(25000);
        System.out.println(e.equals(e1));

//        System.out.println(e);
//        System.out.println("eid " +e.getEid());
//        System.out.println("name  " +e.getName());
//        System.out.println("sallary  " +e.getSallary());
    }
}
