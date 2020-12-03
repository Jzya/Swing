import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

public class App {
    JPanel myPanel = new JPanel();
    JLabel qingwa1 = new JLabel();
    JLabel qingwa2 = new JLabel();
    JLabel qingwa3 = new JLabel();
    JLabel background = new JLabel();
    JTextArea textArea_A=new JTextArea();

    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                textArea_A.append(String.valueOf(e.getKeyChar()));
                if (textArea_A.getText().equals("1")) {
                    qingwa1.setBounds(400,255, 128, 128);
                    textArea_A.setText("");
                }else
                if (textArea_A.getText().equals("2")) {
                    qingwa1.setBounds(270,100, 128, 128);
                    textArea_A.setText("");
                }else
                if (textArea_A.getText().equals("3")) {
                    qingwa1.setBounds(700,25, 128, 128);
                    textArea_A.setText("");
                    qingwa2.setEnabled(true);
                }else

                if (textArea_A.getText().equals("4")) {
                    qingwa2.setBounds(400,255, 128, 128);
                    textArea_A.setText("");
                }else
                if (textArea_A.getText().equals("5")) {
                    qingwa2.setBounds(270,100, 128, 128);
                    textArea_A.setText("");
                }else
                if (textArea_A.getText().equals("6")) {
                    qingwa2.setBounds(600,25, 128, 128);
                    textArea_A.setText("");
                }

                if (textArea_A.getText().equals("7")) {
                    qingwa3.setBounds(400,255, 128, 128);
                    textArea_A.setText("");
                }else
                if (textArea_A.getText().equals("8")) {
                    qingwa3.setBounds(270,100, 128, 128);
                    textArea_A.setText("");
                }else
                if (textArea_A.getText().equals("9")) {
                    qingwa3.setBounds(500,25, 128, 128);
                    textArea_A.setText("");
                }

            }
        });
    }


    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("青蛙过河");
        myPanel.setLayout(null);
        myPanel.setFocusable(true);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1024,600);
        frame.setVisible(true);


        textArea_A.setText("");
        textArea_A.setBounds(0,0,100,50);
        textArea_A.setBackground(Color.orange);
        myPanel.add(textArea_A);
        myPanel.add(qingwa1);
        myPanel.add(qingwa2);
        myPanel.add(qingwa3);
        myPanel.add(background);



        URL img1 = App.class.getResource("images/frog.png");
        qingwa1.setIcon(new ImageIcon(img1));
        qingwa1.setBounds(80,400,128,128);


        URL img2 = App.class.getResource("images/frog.png");
        qingwa2.setIcon(new ImageIcon(img2));
        qingwa2.setBounds(180,400,128,128);

        URL img3 = App.class.getResource("images/frog.png");
        qingwa3.setIcon(new ImageIcon(img3));
        qingwa3.setBounds(280,400,128,128);


        URL img4 = App.class.getResource("images/background.png");
        background.setIcon(new ImageIcon(img4));
        background.setBounds(0,0,1024,600);

    }
    public static void main(String[] args) {
        new App().go();
    }
}
