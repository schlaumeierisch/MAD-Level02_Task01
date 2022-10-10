package nl.hva.task01

import androidx.annotation.DrawableRes

data class Place(
    val name: String,
    @DrawableRes val imageResId: Int
)