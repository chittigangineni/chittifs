/*
 * HelloWorld! test Class 
 *  IMPORTANTE *********************************************
 *  
 *  REMOVE THESE CLASS AND THE DEFAULT USER CREATED FOR TEST!
*/
package krishna.controller;


import javax.inject.Inject;

import krishna.business.LoginService;



public class HelloAction extends BaseAction{
	@Inject
	LoginService sv;
	
	public String execute(){
		sv.createFirst();
		return "success";
	}

}
