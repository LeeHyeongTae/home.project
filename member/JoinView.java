package com.bit.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoinView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JPanel panel;
	JButton saveButton, cancelButton;
	JTextField[] textFields;
	JLabel[] labels;
	MemberService memberService;
	
	public JoinView() {
		
		memberService = new MemberServiceImpl();
	}

	
	public void open() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		this.add(panel);
		this.setVisible(true);
		labels = new JLabel[5];
		textFields = new JTextField[5];
		
		String[] labelNames = {"이름", "아이디", "패스워드", "SSN", "추가사항"};
		
		for(int i=0; i<labelNames.length; i++) {
			labels[i] = new JLabel(labelNames[i]);
			panel.add(labels[i]);
			textFields[i] = new JTextField();
			panel.add(textFields[i]);
		}
		
		saveButton = new JButton("저장");
		cancelButton = new JButton("취소");
		saveButton.addActionListener(this);
		cancelButton.addActionListener(this);
		panel.add(saveButton);
		panel.add(cancelButton);
		labels[0].setBounds(40,10,40,40);
		labels[1].setBounds(40,50,40,40);
		labels[2].setBounds(40,90,60,40);
		labels[3].setBounds(40,130,40,60);
		labels[4].setBounds(40,170,60,40);
		textFields[0].setBounds(120,10,200,30);
		textFields[1].setBounds(120,50,200,30);
		textFields[2].setBounds(120,90,200,30);
		textFields[3].setBounds(120,130,280,30);
		textFields[4].setBounds(120,180,280,120);
		saveButton.setBounds(125, 330, 80, 30);
		cancelButton.setBounds(240, 330, 80, 30);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {//버튼이 내부적으로 이벤트를 가지고 있다.
		if(e.getSource() == saveButton) {
			textFields[0].setText("홍길동,유관순,이순신,신사임당,이도");
			textFields[1].setText("hong,you,lee,shin,leedo");
			textFields[2].setText("1,1,1,1,1");
			textFields[3].setText("900101-1,910506-2,98515-3,900101-2,020606-3");
			JOptionPane.showMessageDialog(this,
						String.format("%s / %s / %s / %s", 
							textFields[0].getText(),
							textFields[1].getText(),
							textFields[2].getText(),
							textFields[3].getText()));
			String[] data = String.format("%s / %s / %s / %s", 
					textFields[0].getText(),
					textFields[1].getText(),
					textFields[2].getText(),
					textFields[3].getText()).split("/");
			
			String[] names = data[0].split(",");
			String[] ids = data[1].split(",");
			String[] pws = data[2].split(",");
			String[] ssns = data[3].split(",");

//			memberService.add(new Member(names[0],ids[0],pws[0],ssns[0])); 
//			memberService.add(new Member(names[1],ids[1],pws[1],ssns[1])); 
//			memberService.add(new Member(names[2],ids[2],pws[2],ssns[2])); 
//			memberService.add(new Member(names[3],ids[3],pws[3],ssns[3])); 
					
			//각 스플릿을 통해 담는다.
			System.out.println("1");
			
			Member[] members = memberService.getMembers();//getMember
			System.out.println("length: " + members.length);
			
			for(int i=0; i<members.length; i++) {
				
				memberService.add(new Member(names[i],ids[i],pws[i],ssns[i])); 
				System.out.println(members[i].getMembers());
				System.out.println(members[i].toString());
			}
		}else if(e.getSource() == cancelButton){
			JOptionPane.showMessageDialog(this, "취소");
			return;
		}
	}
	
}