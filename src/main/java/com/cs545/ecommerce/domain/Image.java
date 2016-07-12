/**
 * 
 */
package com.cs545.ecommerce.domain;

/**
 * @author Ivan
 *
 */
public class Image {
	private String imageURL;
	private String imageName;
	
	public Image(){
		
	}
	
	public Image(String imageName, String imageURL){
		this();
		this.imageURL = imageURL;
		this.imageName = imageName;
	}
	
	/**
	 * @return the imageURL
	 */
	public String getImageURL() {
		return imageURL;
	}
	
	/**
	 * @param imageURL the imageURL to set
	 */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return imageName;
	}
	
	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}	

}
