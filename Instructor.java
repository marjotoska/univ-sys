import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.D28EA0D3-4D3D-0822-A9CA-777715B8CDEA]
// </editor-fold> 
public class Instructor {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.456CA641-B8CA-EA3E-9937-73C05E5770FD]
    // </editor-fold> 
    private String id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8C21B015-74C7-8F01-A644-04510703DCCC]
    // </editor-fold> 
    private String fName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.07C99767-AA0E-E74E-7B9C-1F7BDC04689E]
    // </editor-fold> 
    private String lName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.680B9400-561C-6D64-DFD0-578C14FA7DB7]
    // </editor-fold> 
    private String gender;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3194B5ED-C501-8006-A385-755ABEABB9F6]
    // </editor-fold> 
    private ArrayList<Student> students = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.98DCDD15-AE09-6617-FC70-3C8FEDB6056D]
    // </editor-fold> 
    private ArrayList<Course> courses = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4C1A7033-EF51-A54A-33A3-0CEB4ECF57F6]
    // </editor-fold> 
    public Instructor () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0C0AFB66-B841-1F98-4ED6-683CD3445468]
    // </editor-fold> 
    public ArrayList<Course> getCourses () {
        return courses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7EAB6D03-8BAA-9DFA-D588-1EB730F0FEB5]
    // </editor-fold> 
    public void setCourses (ArrayList<Course> val) {
        this.courses = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7FBD9C32-E31E-00C3-9ADC-BC981DBE3523]
    // </editor-fold> 
    public String getFName () {
        return fName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0815CC8E-5C8D-EA69-95CC-D2122B66AE20]
    // </editor-fold> 
    public void setFName (String val) {
        this.fName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F8C4B6A5-B880-B76B-A199-7D7A7D5349EB]
    // </editor-fold> 
    public String getGender () {
        return gender;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.211D6663-CE23-4BDD-4ED5-5F868A16BBB7]
    // </editor-fold> 
    public void setGender (String val) {
        this.gender = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0FA7DFA8-5456-FF17-B42D-DCD0C73B615E]
    // </editor-fold> 
    public String getId () {
        return id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.48C61E4C-D630-0018-1CD9-18F7EF801854]
    // </editor-fold> 
    public void setId (String val) {
        this.id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.83895DEA-535C-DAC9-1B6B-6274D5948FC0]
    // </editor-fold> 
    public String getLName () {
        return lName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.858F6C5F-DF74-143B-AC7D-C8A341DA042A]
    // </editor-fold> 
    public void setLName (String val) {
        this.lName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7EE202E4-F0EE-AFE8-C177-B137F73D962D]
    // </editor-fold> 
    public ArrayList<Student> getStudents () {
        return students;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.55C50A2D-A3A9-CF49-BDB8-945A4E5D0F9E]
    // </editor-fold> 
    public void setStudents (ArrayList<Student> val) {
        this.students = val;
    }

}

