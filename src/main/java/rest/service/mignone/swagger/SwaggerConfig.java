package rest.service.mignone.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Configuration
@Configuration
// Enable Swagger
@EnableSwagger2
public class SwaggerConfig {

    // Para ver la docuemtacion: http://localhost:8080/v2/api-docs
    // O en http://localhost:8080/swagger-ui.html
    @Bean
    public Docket api(){
        return new Docket (DocumentationType.SWAGGER_2);
    }
    // Bean - Docket
    //Swager 2
    // All the paths
    // All the apis


}
