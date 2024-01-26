package net.codejava;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "sales")
public class Sale {
	@Id
	private String serialNumber;
	private String item;
	private int quantity;
	private float amount;
	private Date date;
	
	protected Sale() {
	}

	protected Sale(final String serialNumber, final String item, final int quantity, final float amount, final Date date) {
        this.serialNumber = serialNumber;
        this.item = item;
        this.quantity = quantity;
        this.amount = amount;
        this.date = date;	
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

	public String getItem() {
		return item;
	}

	public void setItem(final String item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(final int quantity) {
		this.quantity = quantity;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(final float amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(final Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Sale [serial_number=" + serialNumber + ", item=" + item + ", quantity=" + quantity + ", amount=" + amount + ", date=" + date + "]";
	}
}