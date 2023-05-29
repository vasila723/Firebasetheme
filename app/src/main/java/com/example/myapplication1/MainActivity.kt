package com.example.myapplication1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication1.databinding.ActivityMain2Binding
class MainActivity : AppCompatActivity() {
    private val ActivityMain2Binding: Any
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        loadFragment(Homefragment())
        binding.bottomNavigation.setOnItemReselectedListener {
            val fragment=when(it.itemId){
                R.id.home->{
                HomeFragment()
                }
                R.id.search->{
                    SearchFragment()
                }
                else->{
                    AccountFragment()
                } }loadfragment(fragment)
        true}
    } }private fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.container,fragment).commit()
    }
