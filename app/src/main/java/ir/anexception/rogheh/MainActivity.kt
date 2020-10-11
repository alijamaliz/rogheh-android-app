package ir.anexception.rogheh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import ir.anexception.rogheh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        navController = this.findNavController(R.id.notesNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController)
        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_RTL;
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}