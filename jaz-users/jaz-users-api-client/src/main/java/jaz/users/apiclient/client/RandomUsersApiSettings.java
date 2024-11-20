package jaz.users.apiclient.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomUsersApiSettings implements ISetRandomUsersApi {

    @Value("${randomusers.api.url}")
    private String apiUrl;

//    public RandomUsersApiSettings(
//            @Value("${randomusers.api.url}")   String apiUrl
//    ) {
//        this.apiUrl = apiUrl;
//    }

    public String getApiUrl() {
        return apiUrl;
    }
}
