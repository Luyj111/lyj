import java.util.Objects;
public class HardDisk {
	int amount;
	public void setAmount(int m) {
		amount = m;
	}
	int getAmount(){
		return amount;
	}
	HardDisk() { }
	HardDisk(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "HD的容量:"+amount;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		HardDisk hardDisk = (HardDisk) obj;
		return getAmount() == hardDisk.getAmount();
	}
}
