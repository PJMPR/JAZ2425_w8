package jaz.users.apiclient.client;

import jaz.users.apiclient.contract.PageInfoDto;
import jaz.users.apiclient.contract.UserResultsDto;

public interface IRandomUsersClient {

    UserResultsDto getRandomUsers();
    UserResultsDto getRandomUsers(PageInfoDto page);

}
