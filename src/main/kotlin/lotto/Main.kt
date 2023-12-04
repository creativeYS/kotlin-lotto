package lotto

import lotto.view.InputView
import lotto.view.OutputView

fun main() {
    val inputView = InputView()
    val outputView = OutputView()

    inputView.input()

    val lottoCount: Int = inputView.money / 1000
    outputView.printLottoCount(lottoCount)
}