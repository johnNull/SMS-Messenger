
import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;
import javax.activation.*;

public class SendEmail
{
	public static String user = "";
	public static String pass = "";
	public static String msg = "";
   public static void Send()
   {    
	   Writer writer = new Writer();
	   Reader reader = new Reader();
	   String[] samSucks = new String[2];	   
	   samSucks[0]="5859670038@txt.att.net";
	   samSucks[1]="5856987235@vtext.com";
	   Properties props = new Properties();
	   props.put("mail.smtp.host","smtp.gmail.com");
	   props.put("mail.smtp.socketFactory.port", "465");
	   props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	   props.put("mail.smtp.auth", "true");
	   props.put("mail.smtp.port", "465");
	   ArrayList<Person> pList = new ArrayList<Person>();
	   Reader.read(pList);
	   for(int i=0; i<pList.size(); i++){
		System.out.println(pList.get(i).getName());
		System.out.println(pList.get(i).getlName());
		System.out.println(pList.get(i).getCarrier());
		System.out.println(pList.get(i).getNumber());
		System.out.println(pList.size());
		switchaddress.convertAddress(pList, i);
	   }
	   
	   Session session=Session.getDefaultInstance(props,
			   new javax.mail.Authenticator() {
			   		protected PasswordAuthentication getPasswordAuthentication(){
			   			return new PasswordAuthentication(user, pass);
			   		}
	   			}
			   );
	   try{
	    Message message= new MimeMessage(session);
	    message.setFrom(new InternetAddress(user));
	    for(int w = 0; w < pList.size();w++)
	    {
		    message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(pList.get(w).getNumber()+pList.get(w).getCarrier()));
	    }
	    message.setSubject("Messjuaner");
	    message.setText(msg);
	    Transport.send(message);
		   
	   }catch(Exception e){
		 System.out.println(e.getMessage());  
	   }
   }


}