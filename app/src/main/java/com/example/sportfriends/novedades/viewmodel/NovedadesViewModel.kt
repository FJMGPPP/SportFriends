package com.example.sportfriends.novedades.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sportfriends.novedades.model.NovedadModel
import com.example.sportfriends.novedades.model.NovedadesProvider

class NovedadesViewModel : ViewModel()
{
     val model = MutableLiveData<NovedadModel>()

    fun getData()
    {
        val data : NovedadModel = NovedadesProvider.getData();
        model.postValue(data);
    }
}