package com.roamingtails.model;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import org.springframework.data.annotation.Id;

public class UserProfile {
	
	@Id
	private String userId;
	private String password;
	private String firstName;
	private String lastName;
	private String emailId;	
	private long phoneNumber;
	private long mobilenumber;
	private byte[] imageFileUrl;
	//private GridFSInputFile gfsfileProfile;
	private Address add = new Address();
	//private PetProfile pet = new PetProfile();
	private ArrayList< PetProfile > petList = new ArrayList< PetProfile >();
	private String authToken;
	
	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public byte[] getImageFileUrl() {
		return imageFileUrl;
	}

	public void setImageFileUrl(byte[] bs) {
		this.imageFileUrl = bs;
	}

	

	@Override
	public String toString() {
		return "UserProfile [userId=" + userId + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber + ", mobilenumber=" + mobilenumber
				+ ", imageFileUrl=" + imageFileUrl + "]";
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}	
	
	public UserProfile(String emailId, String firstName, String lastName, String password, Address add, long phoneNumber, long mobilenumber,ArrayList< PetProfile > petList)
	{
		this.emailId=emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.mobilenumber = mobilenumber;
		this.setAdd(add);
		//this.imageFileUrl = imageFileUrl;
		this.petList = petList;
	}
	public byte[] saveImage(String filePath)throws IOException
	{
	   		
       // open image
		 File imgPath = new File(filePath);
		 BufferedImage bufferedImage = ImageIO.read(imgPath);

		 // get DataBufferBytes from Raster
		 WritableRaster raster = bufferedImage.getRaster();
		 DataBufferByte data = (DataBufferByte) raster.getDataBuffer();
		 return(data.getData());	
	}
	
	/*public 
	public GridFSInputFile createImage(String fileUrl) throws UnknownHostException
	{
		File imageFile = new File(fileUrl);	
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("RoamingTails");
		
		GridFS gfsPhoto = new GridFS(db ,"photo");
		GridFSInputFile gfsFile = null;
		try {
			gfsFile = gfsPhoto.createFile(imageFile);
			gfsFile.setFilename("ProfilePicture"+ getUserId());
			gfsFile.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gfsFile;
	}
*/

	public ArrayList< PetProfile > getPetList() {
		return petList;
	}

	public void setPetList(ArrayList< PetProfile > petList) {
		this.petList = petList;
	}


	
}
