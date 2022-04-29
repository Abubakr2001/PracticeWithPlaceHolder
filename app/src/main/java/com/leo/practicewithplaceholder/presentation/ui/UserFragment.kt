package com.leo.practicewithplaceholder.presentation.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.leo.practicewithplaceholder.databinding.FragmentUserBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserFragment : Fragment() {

    private val binding: FragmentUserBinding by lazy {
        FragmentUserBinding.inflate(layoutInflater)
    }
    private val vm: UserViewModel by viewModels()
    private lateinit var adapter: UserAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        adapter = UserAdapter()
        binding.rcView.adapter = adapter

        vm.getAllUser().observe(viewLifecycleOwner) {
            adapter.submitList(it)
            Log.e("TAG", "onCreateView: ${it.map { it.website }}")
        }

        return binding.root
    }


}