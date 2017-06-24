package webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@Autowired
	public LoginService loginService;
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String showForm() {
		return "login";
	}


	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name,
			@RequestParam String password, ModelMap map){
		map.put("username", name);
		map.put("password", password);
		boolean userExist = loginService.checkLogin(name, password);
		System.out.print("userExists::::"+userExist);
		if(userExist){
			System.out.print("user found" );
			return "welcome";
			
		}

		return "login";
	}
	
	

	
	
}
