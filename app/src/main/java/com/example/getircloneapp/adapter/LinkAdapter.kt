package com.example.getircloneapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getircloneapp.databinding.LinkCardBinding
import com.example.getircloneapp.entity.LinkEntity

class LinkAdapter(var mContext:Context,var linkListesi:List<LinkEntity>)
    :RecyclerView.Adapter<LinkAdapter.LinkCardTutucu>(){

    inner class LinkCardTutucu(linkCardBinding: LinkCardBinding)
        :RecyclerView.ViewHolder(linkCardBinding.root){
        var linkTasarim:LinkCardBinding
        init{
            this.linkTasarim=linkCardBinding
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinkCardTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim= LinkCardBinding.inflate(layoutInflater,parent,false)
        return LinkCardTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: LinkCardTutucu, position: Int) {
        val link=linkListesi.get(position)
        holder.linkTasarim.linkNesne2=link
        //holder.linkTasarim.textView.text="gmail"
        holder.linkTasarim.imageView2.setImageResource(mContext.resources.getIdentifier(link.link_icon,"drawable",mContext.packageName))

    }

    override fun getItemCount(): Int {
        return linkListesi.size
    }

}