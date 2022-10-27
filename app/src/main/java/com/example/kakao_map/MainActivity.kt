package com.example.kakao_map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import com.example.kakao_map.databinding.ActivityMainBinding
import net.daum.mf.map.api.MapView

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val mapView = MapView(this)

        binding.mapView.addView(mapView)

    }
}