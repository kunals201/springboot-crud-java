#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;

@SpringBootApplication
@Async
public class SpringwithdataApplication {

    public static void main(String[] args) {
        
        SpringApplication.run(SpringwithdataApplication.class, args);
    }
}
