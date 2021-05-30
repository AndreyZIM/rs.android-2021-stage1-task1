package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArray: MutableList<Int> = sadArray.toMutableList()

        removeBadElements(happyArray)

        return happyArray.toIntArray()
    }

    private fun removeBadElements(list: MutableList<Int>) {
        for (i in list.indices) {
            if (i == 0 || i == (list.size - 1)) continue
            else {
                 if(list[i - 1] + list[i + 1] < list[i]) {
                     list.removeAt(i)
                     removeBadElements(list)
                     break
                 }
            }
        }
    }
}
