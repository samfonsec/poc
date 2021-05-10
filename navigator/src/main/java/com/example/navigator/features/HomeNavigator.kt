package com.example.navigator.features

import android.content.Context
import android.content.Intent
import com.example.navigator.core.NavigatorProvider
import com.example.navigator.core.getIntentForClassName
import com.gaelmarhic.quadrant.QuadrantConstants

object HomeNavigator : NavigatorProvider {

    override fun navigate(context: Context): Intent {
        return getIntentForClassName(context, QuadrantConstants.HOME_ACTIVITY)
    }
}