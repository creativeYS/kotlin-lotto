package lotto.view

import lotto.domain.Lotto
import lotto.utils.StatisticsUtil

class OutputView {
    fun printLottoCount(lottoCount: Int) {
        println("bought lotto $lottoCount.")
    }

    fun printLotto(lotto: Lotto) {
        println("[ ${lotto.joinToString(", ")} ]")
    }

    fun printStatistics(lottoList: List<Lotto>, winLotto: Lotto) {
        println()
        println("=== Statistics ===")
        println()

        val winCount = StatisticsUtil.getCountWin(lottoList, winLotto)
        val totalPrize = StatisticsUtil.getTotalProfit(winCount)
        val profit = totalPrize.toDouble() / (lottoList.size * 1000).toDouble()

        winCount.forEach {
            println("${it.key.count} matched (${it.key.prize}) : ${it.value} ")
        }
        println("total prize : $totalPrize, profit : $profit")
    }
}
