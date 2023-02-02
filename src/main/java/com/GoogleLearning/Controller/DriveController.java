package com.GoogleLearning.Controller;

import com.GoogleLearning.Model.DriveDto;
import com.GoogleLearning.Service.DriveServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriveController {

    @Autowired
    DriveServiceImpl driveService;


    @PostMapping("/addUser")
    public ResponseEntity<DriveDto> addUser(@RequestBody DriveDto driveDto){

        return new ResponseEntity<DriveDto>(driveService.addUser(driveDto) , HttpStatus.CREATED);
    }
}
