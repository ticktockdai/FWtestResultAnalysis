// default package
// Generated Oct 19, 2015 2:31:40 PM by Hibernate Tools 4.3.1

/**
 * SwConfig generated by hbm2java
 */
public class SwConfig implements java.io.Serializable {

	private Integer id;
	private String bmcVersion;
	private String hscVersion;
	private String psuVersion;
	private String fusdrVersion;
	private String biosVersion;
	private String meVersion;

	public SwConfig() {
	}

	public SwConfig(String bmcVersion, String hscVersion, String psuVersion, String fusdrVersion, String biosVersion,
			String meVersion) {
		this.bmcVersion = bmcVersion;
		this.hscVersion = hscVersion;
		this.psuVersion = psuVersion;
		this.fusdrVersion = fusdrVersion;
		this.biosVersion = biosVersion;
		this.meVersion = meVersion;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBmcVersion() {
		return this.bmcVersion;
	}

	public void setBmcVersion(String bmcVersion) {
		this.bmcVersion = bmcVersion;
	}

	public String getHscVersion() {
		return this.hscVersion;
	}

	public void setHscVersion(String hscVersion) {
		this.hscVersion = hscVersion;
	}

	public String getPsuVersion() {
		return this.psuVersion;
	}

	public void setPsuVersion(String psuVersion) {
		this.psuVersion = psuVersion;
	}

	public String getFusdrVersion() {
		return this.fusdrVersion;
	}

	public void setFusdrVersion(String fusdrVersion) {
		this.fusdrVersion = fusdrVersion;
	}

	public String getBiosVersion() {
		return this.biosVersion;
	}

	public void setBiosVersion(String biosVersion) {
		this.biosVersion = biosVersion;
	}

	public String getMeVersion() {
		return this.meVersion;
	}

	public void setMeVersion(String meVersion) {
		this.meVersion = meVersion;
	}

}
