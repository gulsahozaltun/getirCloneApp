package com.example.getircloneapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.getircloneapp.databinding.CategoryCardBinding
//import com.example.getircloneapp.databinding.CategoryCardBinding
import com.example.getircloneapp.entity.KategoriEntity
import com.example.getircloneapp.fragment.AnasayfaFragmentDirections

class KategoriAdapter(var mContext:Context, var kategoriListesi:List<KategoriEntity>)
    :RecyclerView.Adapter<KategoriAdapter.KategoriTasarimTutucu>(){

    inner class KategoriTasarimTutucu(categoryCardBinding: CategoryCardBinding)
        :RecyclerView.ViewHolder(categoryCardBinding.root){
            var cardTasarim:CategoryCardBinding
            init{
                this.cardTasarim=categoryCardBinding
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategoriTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim=CategoryCardBinding.inflate(layoutInflater,parent,false)
        return KategoriTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: KategoriTasarimTutucu, position: Int) {
        val kategori= kategoriListesi.get(position)
        holder.cardTasarim.kategoriNesne=kategori
        holder.cardTasarim.categoryImage.setImageResource(mContext.resources.getIdentifier(kategori.resim_adi,"drawable",mContext.packageName))
        holder.cardTasarim.cardCategory.setOnClickListener {
            holder.cardTasarim.cardCategory.setOnClickListener {
                val gecis=AnasayfaFragmentDirections.detayGecisAction(kategori)
                Navigation.findNavController(it).navigate(gecis)
            }

        }
    }

    override fun getItemCount(): Int {
        return kategoriListesi.size
    }

}