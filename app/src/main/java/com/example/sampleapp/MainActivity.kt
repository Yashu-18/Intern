package com.example.sampleapp

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.collabdiary.android.views.fragments.BaseFragment
import com.example.sampleapp.BottomFragments.BlockFragment
import com.example.sampleapp.BottomFragments.BottomFragment
import com.example.sampleapp.BottomFragments.CopyFragment
import com.example.sampleapp.BottomFragments.ReportFragment
import com.example.sampleapp.BottomFragments.ReportmsgFragment
import com.example.sampleapp.fragments.AboutPostFragment
import com.example.sampleapp.fragments.AccessFragment
import com.example.sampleapp.fragments.AdminFragment
import com.example.sampleapp.fragments.CollegeHubFragment
import com.example.sampleapp.fragments.ConnectDiaryFragment
import com.example.sampleapp.fragments.CoverFragment
import com.example.sampleapp.fragments.CreateDiaryFragment
import com.example.sampleapp.fragments.CrewMemberFragment
import com.example.sampleapp.fragments.FragmentOne
import com.example.sampleapp.fragments.FragmentThree
import com.example.sampleapp.fragments.FragmentTwo
import com.example.sampleapp.fragments.GroupFragment
import com.example.sampleapp.fragments.HighlightsFragment
import com.example.sampleapp.fragments.HubFragment
import com.example.sampleapp.fragments.InputTypeFragment
import com.example.sampleapp.fragments.InsightsFragment
import com.example.sampleapp.fragments.LabelFragment
import com.example.sampleapp.fragments.MediaFragment
import com.example.sampleapp.fragments.NewLabelFragment
import com.example.sampleapp.fragments.PageFragment


class MainActivity : AppCompatActivity() {

    private val fragments = listOf(FragmentOne(), FragmentTwo(), FragmentThree(),ReportmsgFragment(),ReportFragment(),PageFragment(),NewLabelFragment(),
        MediaFragment(),InsightsFragment(),LabelFragment(),InputTypeFragment(),HighlightsFragment(),HubFragment(),GroupFragment(),
        CreateDiaryFragment(),CrewMemberFragment(),CoverFragment(),CopyFragment(),ConnectDiaryFragment(),CollegeHubFragment(),
        BottomFragment(),BlockFragment(),AdminFragment(),AccessFragment(),AboutPostFragment())
    private var currentFragmentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        if (savedInstanceState == null) {
//            loadFragment(FragmentOne())
//        }
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener { loadNextFragment() }

    }

//    fun loadFragment(fragment: Fragment) {
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.fragment_container, fragment)
//            .addToBackStack(null)
//            .commit()
//    }

    private fun loadNextFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragments[currentFragmentIndex])
            .commit()

        currentFragmentIndex = (currentFragmentIndex + 1) % fragments.size
    }
}