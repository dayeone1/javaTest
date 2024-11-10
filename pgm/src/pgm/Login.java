package pgm;

import java.awt.BorderLayout;
import javax.swing.*;

public class Login extends JPanel {
    JLabel login_label = new JLabel("Login", JLabel.CENTER);
    JLabel background;

    public Login() {
        setLayout(new BorderLayout()); // 레이아웃 설정

        // 배경 이미지 설정
        background = new JLabel();
        ImageIcon cloud = new ImageIcon("src/img/cloud.png"); // 이미지 경로
        ImageIcon sky = new ImageIcon("src/img/sky.png");
        background.setIcon(sky);
        background.setIcon(cloud);
        
        // JLabel을 패널에 추가
        add(background, BorderLayout.CENTER);
        add(login_label, BorderLayout.NORTH);
    }
}
