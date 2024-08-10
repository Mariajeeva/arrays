//imheritance part
    //override
    public class Manager extends Employee {
        public String department;

        public void ddisplay() {
            super.display();
            System.out.println("departmenmt is " + department);
        }

        public void getdep(String department) {
            this.department = department;
        }
    }


