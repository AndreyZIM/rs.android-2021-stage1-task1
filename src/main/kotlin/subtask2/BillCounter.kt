package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val billList: MutableList<Int> = bill.toMutableList()
        billList.removeAt(k)
        val cost: Int = billList.sum() / 2
        return if (cost == b) "Bon Appetit"
        else (b - cost).toString()
    }
}
