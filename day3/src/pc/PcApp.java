package pc;

public class PcApp {

	public static void main(String[] args) {
		Pc pc = new Pc();
		pc.setUsb(new USBMemory());
		pc.executeUSB();
		pc.setUsb(new USBFan());
		pc.executeUSB();
		pc.setUsb(new USBHumidifier());
		pc.executeUSB();
	}
}

class USBMemory implements IUSB {

	@Override
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("保存します");
	}

}
class USBFan implements IUSB{

	@Override
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("涼しい風を送ります");

	}

}
class USBHumidifier implements IUSB{

	@Override
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("加湿します");

	}

}
