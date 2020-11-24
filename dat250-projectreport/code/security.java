@Override
protected void configure(final HttpSecurity http) throws Exception {
	http.csrf().disable().authorizeRequests()
			//permit all to access some sites
			.antMatchers("/oauth_login", "/h2-console/*", "/", "/poll", "/pollVote", "/polls", "/polls/*/setVotes", "/polls/*/IoT/*", "/styles.css", "/fonts/*").permitAll() 
			//Needs authentication to access other sites
			.anyRequest().authenticated() 
			//Login method, login screen, successful login screen
			.and().oauth2Login().loginPage("/oauth_login").defaultSuccessUrl("/userAdd",true) 
			//Logout method, successful logout screen
			.and().logout().deleteCookies("JSESSIONID").logoutSuccessUrl("/oauth_login"); 
}