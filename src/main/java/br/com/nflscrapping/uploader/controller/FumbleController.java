package br.com.nflscrapping.uploader.controller;

import br.com.nflscrapping.uploader.entity.Fumble;
import br.com.nflscrapping.uploader.kafka.KafkaExample;
import br.com.nflscrapping.uploader.rabbitmq.RabbitPublisher;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fumble")
public class FumbleController {

    String brokers = "tricycle-03.srvs.cloudkafka.com:9094,tricycle-02.srvs.cloudkafka.com:9094,tricycle-01.srvs.cloudkafka.com:9094";
    String username = "d0elkda4";
    String password = "NI29_7AkbeO0EIG65KuaTpXEL3w7wtsg";

    private KafkaExample kafkaExample = new KafkaExample(brokers, username, password);
    private RabbitPublisher rabbitPublisher = new RabbitPublisher();


    @PostMapping
    public void publicar(@RequestBody Fumble fumble) throws Exception {
        //kafkaExample.produce(new Gson().toJson(fumble));
        rabbitPublisher.produce(new Gson().toJson(fumble));
    }

}
