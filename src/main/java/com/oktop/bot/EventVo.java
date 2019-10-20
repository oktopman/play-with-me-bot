package com.oktop.bot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@ToString
public class EventVo {

    private String token;

    @JsonProperty("team_id")
    private String teamId;

    @JsonProperty("api_app_id")
    private String apiAppId;

    private Map<String, Object> event;

    private String type;

    @JsonProperty("event_id")
    private String eventId;

    @JsonProperty("event_time")
    private Integer eventTime;

    @JsonProperty("authed_users")
    private List<String> authedUsers;

    @JsonProperty("authed_teams")
    private List<String> authedTeams;

}
