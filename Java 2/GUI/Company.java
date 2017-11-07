

package ex28;


public class Company {
    
  private String companyName; 
	
  
        private String streetAddress; 
	private String location; 
	private String languages; 
	private String comment; 
	private String website; 
	private String contactName; 
	private String email;
	
	
	public Company(String companyName, String streetAddress, String location, String languages, String comment,
			String website, String contactName, String email) {
		
		this.companyName = companyName;
		this.streetAddress = streetAddress;
		this.location = location;
		this.languages = languages;
		this.comment = comment;
		this.website = website;
		this.contactName = contactName;
		this.email = email;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", streetAddress=" + streetAddress + ", location=" + location
				+ ", languages=" + languages + ", comment=" + comment + ", website=" + website + ", contactName="
				+ contactName + ", email=" + email + "]";
	}
	
	
	
    
    
    
    
    
    
    
    
    
    
}
