package com.ugdgomezdiez.firstopen.feature.domain

class GetFirstOpenUseCase(private val firstOpenRepository: FirstOpenRepository) {
    operator fun invoke(): Boolean{
        return firstOpenRepository.getFirstOpen()
    }
}