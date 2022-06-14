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
    private String emergencyPhoneNumber;
    
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
}