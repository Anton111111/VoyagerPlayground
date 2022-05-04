package com.anton111111.anorak.ui

import android.content.Context
import android.os.Build
import android.text.format.Formatter


fun Long.readableFileSize(context: Context): String {
    var sizeIEC = this.toDouble()
    /**
     * DIRTY TRICK!!! Don't like this trick ;(
     */
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        var n = 0
        while (sizeIEC > 1024) {
            sizeIEC /= 1024f
            n += 1
        }
        if (n > 0) {
            sizeIEC *= Math.pow(1000.0, n.toDouble())
        }
    }
    return Formatter.formatFileSize(context, sizeIEC.toLong())
}