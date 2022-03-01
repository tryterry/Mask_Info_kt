package com.example.mask_info_kt

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mask_info.MaskService
import com.example.mask_info_kt.model.Store
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MainViewModel : ViewModel() {
    val itemLiveData = MutableLiveData<List<Store>>()
    val loadingLiveData = MutableLiveData<Boolean>()

    // 나중에 초기화 해도 되는 변수?
    private val service: MaskService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(MaskService.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        service = retrofit.create(MaskService::class.java)
        fetchStoreInfo()
    }

    fun fetchStoreInfo() {
        // 로딩 시작
        loadingLiveData.value = true

        viewModelScope.launch {
            val storeInfo = service.fetchStoreInfo(37.111, 127.004)
            itemLiveData.value = storeInfo.stores

            // 로딩 끝
            loadingLiveData.value = false
        }
    }


}