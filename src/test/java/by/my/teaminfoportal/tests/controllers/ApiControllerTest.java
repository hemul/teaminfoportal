package by.my.teaminfoportal.tests.controllers;

import by.my.teaminfoportal.repositories.VisitsRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.iterableWithSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApiControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private VisitsRepository visitsRepository;

    @Before
    public void setUp() {
        visitsRepository.deleteAll();
    }

    @Test
    public void apiControllerShouldReturnVisits() throws Exception {
        mockMvc.perform(get("/"));

        mockMvc.perform(post("/api/visits"))
                .andExpect(jsonPath("$.*.description", iterableWithSize(1)));
    }
}
