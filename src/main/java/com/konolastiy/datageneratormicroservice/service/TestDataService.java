package com.konolastiy.datageneratormicroservice.service;

import com.konolastiy.datageneratormicroservice.model.test.DataTestOptions;

public interface TestDataService {

    void sendMessages(DataTestOptions testOptions);

}
