package com.diveandcode.app.repository;
import com.diveandcode.app.entity.DeviceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceStatusRepository extends JpaRepository<DeviceStatus,Integer> {
}
