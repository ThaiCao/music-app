package com.zionhuang.music.extensions

import java.io.File

operator fun File.div(child: String): File = File(this, child)
