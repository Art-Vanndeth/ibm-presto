
package dev.dcoder.ibmpresto.controller;

import dev.dcoder.ibmpresto.model.Person;
import dev.dcoder.ibmpresto.service.PrestoQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/presto")
public class PrestoController {

    private final PrestoQueryService prestoQueryService;

    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        return prestoQueryService.getAllPersons();
    }
}