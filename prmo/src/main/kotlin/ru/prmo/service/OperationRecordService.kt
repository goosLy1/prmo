package ru.prmo.service

import org.springframework.stereotype.Service
import ru.prmo.dto.OperationRecordDto
import ru.prmo.entity.OperationRecordEntity
import ru.prmo.repository.OperationRecordRepository

@Service
class OperationRecordService(
    private val operationRecordRepository: OperationRecordRepository
) {


}