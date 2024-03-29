package actions;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import utils.FileHandler;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

public interface CustomerFacingTeam {

    void typeCustomer(List<String> typeCustomer);

    static void greeting(String toGmail) throws IOException, GeneralSecurityException, MessagingException, javax.mail.MessagingException {
    String user = "me";
    File file = new File("/Users/cb-angalaparameashwari/Documents/AP/Employee/resources/samplemail");
    String mailContentpath = "/Users/cb-angalaparameashwari/Documents/AP/Employee/resources/EngineeringGreeting";
    GmailQuickstart gmailQuickstart = new GmailQuickstart();
    EmailActions emailActions = new EmailActions();
        emailActions.sendMessage(gmailQuickstart.getGmailService(),user,emailActions.createEmailWithAttachment(toGmail,"angalaparameashwari@gmail.com",
            "Welcome!!",FileHandler.readLineByLine(mailContentpath),file));
}
}
