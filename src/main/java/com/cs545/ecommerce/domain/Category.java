/**
 * 
 */
package com.cs545.ecommerce.domain;

import java.io.Serializable;

/**
 * @author Solomon Kassahun
 *
 */
public class Category implements Serializable{
	private String categoryName;
	private String description;
	private String categoryImage;
	
	/**
	 * Default no-arg constructor
	 */	
	public Category(){
		super();
		
	}
	
	public Category(String categoryName){
		this.categoryName = categoryName;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the categoryImage
	 */
	public String getCategoryImage() {
		return categoryImage;
	}

	/**
	 * @param categoryImage the categoryImage to set
	 */
	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		return true;
	}
		
	

}
