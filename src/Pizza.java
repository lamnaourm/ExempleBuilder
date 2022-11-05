
public class Pizza {
	
	private String pate="";
	private String sauce="";
	private String contenu="";
	
	@Override
	public String toString() {
		return "Pizza [pate=" + pate + ", sauce=" + sauce + ", contenu=" + contenu + "]";
	}
	
	public String getPate() {
		return pate;
	}
	public void setPate(String pate) {
		this.pate = pate;
	}
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
	
	

}
