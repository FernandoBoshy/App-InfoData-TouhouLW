package com.example.touhouinfo2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.touhouinfo2.Model.Characters
import com.example.touhouinfo2.R
import com.example.touhouinfo2.interfaces.CharClickListener

class AdapterList(list: MutableList<Characters>): RecyclerView.Adapter<AdapterList.MyViewHolder>() {

    private var characterList: MutableList<Characters> = list

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageIcon: ImageView = itemView.findViewById(R.id.image_icon)
        val name: TextView = itemView.findViewById(R.id.text_name)
        val worldSign: TextView = itemView.findViewById(R.id.text_world)
        val invisibleButton: Button = itemView.findViewById(R.id.invisible_detail_button)
        // ...

        fun bind(data: Int){
            invisibleButton.setOnClickListener {
                println(data)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemList: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.adapter_list, parent, false)
        return MyViewHolder(itemList)
    }

    override fun getItemCount(): Int  = characterList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val char: Characters = characterList[position]
        holder.imageIcon.setImageResource(char.imageId)
        holder.name.setText(char.name)
        holder.worldSign.setText(char.world)
        holder.bind(position)

    }
}