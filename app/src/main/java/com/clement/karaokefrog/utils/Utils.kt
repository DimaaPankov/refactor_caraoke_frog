package com.clement.karaokefrog.utils

fun parseSubs(
    campaignName: String?,
): Map<String, String> {
    return campaignName?.let {
        campaignName.removePrefix("app//")
            .split("/")
            .mapIndexed { index, s ->
                if (index == 0) {
                    "key" to s
                } else {
                    "sub${index}" to s
                }
            }.associate { it }
    } ?: mapOf()
}