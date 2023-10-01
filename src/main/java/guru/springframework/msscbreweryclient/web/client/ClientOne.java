package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;


@Component
@ConfigurationProperties(value = "folder.client", ignoreUnknownFields = false)
public class ClientOne {

    public final String beer_path_v1 = "/api/v1/beer/";
    private String apiHost;

    private RestTemplate restTemplate;

    public ClientOne(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }


    public BeerDto getBeerById(UUID uuid){
        return restTemplate.getForObject(apiHost + beer_path_v1 + uuid.toString(), BeerDto.class);


    }
    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }
}
