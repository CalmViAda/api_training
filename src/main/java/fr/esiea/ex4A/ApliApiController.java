package fr.esiea.ex4A;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.awt.*;
import java.util.concurrent.TimeUnit;

@RestController
public class ApliApiController {

    @GetMapping(path = "/api/matches", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserMatche> find_matches(@RequestParam(name = "userName") String name, @RequestParam(name = "userCountry") String twitter ){
        return List.of(
            new UserMatche("TropMims", "tropmimsdu99"),
            new UserMatche("avion_de_chasse", "clem92")
        );
    }

    @PostMapping(path = "/api/inscription", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void inscription(@RequestBody UserData user) throws InterruptedException{
        //TimeUnit.SECONDS.sleep(6L);
        System.out.println(user);
    }


}
