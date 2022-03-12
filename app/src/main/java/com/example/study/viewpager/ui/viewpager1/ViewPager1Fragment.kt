package com.example.study.viewpager.ui.viewpager1

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.study.databinding.FragmentViewpager1Binding

class ViewPager1Fragment : Fragment() {

    companion object {
        fun newInstance() = ViewPager1Fragment()
    }

    private lateinit var viewModel: ViewPager1ViewModel
    private var _binding: FragmentViewpager1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(ViewPager1ViewModel::class.java)
        _binding = FragmentViewpager1Binding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }


}