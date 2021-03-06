package training.journal.utils

import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import training.journal.R

fun AppCompatActivity.initHomeButton() {
    this.supportActionBar?.let {
        it.displayOptions = ActionBar.DISPLAY_HOME_AS_UP
        it.setHomeButtonEnabled(true)
        it.setDisplayShowHomeEnabled(true)
        it.setHomeAsUpIndicator(this.getDrawable(R.drawable.ic_home_button))
    }
}
