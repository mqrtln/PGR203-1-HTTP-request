package no.kristiania;

import org.junit.jupiter.api.Test;

import static no.kristiania.HttpClient.dummyReturnNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpClientTest {

    @Test
    void dummyShouldReturnNull(){
        assertEquals(null, dummyReturnNull());
    }
}
