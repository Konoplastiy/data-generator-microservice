package com.konolastiy.datageneratormicroservice.web.mapper;

import com.konolastiy.datageneratormicroservice.model.test.DataTestOptions;
import com.konolastiy.datageneratormicroservice.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
