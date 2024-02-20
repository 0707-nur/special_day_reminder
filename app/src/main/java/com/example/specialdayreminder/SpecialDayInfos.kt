package com.example.specialdayreminder

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.specialdayreminder.viewModel.SpecialDayInfosViewModel

class SpecialDayInfos : Fragment() {

    companion object {
        fun newInstance() = SpecialDayInfos()
    }

    private lateinit var viewModel: SpecialDayInfosViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_special_day_infos, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SpecialDayInfosViewModel::class.java)
        // TODO: Use the ViewModel
    }

}