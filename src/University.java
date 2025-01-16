public class University {
    private String University_name;
    private String University_adress;
    private int number_of_students;
    private int number_of_stuff;

    public void setUniversity_name(String university_name) {this.University_name = university_name;}
    public String getUniversity_name() {return University_name;}

    public void setUniversity_adress(String university_adress) {this.University_adress = university_adress;}
    public String getUniversity_adress() {return University_adress;}

    public void setNumber_of_students(int number_of_students) {this.number_of_students = number_of_students;}
    public int getNumber_of_students() {return number_of_students;}

    public void setNumber_of_stuff(int number_of_stuff) {this.number_of_stuff = number_of_stuff;}
    public int getNumber_of_stuff() {return number_of_stuff;}

    public void info(){
        System.out.println("University Name: " + University_name + ". Adress: " + University_adress + ". Number of students: " + number_of_students + ". Number of stuff: " + number_of_stuff);
    }
}


