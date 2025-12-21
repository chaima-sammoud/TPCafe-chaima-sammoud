// src/main/java/org/example/tpcafechaimasammoud/schedular/schedularMethods.java
package org.example.tpcafechaimasammoud.schedular;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.tpcafechaimasammoud.entite.Client;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.example.tpcafechaimasammoud.Services.ClientService;
import java.util.List;


@Component
@AllArgsConstructor
@Slf4j
public class schedularMethods {
    ClientService ClientService;
    @Scheduled( fixedRate = 2000 )// fixed reate  / fixed delay // cron
    public void scheduledTask(){

        log.info("Scheduled task executed");
    }
        /// implementaer  la methode ici
        @Scheduled(cron = "0 0 0 * * *")
                public void method3(){
            for(Client client : ClientService.incrementerPts()){
                log.info("Client : "+ client.getPrenom() + " "+client.getNom());

            }
        }

}