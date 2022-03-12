package com.example.study.viewpager.ui.viewpager3

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.study.databinding.FragmentViewpager3Binding

class ViewPager3Fragment : Fragment() {

    companion object {
        fun newInstance() = ViewPager3Fragment()
    }

    private lateinit var viewModel: ViewPager3ViewModel
    private var _binding: FragmentViewpager3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(ViewPager3ViewModel::class.java)
        _binding = FragmentViewpager3Binding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

}