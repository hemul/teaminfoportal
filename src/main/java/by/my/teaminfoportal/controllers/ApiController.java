package by.my.teaminfoportal.controllers;

import by.my.teaminfoportal.model.Visit;
import by.my.teaminfoportal.repositories.VisitsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    private static final Logger LOG = LoggerFactory.getLogger(ApiController.class);
    final private VisitsRepository visitsRepository;

    public ApiController(VisitsRepository visitsRepository) {
        this.visitsRepository = visitsRepository;
    }

    @PostMapping("/visits")
    public Iterable<Visit> getVisits() {
        return visitsRepository.findAll();
    }

    @PostMapping("/login")
    public String login(@RequestParam(value="username") String username,@RequestParam(value="password") String password) {
        LOG.debug("Name[{}] and Password[{}]", username, password);

        return username + " " + password;
    }
}
