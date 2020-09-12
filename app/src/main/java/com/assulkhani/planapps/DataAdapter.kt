package com.assulkhani.planapps

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DataAdapter () : RecyclerView.Adapter<DataAdapter.ViewHolder> () {

    private var dataList : List<DataModel> = ArrayList()
    fun setData(data : List<DataModel>){
        this.dataList = data
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataAdapter.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: DataAdapter.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

    }
}