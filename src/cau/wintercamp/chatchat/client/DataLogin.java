package cau.wintercamp.chatchat.client;

public class DataLogin extends Data{


	private String userId;
	private String userPw;
	private boolean bool;
	
	public DataLogin(String userId, String userPw) {
		super(Data.DATATYPE_LOGIN);
		this.setUserId(userId);
		this.setUserPw(userPw);
		bool = false;
	}
	
	public DataLogin(String userId, String userPw, boolean bool) {
		super(Data.DATATYPE_LOGIN);
		this.setUserId(userId);
		this.setUserPw(userPw);
		this.bool = bool;
	}

	public boolean getBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
}