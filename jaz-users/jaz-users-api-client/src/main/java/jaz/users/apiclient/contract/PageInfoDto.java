package jaz.users.apiclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PageInfoDto(@JsonProperty("page") int pageNumber, int size) {
}
