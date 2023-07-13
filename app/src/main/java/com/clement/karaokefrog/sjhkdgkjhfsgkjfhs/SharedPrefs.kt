package com.clement.karaokefrog.sjhkdgkjhfsgkjfhs

import android.content.Context

class SharedPrefs(private val jkdshfkjs: Context) {

    private val jdhkjf = jkdshfkjs.getSharedPreferences("databaseInfo", Context.MODE_PRIVATE)



    companion object {
        const val jkdjhskjfh = "UNKNOWN"
        const val fdhjkfhdkjfd = "OPEN_GAME"
        const val jdfhkjhfd = "OPEN_URL"

        const val jkfshkjfh = "STATUS"
        const val jkdsdhjkf = "URL"
        const val jkdshkjd = "CODE"
        const val dshkjfdhdf = "COMPUTER"
    }


    fun jdshjkfh(status: String) {

        jdhkjf.edit().putString(jkfshkjfh, status).apply()
    }

    fun jdhsjkdsh(): String {

        return jdhkjf.getString(jkfshkjfh, jkdjhskjfh) ?: jkdjhskjfh
    }

    fun setUrl(url: String) {

        jdhkjf.edit().putString(jkdsdhjkf, url).apply()
    }

    fun getUrl(): String? {

        return jdhkjf.getString(jkdsdhjkf, null)
    }

    fun setComputer(url: String) {

        jdhkjf.edit().putString(dshkjfdhdf, url).apply()
    }


}

