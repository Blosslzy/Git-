package shiyan_lifegame;

import javax.swing.*;
import java.awt.*;

public class lifegame extends JFrame {

	lifegame()// ���캯��
	{
		this.setSize(1000, 820); // ������Ϸ�����С
		this.setTitle("������Ϸ����ϸ΢���ĶԱ�");
		this.setBackground(new Color(0, 0, 0));// ���ñ���ɫΪ��ɫ
		this.add(new map());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}
	

	public static void main(String[] args) {
		lifegame game = new lifegame();
		game.setVisible(true);
	}
}
