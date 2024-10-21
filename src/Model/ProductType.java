package Model;

import java.util.Objects;

public class ProductType {
	private String typeID;
	private String typeName;
	
	public ProductType(String typeID, String typeName) {
		super();
		this.typeID = typeID;
		this.typeName = typeName;
	}

	public String getTypeID() {
		return typeID;
	}

	public void setTypeID(String typeID) {
		this.typeID = typeID;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(typeID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductType other = (ProductType) obj;
		return Objects.equals(typeID, other.typeID);
	}
	
	
}
