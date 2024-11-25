public class DigitalVideoDisc {
	
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id; // Instance member: Unique ID for each DVD
	  // Class member
    private static int nbDigitalVideoDiscs = 0; // Class member: Tracks number of DVDs created

    public int getId() {
        return id; // Getter for instance member ID
    }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(float cost) {
		this.cost = cost;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

        // Increment class member and assign ID
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

	public DigitalVideoDisc(String title, String category, int length, float cost) {
		this.title = title;
		this.category = category;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, int length, String director) {
		this.title = title;
		this.category = category;
		this.length = length;
		this.director = director;
		nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title) {
		this.title = title;
		nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
		
	}
	public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
	public void displayInfo() {
		System.out.println("ID: " + id); // Print unique ID
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Director: " + director);
        System.out.println("Length: " + length + " minutes");
        System.out.println("Cost: $" + cost);
	}
	@Override
	public String toString() {
	    return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
	}
	public boolean isMatch(String title) {
	    return this.title.equalsIgnoreCase(title); 
	}
	public DigitalVideoDisc() {
	    
	    nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;

	    //part7
	    this.title = "Unknown";
	    this.category = "Unknown";
	    this.director = "Unknown";
	    this.length = 0;
	    this.cost = 0.0f;
	}


	
}





 