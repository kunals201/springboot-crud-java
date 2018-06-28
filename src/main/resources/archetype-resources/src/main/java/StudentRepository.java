#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {


}
