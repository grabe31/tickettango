
package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Merchandise {
	
	@Id
	@GeneratedValue
	private Long id;
	private String itemName;
	private double price;
	private String image;

	public Merchandise() {

	}

	 public Merchandise(String itemName, double price, String image) {
	        this.itemName = itemName;
	        this.price = price;
	        this.image = image;
	}

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
 
