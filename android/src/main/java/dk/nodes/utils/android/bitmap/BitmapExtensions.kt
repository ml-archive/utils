package dk.nodes.utils.android.bitmap

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import java.io.ByteArrayOutputStream

fun Bitmap.toBase64EncodedString(
    format: Bitmap.CompressFormat = Bitmap.CompressFormat.JPEG,
    quality: Int = 100
): String {
    val byteArrayOutputStream = ByteArrayOutputStream()
    compress(format, quality, byteArrayOutputStream)
    val byteArray = byteArrayOutputStream.toByteArray()
    return Base64.encodeToString(byteArray, Base64.NO_WRAP or Base64.NO_PADDING)
}

fun String.decodeBase64EncodedBitmap(): Bitmap {
    val decodedByte = Base64.decode(this, 0)
    return BitmapFactory.decodeByteArray(decodedByte, 0, decodedByte.size)
}