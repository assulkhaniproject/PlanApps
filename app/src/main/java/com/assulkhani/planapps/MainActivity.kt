package com.assulkhani.planapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DataAdapter.Callback{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dataList = ArrayList<DataModel>()
        dataList.add(DataModel(1, "Belajar Android", "Loren Ipsum Today"))
        dataList.add(DataModel(1, "Belajar Android", "Loren Ipsum Today"))
        dataList.add(DataModel(1, "Belajar Android", "Loren Ipsum Today"))
        dataList.add(DataModel(1, "Belajar Android", "Loren Ipsum Today"))
        dataList.add(DataModel(1, "Belajar Android", "Loren Ipsum Today"))

        var dataAdapter = DataAdapter(this)
        rv_data.apply {
            var linearLayoutManager = LinearLayoutManager(context)
            linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
            layoutManager = linearLayoutManager
            adapter = dataAdapter
        }
        dataAdapter.setData(dataList)
        dataAdapter.notifyDataSetChanged()
    }
}
