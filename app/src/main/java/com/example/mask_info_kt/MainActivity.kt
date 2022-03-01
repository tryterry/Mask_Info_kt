package com.example.mask_info_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mask_info_kt.databinding.ActivityMainBinding
import com.example.mask_info_kt.model.Store

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recyclerView = binding.recyclerView
        val storeAdapter = StoreAdapter()


        recyclerView.apply {
            layoutManager = LinearLayoutManager(
                this@MainActivity, RecyclerView.VERTICAL,
                false
            )
            adapter = storeAdapter
        }

        viewModel.apply {
            itemLiveData.observe(this@MainActivity, Observer {
                storeAdapter.updateItems(it)
            })
            loadingLiveData.observe(this@MainActivity, Observer { isLoading ->
                binding.progressBar.visibility = if (isLoading) View.VISIBLE else View.GONE
            })
        }

    }
}

