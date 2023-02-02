package com.GoogleLearning.Service;

import com.GoogleLearning.Model.DriveDto;
import com.GoogleLearning.Repo.DriveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriveServiceImpl implements DriveService {

    @Autowired
    DriveRepo driveRepo;

    @Override
    public DriveDto addUser(DriveDto driveDto) {
        return driveRepo.save(driveDto);
    }
}
