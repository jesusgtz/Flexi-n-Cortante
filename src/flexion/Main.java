package flexion;

/**
 *
 * @author jesus
 */
public class Main {  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInput().setVisible(true);
            }
        });
        
    }
}
