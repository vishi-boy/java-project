package mycode;
class bank{
	int getroi() {
		return 0;
	}
}
class sbi extends bank{
	int getroi() {
		return 8;
	}
}
class icici extends bank{
	int getroi() {
		return 7;
	}
}
class axis extends bank{
	int getroi() {
		return 9;
	}
}
public class overriding {
	public static void main(String[] args) {
		System.out.println("The program is done by Vishal gupta, roll no 118");
		bank sbi=new sbi();
		bank icici=new icici();
		bank axis=new axis();
		System.out.println("SBI interest rate: "+sbi.getroi()+"%");
		System.out.println("ICICI interest rate: "+icici.getroi()+"%");
		System.out.println("AXIS interest rate: "+axis.getroi()+"%");
	}
}
