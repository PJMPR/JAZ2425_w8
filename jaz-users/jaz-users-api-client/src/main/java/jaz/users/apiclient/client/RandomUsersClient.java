package jaz.users.apiclient.client;

import jaz.users.apiclient.contract.PageInfoDto;
import jaz.users.apiclient.contract.UserResultsDto;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RandomUsersClient implements IRandomUsersClient{

    private final ISetRandomUsersApi settings;

    public RandomUsersClient(ISetRandomUsersApi settings) {
        this.settings = settings;
    }

    @Override
    public UserResultsDto getRandomUsers() {

//        RestTemplate restClient = new RestTemplate();
//        var response = restClient.getForEntity(settings.getUrlBuilder().toUriString(), UserResultsDto.class);
//        System.out.println(response);
//        System.out.println(response.getBody());
//        System.out.println(response.getStatusCode());
//        if(response.getStatusCode().is2xxSuccessful())
//            return response.getBody();
        return null;
    }

    @Override
    public UserResultsDto getRandomUsers(PageInfoDto page) {
//        RestTemplate restClient = new RestTemplate();
//        var url = settings.getUrlBuilder()
//                .queryParam("page", page.pageNumber())
//                .queryParam("results", page.size())
//                .toUriString();
//        var response = restClient.getForObject(url, UserResultsDto.class);
//
        return null;
    }
}
