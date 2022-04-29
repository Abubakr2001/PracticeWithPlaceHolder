package com.leo.practicewithplaceholder.presentation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.leo.practicewithplaceholder.data.network.model.user.UserModelItem
import com.leo.practicewithplaceholder.databinding.UserItemBinding

class UserAdapter() :
    ListAdapter<UserModelItem, UserAdapter.UserDataViewHolder>(DiffCallBack) {

    class UserDataViewHolder(var binding: UserItemBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.setClickListener {

            }
        }

        fun bind(data: UserModelItem) {
            binding.userItem = data

        }
    }

    companion object DiffCallBack : DiffUtil.ItemCallback<UserModelItem>() {
        override fun areItemsTheSame(oldItem: UserModelItem, newItem: UserModelItem): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: UserModelItem, newItem: UserModelItem): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserDataViewHolder {
        return UserDataViewHolder(UserItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: UserDataViewHolder, position: Int) {
        val itemData = getItem(position)
        holder.bind(itemData)
    }

}