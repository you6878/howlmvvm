package com.example.howlmvvm

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.howlmvvm.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), ViewInterface {
    lateinit var binding: ActivityMainBinding

    var presenter = Presenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this
    }

    fun clickNumber(i : Int){
        presenter.clickNumber(i)
    }

    override fun checkPasswordMessage() {
        binding.messageSuccess.visibility = View.VISIBLE
    }

    override fun showToastMessage(i: Int) {
        Toast.makeText(this,"$i 번을 클릭했습니다.",Toast.LENGTH_SHORT).show()
    }


}