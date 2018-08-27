package com.serviceportal.repository;
import com.serviceportal.model.ServiceDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final ServiceDetailsRepository repository;

    @Autowired
    public DatabaseLoader(ServiceDetailsRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new ServiceDetails("S1", "Service One", "True"));
        this.repository.save(new ServiceDetails("S2", "Service Two", "True"));
        this.repository.save(new ServiceDetails("S3", "Service Three", "False"));
        this.repository.save(new ServiceDetails("S4", "Service Four", "False"));
    }
}
