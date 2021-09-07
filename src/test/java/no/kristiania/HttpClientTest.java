package no.kristiania;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpClientTest {

    @Test
    void dummyShouldReturnNull(){
        assertEquals(null, HttpClient.dummyReturnNull());
    }

    @Test
    void dummyShouldReturn10(){
        assertEquals(10, HttpClient.return10());
    }
}
