import org.junit.Test;
import javax.mail.AuthenticationFailedException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


public class Tests {


    @Test(expected = AuthenticationFailedException.class)
    public void testValidPassword() throws Exception {
        Properties prop = new Properties();
        InputStream input;
        input = new FileInputStream("temp.txt");

        prop.load(input);

        ReaderConfig readerConfig = new ReaderConfig(prop.getProperty("ProtocolForRetrievingEmail"),
                prop.getProperty("InternetStandardProtocol"),
                prop.getProperty("Host"), prop.getProperty("Email"), prop.getProperty("Password"));
        ReaderAuthentication readerAuthentication = new ReaderAuthentication(readerConfig);
        GmailReader gmailReader = new GmailReader(readerConfig, readerAuthentication);
        gmailReader.analyse();
    }
    @Test(expected = javax.mail.MessagingException.class)
    public void testValidness() throws Exception {
        Properties prop = new Properties();
        InputStream input;
        input = new FileInputStream("temp.txt");

        prop.load(input);

        ReaderConfig readerConfig = new ReaderConfig(prop.getProperty("ProtocolForRetrievingEmail"),
                prop.getProperty("InternetStandardProtocol"),
                prop.getProperty("Host"), prop.getProperty("Email"), prop.getProperty("Password"));
        ReaderAuthentication readerAuthentication = new ReaderAuthentication(readerConfig);
        GmailReader gmailReader = new GmailReader(readerConfig, readerAuthentication);
        gmailReader.analyse();
    }

    @Test(expected = GmailReader.longVacationException.class)
    public void testLongVacation() throws Exception {
        Properties prop = new Properties();
        InputStream input;
        input = new FileInputStream("temp.txt");

        prop.load(input);

        ReaderConfig readerConfig = new ReaderConfig(prop.getProperty("ProtocolForRetrievingEmail"),
                prop.getProperty("InternetStandardProtocol"),
                prop.getProperty("Host"), prop.getProperty("Email"), prop.getProperty("Password"));
        ReaderAuthentication readerAuthentication = new ReaderAuthentication(readerConfig);
        GmailReader gmailReader = new GmailReader(readerConfig, readerAuthentication);
        gmailReader.analyse();

    }
    @Test(expected = GmailReader.invalidDateInformationException.class)
    public void testDateInformation() throws Exception {
        Properties prop = new Properties();
        InputStream input;
        input = new FileInputStream("temp.txt");

        prop.load(input);

        ReaderConfig readerConfig = new ReaderConfig(prop.getProperty("ProtocolForRetrievingEmail"),
                prop.getProperty("InternetStandardProtocol"),
                prop.getProperty("Host"), prop.getProperty("Email"), prop.getProperty("Password"));
        ReaderAuthentication readerAuthentication = new ReaderAuthentication(readerConfig);
        GmailReader gmailReader = new GmailReader(readerConfig, readerAuthentication);
        gmailReader.analyse();

    }
    @Test(expected = GmailReader.invalidDateFormatException.class)
    public void testDateFormat() throws Exception {
        Properties prop = new Properties();
        InputStream input;
        input = new FileInputStream("temp.txt");

        prop.load(input);

        ReaderConfig readerConfig = new ReaderConfig(prop.getProperty("ProtocolForRetrievingEmail"),
                prop.getProperty("InternetStandardProtocol"),
                prop.getProperty("Host"), prop.getProperty("Email"), prop.getProperty("Password"));
        ReaderAuthentication readerAuthentication = new ReaderAuthentication(readerConfig);
        GmailReader gmailReader = new GmailReader(readerConfig, readerAuthentication);
        gmailReader.analyse();

    }
    @Test(expected = GmailReader.pastDateException.class)
    public void testPastDate() throws Exception {
        Properties prop = new Properties();
        InputStream input;
        input = new FileInputStream("temp.txt");

        prop.load(input);

        ReaderConfig readerConfig = new ReaderConfig(prop.getProperty("ProtocolForRetrievingEmail"),
                prop.getProperty("InternetStandardProtocol"),
                prop.getProperty("Host"), prop.getProperty("Email"), prop.getProperty("Password"));
        ReaderAuthentication readerAuthentication = new ReaderAuthentication(readerConfig);
        GmailReader gmailReader = new GmailReader(readerConfig, readerAuthentication);
        gmailReader.analyse();

    }



}
