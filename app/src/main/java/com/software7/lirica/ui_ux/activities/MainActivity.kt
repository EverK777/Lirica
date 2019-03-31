package com.software7.lirica.ui_ux.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.Menu
import android.view.MenuItem
import com.software7.lirica.R
import com.software7.lirica.ui_ux.fragments.main_fragments.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val fragments: Array<Fragment> = arrayOf(HomeFragment())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if(savedInstanceState !=null){
            fragments[0] = supportFragmentManager.getFragment(savedInstanceState,"FragmentHome")!!
           // fragments[1] = supportFragmentManager.getFragment(savedInstanceState,"FragmentHome")!!

        }else{
            //initNavigation
            initNavigation()
        }

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content_frame,fragments[0])
            .commit()


    }



    //methods from the activity
    private fun changeFragment(fragment : Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content_frame, fragment)
            .commit()
    }
    private fun initNavigation(){
        navigation.setOnNavigationItemSelectedListener {
                menuItem ->
            var fragment:Fragment ?= null
            when (menuItem.getItemId()) {
                R.id.navigation_home -> fragment = fragments[0]
                //  R.id.navigation_search -> fragment = SearchFragment()
                //   R.id.navigation_add -> fragment = CreateFragment()
                //   R.id.navigation_near_of_me -> fragment = NearOfMeFragment()
                //  R.id.navigation_notifications -> fragment = NotificationsFragment()
            }
            if (fragment != null) {
                changeFragment(fragment)
                true
            } else {
                false
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return super.onCreateOptionsMenu(menu)


    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        supportFragmentManager.putFragment(outState!!,"FragmentSelected",fragments[0])
        //supportFragmentManager.putFragment(outState,"FragmentSelected",fragments[0])

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item!!.itemId) {
            R.id.navigation_search -> {
                val currentFragment: Fragment = supportFragmentManager.findFragmentById(R.id.content_frame)!!
                (currentFragment as HomeFragment).showSearchView()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}
