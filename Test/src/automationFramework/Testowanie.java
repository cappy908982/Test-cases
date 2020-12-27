package automationFramework;
import java.util.Scanner;

public class Testowanie {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("If you want to exit please tap 0");
		int testCase=-1;
		 Scanner scan = new Scanner(System.in);
		 while(testCase!=0) {
		 System.out.println("Which test case from 1 to 21 do you want to check?");
		 testCase=scan.nextInt();
		 
		 switch (testCase) {
		    case 1:
		        First.between02And06WithEverythingChecked();
		        break;
		    case 2:
		    	Second.between02And06WithoutMedicalCertificate();
		    	break;
		    case 3:
		    	Third.between02And06WithoutMedicalCertificateAndParentsAcceptation();
		    	break;
		    case 4:
		    	Fourth.between02And06WithoutParentsAcceptation();
		    	break;
		    case 5:
		    	Fifth.between07And10WithEverythingChecked();
		    	break;
		    case 6:
		    	Sixth.between07And10WithoutMedicalCertificate();
		    	break;
		    case 7:
		    	Seventh.between07And10WithoutMedicalCertificateAndParentsAcceptation();
		    	break;
		    case 8:
		    	Eighth.between07And10WithoutParentsAcceptation();
		    	break;
		    case 9:
		    	Nineth.before10YearsOld();
		    	break;
		    case 10:
		    	Tenth.between1956And2001();
		    	break;
		    case 11:
		    	Eleventh.dateWithOtherFormat();
		    	break;
		    case 12:
		    	Twelfth.dateWithSpecialCharacters();
		    	break;
		    case 13:
		    	Thirteenth.lastNameWithSpecialCharacters();
		    	break;
		    case 14:
		    	Fourteenth.nameWithSpecialCharacters();
		    	break;
		    case 15:
		    	Fefteenth.noDate();
		    	break;
		    case 16:
		    	Sixteenth.noLastName();
		    	break;
		    case 17:
		    	Seventeenth.noName();
		    	break;
		    case 18:
		    	Eighteenth.withEverythingChecked2009();
		    	break;
		    case 19:
		    	Nineteenth.withMedicalCertificate1955();
		    	break;
		    case 20:
		    	Twentyth.withoutMedicalCertificate1955();
		    	break;
		 
		    
		 	}
		 }
		 scan.close();
	}

}
