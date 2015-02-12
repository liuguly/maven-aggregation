#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api.interfaces;

/**
 * 只是个接口例子
 * 粗粒度对外提供所有接口，或者可细粒度再次拆分接口
 * 
 * @author simon
 *
 */
public interface UserInfoInterface {
	
	public void login(String userName,String password);
	
}
