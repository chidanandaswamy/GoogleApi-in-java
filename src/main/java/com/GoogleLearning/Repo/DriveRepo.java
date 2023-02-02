package com.GoogleLearning.Repo;

import com.GoogleLearning.Model.DriveDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriveRepo extends JpaRepository<DriveDto, String> {
}
