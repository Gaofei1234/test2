package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	    private double num1; 
	    private double num2;
	    private JLabel label1 = new JLabel();
	    private JLabel label2 = new JLabel();
	    private JLabel label3 = new JLabel();
	    private JTextField field1 = new JTextField();
	    private JTextField field2 = new JTextField();
	    private JTextField field3 = new JTextField();
	    private JButton button1 = new JButton();
	    private JButton button2 = new JButton();
	    private JButton button3 = new JButton();
	    private JButton button4 = new JButton();
	 //通过构造方法加载一个简单计算器的界面	 
	    public Calculator() {
	    	
	        super("简单计算器");
	        try {
	            init();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	      
	    }
	 //对简单计算器的页面进行设置
	    private void init() {
	        this.setSize(300, 300);
	        label1.setText("第一个数：");
	        label2.setText("第二个数：");
	        label3.setText("结果：");
	        button1.setText("加法");
	        button2.setText("减法");
	        button3.setText("乘法");
	        button4.setText("除法");
	        label1.setBounds(10, 10, 100, 22);
	        label2.setBounds(10, 35, 100, 22);
	        label3.setBounds(10, 60, 100, 22);
	        field1.setBounds(110, 10, 100, 22);
	        field2.setBounds(110, 35, 100, 22);
	        field3.setBounds(110, 60, 100, 22);
	        button1.setBounds(10, 85, 100, 22);
	        button2.setBounds(110, 85, 100, 22);
	        button3.setBounds(110, 110, 100, 22);
	        button4.setBounds(10, 110, 100, 22);
	     
	        button1.addActionListener(new ActionListener() {
	 
	            public void actionPerformed(ActionEvent e) {
	            	//获取输入的两个数值
	                num1 = Double.parseDouble(field1.getText());
	                num2 = Double.parseDouble(field2.getText());
	                //把获取的结果设置到结果输入框中
	                field3.setText((num1+num2)+"");
	            }
	        });
	        button2.addActionListener(new ActionListener() {
	 
	            public void actionPerformed(ActionEvent e) {
            	    num1 = Double.parseDouble(field1.getText());
	                num2 = Double.parseDouble(field2.getText());
	                //把获取的结果设置到结果输入框中
	                field3.setText((num1-num2)+"");	            	
	            }
	        });
	        button3.addActionListener(new ActionListener() {
	 
	            public void actionPerformed(ActionEvent e) {
	            	    num1 = Double.parseDouble(field1.getText());
		                num2 = Double.parseDouble(field2.getText());
		                //把获取的结果设置到结果输入框中
		                field3.setText((num1*num2)+"");
	            }
	        });
	        button4.addActionListener(new ActionListener() {
	 
	            public void actionPerformed(ActionEvent e) {
	            	    num1 = Double.parseDouble(field1.getText());
		                num2 = Double.parseDouble(field2.getText());
		                if(num2 == 0) {
		                   field2.setText("除数不能为0"); 
		                }
		                //把获取的结果设置到结果输入框中
		                field3.setText((num1/num2)+"");
	            }
	        });
	        JPanel panel = (JPanel) this.getContentPane();
	        panel.setLayout(null);
	        panel.add(label1);
	        panel.add(label2);
	        panel.add(label3);
	        panel.add(field1);
	        panel.add(field2);
	        panel.add(field3);
	        panel.add(button1);
	        panel.add(button2);
	        panel.add(button3);
	        panel.add(button4);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setResizable(false);
	        this.setLocationRelativeTo(null);
	        this.setVisible(true);
	 
	    }
	    
	    
	   
}
