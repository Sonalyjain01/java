import javax.swing.*;
import java.awt.event.*;
public class CheckBoxExample extends Jframe implements Action listener{
JLabel l;
JCheckBox cb1,cb2,cb3;
JButton b;
CheckBoxExample(){
l=new JLabel("Food Ordering System");
l.setBounds(100,100,150,30);
cb1=new JCheckBox("Pizza @ 100");
cb1.setBounds(150,200,50,50);
cb2=new JCheckBox("Burger @ 50");
cb2.setBounds(200,100,50,50);
cb3=new JCheckBox("Tea @ 10");
cb3.setBounds(80,100,50,50);
b=new JButton("Order");
b.setBounds(100,50,80,30);
b.addActionListener(this);
add(l); add(cb1); add(cb2);
add(cb3); add(b);
setSize(400,400);
setLayout(null);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
float amount=0;
String msg="";
if(cb1.isSelect()){
amount+=100;
msg="Pizza:100\n";
}
if(cb2.isSelect()){
amount+=50;
msg+="Burger:50\n";
}
if(cb3.isSelect()){
amount+=10;
msg+="Tea:10\n";
}
msg+="............\n";
JOptionPane.showMessageDialog(this,msg+"Total:"+amount);
}
public static void main(String[] abc){
new CheckBoxExample();
}
}

