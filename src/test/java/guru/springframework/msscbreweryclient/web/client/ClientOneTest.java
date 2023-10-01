package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ClientOneTest {

    @Autowired
    ClientOne clientOne;
    @Test
    void getBeerById() {
        BeerDto dto = clientOne.getBeerById(UUID.randomUUID());
    assertNotNull(dto);
    }
}