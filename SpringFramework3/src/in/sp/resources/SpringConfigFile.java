package in.sp.resources;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration

//@ComponentScan("in.sp.beans")
//@ComponentScan({"in.sp.beans"})
@ComponentScan(basePackages= {"in.sp.beans"})
public class SpringConfigFile {

}
