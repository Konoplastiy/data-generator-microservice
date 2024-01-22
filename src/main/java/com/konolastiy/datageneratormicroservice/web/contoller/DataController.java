package com.konolastiy.datageneratormicroservice.web.contoller;

import com.konolastiy.datageneratormicroservice.model.Data;
import com.konolastiy.datageneratormicroservice.model.test.DataTestOptions;
import com.konolastiy.datageneratormicroservice.service.KafkaDataService;
import com.konolastiy.datageneratormicroservice.service.TestDataService;
import com.konolastiy.datageneratormicroservice.web.dto.DataDto;
import com.konolastiy.datageneratormicroservice.web.dto.DataTestOptionsDto;
import com.konolastiy.datageneratormicroservice.web.mapper.DataMapper;
import com.konolastiy.datageneratormicroservice.web.mapper.DataTestOptionsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final TestDataService testDataService;

    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dataDto) {
        Data data = dataMapper.toEntity(dataDto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.sendMessages(testOptions);
    }

}
