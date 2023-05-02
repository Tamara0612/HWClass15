package HomeWork15;

public class Students {
  /*  Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students*/

    String name;
            int id;
           static int numOfStudents;

    public static void main(String[] args) {
        Students st=new Students();
        st.name="Tamara";
        st.id=12345;
        st.numOfStudents++;
        Students st1=new Students();
        st1.name="Anya";
        st1.id=23456;
        st1.numOfStudents++;
        Students st2=new Students();
        st2.name="Nikola";
        st2.id=34567;
        st2.numOfStudents++;
        System.out.println("Total number of students in the class are " +numOfStudents);


    }

}
