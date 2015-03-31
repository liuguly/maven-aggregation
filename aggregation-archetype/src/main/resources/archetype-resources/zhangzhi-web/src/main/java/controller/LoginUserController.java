#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 只是个springMVC例子
 * 
 * @author xliu
 *
 */
@Controller
@RequestMapping(value = "/login")
public class LoginUserController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String login() {
		return "account/login";
	}
	
}
