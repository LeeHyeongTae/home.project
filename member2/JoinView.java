package com.bit.member2;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JoinView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
    private Container container; 
    private JLabel title,nameLabel,useridLabel,passwordLabel,
    				ssnLabel,addrLabel; 
    private JTextField nameText, useridText, passwordText, ssnText,
    					addrText; 
    private JTextArea resultText; 
    private JButton submitButton, listButton, loginButton; 
    public MemberService memberService;
    
    public void open(){ 
        memberService = new MemberServiceImpl();
    	setTitle("Swing Exercise"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
   
        container = getContentPane(); 
        container.setLayout(null); 
  
        title = new JLabel("Swing Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        container.add(title); 
  
        nameLabel = new JLabel("Name"); 
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        nameLabel.setSize(100, 20); 
        nameLabel.setLocation(100, 100); 
        container.add(nameLabel); 
  
        nameText = new JTextField(); 
        nameText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        nameText.setSize(190, 20); 
        nameText.setLocation(200, 100); 
        container.add(nameText); 
  
        useridLabel = new JLabel("Userid"); 
        useridLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        useridLabel.setSize(100, 20); 
        useridLabel.setLocation(100, 150); 
        container.add(useridLabel); 
  
        useridText = new JTextField(); 
        useridText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        useridText.setSize(150, 20); 
        useridText.setLocation(200, 150); 
        container.add(useridText); 
  
        passwordLabel = new JLabel("Password"); 
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        passwordLabel.setSize(100, 20); 
        passwordLabel.setLocation(100, 200); 
        container.add(passwordLabel); 
        
        passwordText = new JTextField(); 
        passwordText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        passwordText.setSize(150, 20); 
        passwordText.setLocation(200, 200); 
        container.add(passwordText);
  
        ssnLabel = new JLabel("SSN"); 
        ssnLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        ssnLabel.setSize(100, 20); 
        ssnLabel.setLocation(100, 250); 
        container.add(ssnLabel); 
        
        ssnText = new JTextField(); 
        ssnText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        ssnText.setSize(150, 20); 
        ssnText.setLocation(200, 250); 
        container.add(ssnText);
  
        addrLabel = new JLabel("Address"); 
        addrLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        addrLabel.setSize(100, 20); 
        addrLabel.setLocation(100, 300); 
        container.add(addrLabel); 
        
        addrText = new JTextField(); 
        addrText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        addrText.setSize(150, 20); 
        addrText.setLocation(200, 300); 
        container.add(addrText);
        
  
        submitButton = new JButton("Submit"); 
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submitButton.setSize(100, 20); 
        submitButton.setLocation(120, 450);
        submitButton.addActionListener(this);
        container.add(submitButton); 
  
        listButton = new JButton("List"); 
        listButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        listButton.setSize(100, 20); 
        listButton.setLocation(240, 450); 
        listButton.addActionListener(this);
        container.add(listButton); 

        loginButton = new JButton("Login"); 
        loginButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        loginButton.setSize(100, 20); 
        loginButton.setLocation(360, 450);
        loginButton.addActionListener(this);
        container.add(loginButton); 
  
        resultText = new JTextArea(); 
        resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        resultText.setSize(300, 400); 
        resultText.setLocation(500, 100); 
        resultText.setLineWrap(true); 
        resultText.setEditable(false); 
        container.add(resultText); 
 
        setVisible(true); 
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submitButton) {
			JOptionPane.showMessageDialog(this, "저장");
			nameText.setText("홍길동,유관순,이순신,안중근,이도");
			useridText.setText("hong,you,lee,ann,leedo");
			passwordText.setText("1,1,1,1,1");
			ssnText.setText("910617-1,900110-2,941212-1,970517-1,890411-3");
			addrText.setText("서울,서울,광주,하얼빈,부산");
			String[] names = nameText.getText().split(",");
			String[] userids = useridText.getText().split(",");
			String[] passwords = passwordText.getText().split(",");
			String[] ssns = ssnText.getText().split(",");
			String[] addrs = addrText.getText().split(",");
			for(int i=0; i<names.length; i++) {
			Member member = new Member();
			member.setName(names[i]);
			member.setUserId(userids[i]);
			member.setPassword(passwords[i]);
			member.setSsn(ssns[i]);
			member.setAddrs(addrs[i]);
			memberService.add(member);
			}
			
		}else if(e.getSource()==listButton) {
			JOptionPane.showMessageDialog(this, "리스트");
			nameText.setText("");
			useridText.setText("");
			passwordText.setText("");
			ssnText.setText("");
			addrText.setText("");
			resultText.setText(memberService.getToString());
		}else if(e.getSource()==loginButton) {
			JOptionPane.showMessageDialog(this, "로그인");
			Member member = new Member();
			member.setUserId(useridText.getText());
			member.setPassword(passwordText.getText());
			System.out.println(member.getUserId());
			System.out.println(member.getPassword());
			if(member.getPassword().equals(memberService.login(member).getPassword())) {
				JOptionPane.showMessageDialog(this, "로그인성공");
				resultText.setText(memberService.login(member).getString());
			}else {
				JOptionPane.showMessageDialog(this, "로그인실패");
				resultText.setText("로그인실패");
			}
		}
		
	} 
}