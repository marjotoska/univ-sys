
import javax.swing.DefaultListModel;
import javax.swing.JList;


public class ListFunctions {
    
    public  static void addElementToList(JList list, Object obj){
    
             
       DefaultListModel dlm = new DefaultListModel();
       //adding student to the list
       int size = list.getModel().getSize();
       for (int i=0;i<size;i++){
         
          dlm.addElement(list.getModel().getElementAt(i));

      }
       dlm.addElement(obj);
       list.setModel(dlm);
    }
    public static void deleteElementFromList(JList list, Object obj){
    
       DefaultListModel dlm = new DefaultListModel();
       //adding student to the list
       int size = list.getModel().getSize();
       for (int i=0;i<size;i++){
         
          dlm.addElement(list.getModel().getElementAt(i));

      } 
       dlm.removeElement(obj);
       list.setModel(dlm);
        
    
    }
}
