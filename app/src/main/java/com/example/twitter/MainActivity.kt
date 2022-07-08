package com.example.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        tweets()
    }
    fun tweets(){
        var tweet1=Twitter("","Joy Wamaitha","@JWamaitha","50","100","Work hard and dream big","","250","","","")
        var tweet2=Twitter("","Heta Kahuho","@HkAHUHO","25","100","Be Strong, Be Different, Be You","","150","","","")
        var tweet3=Twitter("","Shanel James","@SJames","15","120","Be proud of how hard you are trying","","270","","","")
        var tweet4=Twitter("","Mildred Hastings","@MHastings","40","60","Don't stop until your proud","","500","","","")
        var tweet5=Twitter("","Gitu Wanjiru","@GWanjiru","15","400","You are more capable than you know","","150","","","")
        var tweet6=Twitter("","Vanessa Kwaku","@VKwakutoto","16","250","Never stop dreaming","","300","","","")
        var tweet7=Twitter("","Terry Njoki","@TNjoki","10","110","It never gets easier you just get better","","700","","","")
        var tweet8=Twitter("","Cate Cashy","@CCashy","30","190","Your only limit is you","","110","","","")

        var twitterlist= listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8)
        var twitterAdapter=TwitterRvAdapter(twitterlist)
        binding.rvTwitter.layoutManager=LinearLayoutManager(this)
        binding.rvTwitter.adapter=twitterAdapter
    }
}