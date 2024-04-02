package com.example.pexelsapp.images.view

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.pexelsapp.R
import com.example.pexelsapp.images.data.remote.ImagesApi
import com.example.pexelsapp.images.data.repository.ImagesRepositoryImpl
import com.example.pexelsapp.images.domain.model.CuratedAnswer
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }





//        val coroutineExceptionHandler = CoroutineExceptionHandler{_, throwable ->
//            throwable.printStackTrace()
//        }
//
//        val retrofit = Retrofit.Builder()
//            .baseUrl("https://api.pexels.com")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//
//        val imageApi = retrofit.create(ImagesApi::class.java)
//        val imagesApiImpl = ImagesRepositoryImpl(imageApi) // ??????
        // + coroutineExceptionHandlerF
        //
//        bottomNavigationView = findViewById(R.id.bottom_navigation)
//        bottomNavigationView.setOnItemSelectedListener { menuItem ->
//            when(menuItem.itemId ){
//                R.id.bottom_home -> {
//                    replaceFragment(HomeFragment())
//                    true
//                }
//                R.id.bottom_favorites -> {
//                    replaceFragment(FavoritesFragment())
//                    true
//                }
//                else -> {
//                    false
//                }
//            }
//        }
//        if (savedInstanceState == null) { // to set bottom_home as default fragment
//            bottomNavigationView.selectedItemId = R.id.bottom_home; // change to whichever id should be default
//        }
//        var images: CuratedAnswer
//        b.setOnClickListener {
//            CoroutineScope(Dispatchers.IO + coroutineExceptionHandler).launch {
//                images = imageApi.getCuratedImages("7S4gkfhMoHYrK6ekprdT7HpYXbQGzohxtiYwrdUzoFh5jNEJU4gZxXrn",
//                    per_page = 30,
//                    page = 2)
//                runOnUiThread {
//                    Glide.with(this@MainActivity)
//                        .load(images.photos[0].src.original)
//                        .into(imgId)
//                        for (img in images.photos){
//                            println(img)
//                        }
//                }
//            }
//        }
    }

//    private fun replaceFragment(fragment: Fragment){
//        val btn = findViewById<Button>(R.id.b1  )
//        btn.text = "ABOBA"
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.frame_container, fragment)
//            .commit()
//    }
}