package org.dateplanner.googletemp;

import org.dateplanner.vo.User;
import org.springframework.social.google.connect.GoogleConnectionFactory;
import org.springframework.social.oauth2.OAuth2Parameters;
import org.springframework.stereotype.Controller;

@Controller
class googleVo {
	
	private User user;
	private GoogleConnectionFactory googleConnectionFactory;
	private OAuth2Parameters googleOAuth2Parameters;
	
	public GoogleConnectionFactory getGoogleConnectionFactory() {
		return googleConnectionFactory;
	}

	public void setGoogleConnectionFactory(GoogleConnectionFactory googleConnectionFactory) {
		this.googleConnectionFactory = googleConnectionFactory;
	}

	public OAuth2Parameters getGoogleOAuth2Parameters() {
		return googleOAuth2Parameters;
	}

	public void setGoogleOAuth2Parameters(OAuth2Parameters googleOAuth2Parameters) {
		this.googleOAuth2Parameters = googleOAuth2Parameters;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	
}