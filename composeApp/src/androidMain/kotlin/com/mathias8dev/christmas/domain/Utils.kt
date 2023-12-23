package com.mathias8dev.christmas.domain

import android.content.ContentResolver
import android.net.Uri
import io.github.aakira.napier.Napier

object Utils {
    fun uriFromRes(
        res: Int,
        packageName: String
    ): Uri {
        val uri = Uri.Builder()
            .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
            .authority(packageName)
            .appendPath("$res")
            .build()

        Napier.d("Utils: Calling uriFromRes with res: $res and packageName: $packageName. The output is $uri")
        return uri
    }
}

