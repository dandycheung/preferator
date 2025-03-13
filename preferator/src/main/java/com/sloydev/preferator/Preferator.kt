package com.sloydev.preferator

import android.content.Context
import android.content.Intent

object Preferator {
    const val EXTRA_PERFS_LIST = "PerfsList"

    @JvmStatic
    fun launch(context: Context) {
        context.startActivity(Intent(context, PreferatorActivity::class.java))
    }

    @JvmStatic
    fun launch(context: Context, perfs: String) {
        val intent = Intent(context, PreferatorActivity::class.java)
        intent.putStringArrayListExtra(EXTRA_PERFS_LIST, ArrayList(listOf(perfs)))
        context.startActivity(intent)
    }

    @JvmStatic
    fun launch(context: Context, perfs: List<String>) {
        val intent = Intent(context, PreferatorActivity::class.java)
        intent.putStringArrayListExtra(EXTRA_PERFS_LIST, ArrayList(perfs))
        context.startActivity(intent)
    }
}
