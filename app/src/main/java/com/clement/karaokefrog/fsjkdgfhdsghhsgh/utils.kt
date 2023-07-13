package com.clement.karaokefrog.fsjkdgfhdsghhsgh

fun parseNamign(
    jkdhkjf: String?,
): Map<String, String> {
    return jkdhkjf?.let {
        jkdhkjf.removePrefix("app//")
            .split("/")
            .mapIndexed { kjdshds, sdjhjd ->
                if (kjdshds == 0) {
                    "key" to sdjhjd
                } else {
                    "sub${kjdshds}" to sdjhjd
                }
            }.associate { it }
    } ?: mapOf()
}

fun extractAffiseAffcId(line: String): String? {
    val regex = Regex("affise_affc_id=([^&]+)")
    val matchResult = regex.find(line)

    return matchResult?.groupValues?.get(1)
}

fun deleteRemainingLine(url: String): String {
    val index = url.lastIndexOf('/')
    return if (index != -1) {
        url.substring(0, index + 1)
    } else {
        url
    }
}













