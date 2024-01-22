package com.konolastiy.datageneratormicroservice.service;

import com.konolastiy.datageneratormicroservice.model.Data;

public interface KafkaDataService {

    void send(Data data);
}
