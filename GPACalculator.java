/*Write a program with a GUI to calculate your Grade Point Average       
Written by: Torres Wilson*/
       
public class GPACalculator extends javax.swing.JFrame
implements java.awt.event.ActionListener {
 int loop;
 double points=0, ePoints=0, eCredits=0, gPA=0, credits=0;//declare variables 

//Declaring parts of GUI
 javax.swing.JLabel enterGrade =  
new javax.swing.JLabel("Enter letter grade ");

javax.swing.JTextField inGrade = 
new javax.swing.JTextField();

javax.swing.JLabel enterNumCredits =
new javax.swing.JLabel("Enter number of credits hours ");

javax.swing.JTextField inCredits = 
new javax.swing.JTextField();

javax.swing.JButton button = 
new javax.swing.JButton("Calculate");

javax.swing.JLabel showGPA =
new javax.swing.JLabel("Cummulative GPA is ");

//Declaring parts of GUI to indicate if you're Underweight,Normal,Overweight
//Creating the GUI.
 
public GPACalculator() {
	 setSize(200, 400); 
	 java.awt.Container pane = getContentPane();
	 javax.swing.BoxLayout where = new javax.swing.BoxLayout(pane,
	 javax.swing.BoxLayout.Y_AXIS);
	 setLayout( where );
    
    //Adding GUI objects
	 pane.add( enterGrade );
	 pane.add(inGrade);
	 pane.add(enterNumCredits);
	 pane.add(inCredits);
	 pane.add(button);
	 pane.add(showGPA);
	 button.addActionListener( this ); //Action listener
	 setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
	 setVisible( true ); //making visible
	 }
    
//Getting info from user and converting to a double 
 public void actionPerformed(java.awt.event.ActionEvent thing) {
 String grade = ("");
 grade = inGrade.getText().trim();
 credits = Double.parseDouble( inCredits.getText ().trim() );
if (grade.equals("A")){ //stating how many points equals to the grade
    points = 4.0; 
 }else if (grade.equals("B")){
    points = 3.0;
 }else if (grade.equals("C")){
     points = 2.0;
 }else if (grade.equals("D")){
    points = 1.0;
 }else if (grade.equals("F")){
    points = 0.0; 
 }  
 ePoints += (points*credits); //sum of points
 eCredits = eCredits + credits;// sum of credits
 gPA =(ePoints)/eCredits; //Calculation of GPA
 showGPA.setText("Cummulative GPA is " + gPA);
 }
 public static void main (String[]aardvark) {
	 GPACalculator ant = new GPACalculator();
 }
}



 
 
 
 
 