package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val outputString: MutableList<String> = mutableListOf()
        parseToResult(inputString, outputString)
        return outputString.toTypedArray()
    }

    private fun parseToResult(inputString: String, outputString: MutableList<String>) {
        var startChar: Char
        var endChar: Char? = null
        var startCut: Int? = null
        var endCut: Int? = null
        var passes = 0
        for (i in inputString.indices) {
            if (inputString[i] == '(' || inputString[i] == '<' || inputString[i] == '[') {
                var j = i
                startChar = inputString[i]
                when {
                    inputString[i] == '(' -> endChar = ')'
                    inputString[i] == '<' -> endChar = '>'
                    inputString[i] == '[' -> endChar = ']'
                }
                startCut = i + 1
                while (j in inputString.indices) {
                    if (inputString[j] == startChar) passes++
                    if (inputString[j] == endChar && passes != 0) passes--
                    if (inputString[j] == endChar && passes == 0) {
                        endCut = j
                        break
                    }
                    j++
                }
            }
            if (startCut != null && endCut != null) {
                outputString.add(inputString.substring(startCut, endCut))
                startCut = null
                endCut = null
            }
        }
    }
}
