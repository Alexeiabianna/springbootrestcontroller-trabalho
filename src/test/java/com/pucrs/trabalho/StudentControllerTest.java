package com.pucrs.trabalho;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest
public class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void setUp() throws Exception {
        this.mockMvc.perform(
                MockMvcRequestBuilders.get("/students/")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();
    }
}
