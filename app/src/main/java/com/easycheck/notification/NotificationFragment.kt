package com.easycheck.notification

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.easycheck.AbstractFragment

import com.easycheck.R

class NotificationFragment : AbstractFragment() {

    companion object {
        fun newInstance(): NotificationFragment {
            val args = Bundle()

            val fragment = NotificationFragment()
            fragment.arguments = Bundle()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notification, container, false)
    }

}