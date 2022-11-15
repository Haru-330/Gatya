package com.example.gatya

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.gatya.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding//画面的な物
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //ここから下準備
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //ここまで下準備
        binding.button.setOnClickListener {
            var random = Random.nextInt(100)
            if(kakuritu(random) == 0){
                binding.textView.text="モンキー・D・ルフィ"
                binding.gatya.setImageResource(R.drawable.luffy)
                binding.rare.setImageResource(R.drawable.ssrare)
                binding.rare.visibility = View.VISIBLE
                binding.star.setImageResource(R.drawable.s5)
                binding.star.visibility = View.VISIBLE
            }else if(kakuritu(random) == 1){
                binding.textView.text="ロロノア・ゾロ"
                binding.gatya.setImageResource(R.drawable.zoro)
                binding.rare.setImageResource(R.drawable.hrare)
                binding.rare.visibility = View.VISIBLE
                binding.star.setImageResource(R.drawable.s3)
                binding.star.visibility = View.VISIBLE
            }else if(kakuritu(random) == 2){
                binding.textView.text="ナミ"
                binding.gatya.setImageResource(R.drawable.nami)
                binding.rare.setImageResource(R.drawable.hrare)
                binding.rare.visibility = View.VISIBLE
                binding.star.setImageResource(R.drawable.s3)
                binding.star.visibility = View.VISIBLE
            }else{
                binding.textView.text="はずれ"
                binding.gatya.setImageResource(R.drawable.boy)
                binding.rare.setImageResource(R.drawable.normal)
                binding.rare.visibility = View.VISIBLE
                binding.star.setImageResource(R.drawable.s1)
                binding.star.visibility = View.VISIBLE
            }
        }
    }
    override fun onResume() {
        super.onResume()
        //ステータスバーの背景を透明にする
        window?.statusBarColor = Color.TRANSPARENT
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar!!.hide()
    }
    fun kakuritu(rval:Int): Int {
        if (rval < 10) {
            return 0 //大当たり
        } else if (rval < 30){
            return 1 //当たり
        } else if (rval < 50){
            return 2 //当たり
        } else {
            return 3 //ハズレ
        }
    }
}