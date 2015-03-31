#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ${package}.entity.User;

/**
 * spring-data-jpa 
 * 带分页的Dao，默认提供持久层方法
 * 
 * @author xliu
 *
 */
public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
