package com.example.getircloneapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getircloneapp.R
import com.example.getircloneapp.adapter.KategoriAdapter
import com.example.getircloneapp.databinding.FragmentAnasayfaBinding
import com.example.getircloneapp.entity.KategoriEntity


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim: FragmentAnasayfaBinding
    private lateinit var kategoriListesi :ArrayList<KategoriEntity>
    private lateinit var adapter: KategoriAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim=DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)

        tasarim.rvKategoriTutucu.layoutManager=StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)

        val c1=KategoriEntity("Yeni Ürunler","yeni")
        val c2=KategoriEntity("İndirimler","firsat")
        val c3=KategoriEntity("Damacana","su")
        val c4=KategoriEntity("Su & İçecek","icecekler")
        val c5=KategoriEntity("Fırından","firin")
        val c6=KategoriEntity("Meyve & Sebze","sebze")
        val c7=KategoriEntity("Temel Gıda","gida")
        val c8=KategoriEntity("Atıştırmalık","atistirmalik")
        val c9=KategoriEntity("Dondurma","dondurma")
        val c10=KategoriEntity("Yiyecek","yiyecek")
        val c11=KategoriEntity("Süt & Kahvaltı","kahvalti")
        val c12=KategoriEntity("Fit & Form","fit")
        val c13=KategoriEntity("Kişisel Bakım","bakim")
        val c14=KategoriEntity("Ev Bakım","temizlik")
        val c15=KategoriEntity("Ev & Yaşam","ev_yasam")
        val c16=KategoriEntity("Teknoloji","elektronik")
        val c17=KategoriEntity("Evcil Hayvan","hayvan")
        val c18=KategoriEntity("Bebek","bebek")
        val c19=KategoriEntity("Cinsel Sağlık","kadin_erkek")
        val c20=KategoriEntity("Giyim","giyim")

        kategoriListesi= ArrayList()
        kategoriListesi.add(c1)
        kategoriListesi.add(c2)
        kategoriListesi.add(c3)
        kategoriListesi.add(c4)
        kategoriListesi.add(c5)
        kategoriListesi.add(c6)
        kategoriListesi.add(c7)
        kategoriListesi.add(c8)
        kategoriListesi.add(c9)
        kategoriListesi.add(c10)
        kategoriListesi.add(c11)
        kategoriListesi.add(c12)
        kategoriListesi.add(c13)
        kategoriListesi.add(c14)
        kategoriListesi.add(c15)
        kategoriListesi.add(c16)
        kategoriListesi.add(c17)
        kategoriListesi.add(c18)
        kategoriListesi.add(c19)
        kategoriListesi.add(c20)


        adapter= KategoriAdapter(requireContext(),kategoriListesi)
        tasarim.kAdapter=adapter
        return  tasarim.root
    }

}