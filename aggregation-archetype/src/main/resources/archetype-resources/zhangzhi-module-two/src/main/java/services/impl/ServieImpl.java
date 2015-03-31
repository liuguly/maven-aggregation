#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.services.impl;

import ${package}.services.IService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * service层
 * @author xliu
 *
 */
//Spring Service Bean的标识.
@Component
@Transactional
public class ServieImpl implements IService{

}
