package cau.wintercamp.chatchat.client;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class UIMain extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public Client client;
	
	public UILoginPage loginPage;
	public UIChatPage  chatPage;
	
	public UIMain(Client client){
		
		super("ChatChat!");
		this.init();
		this.client = client;
	}
	
	
	public void init(){
		
		
		this.getContentPane().setLayout(new GridLayout(1, 1));
		
		this.loginPage = new UILoginPage(this);
		this.getContentPane().add(loginPage);
		
		
		this.setVisible(true);
		this.setSize(400,400);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

}