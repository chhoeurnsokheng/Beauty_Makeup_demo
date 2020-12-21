package com.example.music_app.Activity
/**
 *
 *Created by Sokheng :12/21/2020
 * **/
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.music_app.Adapter.BrandAdapter
import com.example.music_app.Adapter.DetailsProductsAdapter
import com.example.music_app.Adapter.ProductNameAdapter
import com.example.music_app.Adapter.RandomAdapter
import com.example.music_app.Model.Brand
import com.example.music_app.Model.Feature
import com.example.music_app.Model.Productsname
import com.example.music_app.Model.getRecently
import com.example.music_app.R
import com.example.music_app.SpaceDecoration

class FragmentHome : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment__home, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val brandlist = listOf<Brand>(
            Brand(R.drawable.cremface),
            Brand(R.drawable.makeup1),
            Brand(R.drawable.shapoo1),
            Brand(R.drawable.shapoo),
            Brand(R.drawable.shapoo2),
            Brand(R.drawable.skincare1),
            Brand(R.drawable.makeup3),
            Brand(R.drawable.makeup4),
            Brand(R.drawable.shapoo3),
        )
        var brandProductrecyclerView=view?.findViewById<RecyclerView>(R.id.brandProductsList)
        brandProductrecyclerView?.adapter =BrandAdapter(brandlist)
        var nlinealayout =LinearLayoutManager(context)
        nlinealayout.orientation= LinearLayoutManager.HORIZONTAL
        brandProductrecyclerView?.layoutManager =nlinealayout
        brandProductrecyclerView?.addItemDecoration(SpaceDecoration(resources.getDimensionPixelSize(R.dimen.provider_name_horizontal_magin)))
        var listProducts = listOf<Productsname>(
            Productsname("Skin"),
            Productsname("Hair"),
            Productsname("Personal_Care"),
            Productsname("Make_Up"),
            Productsname("crea_care"),
            Productsname("others"),
        )
        val productNameRecycler=view?.findViewById<RecyclerView>(R.id.productNameRecycler)
        productNameRecycler?.adapter=ProductNameAdapter(listProducts)
        val linearLayout =LinearLayoutManager(context)
        linearLayout.orientation=LinearLayoutManager.HORIZONTAL
        productNameRecycler?.layoutManager =linearLayout
        productNameRecycler?.addItemDecoration(SpaceDecoration(resources.getDimensionPixelSize(R.dimen.provider_name_horizontal_magin)))

        val recyclerDetailsProducts=view?.findViewById<RecyclerView>(R.id.recyclerDetailsProducts)
        recyclerDetailsProducts?.adapter = DetailsProductsAdapter(getRecently())
        recyclerDetailsProducts?.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerDetailsProducts?.addItemDecoration(SpaceDecoration(resources.getDimensionPixelSize(R.dimen.provider_name_horizontal_magin)))

        var recyclerViewRandom=view?.findViewById<RecyclerView>(R.id.recyclerViewRandom)
        recyclerViewRandom?.layoutManager=LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false )
        recyclerViewRandom?.adapter =DetailsProductsAdapter(getRecently())



    }
}
