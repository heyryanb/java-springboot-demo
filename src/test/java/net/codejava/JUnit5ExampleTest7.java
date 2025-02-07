package net.codejava;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class JUnit5ExampleTest7 {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void justAnExample() {
        System.out.println("\n\nTest7-1 Successful!\n\n");
    }

    @Test
    void contextLoads() {
    }

    int ACTUAL = 9;
    int EXPECTED = 4;

    @Test
    void shouldNotBeEqual() {
        assertEquals(EXPECTED, ACTUAL - 5);
        System.out.println("\n\nTest7-2 Successful!\n\n");
    }

    @Test
    void testHomePage() {
        ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).contains("Welcome to the Sales Manager");
    }

    @Test
    void testSalesPage() {
        ResponseEntity<String> response = restTemplate.getForEntity("/sales", String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).contains("Sales List");
    }

    @Test
    void testLoginPage() {
        ResponseEntity<String> response = restTemplate.getForEntity("/login", String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).contains("Login");
    }
}
