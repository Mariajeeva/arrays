public class main{
    public static void main(String[] args)
    {
        Employee emp = new Employee();
        System.out.println("Displaying Employee details");
        emp.getnameandid("jeeva",98);
        emp.display();
        Manager mng = new Manager();
        System.out.println("Displaying manager details");
        mng.getnameandid("Jefry",109);
        mng.getdep("Computer science");
        mng.ddisplay();
    }
}