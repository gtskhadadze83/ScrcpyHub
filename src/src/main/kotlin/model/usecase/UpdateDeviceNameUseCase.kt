package model.usecase

import model.entity.Device
import model.repository.DeviceRepository

class UpdateDeviceNameUseCase(private val deviceRepository: DeviceRepository) {
    fun execute(device: Device, newName: String, maxSize: Int?): Boolean {
        return try {
            deviceRepository.updateSetting(device, newName, maxSize)
            true
        } catch (e: Exception) {
            false
        }
    }
}