package dk.nodes.utils.kotlin.string

fun String.without(value: String) = this.replace(value, "")

fun StringBuilder.appendIf(value: String, condition: Boolean) : StringBuilder {
    return if (condition) append(value) else this
}

fun StringBuilder.appendlnIf(value: String, condition: Boolean) : StringBuilder {
    return if (condition) appendln(value) else this
}