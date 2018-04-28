import java.util.Objects;
public class PC {
	CPU cpu ;
	HardDisk HD ;
	void setCPU(CPU c) {
		cpu = c;
	}
	void setHardDisk(HardDisk h) {
		HD = h;
	}
	void show() {
		System.out.println("CPU的速度是："+cpu.getSpeed());
		System.out.println("硬盘的容量是："+HD.getAmount());
	}
	PC(){ }
	PC(CPU cpu){
		this.cpu = cpu;
	}
	PC(HardDisk HD) {
		this.HD = HD;
	}
	PC(CPU cpu, HardDisk HD){
		this.cpu = cpu;
		this.HD = HD;
	}
	@Override
	public String toString() {
		return "PC:"+"CPU的速度："+cpu.getSpeed()+";"+"HD的容量："+HD.getAmount();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		PC pc = (PC) obj;
		return Objects.equals(cpu, pc.cpu) && Objects.equals(HD, pc.HD);
	}
}

