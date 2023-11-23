package uz.akra.dars8hw3

import android.accessibilityservice.GestureDescription
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.graphics.ColorUtils
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.akra.dars8hw3.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private val binding by lazy { ActivityMain2Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.col1.setOnClickListener{
            MyData.color = Color.RED
        }

        binding.col2.setOnClickListener{
            MyData.color = Color.BLUE
        }

        binding.col3.setOnClickListener{
            MyData.color = Color.CYAN
        }

        binding.col4.setOnClickListener{
            MyData.color = Color.DKGRAY
        }

        binding.col5.setOnClickListener{
            MyData.color = Color.MAGENTA
        }

        binding.col6.setOnClickListener{
            MyData.color = Color.TRANSPARENT
        }

        binding.col7.setOnClickListener{
            MyData.color = Color.YELLOW
        }

        binding.col8.setOnClickListener{
            MyData.color = Color.LTGRAY
        }

        binding.col9.setOnClickListener{
            MyData.color = Color.rgb(21,101,192)
        }

        binding.col10.setOnClickListener{
            MyData.color = Color.rgb(46,125,50)
        }

        binding.col11.setOnClickListener{
            MyData.color = Color.rgb(124,77,255)
        }

        binding.col12.setOnClickListener{
            MyData.color = Color.rgb(255,87,34)
        }

        binding.col13.setOnClickListener{
            MyData.color = Color.rgb(233,30,99)
        }

        binding.col14.setOnClickListener{
            MyData.color = Color.rgb(0,150,136)
        }

        binding.col15.setOnClickListener{
            MyData.color = Color.rgb(40,42,53)
        }

        binding.col16.setOnClickListener{
            MyData.color = Color.rgb(4,169,109)
        }

    }
}


