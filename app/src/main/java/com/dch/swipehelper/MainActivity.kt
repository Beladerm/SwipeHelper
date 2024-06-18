package com.dch.swipehelper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dch.swipehelper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onStart() {
        super.onStart()
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        val items = List(20) { "Item ${it + 1} Item ${it + 1}  Item ${it + 1}  Item ${it + 1}  Item ${it + 1} " }
        val adapter = MyAdapter(items)
        recyclerView.adapter = adapter

        val swipeHelper = object : SwipeHelper(recyclerView) {
            override fun instantiateUnderlayButton(position: Int): List<UnderlayButton> {
                return listOf(
                    UnderlayButton(
                        this@MainActivity,
                        "Delete",
                        14f,
                        android.R.color.holo_red_light,
                        R.drawable.ic_launcher_foreground,
                        100,
                        object : UnderlayButtonClickListener {
                            override fun onClick() {
                                // Handle delete button click
                            }
                        }
                    ),
                    UnderlayButton(
                        this@MainActivity,
                        "Edit",
                        14f,
                        android.R.color.holo_blue_light,
                        R.drawable.ic_launcher_foreground,
                        100,
                        object : UnderlayButtonClickListener {
                            override fun onClick() {
                                // Handle edit button click
                            }
                        }
                    )
                )
            }
        }

        val itemTouchHelper = ItemTouchHelper(swipeHelper)
        itemTouchHelper.attachToRecyclerView(recyclerView)
    }
}