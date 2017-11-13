package securst;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;
    
public class Email {
    private Session m_Session;
    private Message m_simpleMessage;
    private InternetAddress m_fromAddress;
    private InternetAddress m_toAddress;
    private Properties m_properties;
     
    public void Sendmail(String m_from,String m_to,String m_subject,String m_body){
 
      try {
 
            m_properties    =  new Properties();
            m_properties.put("mail.smtp.host", "smtp.gmail.com");
            m_properties.put("mail.smtp.socketFactory.port", "465");
            m_properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            m_properties.put("mail.smtp.auth", "true");
            m_properties.put("mail.smtp.port", "465");
             
 
            m_Session   =   Session.getDefaultInstance(m_properties,new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("ifyoulovemeyoulovemydog","site18ali1989"); // username and the password
                }
 
            });
             
            m_simpleMessage  =   new MimeMessage(m_Session);
 
            m_fromAddress    =   new InternetAddress(m_from);
            m_toAddress      =   new InternetAddress(m_to);
 
 
            m_simpleMessage.setFrom(m_fromAddress);
            m_simpleMessage.setRecipient(RecipientType.TO, m_toAddress);
            m_simpleMessage.setSubject(m_subject);
            m_simpleMessage.setContent(m_body,"text/plain");
 
            Transport.send(m_simpleMessage);
 
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
    }
 
    public static void main(String[]args)throws Exception
    {
        final int PORT_NUMBER = 44827;

        while(true) {
            try {
            //Listen on port
            ServerSocket serverSock = new ServerSocket(PORT_NUMBER);
            System.out.println("Listening...");

            //Get connection
            Socket clientSock = serverSock.accept();
            System.out.println("Connected client");

            //Get input
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSock.getInputStream()));
            if(br.readLine().equals("false")){
            System.out.println(br.readLine());
            
                Email send_mail    =   new Email();
                String s = clientSock.getInetAddress().toString();
               send_mail.Sendmail("ifyoulovemeyoulovemydog@gmail.com","alifrad2011@gmail.com","Warning","L'antivirus est désactiver dans"+s);
                System.out.println("Message was send To Administrator");
                JOptionPane.showMessageDialog(null," Message was send To Administrator");
                 }else{
            JOptionPane.showMessageDialog(null,"Tout est bien");
            
            }
            br.close();
            serverSock.close();
            clientSock.close();
            
            } catch(Exception e) {
            e.printStackTrace();
            }
      }	
    }
    }              