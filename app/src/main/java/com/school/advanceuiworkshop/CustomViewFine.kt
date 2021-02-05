package com.school.advanceuiworkshop

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class CustomViewFine @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defAttrStyle: Int = 0,
) : LinearLayout(context, attrs, defAttrStyle) {
    init {
        LayoutInflater.from(context).inflate(R.layout.view_easy, this, true)
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.CustomViewFine,
            0,
            0,
        ).apply {

            try {
                text = getString(R.styleable.CustomViewFine_settingsText)
            } finally {
                recycle()
            }
        }
    }

    var text: String? = null
        set(value) {
            field = value
            findViewById<TextView>(R.id.text).text = text
        }

    var buttonClickListener: View.OnClickListener? = null
        set(value) {
            findViewById<Button>(R.id.button).setOnClickListener(value)
        }
}
