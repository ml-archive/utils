package dk.nodes.utils.kotlin.string

fun <T> List<T>.indexOfFirstOrNull(predicate: (T) -> Boolean) : Int? {
    return when(val id = indexOfFirst(predicate)) {
        -1 -> null
        else -> id
    }
}