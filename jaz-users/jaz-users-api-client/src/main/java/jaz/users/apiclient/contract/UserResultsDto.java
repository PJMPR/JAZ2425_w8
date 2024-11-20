package jaz.users.apiclient.contract;

import java.util.List;

public record UserResultsDto(PageInfoDto info, List<UserDto> results) {

}
