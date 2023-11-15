package com.example.formapp

import androidx.lifecycle.ViewModel
import com.example.formapp.data.ContactUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ContactViewModel : ViewModel() {
        private val _stateUI =  MutableStateFlow(ContactUIState())
            val stateUI : StateFlow<ContactUIState> = _stateUI.asStateFlow()

    fun setContact (listData : MutableList<String>){
        _stateUI.update {stateSaatIni->stateSaatIni.copy(
            nama =listData[0],
            alamat =listData[1],
            noTelp = listData[2]
        )
    }
}
}