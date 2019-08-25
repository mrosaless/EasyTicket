package com.easycheck.administration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.easycheck.AbstractFragment

import com.easycheck.R

class AdministrationFragment : AbstractFragment() {

    companion object {
        fun newInstance(): AdministrationFragment {
            val args = Bundle()

            val fragment = AdministrationFragment()
            fragment.arguments = args
            return fragment
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_administration, container, false)
    }

}
