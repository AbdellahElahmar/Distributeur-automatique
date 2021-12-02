/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributeur_automatique;

/**Distrubiteur Automatique
 *
 * @author MAHDI
 */
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.sql.*;

public class distributeur_automatique extends JFrame
implements ActionListener
{


//changeFrame
JFrame changeFrame = new JFrame("Veuillez prendre votre monnaie:");
//Banner Image and button:
JButton bannerButton = new JButton("Bienvenue à votre distributeur automatique");
JLabel selectLabel = new JLabel("Veuillez sélectionner vos produits :");


JLabel biscuits = new JLabel("Biscuits :");

JLabel chips = new JLabel("Chips :");

JLabel canettes = new JLabel("Boisson-canettes :");


ImageIcon productImage1 = new ImageIcon("build\\classes\\images_poduits\\1.jpg");
JButton product1 = new JButton("", productImage1);
JLabel product1des = new JLabel("Oreo", JLabel.CENTER);
JLabel product1price = new JLabel("2.5 DH", JLabel.CENTER);

ImageIcon productImage2 = new ImageIcon("build\\classes\\images_poduits\\2.png");
JButton product2 = new JButton("", productImage2);
JLabel product2des = new JLabel("Sablé", JLabel.CENTER);
JLabel product2price = new JLabel("2 DH", JLabel.CENTER);

ImageIcon productImage3 = new ImageIcon("build\\classes\\images_poduits\\3.jpg");
JButton product3 = new JButton("", productImage3);
JLabel product3des = new JLabel("Tango_sablito", JLabel.CENTER);

JLabel product3price = new JLabel("1 DH", JLabel.CENTER);
ImageIcon productImage4 = new ImageIcon("build\\classes\\images_poduits\\7.jpg");
JButton product4 = new JButton("", productImage4);
JLabel product4des = new JLabel("Conikos", JLabel.CENTER);
JLabel product4price = new JLabel("3 DH", JLabel.CENTER);
ImageIcon productImage5 = new ImageIcon("build\\classes\\images_poduits\\8.jpg");
JButton product5 = new JButton("", productImage5);
JLabel product5des = new JLabel("Crunchips", JLabel.CENTER);
JLabel product5price = new JLabel("2 DH", JLabel.CENTER);

ImageIcon productImage6 = new ImageIcon("build\\classes\\images_poduits\\9.jpg");
JButton product6 = new JButton("", productImage6);
JLabel product6des = new JLabel("Doritos", JLabel.CENTER);
JLabel product6price = new JLabel("4 DH", JLabel.CENTER);

ImageIcon productImage7 = new ImageIcon("build\\classes\\images_poduits\\4.jpg");
JButton product7 = new JButton("", productImage7);
JLabel product7des = new JLabel("Coca-Cola (330ml)", JLabel.CENTER);
JLabel product7price = new JLabel("3.5 DH", JLabel.CENTER);

ImageIcon productImage8 = new ImageIcon("build\\classes\\images_poduits\\5.png");
JButton product8 = new JButton("", productImage8);
JLabel product8des = new JLabel("Pepsi (330ml)", JLabel.CENTER);
JLabel product8price = new JLabel("5 DH", JLabel.CENTER);

ImageIcon productImage9 = new ImageIcon("build\\classes\\images_poduits\\6.jpg");
JButton product9 = new JButton("", productImage9);
JLabel product9des = new JLabel("Sprite (330ml)", JLabel.CENTER);
JLabel product9price = new JLabel("4 dh", JLabel.CENTER);


JLabel selectedLabel = new JLabel("Vous avez sélectionné les éléments suivants:");
JTextArea selectedItems = new JTextArea(8,250);

//Total price:
JLabel selectedItemTotalLabel = new JLabel("Total - Veuillez insérer:");
JTextField selectedItemTotal = new JTextField("0.00 DH", 30);


JLabel moneyInputLabel = new JLabel("Veuillez saisir votre argent\n" +":");


ImageIcon midhImage = new ImageIcon("build\\classes\\images_poduits\\0.5 dh.jpg");
JButton midhbutton = new JButton("", midhImage);

ImageIcon undhImage = new ImageIcon("build\\classes\\images_poduits\\1 DH.jpg");
JButton undhbutton = new JButton("", undhImage);

ImageIcon deuxdhImage = new ImageIcon("build\\classes\\images_poduits\\2 DHS.jpg");
JButton deuxdhbutton = new JButton("", deuxdhImage);

ImageIcon cinqdhImage = new ImageIcon("build\\classes\\images_poduits\\5 DHS.jpg");
JButton cinqdhButton = new JButton("", cinqdhImage);

ImageIcon dixdhImage = new ImageIcon("build\\classes\\images_poduits\\10 DHS.jpg");
JButton dixdhButton = new JButton("", dixdhImage);


JLabel moneyInputLabel2 = new JLabel("Vous avez entré:");
JTextField moneyInput = new JTextField("0.00 DH", 30);

ImageIcon enterCoinsImage = new ImageIcon("images/entercoins.jpg");
JButton enterCoins = new JButton("Entrez les pièces", enterCoinsImage);
ImageIcon returnCoinsImage = new ImageIcon("images/returncoins.jpg");
JButton returnCoins = new JButton ("Retour des pièces", returnCoinsImage);

JTextArea outputMessage = new JTextArea(2,30);

JLabel cancelOrderLabel = new JLabel("Annuler :");
ImageIcon cancelOrderImage = new ImageIcon("build\\classes\\images_poduits\\red_cross.png");
JButton cancelOrder = new JButton("", cancelOrderImage);

JTextField product1stock = new JTextField("10", 2);
JTextField product2stock = new JTextField("10", 2);
JTextField product3stock = new JTextField("10", 2);
JTextField product4stock = new JTextField("10", 2);
JTextField product5stock = new JTextField("10", 2);
JTextField product6stock = new JTextField("10", 2);
JTextField product7stock = new JTextField("10", 2);
JTextField product8stock = new JTextField("10", 2);
JTextField product9stock = new JTextField("10", 2);

JTextField midhStock = new JTextField("20", 2);
JTextField undhStock = new JTextField("20", 2);
JTextField deuxdhStock = new JTextField("20", 2);
JTextField cinqdhStock = new JTextField("20", 2);
JTextField dixdhStock = new JTextField("20", 2);


JTextField argentstock1 = new JTextField("0.5");
JTextField argentstock2 = new JTextField("1");
JTextField argentstock3 = new JTextField("2");
JTextField argentstock4 = new JTextField("5");
JTextField argentstock5 = new JTextField("10");



JButton takeChange = new JButton("prenez votre monnaie");


ImageIcon cfLabelicon = new ImageIcon("images/CFLabel1icon.jpg");
JLabel cfLabelTakeChange = new JLabel("Veuillez prendre le reste.", cfLabelicon, JLabel.CENTER);


JButton CFmidhbutton = new JButton("0.5 DH", midhImage);

JButton CFundhbutton = new JButton("1 DH", undhImage);

JButton CFdeuxdhbutton = new JButton("2 DH", deuxdhImage);

JButton CFcinqdhButton = new JButton("5 DH", cinqdhImage);

JButton CFdixdhButton = new JButton("10 DH", dixdhImage);

JTextField CFmidhStock = new JTextField("20", 2);
JTextField CFundhStock = new JTextField("20", 2);
JTextField CFdeuxdhStock = new JTextField("20", 2);
JTextField CFcinqdhStock = new JTextField("20", 2);
JTextField CFdixdhStock = new JTextField("20", 2);
JLabel CFpleaseTakeChange = new JLabel("Selectionner comment vous voulez recevoir l'argent :");
JLabel CFchangeRemainingLabel = new JLabel("Argent restant : DH");

JTextField CFchangeRemaining = new JTextField("",10);
JButton CFruleH1 = new JButton("");
JTextArea CFoutputMessage = new JTextArea("", 2, 30);
JButton CFfinished = new JButton("Fini");

JButton CFclose = new JButton("Fermer l'onglet");//will be enabled once correct change has been taken
Connection order;
Statement myStatement;
String writeString = "";


double productTotal = 0;//holds value for total to be inserted (total price of all selected items)
double totalInserted = 0;//holds value for total money put in

double product1stockNum = 10;
double product2stockNum = 10;
double product3stockNum = 10;
double product4stockNum = 10;
double product5stockNum = 10;
double product6stockNum = 10;
double product7stockNum = 10;
double product8stockNum = 10;
double product9stockNum = 10;




double midhStockNum = 20;
double undhStockNum = 20;
double deuxdhStockNum = 20;
double cinqdhStockNum = 20;
double dixdhStockNum = 20;


public static void main(String[] args) throws IOException
{
distributeur_automatique jf = new distributeur_automatique();

}

public distributeur_automatique()
{
setLayout(null);//Null layout for absolute positioning
setSize(895, 715);//Dimensions 830x705
setTitle("Distributeur Automatique");//Title
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

bannerButton.setBounds(210,10,400,30);
add(bannerButton);
selectLabel.setBounds(10,50,200,15);
add(selectLabel);

biscuits.setBounds(40,125,100,15);
add(biscuits);

chips.setBounds(50,250,100,15);
add(chips);

canettes.setBounds(5,400,150,15);
add(canettes);


product1.setBounds(120,75,100,100);
product1.addActionListener(this);
add(product1);
product2.setBounds(239,75,100,100);
product2.addActionListener(this);
add(product2);
product3.setBounds(357,75,100,100);
product3.addActionListener(this);


product1des.setBounds(120,175,100,15);
add(product1des);
product1price.setBounds(120,190,100,15);
product1price.setForeground(Color.red);
add(product1price);
product2des.setBounds(230,175,100,15);
add(product2des);
product2price.setBounds(230,190,100,15);
product2price.setForeground(Color.red);
add(product2price);
product3des.setBounds(357,175,100,15);
add(product3des);
product3price.setBounds(357,190,100,15);
product3price.setForeground(Color.red);
add(product3price);


product1stock.setBounds(221,75,17,20);
product1stock.setEditable(false);
add(product1stock);
product2stock.setBounds(340,75,17,20);
product2stock.setEditable(false);
add(product2stock);
product3stock.setBounds(458,75,17,20);
product3stock.setEditable(false);
add(product3stock);




add(product3);
product4.setBounds(120,210,100,100);
product4.addActionListener(this);
add(product4);
product5.setBounds(239,210,100,100);
product5.addActionListener(this);
add(product5);
product6.setBounds(357,210,100,100);
product6.addActionListener(this);
add(product6);



product4des.setBounds(120,312,100,15);
add(product4des);
product4price.setBounds(120,327,100,15);
product4price.setForeground(Color.red);
add(product4price);
product5des.setBounds(239,312,100,15);
add(product5des);
product5price.setBounds(239,327,100,15);
product5price.setForeground(Color.red);
add(product5price);
product6des.setBounds(357,312,100,15);
add(product6des);
product6price.setBounds(357,327,100,15);
product6price.setForeground(Color.red);
add(product6price);


product4stock.setBounds(221,210,17,20);
product4stock.setEditable(false);
add(product4stock);
product5stock.setBounds(340,210,17,20);
product5stock.setEditable(false);
add(product5stock);
product6stock.setBounds(458,210,17,20);
product6stock.setEditable(false);
add(product6stock);




product7.setBounds(120,348,100,100);
product7.addActionListener(this);
add(product7);
product8.setBounds(239,348,100,100);
product8.addActionListener(this);
add(product8);
product9.setBounds(357,348,100,100);
product9.addActionListener(this);
add(product9);


product7des.setBounds(120,448,100,15);
add(product7des);
product7price.setBounds(120,463,100,15);
product7price.setForeground(Color.red);
add(product7price);
product8des.setBounds(239,448,100,15);
add(product8des);
product8price.setBounds(239,463,100,15);
product8price.setForeground(Color.red);
add(product8price);
product9des.setBounds(357,448,100,15);
add(product9des);
product9price.setBounds(357,463,100,15);
product9price.setForeground(Color.red);
add(product9price);


product7stock.setBounds(221,348,17,20);
product7stock.setEditable(false);
add(product7stock);
product8stock.setBounds(340,348,17,20);
product8stock.setEditable(false);
add(product8stock);
product9stock.setBounds(458,348,17,20);
product9stock.setEditable(false);
add(product9stock);









selectedLabel.setBounds(15,475,260,15);
add(selectedLabel);
selectedItems.setBounds(15,495,265,140);
selectedItems.setEditable(false);
add(selectedItems);
//Prix total
selectedItemTotalLabel.setBounds(10,645,130,20);
add(selectedItemTotalLabel);
selectedItemTotal.setBounds(150,645,125,20);
selectedItemTotal.setEditable(false);
add(selectedItemTotal);

moneyInputLabel.setBounds(290,475,160,20);
add(moneyInputLabel);

midhbutton.setBounds(290,495,68,68);
midhbutton.addActionListener(this);
add(midhbutton);

undhbutton.setBounds(379,495,68,68);
undhbutton.addActionListener(this);
add(undhbutton);

deuxdhbutton.setBounds(471,495,68,68);
deuxdhbutton.addActionListener(this);
add(deuxdhbutton);

cinqdhButton.setBounds(348,565,68,68);
cinqdhButton.addActionListener(this);
add(cinqdhButton);

dixdhButton.setBounds(437,565,68,68);
dixdhButton.addActionListener(this);
add(dixdhButton);




argentstock1.setBounds(358,520,20,20);
argentstock1.setEditable(false);
add(argentstock1);
argentstock2.setBounds (447,520,18,20);
argentstock2.setEditable(false);
add(argentstock2);
argentstock3.setBounds(539,520,18,20);
argentstock3.setEditable(false);
add(argentstock3);
argentstock4.setBounds(416,590,18,20);
argentstock4.setEditable(false);
add(argentstock4);
argentstock5.setBounds (505,590,18,20);
argentstock5.setEditable(false);
add(argentstock5);




midhStock.setBounds(358,495,18,20);
midhStock.setEditable(false);
add(midhStock);
undhStock.setBounds(447,495,18,20);
undhStock.setEditable(false);
add(undhStock);
deuxdhStock.setBounds(539,495,18,20);
deuxdhStock.setEditable(false);
add(deuxdhStock);
cinqdhStock.setBounds(416,565,18,20);
cinqdhStock.setEditable(false);
add(cinqdhStock);
dixdhStock.setBounds(505,565,18,20);
dixdhStock.setEditable(false);
add(dixdhStock);


moneyInputLabel2.setBounds(290,638,110,20);
add(moneyInputLabel2);
moneyInput.setBounds(385,638,127,20);
moneyInput.setEditable(false);
add(moneyInput);


enterCoins.setBounds(568,475,250,40);
enterCoins.addActionListener(this);
add(enterCoins);
returnCoins.setBounds(568,525,250,40);
returnCoins.addActionListener(this);
add(returnCoins);
outputMessage.setBounds(568,575,250,50);
outputMessage.setEditable(false);
add(outputMessage);

cancelOrderLabel.setBounds(730,635,122,25);
add(cancelOrderLabel);
cancelOrder.setBounds(780,635,30,30);
cancelOrder.addActionListener(this);
add(cancelOrder);

takeChange.setBounds(540,635,160,25);
takeChange.setForeground(Color.red);

takeChange.setVisible(false);
takeChange.addActionListener(this);
add(takeChange);

try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
String sourceURL = new String ("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=VendingMachineDB.mdb;"); 
order = DriverManager.getConnection(sourceURL, "admin", "");
myStatement = order.createStatement();
}

catch (ClassNotFoundException cnfe) {
System.out.println(cnfe);
}
catch (SQLException sqle) {
System.out.println(sqle);
}
setVisible(true);
setResizable(true);
}

