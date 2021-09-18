package rest.service.mignone.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

//Configuration
@Configuration
// Enable Swagger
@EnableSwagger2
public class SwaggerConfig {

    private static final Contact DEFAULT_CONTACT = new Contact("Federico Mignone", "", "fede..mignone@gmail.com");
    private static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Api Documentation",
            "Api Documentation", "1.0",
            "urn:tos", DEFAULT_CONTACT, "Apache 2.0", "url apache", new ArrayList<>());

    // Para ver la docuemtacion: http://localhost:8080/v2/api-docs
    // O en http://localhost:8080/swagger-ui.html
    @Bean
    public Docket api(){
        return new Docket (DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                ;
    }
    // Bean - Docket
    //Swager 2
    // All the paths
    // All the apis




}
