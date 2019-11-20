import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.B2E24B91-EC46-F08C-A6A7-F746ABBA6AF1]
// </editor-fold> 
public class Course {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7E3966D9-5DB4-745A-0A71-5E9571E78049]
    // </editor-fold> 
    private Classroom mClassroom;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.05DE56CD-B64F-C0AD-27DD-38FD75ADA42D]
    // </editor-fold> 
    private String cNumber;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.35882A6D-0C07-2493-9AC5-7493195DFA27]
    // </editor-fold> 
    private String cName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B8851CEF-4106-9E0D-F0E2-0EB6E58C8C47]
    // </editor-fold> 
    private int nCredits;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4DA81234-1F5B-5397-A9F5-012E3FACECBD]
    // </editor-fold> 
    private Instructor mInstructor;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4BC8C424-8AD2-12E0-7201-6170B0291A3B]
    // </editor-fold> 
    private ArrayList<Student> students=new ArrayList<>();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A3DB4033-3828-94F9-8D6A-A0DB66E48D8A]
    // </editor-fold> 
    public Course () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0BE881B7-1451-D30D-AC05-40D8546462BD]
    // </editor-fold> 
    public String getCName () {
        return cName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.ADB7FA38-0660-3413-3F4F-41C10CF7D8B0]
    // </editor-fold> 
    public void setCName (String val) {
        this.cName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C1FD85C2-EBF3-975B-89CF-C61DC71C68E8]
    // </editor-fold> 
    public String getCNumber () {
        return cNumber;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.56D9D215-A1FE-D0F8-611D-B96A7FFB839D]
    // </editor-fold> 
    public void setCNumber (String val) {
        this.cNumber = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AF789CD2-D098-FA55-572A-39396051946E]
    // </editor-fold> 
    public Instructor getInstructor () {
        return mInstructor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.95B5F0D8-9314-F4B1-3532-6EAD29F01EBF]
    // </editor-fold> 
    public void setInstructor (Instructor val) {
        this.mInstructor = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B68DD590-C751-045C-E929-A4F8BB9394AF]
    // </editor-fold> 
    public int getNCredits () {
        return nCredits;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.811F06E5-7321-68FD-A1B0-0FECFA878715]
    // </editor-fold> 
    public void setNCredits (int val) {
        this.nCredits = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.814AD3C1-5443-229E-00CA-45DE91CA5BBF]
    // </editor-fold> 
    public ArrayList<Student> getStudents () {
        return students;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EFF07BFC-FE0F-79E1-6F6C-6EE11309BF66]
    // </editor-fold> 
    public void setStudents (ArrayList<Student> val) {
        this.students = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DAF8DE03-8FBB-71BD-A970-E64456CC9456]
    // </editor-fold> 
    public Classroom getClassroom () {
        return mClassroom;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.45AE0D83-8AF5-B4E3-C61F-C5768CC31336]
    // </editor-fold> 
    public void setClassroom (Classroom val) {
        this.mClassroom = val;
    }

}

