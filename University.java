import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.26B78252-246C-A50F-B1E0-FA3D13DF4D43]
// </editor-fold> 
public class University {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1224C094-7C17-8275-C451-5D4B14155C12]
    // </editor-fold> 
    private String name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.45B716EF-D324-0C2A-8648-956F0A02D1AA]
    // </editor-fold> 
    private ArrayList<Student> students = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3AA696DB-9E2C-44BE-E7C9-7CF4A6D54C9D]
    // </editor-fold> 
    private ArrayList<Instructor> instructors = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4F749AF6-DA78-38C1-B21D-B00B84EC473D]
    // </editor-fold> 
    private ArrayList<Course> courses = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.95A08255-1D6A-016A-CC95-F7E753A32832]
    // </editor-fold> 
    private ArrayList<Classroom> classrooms = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CBE05657-705B-400D-E22B-3B28F64FF61F]
    // </editor-fold> 
    private Address address;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EF73E6CE-FD8B-57F7-C759-8FC352F7E1C5]
    // </editor-fold> 
    public University () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D81B39CA-532C-3D36-1E7D-07CD19EE429A]
    // </editor-fold> 
    public Address getAddress () {
        return address;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.52BD08E5-A5D2-9AC2-EAD4-665E40ABB46C]
    // </editor-fold> 
    public void setAddress (Address val) {
        this.address = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.300407D7-6404-B512-2A1B-C08B658A5B72]
    // </editor-fold> 
    public ArrayList<Classroom> getClassrooms () {
        return classrooms;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3FD65246-7553-00F2-C918-38974000C4C1]
    // </editor-fold> 
    public void setClassrooms (ArrayList<Classroom> val) {
        this.classrooms = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B12BD727-ED03-F9E1-FFF9-F6A176BC19DE]
    // </editor-fold> 
    public ArrayList<Course> getCourses () {
        return courses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7467FD2C-0756-0AD6-8061-86BE877E935A]
    // </editor-fold> 
    public void setCourses (ArrayList<Course> val) {
        this.courses = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7186FAC2-D810-7785-BFBC-2515E4694501]
    // </editor-fold> 
    public ArrayList<Instructor> getInstructors () {
        return instructors;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.970FD5E1-0329-0F97-9D66-63A5F8B34A94]
    // </editor-fold> 
    public void setInstructors (ArrayList<Instructor> val) {
        this.instructors = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.55D23E32-81D9-0D61-1B67-1CA0C297D632]
    // </editor-fold> 
    public String getName () {
        return name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.505283DD-C65F-9813-0581-F2E795038433]
    // </editor-fold> 
    public void setName (String val) {
        this.name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BCB0B00D-BAA8-0DAC-FD82-DAA11178F2E8]
    // </editor-fold> 
    public ArrayList<Student> getStudents () {
        return students;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6FD3EA88-21A7-1919-2435-2E01DC4BA944]
    // </editor-fold> 
    public void setStudents (ArrayList<Student> val) {
        this.students = val;
    }

}

