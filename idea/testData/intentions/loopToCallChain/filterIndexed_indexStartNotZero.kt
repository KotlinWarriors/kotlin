// WITH_RUNTIME
// IS_APPLICABLE: false
fun foo(list: List<String>): String? {
    var i = 1
    <caret>for (s in list) {
        if (s.length > i) {
            return s
        }
        i++
    }
    return null
}