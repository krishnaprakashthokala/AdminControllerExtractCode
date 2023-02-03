package org.ecommerce.admincontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({})
public class AdminControllerApp {
    public static void main(String[] args)
    {
      SpringApplication.run(AdminControllerApp.class, args);
    }
}