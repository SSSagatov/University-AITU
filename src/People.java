public class People {
    public People(String name, String id_code, int age) {
        this.name = name;
        this.id_code= id_code;
        this.age = age;
    }
    protected String name;
    protected String id_code;
    protected int age;
}

class Students extends People{
    public Students(String name, String id_code, int age) {
        super(name, id_code, age);
    }

    private double grade;

    public void setGrade(double grade) {this.grade = grade;}
    public double getGrade() {return grade;}

    public void student_info(){
        System.out.println("Student name: " + name + ". ID: " + id_code + ". Age: " + age + ". Grade: " + grade);
    }
}


//STUFF
class Stuff extends People{
    public Stuff(String name, String id_code, int age) {
        super(name, id_code, age);
    }

    //salary information
    double salary;
    double salary_total_lecturer;
    double salary_total_teacher;

    //setters and getters
    public void setSalary(double salary) {this.salary = salary;}
    public double getSalary() {return salary;}

    //days of months
    int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    //Lecturer salary
    public class lecturer{
        double percent_lecturer = 0.12;

        public void salary_lecturer(){
            for (int i = 0; i < month.length; i++) {
                salary_total_lecturer = getSalary() * month[i] * percent_lecturer;
            }
        }
    }

    //Teacher salary
    public class teacher{
        double percent_teacher = 0.06;
        private double salary_teacher;
        private double salary_lecturer;

        public void salary_teacher(){
            for (int i = 0; i < month.length; i++) {
                salary_total_teacher = getSalary() * month[i] * percent_teacher;
                this.salary_teacher = salary_total_teacher;
            }
        }
    }

    public void teacher_info(){
        System.out.println("Teacher name:" + name + ". ID code: " + id_code + ". Age: " + age + ". Salary: " + salary_total_lecturer);
    }
    public void lecturer_info(){
        System.out.println("Lecturer name:" + name + ". ID code: " + id_code + ". Age: " + age + ". Salary: " + salary_total_lecturer);
    }
}