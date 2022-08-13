package com.example.howlmvvm

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData


class ViewModel {

    var toastMessage = MutableLiveData<Int>()
    var checkPasswordMessage = ObservableField<Boolean>(false)

    var model = Model()



    fun clickNumber(i : Int){
        toastMessage.value = i
        model.inputPassword(i)

        if(model.password.size == 4 && model.checkPassword()){
            //4자리 이상 비밀번호가 1234
            //비밀번호가 맞을 경우 True
            checkPasswordMessage.set(true)
        }

    }
}