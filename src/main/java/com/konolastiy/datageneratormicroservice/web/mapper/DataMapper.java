package com.konolastiy.datageneratormicroservice.web.mapper;

import com.konolastiy.datageneratormicroservice.model.Data;
import com.konolastiy.datageneratormicroservice.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto>{
}
