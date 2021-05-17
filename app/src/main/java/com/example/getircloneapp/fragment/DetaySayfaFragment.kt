package com.example.getircloneapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.getircloneapp.R
import com.example.getircloneapp.databinding.FragmentDetaySayfaBinding
import com.example.getircloneapp.entity.KategoriEntity


class DetaySayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentDetaySayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim=DataBindingUtil.inflate(inflater,R.layout.fragment_detay_sayfa, container, false)
        val b:DetaySayfaFragmentArgs by navArgs()
        val gelenSonuc=b.gelenNesne
        tasarim.detayNesne=gelenSonuc
        tasarim.kategoriDetayResim.setImageResource(resources.getIdentifier(gelenSonuc.resim_adi,"drawable",requireContext().packageName))
        return tasarim.root
    }

}