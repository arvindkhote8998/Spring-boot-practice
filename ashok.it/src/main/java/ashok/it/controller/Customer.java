package ashok.it.controller;

public class Customer {

	private Integer custId;
	private String customerName;
	private String geneger;
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getGeneger() {
		return geneger;
	}
	public void setGeneger(String geneger) {
		this.geneger = geneger;
	}
	public Customer(Integer custId, String customerName, String geneger) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.geneger = geneger;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerName=" + customerName + ", geneger=" + geneger + "]";
	}
	
	
}
