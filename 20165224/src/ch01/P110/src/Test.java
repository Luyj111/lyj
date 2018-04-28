public class Test {
	public static void main(String[] args) {
		CPU cpu1 = new CPU();
		CPU cpu2 = new CPU();
		cpu1.setSpeed(2200);
		cpu2.setSpeed(1100);
		System.out.println("cpu1:"+cpu1.toString());
		System.out.println("cpu2:"+cpu2.toString());
		System.out.println("cpu1==cpu2:"+cpu1.equals(cpu2));
		HardDisk disk1 = new HardDisk();
		HardDisk disk2 = new HardDisk();
		disk1.setAmount(200);
		disk2.setAmount(100);
		System.out.println("disk1:"+disk1.toString());
		System.out.println("disk2:"+disk2.toString());
		System.out.println("disk1==disk2:"+disk1.equals(disk2));
		PC pc1 = new PC();
		PC pc2 = new PC();
		pc1.setCPU(cpu1);
		pc1.setHardDisk(disk1);
		pc2.setCPU(cpu1);
		pc2.setHardDisk(disk1);
		pc1.show();
		pc2.show();
		System.out.println("pc1:"+pc1.toString());
		System.out.println("pc2:"+pc2.toString());
		System.out.println("pc1==pc2:"+pc1.equals(pc2));
	}
}
