package com.ugdgomezdiez.firstopen.feature.domain

class GetFiveOpenUseCase(private val firstOpenRepository: FirstOpenRepository) {
    operator fun invoke(): Boolean{
        return firstOpenRepository.getFiveOpen()
    }
}