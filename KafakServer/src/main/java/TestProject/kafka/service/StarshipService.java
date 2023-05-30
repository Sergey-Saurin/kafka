package TestProject.kafka.service;

import TestProject.kafka.dto.StarshipDto;
import org.springframework.kafka.annotation.KafkaListener;

public interface StarshipService {

    StarshipDto save(StarshipDto dto);

    void send(StarshipDto dto);

    void consume(StarshipDto dto);
}
