package com.example.recyclerviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val profileList = arrayListOf(
            Profiles(R.drawable.user, "안드로이드", 23, "안드로이드 앱 개발자"),
            Profiles(R.drawable.user, "간드로이드", 15, "그저 휴학생"),
            Profiles(R.drawable.profile, "난드로이드", 18, "백수"),
            Profiles(R.drawable.user, "단드로이드", 40, "웹 개발자"),
            Profiles(R.drawable.profile, "란드로이드", 20, "백엔드 개발자"),
            Profiles(R.drawable.profile, "만드로이드", 24, "풀스택 개발자"),
            Profiles(R.drawable.profile, "반드로이드", 69, "보안업체 직원"),
            Profiles(R.drawable.user, "산드로이드", 42, "굴러다니는 돌멩이"),
            Profiles(R.drawable.user, "잔드로이드", 23, "눈꺼풀 속 속눈썹"),
            Profiles(R.drawable.profile, "찬드로이드", 19, "종이컵에 호올스"),
            Profiles(R.drawable.user, "칸드로이드", 32, "책상 위의 캘린더"),
            Profiles(R.drawable.user, "탄드로이드", 27, "본체 옆 파우치"),
            Profiles(R.drawable.profile, "판드로이드", 36, "필통 속 드라이버"),
            Profiles(R.drawable.user, "한드로이드", 50, "고장난 HDMI")
        )

        binding.rvProfile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvProfile.setHasFixedSize(true)

        binding.rvProfile.adapter = ProfileAdapter(profileList)
    }
}