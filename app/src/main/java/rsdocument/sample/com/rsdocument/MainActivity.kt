package rsdocument.sample.com.rsdocument

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var img = BitmapFactory.decodeResource(resources, R.drawable.rfv)
        img = Bitmap.createScaledBitmap(img, 480, 640, true)

        document_layout.getDocumentSurfaceView().repaint(img)
    }
}