package kaczmarek.seekbarwithindicator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.SeekBar



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        defaulSeekbar.setOnSeekBarChangeListener(seekBarChangeListener)
        customSeekbar.setCustomSeekbarOnChangeListener(customSeekBarChangeListener)
        customSeekbar2.setCustomSeekbarOnChangeListener(customSeekBarChangeListener)
        updateBackgroundColor()
    }

    private val seekBarChangeListener = object : SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
            updateBackgroundColor()
        }

        override fun onStartTrackingTouch(seekBar: SeekBar) {

        }

        override fun onStopTrackingTouch(seekBar: SeekBar) {

        }
    }

    private val customSeekBarChangeListener = object : SeekbarWithIndicator.OnSeekBarChangeListener{
        override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
            updateBackgroundColor()
        }
    }

    private fun updateBackgroundColor(){
        var redValue = defaulSeekbar.progress
        var greenValue = customSeekbar.progress
        var blueValue = customSeekbar2.progress
        // меняем фон через формат RGB
        mainLayout.setBackgroundColor(-0x1000000 + redValue * 0x10000 + greenValue * 0x100
                + blueValue)
    }


}
