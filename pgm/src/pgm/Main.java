package pgm;

import javax.swing.*;

public class Main { 
    public static void main(String[] args) {
        // JFrame 설정
        JFrame jf = new JFrame();
        jf.setBounds(0, 10, 360, 800); // jf 위치, 크기 지정
        jf.setTitle("Main");
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 닫기 버튼 누르면 종료
        
        // Login 패널 추가
        jf.add(new Login());
        jf.setVisible(true); // jf가 보이게 설정
    }
}
