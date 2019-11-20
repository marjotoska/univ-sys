import java.util.ArrayList; 
import java.util.Date;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.0BC39200-5B00-069B-6E8E-E36DFA9B281A]
// </editor-fold> 
public class Student {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.748BE827-FD59-DAB5-B56B-17EE795ABF16]
    // </editor-fold> 
    private String id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AED97BA0-C235-432A-ADA4-1CDC9EE7B798]
    // </editor-fold> 
    private String fName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.45F055DF-57F5-8888-72EF-8F9749D3A9A8]
    // </editor-fold> 
    private String lName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.738C74E9-69DD-3464-6AD5-A98507D6CA3C]
    // </editor-fold> 
    private String gender;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A8E3E921-6691-85EE-1F68-E26A2741F954]
    // </editor-fold> 
    private Date dob;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9C7B4A74-E124-1F0C-D6C6-491D5CD6FC0C]
    // </editor-fold> 
    private Instructor mInstructor;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4F561BBD-6FB9-C184-2D1B-FEBD7985E8C0]
    // </editor-fold> 
    private ArrayList<Address> addresses = new ArrayList();;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DAF1DFD9-ABDD-9871-7425-76DEB3E21A82]
    // </editor-fold> 
    private ArrayList<Course> mCourse = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ADCB3B46-79E1-A59B-AB0B-16400460D1A5]
    // </editor-fold> 
    public Student () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.050F0E5D-AD5E-5C2E-559B-314E325D6147]
    // </editor-fold> 
    public ArrayList<Address> getAddresses () {
        return addresses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.49595B70-2E3A-F172-4690-EA6304F5B657]
    // </editor-fold> 
    public void setAddresses (ArrayList<Address> val) {
        this.addresses = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EB62F2E2-108B-F1ED-259C-77326B38BB55]
    // </editor-fold> 
    public Date getDob () {
        return dob;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3EAA1FEA-F959-4D50-3AAC-D75961B0E186]
    // </editor-fold> 
    public void setDob (Date val) {
        this.dob = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B86291A1-CA2C-97BD-84CB-0D3FFFFABF1E]
    // </editor-fold> 
    public String getFName () {
        return fName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.42C03DD2-1D28-43AF-1E17-843C1AA9AA37]
    // </editor-fold> 
    public void setFName (String val) {
        this.fName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CA4161B0-8296-6EB1-E5AB-FA55DD712720]
    // </editor-fold> 
    public String getGender () {
        return gender;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FCF525B8-60AA-76C8-F74D-FD9B97230D6D]
    // </editor-fold> 
    public void setGender (String val) {
        this.gender = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.61B1D036-3F4F-6DA8-ABBB-EF775C3AF2AC]
    // </editor-fold> 
    public String getId () {
        return id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.298D0BAC-C932-B842-FFFF-E5FA9C899B8F]
    // </editor-fold> 
    public void setId (String val) {
        this.id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AFD82A54-3FC0-63AB-5BDA-804FAE3B7B49]
    // </editor-fold> 
    public String getLName () {
        return lName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.70594B16-FEE4-899E-F25A-4A7D751523EF]
    // </editor-fold> 
    public void setLName (String val) {
        this.lName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FE2324C6-0E2B-727A-338E-B8141179243F]
    // </editor-fold> 
    public ArrayList<Course> getCourse () {
        return mCourse;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.100B1BA0-B74E-7FAE-9D16-0E18ED1754E0]
    // </editor-fold> 
    public void setCourse (ArrayList<Course> val) {
        this.mCourse = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3389D8F6-9C55-DD75-A99D-D223AD62AB01]
    // </editor-fold> 
    public Instructor getInstructor () {
        return mInstructor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CB7C36BD-2F43-86C8-9B1C-ADDF31553703]
    // </editor-fold> 
    public void setInstructor (Instructor val) {
        this.mInstructor = val;
    }

    @Override
    public String toString() {
        return fName + " " + lName;
    }

}

