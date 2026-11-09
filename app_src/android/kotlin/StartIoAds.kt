package com.deepinnovations.call_history

import android.content.Context
import com.startapp.sdk.adsbase.StartAppSDK

/** Initializes Start.io once per app process before requesting banner ads. */
object StartIoAds {
    private const val APP_ID = "210504322"
    @Volatile private var initialized = false

    @Synchronized
    fun initialize(context: Context) {
        if (initialized) return
        StartAppSDK.initParams(context.applicationContext, APP_ID)
            .setReturnAdsEnabled(false)
            .setCallback { initialized = true }
            .init()
        // Prevent duplicate init calls in this process.
        initialized = true
    }
}
