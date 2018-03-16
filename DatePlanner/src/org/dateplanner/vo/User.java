package org.dateplanner.vo;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.dateplanner.commons.Region;

public class User {
	
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd kk:mm");
	
	private int no;
	private String id;
	private String name;
	private String key;
	private Character platform;
	private String nickname;
	private String profile;
	private Integer regionNo;
	private String introduction;
	private Timestamp regdate;
	
	public User() {}
	public User(int no) { this.no = no; }
	
	public int getNo() { return no; }
	public String getId() { return id; }
	public String getName() { return name; }
	public String getKey() { return key; }
	public Character getPlatform() { return platform; }
	public String getNickname() { return nickname; }
	public String getProfile() { return profile; }
	public String getProfileWithDefault() { return profile == null || profile.isEmpty() ? "default.jpg" : profile; }
	public Integer getRegionNo() { return regionNo; }
	public String getRegion() { return Region.LIST.get(regionNo); }
	public String getIntroduction() { return introduction; }
	public Timestamp getRegdate() { return regdate; }
	public String getFormattedRegdate() { return DATE_FORMAT.format(regdate); }
	public void setNo(int no) { this.no = no; }
	public void setId(String id) { this.id = id; }
	public void setName(String name) { this.name = name; }
	public void setKey(String key) { this.key = key; }
	public void setPlatform(Character platform) { this.platform = platform; }
	public void setNickname(String nickname) { this.nickname = nickname; }
	public void setProfile(String profile) { this.profile = profile; }
	public void setRegionNo(Integer regionNo) { this.regionNo = regionNo; }
	public void setIntroduction(String introduction) { this.introduction = introduction; }
	public void setRegdate(Timestamp regdate) { this.regdate = regdate; }
	
	@Override
	public String toString() {
		return "User [no=" + no + ", id=" + id + ", name=" + name + ", key=" + key + ", platform=" + platform
				+ ", nickname=" + nickname + ", profile=" + profile + ", regionNo=" + regionNo
				+ ", introduction=" + introduction + ", regdate=" + regdate + "]";
	} //toString();
	
} //class User;