package com.example.getircloneapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.getircloneapp.R
import com.example.getircloneapp.adapter.LinkAdapter
import com.example.getircloneapp.databinding.FragmentLinkBinding
import com.example.getircloneapp.entity.LinkEntity
import com.example.getircloneapp.databinding.LinkCardBinding

class LinkFragment : Fragment() {

private lateinit var linkListesi:ArrayList<LinkEntity>
private lateinit var adapter:LinkAdapter
private lateinit var tasarim: FragmentLinkBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        tasarim=DataBindingUtil.inflate(inflater,R.layout.fragment_link, container, false)


        val l1= LinkEntity("gulsahozaltun@gmail.com","gmail")
        val l2= LinkEntity("www.linkedin.com/in/gulsahozaltun","linkedin")
        val l3= LinkEntity(" https://github.com/gulsahozaltun","git")

        linkListesi=ArrayList()
        linkListesi.add(l1)
        linkListesi.add(l2)
        linkListesi.add(l3)

        adapter=LinkAdapter(requireContext(),linkListesi)
        tasarim.linkNesne=adapter




        return  tasarim.root
    }


}