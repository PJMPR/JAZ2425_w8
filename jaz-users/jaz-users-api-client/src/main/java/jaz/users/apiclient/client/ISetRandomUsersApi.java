package jaz.users.apiclient.client;

import org.springframework.web.util.UriComponentsBuilder;

public interface ISetRandomUsersApi {
    String getApiUrl();

    default UriComponentsBuilder getUrlBuilder(){
        return UriComponentsBuilder
                .newInstance()
                .scheme("https")
                .host(getApiUrl())
                .path("api");
    }
}
