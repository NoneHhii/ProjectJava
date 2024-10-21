package Model;

import java.util.Objects;

public class Product {
	private String idProduct;
	private String productName;
	private String ProductImage;
	private int unitPrice;
	private ProductType productType;
	
	public Product(String idProduct, String productName, String productImage, int unitPrice, ProductType productType) {
		super();
		this.idProduct = idProduct;
		this.productName = productName;
		ProductImage = productImage;
		this.unitPrice = unitPrice;
		this.productType = productType;
	}

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return ProductImage;
	}

	public void setProductImage(String productImage) {
		ProductImage = productImage;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProduct);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(idProduct, other.idProduct);
	}
	
	
}
