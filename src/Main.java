public class Main{
    public static void main(String[] args){
        University university = new University();

        Stuff stuff1 = new Stuff("Raikhan Madi", "ID001KZ", 35);
        Stuff stuff2 = new Stuff("Herbert Schildt", "ID010KZ", 40);
        Stuff stuff3 = new Stuff("Lora Benedict", "ID011KZ", 27);

        //Salary for lecturer and teachers
        stuff1.setSalary(16000);
        stuff2.setSalary(12000);
        stuff3.setSalary(8500);

        Students student1 = new Students("Sanzhar Sagatov", "ST001KZ", 18);
        Students student2 = new Students("Bexultan Kasymov", "ST010KZ", 18);
        Students student3 = new Students("Tolegen Tlegen","ST011KZ", 18);
        //Grades for students
        student1.setGrade(4.8);
        student2.setGrade(4.7);
        student3.setGrade(5.0);

        //University
        System.out.println("University Information: ");
        university.setUniversity_adress("Мангилик Ел, С1");
        university.setUniversity_name("Astana IT University");
        university.setNumber_of_students(10000);
        university.setNumber_of_stuff(100);
        university.info();
        System.out.println();

    //Stuff
        System.out.println("Stuff Information: ");
        //Lecturer
        stuff1.lecturer_info();
        //Teachers
        stuff2.teacher_info();
        stuff3.teacher_info();
        System.out.println();
    //Students
        System.out.println("Students Information: ");
        student1.student_info();
        student2.student_info();
        student3.student_info();
    }
}

