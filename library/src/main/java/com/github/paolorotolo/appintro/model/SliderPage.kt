package com.github.paolorotolo.appintro.model

import android.graphics.drawable.Drawable
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes

/**
 * Slide Page Model
 */
data class SliderPage @JvmOverloads constructor(
        var title: CharSequence? = null,
        var description: CharSequence? = null,
        @DrawableRes var imageDrawable: Int = 0,
        @ColorInt var bgColor: Int = 0,
        @DrawableRes var bgDrawable: Int = 0,
        @ColorInt var titleColor: Int = 0,
        @ColorInt var descColor: Int = 0,
        var titleTypeface: String? = null,
        var descTypeface: String? = null
) {
    val titleString : String? get() = title?.toString()
    val descriptionString : String? get() = description?.toString()
}