package com.example.navigation.contract

import androidx.annotation.StringRes

interface HasCustomTitle {

//    @return the string resource which should be displayed instead of default title
    @StringRes
    fun getTitleRes(): Int
}