package ICS4U1;

/**
 * Name: Lucus Lu, Harry Liu
 * Date: Mar 11, 2022
 * Description: The original class for Phone
 */

public class Phone {

	/* Attributes */
	/**
	 * The brand of the device
	 */
	private String brand;
	
	/**
	 * The colour of the device
	 */
	private String colour;
	
	/**
	 * The price of the device
	 */
	private double price;
	
	/**
	 * The size of the device
	 */
	private double size;
	
	/**
	 * The weight of the device
	 */
	private double weight;
	
	/**
	 * The storage of the device
	 */
	private int storage;
	
	/**
	 * The battery of the device
	 */
	private int battery;
	
	/**
	 * Whether the device is locked or not
	 */
	private boolean isLocked;
	
	/**
	 * Whether the device is on or not
	 */
	private boolean isOn;
	
	/**
	 * Whether the device has face ID or not
	 */
	private boolean hasFaceID;

	
	/* Constructor */
	/**
	 * Name: Phone
	 * Description: Constructor for the Phone class
	 * @param brand - String value for the brand of the phone
	 * @param colour - String value for the colour of the phone
	 * @param price - double value for the price of the phone
	 * @param size - double value for the size of the phone
	 * @param weight - double value for the weight of the phone
	 * @param storage - int value for the storage of the phone
	 * @param battery - int value for the battery value of the phone in %
	 * @param hasFaceID - boolean value for whether the phone has face ID or not
	 * @param isLocked - boolean value for whether the phone is locked or not
	 * @param isOn - boolean value for whether the phone is on or not
	 */
	public Phone (String brand, String colour, double price, double size, double weight, int storage, int battery, boolean hasFaceID, boolean isLocked, boolean isOn) {
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.size = size;
		this.weight = weight;
		this.storage = storage;
		this.battery = battery;
		this.hasFaceID = hasFaceID;
		this.isLocked = isLocked;
		this.isOn = isOn;
	}
	
	/* Accessors and Mutators */
	/**
	 * Name: getBrand
	 * Description: gets the brand of the phone
	 * @return - String value for the brand of the phone
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Name: getColour
	 * Description: gets the color of the phone
	 * @return - String value for the colour of the phone
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * Name: getPrice
	 * Description: gets the price of the phone
	 * @return - double value for the price of the phone
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Name: getSize
	 * Description: gets the size of the phone
	 * @return - double value for the size of the phone
	 */
	public double getSize() {
		return size;
	}

	/**
	 * Name: getWeight
	 * Description: gets the weight of the phone
	 * @return - double value for the weight of the phone
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Name: getStorage
	 * Description: gets the storage of the phone
	 * @return - int value for the storage of the phone
	 */
	public int getStorage() {
		return storage;
	}

	/**
	 * Name: getBattery
	 * Description: gets the battery of the phone
	 * @return - int value for the battery of the phone
	 */
	public int getBattery() {
		return battery;
	}

	/**
	 * Name: getisLocked
	 * Description: gets whether the phone is locked or not
	 * @return - boolean value for whether the phone is locked or not
	 */
	public boolean getIsLocked() {
		return isLocked;
	}

	/**
	 * Name: getIsOn
	 * Description: gets whether the phone is on or not
	 * @return - boolean value for whether the phone is on or not
	 */
	public boolean getIsOn() {
		return isOn;
	}
	
	/**
	 * Name: getHasFaceID
	 * Description: get whether the phone has face ID or not
	 * @return - boolean value for whether the phone has face ID or not
	 */
	public boolean getHasFaceID() {
		return hasFaceID;
	}
	
	/**
	 * Name: setIsOn
	 * Description: This mutator method is used to set the device on and off
	 * @param newIsOn - boolean value that represents the new status of the device
	 */
	public void setIsOn(boolean newIsOn) {
		isOn = newIsOn;
	}
	
	/**
	 * Name: setBattery
	 * Description: This mutator method is used to change the battery value while keeping the value between 0-100
	 * @param newBattery - an int value for the new battery value after using or charging
	 */
	public void setBattery(int newBattery) {
		battery = Math.max(0, Math.min(100, newBattery));	//keep the battery value within the range 0-100
		if (battery == 0) {
			setIsOn(false);		//turn device off if battery is at 0%
		}
	}	
	
	
	/* Other methods */
	/**
	 * Name: unlock
	 * Description: unlocks the device
	 */
	public void unlock() {
		isLocked = false;
	}

	/**
	 * Name: lock
	 * Description: locks the device
	 */
	public void lock() {
		isLocked = true;
	}

	/**
	 * Name: charge
	 * Description: charges the device at a rate of 1% per minute
	 * @param time - int value that represents the time the device gets charged in minutes
	 */
	public void charge(int time) { // time in min
		battery = Math.min(100, battery + time * 1);
	}
	
	/**
	 * Name: call
	 * Description: calls, uses up battery when calling at a rate of 2% per minute
	 * @param time - an int value representing the time of the call in minutes
	 */
	public void call (int time) {
		if (isLocked) {
			System.out.println("Unlock phone first");
			return;
		}
		
		if (battery == 0) {
			System.out.println("Charge phone first");
			return;
		}
		
		battery = Math.max(0, battery - time*2);
	}
	
	/**
	 * Name: powerOn
	 * Description: turns the device on
	 */
	public void powerOn() {
		//if phone is already on
		if (getIsOn()) {
			System.out.println("SYSTEM MESSAGE: Phone is already on and ready to use!");
			return;
		}

		//if there is no battery, does not work
		if (getBattery() == 0) {
			System.out.println("SYSTEM MESSAGE: Charge phone first!");
			return;
		}

		//set phone as on
		setIsOn(true);
		System.out.println("SYSTEM MESSAGE: Phone has been turned on");
	}

	/**
	 * Name: shutdown
	 * Description: shuts the device down
	 */
	public void shutdown() {
		//if phone is already off
		if (!getIsOn()) {
			System.out.println("SYSTEM MESSAGE: Phone is already off");
			return;
		}
		
		//shut the phone down
		setIsOn(false);
		System.out.println("SYSTEM MESSAGE: Phone has been turned off");
	}

	/**
	 * Name: hasEnoughBattery
	 * Description: tells the user whether the phone has enough battery or not
	 * @return - a String value indicating whether there is enough battery or not
	 */
	public String hasEnoughBattery() {
		//if >= 60, yes; if < 60, no
		return getBattery() >= 60 ? "SYSTEM MESSAGE: There is enough battery" : "SYSTEM MESSAGE: There is not enough battery";
	}
	
	/**
	 * Name: toString
	 * Description: outputs the  attributes of the device and their status
	 * @return - a string value for the  attributes of the device and their status
	 */
	public String toString() {
		return "\nBrand: " + brand + "\nColour: " + colour + "\nPrice: " + price + "\nSize: " + size + "\nWeight "
				+ weight + "\nStorage: " + storage + "\nBattery: " + battery + "%\nIs Locked: "
				+ (isLocked ? "Yes" : "No") + "\nis On: " + (isOn ? "Yes" : "No") + "\nHas Face ID: " + (hasFaceID ? "Yes" : "No");
	}
	

}
