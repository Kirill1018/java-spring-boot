package javaSpringBoot;
import org.springframework.context.annotation
.Configuration;
import org.springframework.boot.web
.server.WebServerFactoryCustomizer;
import org.springframework.boot.web
.servlet.server.ConfigurableServletWebServerFactory;
@Configuration
public class CustomContainer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> { public void customize(ConfigurableServletWebServerFactory factory) { factory.setPort(0); } }