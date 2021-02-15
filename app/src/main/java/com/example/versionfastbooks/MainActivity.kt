package com.example.versionfastbooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.versionfastbooks.viewmodel.MyViewModelBooks


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mInstaciaVMenElMain by viewModels<MyViewModelBooks>()

        mInstaciaVMenElMain.doSomething()
    }
}