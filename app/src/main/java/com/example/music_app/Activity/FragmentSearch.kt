package com.example.music_app.Activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.music_app.Adapter.DetailsProductsAdapter
import com.example.music_app.Adapter.RandomAdapter
import com.example.music_app.Model.Feature.Companion.getfeature
import com.example.music_app.R

class FragmentSearch : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var recyclerView =view?.findViewById<RecyclerView>(R.id.recyclerViewRandomPicture)
        recyclerView?.layoutManager =LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        recyclerView?.adapter =RandomAdapter(getfeature())


    }
}
