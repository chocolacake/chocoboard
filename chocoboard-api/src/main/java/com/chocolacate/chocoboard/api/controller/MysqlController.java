package com.chocolacate.chocoboard.api.controller;

import com.chocolacate.chocoboard.api.entity.Response;
import com.chocolacate.chocoboard.api.entity.request.GetMysqlRequest;
import com.chocolacate.chocoboard.datasource.entity.MysqlDataSource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mysql")
@RestController
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class MysqlController {


    @GetMapping("/")
    public Response<MysqlDataSource> getMysqlDataSource(@RequestBody GetMysqlRequest request){
        return new Response<>();
    }
}
