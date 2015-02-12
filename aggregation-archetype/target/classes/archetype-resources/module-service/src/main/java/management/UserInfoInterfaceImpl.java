#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.management;
import org.springframework.beans.factory.annotation.Autowired;
import ${package}.api.interfaces.UserInfoInterface;
import ${package}.services.IService;


/**
 * 
 * @author xliu
 *
 */
public class UserInfoInterfaceImpl implements UserInfoInterface{
	
	@Autowired
	private IService service;
	
	@Override
	public void login(String userName,String password){
		//调用service方法
		
	}
}
