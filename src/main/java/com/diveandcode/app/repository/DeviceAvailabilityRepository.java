package com.diveandcode.app.repository;
import com.diveandcode.app.entity.DeviceAvailability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceAvailabilityRepository extends JpaRepository<DeviceAvailability,Integer> {
}
