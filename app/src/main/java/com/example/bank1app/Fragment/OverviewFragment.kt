package com.example.bank1app.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.bank1app.R
import com.example.bank1app.transaction.TransactionActivity

class OverviewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_overview, container, false)

        // AppCompatButton (yoki boshqa turdagi tugma) bosilganda
        val transferButton: ImageView = view.findViewById(R.id.transaction)
        transferButton.setOnClickListener {
            // Fragmentdan TransferActivityga o'tish uchun Intent yaratish
            val intent = Intent(activity, TransactionActivity::class.java)
            startActivity(intent)
        }

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = OverviewFragment()
    }
}