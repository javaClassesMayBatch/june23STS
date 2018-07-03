package src.main.java.bankingSystem.models;

import java.math.BigDecimal;

public class Transaction {
	public static enum transectionType {
		DEBIT, CREDIT;
	}
	public static enum transectionMode {
		CHECQUE, ONLINE, SWAP, UPI;
	}

	private transectionType type;
	private BigDecimal amount;
	private Customer secondPerson;
	private String details;
	public transectionType getType() {
		return type;
	}
	public void setType(transectionType type) {
		this.type = type;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Customer getSecondPerson() {
		return secondPerson;
	}
	public void setSecondPerson(Customer secondPerson) {
		this.secondPerson = secondPerson;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Transaction(transectionType type, BigDecimal amount, Customer secondPerson, String details) {
		super();
		this.type = type;
		this.amount = amount;
		this.secondPerson = secondPerson;
		this.details = details;
	}
	@Override
	public String toString() {
		return "Transaction ["
				+ "type=" + type 
				+ ", amount=" + amount 
				+ ", secondPerson=" + secondPerson 
				+ ", details=" + details 
			+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((details == null) ? 0 : details.hashCode());
		result = prime * result + ((secondPerson == null) ? 0 : secondPerson.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		if (secondPerson == null) {
			if (other.secondPerson != null)
				return false;
		} else if (!secondPerson.equals(other.secondPerson))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	
	
}
