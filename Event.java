package org.hcl8;

public class Event {

	private String name;
	private String detail;
	private String ownerName;
	private Long typeId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15s%-15s", this.getName(), this.getDetail(), this.getOwnerName(),
				this.getTypeId());
	}

}
