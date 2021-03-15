public class day8 {

    public class Student {

        //non static variables , member data , data . properties, attributes
        String name;
        int roll;


        //constructor : is a special function which has following features:
        //1. it's name is same as class name
        //2.It has no return value
        //3.we cannot use void keyword too
        //4. It can have any access modifier
        //5. It runs only once for each object
        //6.It is mainly used to initialize the member data

        public void assignInfo(String n, int r) {
            name = n;
            roll = r;
        }

        public void displayInfo() {
            System.out.println("Student name is: " + name);
            System.out.println("Student roll is " + roll);
        }

        public void main(String[] args) {

            Student student1 = new Student();
            System.out.println(student1.name);
        }
    }
}
