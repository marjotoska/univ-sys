
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;


public class UniversityManager {
    
    public static void main(String[] args) {
        University univ = new University();
        univ.setName("CIT");
        
        Address ad = new Address();
        ad.setStName("A.Z. Cajupi");
        ad.setStNum("6");
        ad.setCity("Tirana");
        univ.setAddress(ad);//assigning the address to univ
        
        //Add Class Room
        Classroom classroom1=new Classroom(); //creating a classroom
        classroom1.setRoomNum(5555);
        
        Classroom classroom2=new Classroom();
        classroom2.setRoomNum(6666);
        
        univ.getClassrooms().add(classroom2);// add classroom to university
        univ.getClassrooms().add(classroom1);
        
        Student s1 = new Student();
        s1.setFName("Bleona");
        s1.setLName("Qerreti");
        s1.setGender("Female");
        Date dat = new Date("12/13/2000");
        s1.setDob(dat);
        
        univ.getStudents().add(s1);//add student to student collection
        
        Student s2 = new Student();
        s2.setFName("Kevin");
        s2.setLName("Lano");
        s2.setGender("Male");
        Date dat1 = new Date("12/16/2000");
        s2.setDob(dat1);
        
        univ.getStudents().add(s2);//add student to student collection
        
        Instructor ins1 = new Instructor();
        ins1.setFName("Jim");
        ins1.setLName("Smith");
        
        Instructor ins2 = new Instructor();
        ins2.setFName("John");
        ins2.setLName("Belushi");
        ins2.setGender("Male");
        
        univ.getInstructors().add(ins2);
                
        univ.getInstructors().add(ins1);//add instructor to university collection
        
        ins1.getStudents().add(s1);
        ins1.getStudents().add(s2);//link instructor to student
        
        s1.setInstructor(ins1);//link student to instructor
        s2.setInstructor(ins1);
        
        Instructor ins3 = new Instructor();
        ins3.setFName("Ermira");
        ins3.setLName("Cakrani");
        ins3.setGender("Female");
        
        univ.getInstructors().add(ins3); // Add new professor to the collection
        ins3.setStudents(ins2.getStudents());//Assign Instructor 1 students to instructor 3
        
        
        //Asigning students the new professor
        System.out.println("number of elements "+ins3.getStudents().size());
    Iterator it1 = ins3.getStudents().iterator();
    while(it1.hasNext()){
    Student st3 = (Student) it1.next();
    st3.setInstructor(ins3);       
    }
    
    ins1.setStudents(new ArrayList<>()) ; // We are nullifying the students collection of Instructor 1
        
    Course c1 = new Course();
        c1.setCName("Soft Eng");
        c1.setCNumber("SE101");
        c1.setNCredits(6);
        univ.getCourses().add(c1);
        c1.setClassroom(classroom1);
        c1.setInstructor(ins1); // assigning a proffesor to the course
        
        
        Course c2 = new Course();
        c2.setCName("Soft Arch");
        c2.setCNumber("SA101");
        c2.setNCredits(6);
        univ.getCourses().add(c2);
        c2.setClassroom(classroom2);
        c2.setInstructor(ins1);
        
        s1.getCourse().add(c1);//add course to student
        s2.getCourse().add(c1);
        
        s1.getCourse().add(c2);//add course to student
        s2.getCourse().add(c2);
        
        c1.getStudents().add(s1);
        c1.getStudents().add(s2);
        
        c2.getStudents().add(s1);
        c2.getStudents().add(s2);
        
        classroom1.getCourse().add(c1);
        classroom2.getCourse().add(c2);
        
        //ins1 loses the job, need to be replaced by ins2
        ins2.setStudents(ins1.getStudents());//assinging students of ins1 to ins2
        System.out.println("ins1 "+ins1.getStudents().size());
        System.out.println("ins2 "+ins2.getStudents().size());
        ins1.setStudents(new ArrayList());//nullifying the list of students assigned to ins1
        s1.setInstructor(ins2);
        s2.setInstructor(ins2);
        
        c1.setInstructor(ins2);//changing courses
        c2.setInstructor(ins2);
        
        //student s1 drops course c1: make the changes
        c1.getStudents().remove(s1);
        s1.getCourse().remove(c1);
        
        univ.getInstructors().remove(ins1);//removnig the instructor from the university
        System.out.println("----------------------------------------------");
        System.out.println("University Information");
        System.out.println("----------------------------------------------");

        System.out.println("City: "+univ.getAddress().getCity());
        System.out.println("Street Address: "+univ.getAddress().getStName());
        System.out.println("Street Number: "+univ.getAddress().getStNum());

        
        System.out.println("----------------------------------------------");
        System.out.println("List of student");
        System.out.println("----------------------------------------------");

        
        Iterator students = univ.getStudents().iterator();
        while (students.hasNext()) {
            Student st = (Student)students.next();
            System.out.println("Name is: "+ st.getFName()+ " "+st.getLName());
        
        }
        System.out.println("----------------------------------------------");
        System.out.println("List of instructor and their students");
        System.out.println("----------------------------------------------");

        Iterator instructors = univ.getInstructors().iterator();
        while (instructors.hasNext()){
        
            Instructor ins = (Instructor)instructors.next();
            System.out.println("Instructor "+ins.getFName()+" "+ins.getLName()+ " advises:");
            
            Iterator sts = ins.getStudents().iterator();
            while (sts.hasNext()){
                Student st = (Student)sts.next();
                System.out.println("Student name: "+st.getFName()+" "+st.getLName());
            }
            
        }
        
        System.out.println("-----------------------------------------------");
        System.out.println("List of courses and students");
        System.out.println("-----------------------------------------------");

        Iterator courses = univ.getCourses().iterator();
        while (courses.hasNext()){
            Course cor = (Course)courses.next();
            System.out.println("Course: "+ cor.getCName()+" "+cor.getCNumber());
            System.out.println("Class Room Number: "+ cor.getClassroom().getRoomNum());

            
            Iterator co_st = cor.getStudents().iterator();
            while (co_st.hasNext()){
            Student st = (Student)co_st.next();
                System.out.println("Student: "+st.getFName()+" "+st.getLName());
            }
            System.out.println("");
        }
        
        Iterator cls = univ.getClassrooms().iterator();
        while(cls.hasNext()){
            Classroom clr = (Classroom)cls.next();
            System.out.println("Classroom "+ clr.getRoomNum());
               
           Iterator cs = clr.getCourse().iterator();
           while (cs.hasNext()){
             Course c = (Course)cs.next();
             System.out.println("course "+ c.getCName()+ " "+c.getCNumber());
             
             System.out.println("This proffessor " +c.getInstructor().getFName() + " "+ c.getInstructor().getLName());
             
             Iterator st = c.getStudents().iterator();
             
             while(st.hasNext()){
             
                 Student s = (Student) st.next();
                 
                 System.out.println("Name of the student is "+s.getFName() +" "+ s.getLName());
             
             }
        }
           
           
        }
        
    //List of student and corresponding Instructor
        System.out.println("List of students and their corresponding Instructor.");
        Iterator it = univ.getStudents().iterator();
        while(it.hasNext()){
        Student st = (Student) it.next(); 
            System.out.println("Student " + st.getFName() + " " + st.getLName()+ " Professor "+ st.getInstructor().getFName() +
                    " "+ st.getInstructor().getLName());
        }
    
    
    }
    
}
