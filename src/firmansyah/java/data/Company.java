package firmansyah.java.data;

public class Company {
    String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public class Employee{
        String name;

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }

        public String getCompany(){
            return Company.this.name;
            // return Company.this.getName();
            //Choose One from above, it is still work
        }
    }
}
