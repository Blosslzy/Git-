package shiyan_lifegame;

import javax.swing.*;
import java.awt.*;

public class lifegame extends JFrame {

	lifegame()// 构造函数
	{
		this.setSize(1000, 820); // 设置游戏区域大小
		this.setTitle("生命游戏——细微差别的对比");
		this.setBackground(new Color(0, 0, 0));// 设置背景色为黑色
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
