package z_exc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

class MyForm2 extends Frame {
	Button b;
	
	MyForm2() {
		super("나의 두번째 창");
		b = new Button("OK");
	}
	void addLayout() {
		
		setLayout(new FlowLayout());
		add(b);
		
		setBounds(100,200,300,200);	//부모꺼라서 오류가 안남
		setVisible(true);
		
		//이벤트 처리
		MyEvent2 evt = new MyEvent2();
		b.addActionListener(evt);
	}
	
	class MyEvent2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "버튼이 눌렸습니다.");
		}
		
	}
}

public class Test2 {

	public static void main(String[] args) {
		MyForm2 my2 = new MyForm2();
		my2.addLayout();
	}

}
