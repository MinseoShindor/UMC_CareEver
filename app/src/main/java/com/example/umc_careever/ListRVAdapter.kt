package com.example.umc_careever

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.umc_careever.databinding.ListItemBinding
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.umc_careever.databinding.FragmentHomeBinding


class ListRVAdapter: RecyclerView.Adapter<ListRVAdapter.ListViewHolder>(){

    private var data = mutableListOf<Help>()

    class ListViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(help: Help) {
            binding.helpListTitleTv.text = help.title
            binding.helpListGroupTv.text = help.group
            binding.helpListDateTv.text = help.date
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding= ListItemBinding.inflate(layoutInflater, parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    fun replaceList(newList: MutableList<Help>) {
        data = newList.toMutableList()
        notifyDataSetChanged()
    }

}


//
//class ListRVAdapter(private val itemList: ArrayList<Help>): RecyclerView.Adapter<ListRVAdapter.ViewHolder>() {
//
//    interface MyItemClickListener {
//        fun onItemClick(help: Help)
//        fun onRemoveHelp(position: Int)
//    }
//
//    private lateinit var mItemClickListener: MyItemClickListener
//    fun setMyItemClickListener(itemClickListener: MyItemClickListener) {
//        mItemClickListener = itemClickListener
//    }
//
//    fun addItem(help: Help) {
//        itemList.add(help)
//        notifyDataSetChanged()
//    }
//
//    fun removeItem(position: Int) {
//        itemList.removeAt(position)
//        notifyDataSetChanged()
//    }
//
//
//
//    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListRVAdapter.ViewHolder {
//        val binding : ListItemBinding = ListItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
//
//        return ViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: ListRVAdapter.ViewHolder, position: Int) {
//        holder.bind(itemList[position])
//        holder.itemView.setOnClickListener {
//            mItemClickListener.onItemClick(itemList[position]) }
//    }
//
//    override fun getItemCount(): Int = itemList.size
//
//
//    inner class ViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root) {
//
//        fun bind(help: Help) {
//            binding.helpListDateTv.text = help.date
//            binding.helpListGroupTv.text = help.group
//            binding.helpListTitleTv.text = help.title
//        }
//    }
//
//
//}