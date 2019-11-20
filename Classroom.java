
import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.813CFFCC-EF8C-D808-F237-6D72222653DC]
// </editor-fold> 
public class Classroom {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.481EEE11-FF7F-D3D7-A98E-78FD61F04898]
    // </editor-fold> 
    private ArrayList<Course> mCourse =new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0062FE7A-5F3E-6DEE-2EDB-204778D932B2]
    // </editor-fold> 
    private int roomNum;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EBDCB1B3-E2FC-8CBD-6B11-9172A42D606C]
    // </editor-fold> 
    public Classroom () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A0B42446-0CEE-E935-2B7B-ED279093A342]
    // </editor-fold> 
    public int getRoomNum () {
        return roomNum;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1BAE723C-D6AF-F69B-26EB-8D146AFBF8DC]
    // </editor-fold> 
    public void setRoomNum (int val) {
        this.roomNum = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.49B3841E-42E2-4C85-01BA-749E0439EE70]
    // </editor-fold> 
    public ArrayList<Course> getCourse () {
        return mCourse;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6E77F4C0-3C28-395B-0443-965308455A43]
    // </editor-fold> 
    public void setCourse (ArrayList<Course> val) {
        this.mCourse = val;
    }

}

