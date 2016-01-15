package main;

/**
 * Created by Jack on 10/8/15.
 */
public class Email {  // Define the class
    public String subject;  // Field
    public String body;  // Field
    public String destination;  // Field
    public int timestamp;  // Field

    public Email() {  // Default Constructor.  This is where you put values that must be initialized for the class to work.  If you do not enter any arguments when creating the object in JREPL, these will be the default arguments
        System.out.println("Creating email...");
        subject = "No Subject";
        body = "";
        destination = "";
        timestamp = 0;
    }

    public Email(String subject, String body, String destination, int timestamp) {  // Another class constructor, this allows you to enter your own values into the object in JREPL
        this.subject = subject;
        this.body = body;
        this.destination = destination;
        this.timestamp = timestamp;
    }

    public void setSubject(String subject) {  // Method constructor
        this.subject = subject;
    }

    public String getSubject() {  // Method constructor
        return subject;
    }

    public static boolean isValidSubject(String subject) {  // This is a static method.  It does not refer to any arguments or previously defined data
        return subject.length() != 0;
    }
}
