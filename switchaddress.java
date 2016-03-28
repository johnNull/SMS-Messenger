import java.util.*;
public class switchaddress {
	
	public static void convertAddress(ArrayList<Person> p, int i)
	{
		switch(p.get(i).getCarrier()){
			case "AirFireMobile":
				p.get(i).setCarrier("@sms.airfiremobile.com");
				break;
			case "AlaskaCommunications":
				p.get(i).setCarrier("@msg.acsalaska.com");
				break;
			case "Alltell(AlliedWireless)":
				p.get(i).setCarrier("@sms.alltelwireless.com");
				break;
			case "Ameritech":
				p.get(i).setCarrier("@paging.acswireless.com");
				break;
			case "AssuranceWireless":
				p.get(i).setCarrier("@vmobl.com");
				break;
			case "AT&T":
				p.get(i).setCarrier("@txt.att.net");
				break;
			case "BellSouth":
				p.get(i).setCarrier("@bellsouth.cl");
				break;
			case "BluegrassCellular":
				p.get(i).setCarrier("sms.bluecell.com");
				break;
			case "BoostMobile":
				p.get(i).setCarrier("@sms.myboostmobile.com");
				break;
			case "Cellcom":
				p.get(i).setCarrier("@csouth1.com");
				break;
			case "CentennialWireless":
				p.get(i).setCarrier("@cwemail.com");
				break;
			case "CharitonValleyWireless":
				p.get(i).setCarrier("@sms.cvalley.net");
				break;
			case "ChatMobility":
				p.get(i).setCarrier("@mail.msgender.com");
				break;
			case "Cingular":
				p.get(i).setCarrier("@cingular.com");
				break;
			case "Cleartalk":
				p.get(i).setCarrier("@sms.mycricket.com");
				break;
			case "ConsumerCellular":
				p.get(i).setCarrier("@cingularme.com");
				break;
			case "Cricket":
				p.get(i).setCarrier("@sms.mycricket.com");
				break;
			case "CSpireWireless":
				p.get(i).setCarrier("@cspire1.com");
				break;
			case "EdgeWireless":
				p.get(i).setCarrier("@edgewireless.com");
				break;
			case "ElementMobile":
				p.get(i).setCarrier("@sms.elementmobile.net");
				break;
			case "Essendex":
				p.get(i).setCarrier("@echoemail.com");
				break;
			case "CeneralCommunicationsInc.":
				p.get(i).setCarrier("@mobile.gci.net");
				break;
			case "GoldenStateCellular":
				p.get(i).setCarrier("@gscsms.com");
				break;
			case "Greatcall":
				p.get(i).setCarrier("@vtxt.com");
				break;
			case "Kajeet":
				p.get(i).setCarrier("@mobile.kajeet.net");
				break;
			case "Longlines":
				p.get(i).setCarrier("@text.longlines.com");
				break;
			case "MetroPCS":
				p.get(i).setCarrier("@mymetropcs.com");
				break;
			case "Nextech":
				p.get(i).setCarrier("@sms.ntwls.net");
				break;
			case "PagePlusCellular":
				p.get(i).setCarrier("@vtext.com");
				break;
			case "QwestWireless":
				p.get(i).setCarrier("@qwestmp.com");
				break;
			case "RedPocketMobile":
				p.get(i).setCarrier("@txt.att.net");
				break;
			case "RogersWireless":
				p.get(i).setCarrier("@sms.rogers.com");
				break;
			case "SimpleMobile":
				p.get(i).setCarrier("@smtext.com");
				break;
			case "Southernlinc":
				p.get(i).setCarrier("@page.southernlinc.com");
				break;
			case "SouthCentralCommunications":
				p.get(i).setCarrier("@rinasms.com");
				break;
			case "Sprint":
				p.get(i).setCarrier("@messaging.sprintpcs.com");
				break;
			case "StraightTalk":
				p.get(i).setCarrier("@vtext.com");
				break;
			case "StraightTalk(AT&T Sim)":
				p.get(i).setCarrier("@txt.att.net");
				break;
			case "StraightTalk(T-Mobile Sim)":
				p.get(i).setCarrier("@tmomail.net");
				break;
			case "Solavei":
				p.get(i).setCarrier("@tmomail.net");
				break;
			case "SyringaWireless":
				p.get(i).setCarrier("@rinasms.com");
				break;
			case "T-Mobile":
				p.get(i).setCarrier("@tmomail.net");
				break;
			case "Teleflip":
				p.get(i).setCarrier("@teleflip.com");
				break;
			case "TelusMobility":
				p.get(i).setCarrier("@msg.telus.com");
				break;
			case "Ting":
				p.get(i).setCarrier("@message.ting.com");
				break;
			case "TracFone":
				p.get(i).setCarrier("@mmst5.tracfone.com");
				break;
			case "Unicel":
				p.get(i).setCarrier("@utext.com");
				break;
			case "UnionWireless":
				p.get(i).setCarrier("@union-tel.com");
				break;
			case "USCellular":
				p.get(i).setCarrier("@emial.uscc.net");
				break;
			case "USAMobility":
				p.get(i).setCarrier("@usamobility.net");
				break;
			case "VerizonWireless":
				p.get(i).setCarrier("@vtext.com");
				break;
			case "Viaero":
				p.get(i).setCarrier("@viaerosms.com");
				break;
			case "VirginMobile":
				p.get(i).setCarrier("@vmobl.com");
				break;
			case "WestCentralWireless":
				p.get(i).setCarrier("@sms.wcc.net");
				break;
			case "XITCommunications":
				p.get(i).setCarrier("@sms.xit.net");
				break;
		}
	}

}
