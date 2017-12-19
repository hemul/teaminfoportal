package by.my.teaminfoportal.controllers;

import by.my.teaminfoportal.model.Visit;
import by.my.teaminfoportal.repositories.VisitsRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    final private VisitsRepository visitsRepository;

    public ApiController(VisitsRepository visitsRepository) {
        this.visitsRepository = visitsRepository;
    }

    @PostMapping("/visits")
    public Iterable<Visit> getVisits() {
        return visitsRepository.findAll();
    }
}
