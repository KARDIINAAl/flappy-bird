import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception {
        int boardwidth=360;
        int boardheight=640;
        JFrame frame = new JFrame("FLAPPY BIRD");
        
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(boardwidth,boardheight);
        follpyclass bird = new follpyclass();
        frame.add(bird);
        frame.pack();
        bird.requestFocus();             
        frame.setVisible(true);
    }
}   
