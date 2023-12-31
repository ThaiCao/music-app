package com.zionhuang.music.update

import com.google.gson.annotations.SerializedName

data class Release(
    @SerializedName("id") val id: Int,
    @SerializedName("url") val url: String,
    @SerializedName("node_id") val nodeId: String,
    @SerializedName("tag_name") val tagName: String,
    @SerializedName("name") val name: String,
    @SerializedName("prerelease") val preRelease: Boolean,
    @SerializedName("body") val body: String,
    @SerializedName("assets") val assets: List<Asset>,
) {
    val version: Version get() = Version.parse(name)
}
