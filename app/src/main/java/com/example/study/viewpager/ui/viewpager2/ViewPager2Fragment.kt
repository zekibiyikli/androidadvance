package com.example.study.viewpager.ui.viewpager2

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.study.databinding.FragmentViewpager2Binding

class ViewPager2Fragment : Fragment() {

    companion object {
        fun newInstance() = ViewPager2Fragment()
    }

    private lateinit var viewModel: ViewPager2ViewModel
    private var _binding: FragmentViewpager2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(ViewPager2ViewModel::class.java)
        _binding = FragmentViewpager2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

}