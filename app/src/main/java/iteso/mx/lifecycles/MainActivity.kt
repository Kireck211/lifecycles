package iteso.mx.lifecycles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"
        const val USER_NAME = "USER_NAME"
        const val USER_EMAIL = "USER_EMAIL"
        const val SESSION_TOKEN = "SESSION_TOKEN"
    }

    private lateinit var mSessionTokenTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v(TAG, "onCreate")
        setContentView(R.layout.activity_main)

        mSessionTokenTextView = findViewById(R.id.activity_main_tv_session_token)
    }

    override fun onStart() {
        super.onStart()
        Log.v(TAG, "onStart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.v(TAG, "onRestoreInstanceState")
        mSessionTokenTextView.text = savedInstanceState.getString(SESSION_TOKEN, "No hay session token")
    }

    override fun onResume() {
        super.onResume()
        Log.v(TAG, "onResume")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.v(TAG, "onSaveInstance")

        outState.putString(USER_EMAIL, "edesantiago@iteso.mx")
        outState.putString(USER_NAME, "kireck211")
        outState.putString(SESSION_TOKEN, "aldsfkjasñdflkjñlhasdñlkfjñlaskjdfkl1209834oiajsdf")
    }

    override fun onPause() {
        super.onPause()
        Log.v(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG, "onDestroy")
    }

}
