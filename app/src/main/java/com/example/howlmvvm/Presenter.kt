package com.example.howlmvvm

class Presenter(var viewInterface : ViewInterface) {

    var model = Model()


    fun clickNumber(i : Int){
        model.inputPassword(i)
        viewInterface.showToastMessage(i)
        if(model.password.size == 4 && model.checkPassword()){
            viewInterface.checkPasswordMessage()
        }
    }

}