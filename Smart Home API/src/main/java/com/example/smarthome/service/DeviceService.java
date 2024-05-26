package com.example.smarthome.service;

import com.example.smarthome.entity.Device;

import java.util.List;
import java.util.Optional;

public interface DeviceService {
    Device createDevice(Device device);
    Optional<Device> getDeviceById(Long id);
    List<Device> getAllDevices();
    Device updateDevice(Long id, Device device);
    void deleteDevice(Long id);
}
