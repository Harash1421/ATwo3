package com.timer.atwo3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list = ArrayList<List>()
        list.add(List(1, R.drawable.horse, "Horse"))
        list.add(List(1, R.drawable.lion, "Lion"))
        list.add(List(1, R.drawable.tiger, "Tiger"))
        list.add(List(1, R.drawable.camel, "Camel"))
        list.add(List(1, R.drawable.cheetah, "Cheetah"))

        var adapter = Adapter(this,list)
        main_Rc.adapter = adapter
        main_Rc.layoutManager = LinearLayoutManager(this)
    }
}