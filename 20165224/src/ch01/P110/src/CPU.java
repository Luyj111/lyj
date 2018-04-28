import java.util.Objects;
public class CPU  {
	int speed;
	public void setSpeed(int m) {
		speed = m;
	}
	int getSpeed() {
		return speed;
	}
	CPU() { }
	CPU(int speed){
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "CPU的速度："+speed;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		CPU cpu = (CPU) obj;
		return getSpeed() == cpu.getSpeed();
	}
}

