package fr.esiea.ex4A;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserData {

    public final String userCountry;
    public final String userEmail;
    public final String userName;
    public final String userSex;
    public final String userSexPref;
    public final String userTweeter;


    public UserData(@JsonProperty("userCountry") String userCountry, @JsonProperty("userEmail") String userEmail, @JsonProperty("userName") String userName,
                    @JsonProperty("userSex") String userSex, @JsonProperty("userSexPref") String userSexPref, @JsonProperty("userTweeter") String userTweeter) {
        this.userCountry = userCountry;
        this.userEmail = userEmail;
        this.userName = userName;
        this.userSex = userSex;
        this.userSexPref = userSexPref;
        this.userTweeter = userTweeter;
    }

    @Override
    public String toString() {
        return "UserData{" + "userCountry='" + userCountry + '\'' +
            ", userEmail='" + userEmail + '\'' +
            ", userName='" + userName + '\'' +
            ", userSex='" + userSex + '\'' +
            ", userSexPref='" + userSexPref + '\'' +
            ", userTweeter='" + userTweeter + '\'' + '}';
    }
}
