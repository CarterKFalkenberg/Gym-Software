import java.util.Date;
import java.util.Hashtable;
import java.awt.Image;

public class Member{
    private String planType;
    
    private String firstName;
    private char middleInitial;
    private String lastName;
    
    private String address;
    private String city;
    private String state;
    private int zipCode;
    
    private Date dateOfBirth;
    private String email;
    private char gender;
    private int phoneNumber;
    
    private String emergencyName;
    private int emergencyPhoneNumber;
    
    private int barcode;
    private int agreementNumber;
    
    private int cardNumber;
    private int cardSecurityCode;
    private Date cardExpirationDate;
    
    private Image picture;
    private Date pictureTakenDate;
    
    private Hashtable<String, String> documents;
    
    private Date memberSince;
    private Date lastVisit;
    private Date[] checkIns;
    private int[] invoices;
    private String[] notes;
    
    private String checkInMessage;

    public Member(String planType, 
        String firstName, char middleInitial, String lastName, 
        String address, String city, String state, int zipCode, 
        Date dateOfBirth, String email, char gender, int phoneNumber, 
        String emergencyName, int emergencyPhoneNumber, 
        int cardNumber, int cardSecurityCode, Date cardExpirationDate, 
        Image picture, Date pictureTakenDate, 
        Hashtable<String, String> documents, 
        Date memberSince, Date lastVisit, Date[] checkIns, int[] invoices, String[] notes){
            this.planType = planType;
            this.firstName = firstName;
            this.middleInitial = middleInitial;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.phoneNumber = phoneNumber;
            this.emergencyName = emergencyName;
            this.emergencyPhoneNumber = emergencyPhoneNumber;
            this.cardNumber = cardNumber;
            this.cardSecurityCode = cardSecurityCode;
            this.cardExpirationDate = cardExpirationDate;
            this.picture = picture;
            this.pictureTakenDate = pictureTakenDate;
            this.documents = documents;
            this.memberSince = memberSince;
            this.lastVisit = lastVisit;
            this.checkIns = checkIns;
            this.invoices = invoices;
            this.notes = notes;
    }
}