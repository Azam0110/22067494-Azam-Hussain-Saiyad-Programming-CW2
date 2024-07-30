
/**
 * Write a description of class BankGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

// imports
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BankGUI implements ActionListener
{
    //declare all the components here
    private JFrame frame;
    
    //----------------------------------debitcard components-----------------------------------
    private JLabel debitCardIDLabel;
    private JLabel issuerBankLabel;
    private JLabel balanceAmountLabel; 
    private JLabel PINnumberLabel; 
    private JLabel clientNameLabel;
    private JLabel bankAccountLabel;
    private JLabel wdCardIDLabel; 
    private JLabel wdWithdrawalAmountLabel;
    private JLabel wdPINnumberLabel;
    private JLabel wdWithdrawalDateLabel;
    
    private JButton addDebitCardButton;
    private JButton wdDisplayButton;
    private JButton wdWithdrawButton;
                
    private JTextField debitCardIDTxt;
    private JTextField issuerBankTxt; 
    private JTextField balanceAmountTxt;
    private JTextField PINnumberTxt;
    private JTextField clientNameTxt; 
    private JTextField bankAccountTxt; 
    private JTextField wdCardIDTxt;
    private JTextField wdWithdrawalAmountTxt;
    private JTextField wdPINnumberTxt;
                        
    private JComboBox wdWithdrawalDateDayBox;
    private JComboBox wdWithdrawalDateMonthBox; 
    private JComboBox wdWithdrawalDateYearBox;
                        
    //----------------------------------creditcard components----------------------------------
    private JLabel creditCardIDLabel;
    private JLabel creditClientNameLabel; 
    private JLabel creditIssuerBankLabel;
    private JLabel creditCVCnumberLabel;
    private JLabel creditBalanceAmountLabel;
    private JLabel creditBankAccountLabel;
    private JLabel creditInterestRateLabel;
    private JLabel creditExpirationDateLabel;
    private JLabel clCardIDLabel;
    private JLabel clCreditLimitLabel;
    private JLabel clGracePeriodLabel;
                    
    private JButton cancelCreditCardButton; 
    private JButton addCreditCardButton;
    private JButton clDisplayButton;
    private JButton clSetCreditLimitButton;
    private JButton clClearButton;
    
    private JTextField creditCardIDTxt;
    private JTextField creditClientNameTxt;
    private JTextField creditIssuerBankTxt;
    private JTextField creditCVCnumberTxt;
    private JTextField creditBalanceAmountTxt;
    private JTextField creditBankAccountTxt;
    private JTextField creditInterestRateTxt;
    private JTextField clCardIDTxt;
    private JTextField clCreditLimitTxt; 
    private JTextField clGracePeriodTxt;
                        
    private JComboBox creditDayExpirationDateBox;
    private JComboBox creditMonthExpirationDateBox; 
    private JComboBox creditYearExpirationDateBox;
    
    //Declaring the arrayList:
    ArrayList<BankCard> bankCard = new ArrayList<BankCard>();
    
    // Instance variables for DebitCard and CreditCard objects
    DebitCard debitobj;
    CreditCard creditobj;
     
    
    //Constructor
    public BankGUI(){
        //creating the JFrame
        frame = new JFrame();
        
        // Creating DebitCard Labels,TextFields and Buttons
        debitCardIDLabel = new JLabel("Card ID :");
        issuerBankLabel = new JLabel("Issuer Bank :");
        balanceAmountLabel = new JLabel("Balance Amount :");
        PINnumberLabel = new JLabel("PIN Number :");
        clientNameLabel = new JLabel("Client Name :");
        bankAccountLabel = new JLabel("Bank Account :");
        addDebitCardButton = new JButton("Add Debit Card");
        
        debitCardIDTxt = new JTextField();
        issuerBankTxt = new JTextField();
        balanceAmountTxt = new JTextField();
        PINnumberTxt = new JTextField();
        clientNameTxt = new JTextField();
        bankAccountTxt = new JTextField();
        
        // Setting the bounds for Label,TextField and Button
        debitCardIDLabel.setBounds(59, 34, 60, 20);
        debitCardIDTxt.setBounds(119, 28, 90, 32);
        issuerBankLabel.setBounds(256, 34, 86, 20);
        issuerBankTxt.setBounds(342, 28, 140, 32);
        balanceAmountLabel.setBounds(534, 34, 114, 20);
        balanceAmountTxt.setBounds(648, 28, 140, 32);
        PINnumberLabel.setBounds(30, 75, 89, 20);
        PINnumberTxt.setBounds(119, 69, 90, 32);
        clientNameLabel.setBounds(253, 76, 89, 20);
        clientNameTxt.setBounds(342, 70, 140, 32);
        bankAccountLabel.setBounds(551, 76, 97, 20);
        bankAccountTxt.setBounds(648, 71, 140, 32);
        addDebitCardButton.setBounds(337, 129, 150, 32);
        
        // Adding the Labels,TextFields and Buttons to Frame
        frame.add(debitCardIDLabel);
        frame.add(debitCardIDTxt);
        frame.add(issuerBankLabel);
        frame.add(issuerBankTxt);
        frame.add(balanceAmountLabel);
        frame.add(balanceAmountTxt);
        frame.add(PINnumberLabel);
        frame.add(PINnumberTxt);
        frame.add(clientNameLabel);
        frame.add(clientNameTxt);
        frame.add(bankAccountLabel);
        frame.add(bankAccountTxt);
        frame.add(addDebitCardButton);
        
        
        
        
        // Creating Withdraw Labels,TextFields ComboBox and Buttons
        wdCardIDLabel = new JLabel("Card ID :");
        wdWithdrawalAmountLabel = new JLabel("Withdrawal Amount :");
        wdPINnumberLabel = new JLabel("PIN Number :");
        wdWithdrawalDateLabel = new JLabel("Withdrawal Date :");
        wdDisplayButton = new JButton("Display");
        wdWithdrawButton = new JButton("Withdraw");
        
        wdCardIDTxt = new JTextField();
        wdWithdrawalAmountTxt = new JTextField();
        wdPINnumberTxt = new JTextField();
        String[] DayList = {"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
                            "16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        wdWithdrawalDateDayBox = new JComboBox(DayList);
        
        String[] MonthList = {"Month","January","Feburary","March","April","May","June","July",
                                "August","September","October","November","December"};
        wdWithdrawalDateMonthBox = new JComboBox(MonthList);
        
        String[] YearList = {"Year","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000",
                            "2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013",
                            "2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        wdWithdrawalDateYearBox = new JComboBox(YearList);
        
        // Setting the bounds for Label,TextField and Button
        wdCardIDLabel.setBounds(59, 194, 60, 20);
        wdCardIDTxt.setBounds(119, 188, 90, 32);
        wdWithdrawalAmountLabel.setBounds(383, 194, 132, 20);
        wdWithdrawalAmountTxt.setBounds(521, 188, 140, 32);
        wdPINnumberLabel.setBounds(30, 234, 89, 20);
        wdPINnumberTxt.setBounds(119, 228, 90, 32);
        wdWithdrawalDateLabel.setBounds(405, 233, 110, 20);
        wdWithdrawalDateDayBox.setBounds(521, 227, 70, 32);
        wdWithdrawalDateMonthBox.setBounds(600, 227, 80, 32);
        wdWithdrawalDateYearBox.setBounds(689, 227, 80, 32);
        wdDisplayButton.setBounds(285, 282, 120, 32);
        wdWithdrawButton.setBounds(425, 282, 120, 32);
        
        // Adding the Labels,TextFields and Buttons to Frame
        frame.add(wdCardIDLabel);
        frame.add(wdCardIDTxt);
        frame.add(wdWithdrawalAmountLabel);
        frame.add(wdWithdrawalAmountTxt);
        frame.add(wdPINnumberLabel);
        frame.add(wdPINnumberTxt);
        frame.add(wdWithdrawalDateLabel);
        frame.add(wdWithdrawalDateDayBox);
        frame.add(wdWithdrawalDateMonthBox);
        frame.add(wdWithdrawalDateYearBox);
        frame.add(wdDisplayButton);
        frame.add(wdWithdrawButton);
        
        
        
        
        // Creating CreditCard Labels,TextFields ComboBox and Buttons
        creditCardIDLabel = new JLabel("Card ID :");
        creditClientNameLabel = new JLabel("Client Name :");
        creditIssuerBankLabel = new JLabel("Issuer Bank :");
        creditCVCnumberLabel = new JLabel("CVC Number :");
        creditBalanceAmountLabel = new JLabel("Balance Amount :");
        creditBankAccountLabel = new JLabel("Bank Account :");
        creditInterestRateLabel = new JLabel("Interest Rate :");
        creditExpirationDateLabel = new JLabel("Expiration Date :");
        cancelCreditCardButton = new JButton("Cancel Credit Card");
        addCreditCardButton = new JButton("Add Credit Card");
        
        creditCardIDTxt = new JTextField();
        creditClientNameTxt = new JTextField();
        creditIssuerBankTxt = new JTextField();
        creditCVCnumberTxt = new JTextField();
        creditBalanceAmountTxt = new JTextField();
        creditBankAccountTxt = new JTextField();
        creditInterestRateTxt = new JTextField();
        String[] dayList = {"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
                            "16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        creditDayExpirationDateBox = new JComboBox(dayList);
        
        String[] monthList = {"Month","January","Feburary","March","April","May","June","July",
                                "August","September","October","November","December"};
        creditMonthExpirationDateBox = new JComboBox(monthList);
        
        String[] yearList = {"Year","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000",
                            "2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013",
                            "2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        creditYearExpirationDateBox = new JComboBox(yearList);
        
        // Setting the bounds for Label,TextField and Button
        creditCardIDLabel.setBounds(59, 350, 60, 20);
        creditCardIDTxt.setBounds(119, 344, 90, 32);
        creditClientNameLabel.setBounds(271, 350, 89, 20);
        creditClientNameTxt.setBounds(360, 343, 140, 32);
        creditIssuerBankLabel.setBounds(557, 350, 86, 20);
        creditIssuerBankTxt.setBounds(643, 344, 140, 32);
        creditCVCnumberLabel.setBounds(24, 390, 95, 20);
        creditCVCnumberTxt.setBounds(119, 384, 90, 32);
        creditBalanceAmountLabel.setBounds(246, 390, 114, 20);
        creditBalanceAmountTxt.setBounds(360, 384, 140, 32);
        creditBankAccountLabel.setBounds(546, 390, 97, 20);
        creditBankAccountTxt.setBounds(643, 384, 140, 32);
        creditInterestRateLabel.setBounds(27, 430, 92, 20);
        creditInterestRateTxt.setBounds(119, 424, 90, 32);
        creditExpirationDateLabel.setBounds(251, 430, 104, 20);
        creditDayExpirationDateBox.setBounds(360, 425, 70, 32);
        creditMonthExpirationDateBox.setBounds(439, 425, 80, 32);
        creditYearExpirationDateBox.setBounds(528, 425, 80, 32);
        cancelCreditCardButton.setBounds(251, 484, 150, 32);
        addCreditCardButton.setBounds(425, 484, 150, 32);
        
        // Adding the Labels,TextFields and Buttons to Frame
        frame.add(creditCardIDLabel);
        frame.add(creditCardIDTxt);
        frame.add(creditClientNameLabel);
        frame.add(creditClientNameTxt);
        frame.add(creditIssuerBankLabel);
        frame.add(creditIssuerBankTxt);
        frame.add(creditCVCnumberLabel);
        frame.add(creditCVCnumberTxt);
        frame.add(creditBalanceAmountLabel);
        frame.add(creditBalanceAmountTxt);
        frame.add(creditBankAccountLabel);
        frame.add(creditBankAccountTxt);
        frame.add(creditInterestRateLabel);
        frame.add(creditInterestRateTxt);
        frame.add(creditExpirationDateLabel);
        frame.add(creditDayExpirationDateBox);
        frame.add(creditMonthExpirationDateBox);
        frame.add(creditYearExpirationDateBox);
        frame.add(cancelCreditCardButton);
        frame.add(addCreditCardButton);
        
        
        
        
        
        // Creating CreditLimit and GracePeriod Labels,TextFields and Buttons
        clCardIDLabel = new JLabel("Card ID :");
        clCreditLimitLabel = new JLabel("Credit Limit :");
        clGracePeriodLabel = new JLabel("Grace Period :");
        clDisplayButton = new JButton("Display");
        clSetCreditLimitButton = new JButton("Set Credit Limit");
        clClearButton = new JButton("Clear all");
        
        clCardIDTxt = new JTextField();
        clCreditLimitTxt = new JTextField();
        clGracePeriodTxt = new JTextField();
        
        // Setting the bounds for Label,TextField and Button
        clCardIDLabel.setBounds(59, 554, 60, 20);
        clCardIDTxt.setBounds(119, 548, 90, 32);
        clCreditLimitLabel.setBounds(278, 554, 82, 20);
        clCreditLimitTxt.setBounds(360, 548, 114, 32);
        clGracePeriodLabel.setBounds(562, 554, 94, 20);
        clGracePeriodTxt.setBounds(656, 548, 90, 32);
        clDisplayButton.setBounds(193, 614, 120, 32);
        clSetCreditLimitButton.setBounds(344, 614, 140, 32);
        clClearButton.setBounds(515, 614, 120, 32);
        
        // Adding the Labels,TextFields and Buttons to Frame
        frame.add(clCardIDLabel);
        frame.add(clCardIDTxt);
        frame.add(clCreditLimitLabel);
        frame.add(clCreditLimitTxt);
        frame.add(clGracePeriodLabel);
        frame.add(clGracePeriodTxt);
        frame.add(clDisplayButton);
        frame.add(clSetCreditLimitButton);
        frame.add(clClearButton);
        
        // Adding the ActionListener to buttons
        addDebitCardButton.addActionListener(this);
        wdDisplayButton.addActionListener(this);
        wdWithdrawButton.addActionListener(this);
        cancelCreditCardButton.addActionListener(this);
        addCreditCardButton.addActionListener(this);
        clDisplayButton.addActionListener(this);
        clSetCreditLimitButton.addActionListener(this);
        clClearButton.addActionListener(this);
        
        // Setting the Focusable to buttons
        addDebitCardButton.setFocusable(false);
        wdDisplayButton.setFocusable(false);
        wdWithdrawButton.setFocusable(false);
        cancelCreditCardButton.setFocusable(false);
        addCreditCardButton.setFocusable(false);
        clDisplayButton.setFocusable(false);
        clSetCreditLimitButton.setFocusable(false);
        clClearButton.setFocusable(false);
        
        // Setting the size,layout of the Frame
        frame.setSize(850,720);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    
    //implementing the method of the ActionListener
    public void actionPerformed(ActionEvent e){
        //ActionEvent or button functionality of Add Debit Card button
        if(e.getSource() == addDebitCardButton){
            //It checks whether those text fields are empty or not
            if(clientNameTxt.getText().isEmpty() ||
            debitCardIDTxt.getText().isEmpty() ||
            issuerBankTxt.getText().isEmpty() ||
            bankAccountTxt.getText().isEmpty() ||
            balanceAmountTxt.getText().isEmpty() ||
            PINnumberTxt.getText().isEmpty()) 
            {  
                // If any field is empty this OptionPane  message is shown
                JOptionPane.showMessageDialog(frame, "Please Input All The Details!","Error found",JOptionPane.INFORMATION_MESSAGE); 
            } 
            else{
                //using try catch method for event hanlding
                try{
                    double balanceAmount = Double.parseDouble(balanceAmountTxt.getText());
                    int debitCardID = Integer.parseInt(debitCardIDTxt.getText());
                    String bankAccount = bankAccountTxt.getText();
                    String issuerBank = issuerBankTxt.getText();
                    String clientName = clientNameTxt.getText();
                    int PINnumber = Integer.parseInt(PINnumberTxt.getText());
                    String balance = String.valueOf(balanceAmount);
                    String card = String.valueOf(debitCardID);
                    String pin = String.valueOf(PINnumber);
                    String message = "Balance Amount : " + balance + " \nCard ID : " + card + " \nIssuer Bank : " + issuerBank + 
                                    " \nBank Account : " + bankAccount + " \nClient Name : " + clientName + " \nPin Number : " + pin;
                    debitobj = new DebitCard(balanceAmount,debitCardID,bankAccount,issuerBank,clientName,PINnumber);
                    boolean isCardIdUnique = true;
                    for(BankCard debitobj  : bankCard){
                        if (debitobj instanceof DebitCard){
                            DebitCard card_obj = (DebitCard) debitobj;
                            if(debitobj.getCardId() == debitCardID){
                                isCardIdUnique = false;
                                break;
                            }
                        }    
                    }
                    if (!clientName.matches("[a-zA-Z]+")) {
                        JOptionPane.showMessageDialog(frame, "Please Input Alphabetic Values for Client Name!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (!issuerBank.matches("[a-zA-Z]+")) {
                        JOptionPane.showMessageDialog(frame, "Please Input Alphabetic Values for Issuer Bank!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if(isCardIdUnique){
                        bankCard.add(debitobj);
                        JOptionPane.showMessageDialog(frame, "Debit Card Added Successfully!\n" + message,"Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, " The Card ID was already added", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch(NumberFormatException a){
                    JOptionPane.showMessageDialog(frame, "Please Input Numeric Values!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
        //After clicking in Add Credit Card Button all items of credit card is added in arrayList of BankCard class
        if (e.getSource() == addCreditCardButton) {
            if (creditClientNameTxt.getText().isEmpty() ||
            creditCardIDTxt.getText().isEmpty() ||
            creditIssuerBankTxt.getText().isEmpty() ||
            creditBankAccountTxt.getText().isEmpty() ||
            creditBalanceAmountTxt.getText().isEmpty() ||
            creditCVCnumberTxt.getText().isEmpty() ||
            creditInterestRateTxt.getText().isEmpty() ||
            creditYearExpirationDateBox.getSelectedItem().equals("Year") ||
            creditMonthExpirationDateBox.getSelectedItem().equals("Month") ||
            creditDayExpirationDateBox.getSelectedItem().equals("Day")) {
                JOptionPane.showMessageDialog(frame, "Please Input All The Details!","Error found",JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
                    int creditCardID = Integer.parseInt(creditCardIDTxt.getText());
                    String creditClientName = creditClientNameTxt.getText();
                    String creditIssuerBank = creditIssuerBankTxt.getText();
                    String creditBankAccount = creditBankAccountTxt.getText();
                    int creditBalanceAmount = Integer.parseInt(creditBalanceAmountTxt.getText());
                    int creditCVCnumber = Integer.parseInt(creditCVCnumberTxt.getText());
                    double creditInterestRate = Double.parseDouble(creditInterestRateTxt.getText());
                    String dayList = (String) creditDayExpirationDateBox.getSelectedItem();
                    String monthList = (String) creditMonthExpirationDateBox.getSelectedItem();
                    String yearList = (String) creditYearExpirationDateBox.getSelectedItem();
                    String creditExpirationDate = dayList + "-" + monthList + "-" + yearList;
                    String balance = String.valueOf(creditBalanceAmount);
                    String card = String.valueOf(creditCardID);
                    String cvc = String.valueOf(creditCVCnumber);
                    String rate = String.valueOf(creditInterestRate);
                    String message= "Balance Amount : " + balance + " \nCard ID : " + card + " \nIssuer Bank : " + creditIssuerBank + 
                                    " \nBank Account : " + creditBankAccount + " \nClient Name : " + creditClientName + " \nCvc Number : " 
                                    + cvc + " \nInterest Rate :" + rate + "\nExpiration Date :" +dayList + " " +monthList + " "+yearList;
                    creditobj = new CreditCard(creditCardID, creditClientName, creditIssuerBank, creditBankAccount, creditBalanceAmount,
                                                creditCVCnumber, creditInterestRate, creditExpirationDate);
                    boolean isCardIdUnique = true;
                    for (BankCard creditobj : bankCard) {
                        if (creditobj instanceof CreditCard) {
                            CreditCard card_obj = (CreditCard) creditobj;
                            if (creditobj.getCardId() == creditCardID) {
                                isCardIdUnique = false;
                                break;
                            }
                        }
                    }
                    if (!creditClientName.matches("[a-zA-Z]+")) {
                        JOptionPane.showMessageDialog(frame, "Please Input Alphabetic Values for Client Name!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (!creditIssuerBank.matches("[a-zA-Z]+")) {
                        JOptionPane.showMessageDialog(frame, "Please Input Alphabetic Values for Issuer Bank!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (isCardIdUnique) {
                        bankCard.add(creditobj);
                        JOptionPane.showMessageDialog(frame, "Credit Card Added Successfully!\n" + message, "Information", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame, " The Card ID was already added", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(frame, "Please input numeric values!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //When Withdraw display button is clicked, the information of debitCard and withdraw is displayed
        if(e.getSource() == wdDisplayButton){
            if(debitCardIDTxt.getText().isEmpty() ||
            issuerBankTxt.getText().isEmpty() ||
            clientNameTxt.getText().isEmpty() ||
            bankAccountTxt.getText().isEmpty() ||
            balanceAmountTxt.getText().isEmpty() ||
            wdPINnumberTxt.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please Input All The Details!","Error", JOptionPane.ERROR_MESSAGE);
            }

            else{
                try{
                    int cardID = Integer.parseInt(debitCardIDTxt.getText());
                    String issuerBank = issuerBankTxt.getText();
                    int balanceAmount = Integer.parseInt(balanceAmountTxt.getText());
                    String bankAccount = bankAccountTxt.getText();
                    String clientName = clientNameTxt.getText();
                    int pinNumber = Integer.parseInt(wdPINnumberTxt.getText());
                    String balance = String.valueOf(balanceAmount);
                    String card = String.valueOf(cardID);
                    String pin = String.valueOf(pinNumber);
                    
                    debitobj = new DebitCard(balanceAmount, cardID, bankAccount, issuerBank, clientName, pinNumber);
                    for(BankCard debitobj : bankCard){
                        if(debitobj instanceof DebitCard){
                            DebitCard debitdisplayobj = (DebitCard) debitobj;
                            debitdisplayobj.display();
                        }
                    }
                }
                catch(NumberFormatException z){
                    JOptionPane.showMessageDialog(frame, "Please input numeric values!","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
        //When Cancel Credit Button is clicked it cancels Credit Card after valid card Id is entered
        if (e.getSource() == cancelCreditCardButton) {
            if(creditCardIDTxt.getText().isEmpty() ||
            creditIssuerBankTxt.getText().isEmpty()||
            creditBalanceAmountTxt.getText().isEmpty()||
            creditClientNameTxt.getText().isEmpty()||
            creditBankAccountTxt.getText().isEmpty()||
            creditCVCnumberTxt.getText().isEmpty()||
            creditInterestRateTxt.getText().isEmpty()||
            creditYearExpirationDateBox.getSelectedItem().equals("Year") ||
            creditMonthExpirationDateBox.getSelectedItem().equals("Month") ||
            creditDayExpirationDateBox.getSelectedItem().equals("Day") ||
            clCreditLimitTxt.getText().isEmpty()||
            clCardIDTxt.getText().isEmpty()||
            clGracePeriodTxt.getText().isEmpty())

            {
                JOptionPane.showMessageDialog(frame, "Please Fill All The Details", "Error", JOptionPane.ERROR_MESSAGE);
            }

            else{
                try{
                    int cardId = Integer.parseInt(clCardIDTxt.getText());
                    double creditLimit = Double.parseDouble(clCreditLimitTxt.getText());
                    int gracePeriod = Integer.parseInt(clGracePeriodTxt.getText());
                    boolean isCardIdEqual = false;
                    for (BankCard Credit : bankCard) {
                        if (Credit instanceof CreditCard) {
                            CreditCard creditobject = (CreditCard) Credit;
                            if (creditobject.getCardId() == cardId) {
                                creditobject.cancelCreditCard();
                                isCardIdEqual = true;
                                break;
                            }
                        }
                    }
                    if (isCardIdEqual) {
                        JOptionPane.showMessageDialog(frame, "Credit Card Cancelled Successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        JOptionPane.showMessageDialog(frame, "Card Was Not Found", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException z){
                    JOptionPane.showMessageDialog(frame, "Please input the correct values.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }  
        }
        
        //ActionEvent or button functionality of Set Credit Limit Card 
        if (e.getSource() == clSetCreditLimitButton){
            if(clCardIDTxt.getText().isEmpty() ||
            clCreditLimitTxt.getText().isEmpty() ||
            clGracePeriodTxt.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please Input All The Details!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    int clCardID = Integer.parseInt(clCardIDTxt.getText());
                    double clCreditLimit = Double.parseDouble(clCreditLimitTxt.getText());
                    int clGracePeriod = Integer.parseInt(clGracePeriodTxt.getText());
                    boolean cardIdFound = false;
                    for (BankCard Credit : bankCard) {
                        if (Credit instanceof CreditCard) {
                            CreditCard cards = (CreditCard) Credit;
                            if (cards.getCardId() == clCardID) {
                                cards.setCreditLimit(clCreditLimit, clGracePeriod);
                                cardIdFound = true;
                                break;
                            }
                        }
                    }
                    if(cardIdFound){
                        JOptionPane.showMessageDialog(frame,"Credit Limit Set Successfully.","Message",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Card id dont match !", "Message",JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException z){
                    JOptionPane.showMessageDialog(frame, "Please input the correct values!");
                }
            }
        }
        
        //When Credit display button is clicked, the information of creditCard and setCreditLimit is displayed
        if(e.getSource() == clDisplayButton){
            if(creditCardIDTxt.getText().isEmpty() ||
            creditIssuerBankTxt.getText().isEmpty() ||
            creditBankAccountTxt.getText().isEmpty() ||
            creditClientNameTxt.getText().isEmpty() ||
            creditBalanceAmountTxt.getText().isEmpty() ||
            creditCVCnumberTxt.getText().isEmpty() ||
            creditInterestRateTxt.getText().isEmpty() ||
            creditYearExpirationDateBox.getSelectedItem().equals("Year") ||
            creditMonthExpirationDateBox.getSelectedItem().equals("Month") ||
            creditDayExpirationDateBox.getSelectedItem().equals("Day"))
            {
                JOptionPane.showMessageDialog(frame, "Please Input All The Details!", "Message", JOptionPane.ERROR_MESSAGE);
            }

            else{
                try{
                    int creditCardID = Integer.parseInt(creditCardIDTxt.getText());
                    String creditClientName = creditClientNameTxt.getText();
                    String creditIssuerBank = creditIssuerBankTxt.getText();
                    String creditBankAccount = creditBalanceAmountTxt.getText();
                    int creditBalanceAmount = Integer.parseInt(creditBalanceAmountTxt.getText());
                    int creditCVCnumber = Integer.parseInt(creditCVCnumberTxt.getText());
                    double creditInterestRate = Double.parseDouble(creditInterestRateTxt.getText());
                    String dayList = (String) creditDayExpirationDateBox.getSelectedItem();
                    String monthList = (String) creditMonthExpirationDateBox.getSelectedItem();
                    String yearList = (String) creditYearExpirationDateBox.getSelectedItem();
                    String creditexpirationDate = dayList + "-" + monthList + "-" + yearList;
                    String balance = String.valueOf(creditBalanceAmount);
                    String card = String.valueOf(creditCardID);
                    String cvc = String.valueOf(creditCVCnumber);
                    String rate = String.valueOf(creditInterestRate);
                    String message = "Balance Amount : " + balance + " \nCard ID : " + card + " \nIssuer Bank : " + creditIssuerBank +
                                    " \nBank Account : " + creditBankAccount + " \nClient Name : " + creditClientName + " \nCvc Number : " 
                                        + cvc + " \nInterest Rate :" + rate + "\nExpiration Date :" + dayList + " " + monthList + " "+ yearList;
                    creditobj = new CreditCard(creditCardID, creditClientName, creditIssuerBank, creditBankAccount, creditBalanceAmount, 
                                                creditCVCnumber, creditInterestRate,creditexpirationDate);
                    for (BankCard creditobj : bankCard){
                        if (creditobj instanceof CreditCard){
                            CreditCard creditdisplayobj = (CreditCard) creditobj;
                            creditdisplayobj.display();
                        }
                    }
                }
                catch(NumberFormatException z){
                    JOptionPane.showMessageDialog(frame, "Please input numeric values!", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //ActionEvent or button functionality of Withdraw button
        if (e.getSource() == wdWithdrawButton) {
            if (wdCardIDTxt.getText().isEmpty() || 
            wdWithdrawalAmountTxt.getText().isEmpty() || 
            wdWithdrawalDateDayBox.getSelectedItem().equals("Day") || 
            wdWithdrawalDateMonthBox.getSelectedItem().equals("Month")|| 
            wdWithdrawalDateYearBox.getSelectedItem().equals("Year") || 
            wdPINnumberTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please Input All The Details!", "Message", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    int cardId = Integer.parseInt(wdCardIDTxt.getText());
                    int withdrawalAmount = Integer.parseInt(wdWithdrawalAmountTxt.getText());
                    int pinNumber = Integer.parseInt(wdPINnumberTxt.getText());
                    String DayList = (String) wdWithdrawalDateDayBox.getSelectedItem();
                    String MonthList = (String) wdWithdrawalDateMonthBox.getSelectedItem();
                    String YearList = (String) wdWithdrawalDateYearBox.getSelectedItem();
                    String withdrawalDate = DayList + "-" + MonthList + "-" + YearList;
                    boolean isCardIdFound = false;
                    boolean isPinNumberCorrect = false;
                    for (BankCard bc : bankCard) {
                        if (bc instanceof DebitCard && !isCardIdFound) {
                            DebitCard dc = (DebitCard) bc;
                            if (dc.getCardId() == cardId) {
                                isCardIdFound = true;
                                if (dc.getPinNumber() == pinNumber) {
                                    isPinNumberCorrect = true;
                                    if (dc.getBalanceAmount() >= withdrawalAmount) {
                                        dc.withdraw(withdrawalAmount, withdrawalDate, pinNumber);
                                        JOptionPane.showMessageDialog(frame, "WITHDRAWAL SUCCESSFUL!", "Message",JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(frame, "INSUFFICIENT BALANCE!", "Message",JOptionPane.ERROR_MESSAGE);
                                    }
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(frame, "INVALID PIN NUMBER!", "Message",JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                        }
                    }
                    if (!isCardIdFound) {
                        JOptionPane.showMessageDialog(frame, "CARD NOT FOUND!", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input! Please enter numbers only.", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
       
        // This clear Button clears all the text fields
        if(e.getSource() == clClearButton){
            debitCardIDTxt.setText("");
            issuerBankTxt.setText("");
            balanceAmountTxt.setText("");
            PINnumberTxt.setText("");
            clientNameTxt.setText("");
            bankAccountTxt.setText("");
            wdCardIDTxt.setText("");
            wdWithdrawalAmountTxt.setText("");
            wdPINnumberTxt.setText("");
            creditCardIDTxt.setText("");
            creditClientNameTxt.setText("");
            creditIssuerBankTxt.setText("");
            creditCVCnumberTxt.setText("");
            creditBalanceAmountTxt.setText("");
            creditBankAccountTxt.setText("");
            creditInterestRateTxt.setText("");
            clCardIDTxt.setText("");
            clCreditLimitTxt.setText("");
            clGracePeriodTxt.setText("");
        }
    }
    
    public static void main(String[] args){
        BankGUI obj = new BankGUI();
    }
}