public void changeFrameInit()
{

changeFrame.setSize(504, 390);
changeFrame.setLayout(null);
changeFrame.setVisible(false);
changeFrame.setResizable(false);
changeFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

cfLabelTakeChange.setBounds(22,2,450,40);
changeFrame.add(cfLabelTakeChange);
CFpleaseTakeChange.setBounds(6,50,300,20);
changeFrame.add(CFpleaseTakeChange);


CFmidhbutton.setBounds(10,80,68,68);
CFmidhbutton.addActionListener(this);
changeFrame.add(CFmidhbutton);

CFundhbutton.setBounds(92,80,68,68);
CFundhbutton.addActionListener(this);
changeFrame.add(CFundhbutton);


CFdeuxdhbutton.setBounds(174,80,68,68);
CFdeuxdhbutton.addActionListener(this);
changeFrame.add(CFdeuxdhbutton);

CFcinqdhButton.setBounds(256,80,68,68);
CFcinqdhButton.addActionListener(this);
changeFrame.add(CFcinqdhButton);

CFdixdhButton.setBounds(338,80,68,68);
CFdixdhButton.addActionListener(this);
changeFrame.add(CFdixdhButton);



CFmidhStock.setBounds(35,150,18,20);
CFmidhStock.setEditable(false);
changeFrame.add(CFmidhStock);
CFundhStock.setBounds(117,150,18,20);
CFundhStock.setEditable(false);
changeFrame.add(CFundhStock);
CFdeuxdhStock.setBounds(199,150,18,20);
CFdeuxdhStock.setEditable(false);
changeFrame.add(CFdeuxdhStock);
CFcinqdhStock.setBounds(281,150,18,20);
CFcinqdhStock.setEditable(false);
changeFrame.add(CFcinqdhStock);
CFdixdhStock.setBounds(364,150,18,20);
CFdixdhStock.setEditable(false);
changeFrame.add(CFdixdhStock);


CFruleH1.setBounds(4,180,490,2);
changeFrame.add(CFruleH1);

CFchangeRemainingLabel.setBounds(6,190,130,20);
changeFrame.add(CFchangeRemainingLabel);
CFchangeRemaining.setBounds(125,190,60,20);
CFchangeRemaining.setEditable(false);
changeFrame.add(CFchangeRemaining);


CFoutputMessage.setBounds(120,220,250,60);
CFoutputMessage.setEditable(false);
changeFrame.add(CFoutputMessage);

CFfinished.setBounds(192,290,100,20);
CFfinished.addActionListener(this);
changeFrame.add(CFfinished);

CFclose.setBounds(145,320,200,25);
CFclose.addActionListener(this);
CFclose.setVisible(false);
changeFrame.add(CFclose);
}
private void closeChangeFrame()
{
changeFrame.setVisible(false);
}
public void actionPerformed(ActionEvent e)
{

DecimalFormat poundsFormat = new DecimalFormat ("0.00 DH");
DecimalFormat numFormat = new DecimalFormat ("0");

DecimalFormat twoFormat = new DecimalFormat("00");
DecimalFormat decFormat = new DecimalFormat("0.00");
String addToSelection;//adds the selected product to the output section


double errorGiveChange = totalInserted - productTotal;

if (e.getSource() == product1)
{

writeString ="INSERT INTO VendingMachine(Products, Price) VALUES('Oreo', '2.5 DH')";

addToSelection = selectedItems.getText() + "\n Oreo - 2.5 DH";
selectedItems.setText(addToSelection);

productTotal += 2.5;
selectedItemTotal.setText(poundsFormat.format(productTotal));

product1stockNum -= 1;
product1stock.setText(numFormat.format(product1stockNum));

if (product1stockNum == 0)
{
product1.setEnabled(false);
showMessageDialog(null, "Désolé, Oreos est actuellement en rupture de stock","Stock épuisé!", JOptionPane.WARNING_MESSAGE);
}
}

if (e.getSource() == product2)
{

writeString ="INSERT INTO VendingMachine(Products, Price) VALUES('Sablés', '2 DH')";

addToSelection = selectedItems.getText() + "\n Sablés - 2 DH";
selectedItems.setText(addToSelection);

productTotal += 2;
selectedItemTotal.setText(poundsFormat.format(productTotal));

product2stockNum -= 1;
product2stock.setText(numFormat.format(product2stockNum));

if (product2stockNum == 0)
{
product2.setEnabled(false);
showMessageDialog(null, "Désolé, les Sablés sont actuellement en rupture de stock",
"Stock épuisé!", JOptionPane.WARNING_MESSAGE);
}
}
//product3
if (e.getSource() == product3)
{


writeString ="INSERT INTO VendingMachine(Products, Price) VALUES('Tango','1 DH')";

addToSelection = selectedItems.getText() + "\n Tango - 1 DH";
selectedItems.setText(addToSelection);

productTotal += 1;
selectedItemTotal.setText(poundsFormat.format(productTotal));

product3stockNum -= 1;
product3stock.setText(numFormat.format(product3stockNum));

if (product3stockNum == 0)
{
product3.setEnabled(false);
showMessageDialog(null, "Désolé, les tango sont actuellement en rupture de stock","Stock épuisé!", JOptionPane.WARNING_MESSAGE);
}
}

if (e.getSource() == product4)
{

writeString ="INSERT INTO VendingMachine(Products, Price) VALUES('Conikos', '3 DH')";

addToSelection = selectedItems.getText() + "\n Conikos - 3 DH";
selectedItems.setText(addToSelection);

productTotal += 3;
selectedItemTotal.setText(poundsFormat.format(productTotal));

product4stockNum -= 1;
product4stock.setText(numFormat.format(product4stockNum));

if (product4stockNum == 0)
{
product4.setEnabled(false);
showMessageDialog(null, "Désolé, les conikos sont actuellement en rupture de stock", "Stock épuisé!", JOptionPane.WARNING_MESSAGE);
}
}

//product5
if (e.getSource() == product5)
{

writeString ="INSERT INTO VendingMachine(Products, Price) VALUES('Crunchips', '2 DH')";

addToSelection = selectedItems.getText() + "\n Crunchips - 2 DH";
selectedItems.setText(addToSelection);

productTotal += 2;
selectedItemTotal.setText(poundsFormat.format(productTotal));

product5stockNum -= 1;
product5stock.setText(numFormat.format(product5stockNum));

if (product5stockNum == 0)
{
product5.setEnabled(false);
showMessageDialog(null, "Désolé, les Crunchips sont actuellement en rupture de stock", "Stock épuisé!", JOptionPane.WARNING_MESSAGE);
}
}

if (e.getSource() == product6)
{

writeString ="INSERT INTO VendingMachine(Products, Price) VALUES('Doritos', '4 DH')";

addToSelection = selectedItems.getText() + "\n Doritos - 4 DH";
selectedItems.setText(addToSelection);

productTotal += 10;
selectedItemTotal.setText(poundsFormat.format(productTotal));

product6stockNum -= 1;
product6stock.setText(numFormat.format(product6stockNum));

if (product6stockNum == 0)

{
product6.setEnabled(false);
showMessageDialog(null, "Désolé, les Doritos sont actuellement en rupture de stock", "Stock épuisé!", JOptionPane.WARNING_MESSAGE);
}
}

if (e.getSource() == product7)
{

writeString ="INSERT INTO VendingMachine(Products, Price) VALUES('Coca-Cola (330ml)', '3.5 DH')";
showMessageDialog(null, "Veuillez faire preuve de prudence lors de l'ouverture de cette boisson.\n\nIl peut être secoué.", "Mise en garde!", JOptionPane.WARNING_MESSAGE);

addToSelection = selectedItems.getText() + "\n Coca-Cola (330ml) - 3.5 DH";
selectedItems.setText(addToSelection);

productTotal += 3.5;
selectedItemTotal.setText(poundsFormat.format(productTotal));

product7stockNum -= 1;
product7stock.setText(numFormat.format(product7stockNum));

if (product7stockNum == 0)
{
product7.setEnabled(false);
showMessageDialog(null, "Désolé, Coca-Cola est actuellement en rupture de stock",
"Stock épuisé!", JOptionPane.WARNING_MESSAGE);
}
}

if (e.getSource() == product8)
{

writeString ="INSERT INTO VendingMachine(Products, Price) VALUES('Pepsi (330ml)', '5 DH')";
showMessageDialog(null, "Veuillez faire preuve de prudence lors de l'ouverture de cette boisson.\n\nIl peut être secoué.", "Mise en garde!", JOptionPane.WARNING_MESSAGE);

addToSelection = selectedItems.getText() + "\n Pepsi (330ml) - 5 DH";
selectedItems.setText(addToSelection);

productTotal += 5;

selectedItemTotal.setText(poundsFormat.format(productTotal));

product8stockNum -= 1;
product8stock.setText(numFormat.format(product8stockNum));

if (product8stockNum == 0)
{
product8.setEnabled(false);
showMessageDialog(null, "Désolé, Pepsi est actuellement en rupture de stock",
"Stock épuisé!", JOptionPane.WARNING_MESSAGE);
}
}

if (e.getSource() == product9)
{

writeString ="INSERT INTO VendingMachine(Products, Price) VALUES('Sprite (330ml)', '4 DH')";
showMessageDialog(null, "Veuillez faire preuve de prudence lors de l'ouverture de cette boisson.\n\nIl peut être secoué.", "Mise en garde!", JOptionPane.WARNING_MESSAGE);

addToSelection = selectedItems.getText() + "\n Sprite (330ml) - 0.60 DH";
selectedItems.setText(addToSelection);

productTotal += 10;
selectedItemTotal.setText(poundsFormat.format(productTotal));

product9stockNum -= 1;
product9stock.setText(numFormat.format(product9stockNum));

if (product9stockNum == 0)
{
product9.setEnabled(false);
showMessageDialog(null, "Désolé, Sprite est actuellement en rupture de stock","Stock épuisé!", JOptionPane.WARNING_MESSAGE);
}
}


if (e.getSource() == cancelOrder)
{
selectedItems.setText("");
moneyInput.setText(poundsFormat.format(productTotal - productTotal));
selectedItemTotal.setText("0.00 DH");
outputMessage.setText("");
outputMessage.setBackground(Color.white);

takeChange.setVisible(false);

totalInserted = 0;
productTotal = 0;
}

if (e.getSource() == enterCoins)//if enter coins button is pressed:
{
String productsFW = selectedItems.getText();
String totalFW = selectedItemTotal.getText();
String inputFW = moneyInput.getText();

double changePH = errorGiveChange;
CFchangeRemaining.setText(decFormat.format(changePH));

if (totalInserted == 0)
{
outputMessage.setText("Error! Veuillez saisir votre argent en utilisant le \n'Section de l'argent d'entrée!\n Vous devez entrer " + poundsFormat.format(productTotal) + " !");
outputMessage.setBackground(Color.red);
}

else if (productTotal == 0)
{

outputMessage.setText("Error! Veuillez sélectionner au moins un produit!");
outputMessage.setBackground(Color.red);
}
else if (productTotal == totalInserted)//Correct money is input
{
outputMessage.setText(poundsFormat.format(totalInserted) + " Accepted! \n\nMerci pour votre achat!");
outputMessage.setBackground(Color.green);

selectedItems.setText("");
selectedItemTotal.setText("0.00 DH");
moneyInput.setText("0.00 DH");

totalInserted = 0;
productTotal = 0;
}
else if (totalInserted < productTotal)//Not enough money is input
{

    double errorInputShort = productTotal - totalInserted;

outputMessage.setText("Error! Veuillez saisir le montant correct!\n\n vous avez besoin de " + poundsFormat.format(errorInputShort) + " pour payer!");
outputMessage.setBackground(Color.red);
}
else if (totalInserted > productTotal)//if too much money is input
{
//make the "take change button visible
takeChange.setVisible(true);

product1.setEnabled(false);
product2.setEnabled(false);
product3.setEnabled(false);
product4.setEnabled(false);
product5.setEnabled(false);
product6.setEnabled(false);
product7.setEnabled(false);
product8.setEnabled(false);
product9.setEnabled(false);
enterCoins.setEnabled(false);
returnCoins.setEnabled(false);
cancelOrder.setEnabled(false);




midhbutton.setEnabled(false);
undhbutton.setEnabled(false);
deuxdhbutton.setEnabled(false);
cinqdhButton.setEnabled(false);
dixdhButton.setEnabled(false);


outputMessage.setText(poundsFormat.format(totalInserted) + " Accepted! Merci pour votre achat! \n Veuillez emporter votre " + poundsFormat.format(errorGiveChange) + "monnaie.\nappuyer sur le bouton 'prenez votre monnaie':");
outputMessage.setBackground(Color.green);

selectedItems.setText("");
selectedItemTotal.setText("0.00 DH");
moneyInput.setText("0.00 DH");

totalInserted = 0;
productTotal = 0;
}
}

if (e.getSource() == takeChange)
{

takeChange.setVisible(false);
changeFrameInit();
changeFrame.setVisible(true);

CFmidhStock.setText(numFormat.format(midhStockNum));
CFundhStock.setText(numFormat.format(undhStockNum));
CFdeuxdhStock.setText(numFormat.format(deuxdhStockNum));
CFcinqdhStock.setText(numFormat.format(cinqdhStockNum));
CFdixdhStock.setText(numFormat.format(dixdhStockNum));
}















if (e.getSource() == CFmidhbutton)
{

midhStockNum -=1;
CFmidhStock.setText(numFormat.format(midhStockNum));

double calcChange = Double.parseDouble(CFchangeRemaining.getText());
calcChange -=0.5;
CFchangeRemaining.setText(decFormat.format(calcChange));

if (calcChange < 0)
{
calcChange +=0.5; //adds the 1pound back to the value
CFchangeRemaining.setText(decFormat.format(calcChange));

midhStockNum -=1;
CFmidhStock.setText(numFormat.format(midhStockNum));


CFoutputMessage.setText(" Error!\n vous ne pouvez pas en prendre autant!\nVous avez juste " + decFormat.format(calcChange) + "DH à prendre!");
CFoutputMessage.setBackground(Color.red);
}
if (midhStockNum == 0)
{
CFmidhbutton.setEnabled(false);
showMessageDialog(null, "Désolé, il ne reste pas autant d'argent.\n\nveullez selectionner une autre monnaie.", "stocke épuisé!", JOptionPane.WARNING_MESSAGE);
}
}

if (e.getSource() == CFundhbutton)
{

undhStockNum -=1;
CFundhStock.setText(numFormat.format(undhStockNum));
//deducts amount from the change remaning
double calcChange = Double.parseDouble(CFchangeRemaining.getText());
calcChange -=1;
CFchangeRemaining.setText(decFormat.format(calcChange));

if (calcChange < 0)
{
calcChange +=1; //adds the 1pound back to the value
CFchangeRemaining.setText(decFormat.format(calcChange));

undhStockNum -=1;
CFundhStock.setText(numFormat.format(undhStockNum));

CFoutputMessage.setText(" Error!\nVous ne pouvez pas prendre autant!\nVous n'avez que " + decFormat.format(calcChange) + "DH à prendre!");
CFoutputMessage.setBackground(Color.red);
}
if (undhStockNum == 0)
{
CFundhbutton.setEnabled(false);
showMessageDialog(null, "Désolé, il ne reste pas autant d'argent.\n\nveullez selectionner une autre monnaie.", "stocke épuisé!", JOptionPane.WARNING_MESSAGE);
}
}
//CF 20p
if (e.getSource() == CFdeuxdhbutton)
{

deuxdhStockNum -=1;

CFdeuxdhStock.setText(numFormat.format(deuxdhStockNum));

double calcChange = Double.parseDouble(CFchangeRemaining.getText());
calcChange -=2;
CFchangeRemaining.setText(decFormat.format(calcChange));

if (calcChange < 0)
{
calcChange +=2; //adds the 1pound back to the value
CFchangeRemaining.setText(decFormat.format(calcChange));

deuxdhStockNum -=1;
CFdeuxdhStock.setText(numFormat.format(deuxdhStockNum));

CFoutputMessage.setText(" Error!\nVous ne pouvez pas prendre autant!\nvous n'avez que " + decFormat.format(calcChange) + "DH à prendre!");
CFoutputMessage.setBackground(Color.red);
}
if (deuxdhStockNum == 0)
{
CFdeuxdhbutton.setEnabled(false);
showMessageDialog(null, "Désolé, il ne reste pas autant d'argent.\n\nveullez selectionner une autre monnaie.", "stocke épuisé!", JOptionPane.WARNING_MESSAGE);
}
}

if (e.getSource() == CFcinqdhButton)
{

cinqdhStockNum -=1;
CFcinqdhStock.setText(numFormat.format(cinqdhStockNum));

double calcChange = Double.parseDouble(CFchangeRemaining.getText());
calcChange -=5;
CFchangeRemaining.setText(decFormat.format(calcChange));

if (calcChange < 0)
{
calcChange +=5; //adds the 1pound back to the value
CFchangeRemaining.setText(decFormat.format(calcChange));

cinqdhStockNum -=1;
CFcinqdhStock.setText(numFormat.format(cinqdhStockNum));

CFoutputMessage.setText(" Error!\nVous ne pouvez pas prendre autant!\nvous n'avez que " + decFormat.format(calcChange) + "DH à prendre!");

CFoutputMessage.setBackground(Color.red);
}
if (cinqdhStockNum == 0)
{
CFcinqdhButton.setEnabled(false);
showMessageDialog(null, "Désolé, il ne reste pas autant d'argent.\n\nveullez selectionner une autre monnaie.", "stocke épuisé!", JOptionPane.WARNING_MESSAGE);
}
}

if (e.getSource()== CFdixdhButton)
{

dixdhStockNum -=1;
CFdixdhStock.setText(numFormat.format(dixdhStockNum));

double calcChange = Double.parseDouble(CFchangeRemaining.getText());
calcChange -=10;
CFchangeRemaining.setText(decFormat.format(calcChange));

if (calcChange < 0)
{
calcChange +=10; //adds the 1pound back to the value
CFchangeRemaining.setText(decFormat.format(calcChange));

dixdhStockNum -=1;
CFdixdhStock.setText(numFormat.format(dixdhStockNum));

CFoutputMessage.setText(" Error!\nVous ne pouvez pas prendre autant\nvous n'avez que " + decFormat.format(calcChange) + "DH à prendre!");
CFoutputMessage.setBackground(Color.red);
}
if (dixdhStockNum == 0)
{
CFdixdhButton.setEnabled(false);
showMessageDialog(null, "Désolé, il ne reste pas autant d'argent.\n\nveullez selectionner une autre monnaie.", "stocke épuisé!", JOptionPane.WARNING_MESSAGE);
}
}



if (e.getSource() == CFfinished)
{

double calcChange = Double.parseDouble(CFchangeRemaining.getText());
if (calcChange > 0)
{
CFoutputMessage.setText(" Error!\n\nous avez encore "+ decFormat.format(calcChange) + "DH à prendre!");
CFoutputMessage.setBackground(Color.red);
}
if (calcChange == 0)
{
CFoutputMessage.setText(" Merciii!\nVeuillez cliquer le bouton suivant pour quitter\n cette onglet.");
CFoutputMessage.setBackground(Color.green);

CFclose.setVisible(true);

CFmidhbutton.setEnabled(false);
CFundhbutton.setEnabled(false);
CFdeuxdhbutton.setEnabled(false);
CFcinqdhButton.setEnabled(false);
CFdixdhButton.setEnabled(false);

CFfinished.setEnabled(false);
}
} //change frame close button
if (e.getSource() == CFclose)
{

closeChangeFrame();
//re-enable all buttons on main frame
product1.setEnabled(true);
product2.setEnabled(true);
product3.setEnabled(true);
product4.setEnabled(true);
product5.setEnabled(true);
product6.setEnabled(true);
product7.setEnabled(true);
product8.setEnabled(true);
product9.setEnabled(true);
enterCoins.setEnabled(true);
returnCoins.setEnabled(true);
cancelOrder.setEnabled(true);
midhbutton.setEnabled(true);
undhbutton.setEnabled(true);
deuxdhbutton.setEnabled(true);
cinqdhButton.setEnabled(true);
dixdhButton.setEnabled(true);
CFmidhbutton.setEnabled(true);
CFundhbutton.setEnabled(true);
CFdeuxdhbutton.setEnabled(true);
CFcinqdhButton.setEnabled(true);
CFdixdhButton.setEnabled(true);
CFfinished.setEnabled(true);

outputMessage.setText("");
outputMessage.setBackground(Color.white);
}

if (e.getSource() == returnCoins)
{
if (totalInserted == 0)//if no money has been input
{
outputMessage.setText("vous n'avez rien entré!\n\nVeuillez réessayer!");
outputMessage.setBackground(Color.red);

moneyInput.setText("0.00 DH");

}

else//if something HAS been input
{
outputMessage.setText(poundsFormat.format(totalInserted) + " Revenu.\n\nVeuillez prendre votre argent.");
outputMessage.setBackground(Color.red);

moneyInput.setText("0.00 DH");

totalInserted = 0;
}
}


if(e.getSource() == midhbutton)
{

totalInserted += 0.5;
moneyInput.setText(poundsFormat.format(totalInserted));

midhStockNum -= 1;
midhStock.setText(numFormat.format(midhStockNum));
}

if(e.getSource() == undhbutton)
{

totalInserted += 1;
moneyInput.setText(poundsFormat.format(totalInserted));

undhStockNum -= 1;
undhStock.setText(numFormat.format(undhStockNum));
}

if(e.getSource() == deuxdhbutton)
{

totalInserted +=2;
moneyInput.setText(poundsFormat.format(totalInserted));
deuxdhStockNum -= 1;
deuxdhStock.setText(numFormat.format(deuxdhStockNum));
}

if(e.getSource() == cinqdhButton)
{

totalInserted += 5;

moneyInput.setText(poundsFormat.format(totalInserted));

cinqdhStockNum -= 1;
cinqdhStock.setText(numFormat.format(cinqdhStockNum));
}

if(e.getSource() == dixdhButton)
{

    totalInserted += 10;
moneyInput.setText(poundsFormat.format(totalInserted));

dixdhStockNum -= 1;
dixdhStock.setText(numFormat.format(dixdhStockNum));
}


try {
myStatement.executeUpdate(writeString);
}
catch (SQLException sqle) {
System.out.println(sqle);
}
}
}


