package com.school.advanceuiworkshop

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class CustomViewFine @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defAttrStyle: Int = 0,
) : LinearLayout(context, attrs, defAttrStyle) {
    init {
        LayoutInflater.from(context).inflate(R.layout.view_custom_layout, this, true)
    }

    var onButtonClickListener: View.OnClickListener? = null
        set(value) {
            field = value
            findViewById<Button>(R.id.button).setOnClickListener(value)
        }
}
