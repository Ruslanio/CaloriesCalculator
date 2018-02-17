package com.production.ruslanio.caloriescalculator.util

/**
 * Created by Ruslanio on 07.02.2018.
 */
class UtilFormulas {

    companion object {

        val FORMULA_CATCH_MAC_ARDL = 1
        val FORMULA_MIFFLINA_SAN_JEORA = 2

        val SEX_MALE = 5
        val SEX_FEMALE = 6

        val GAIN_WEIGHT = 3
        val LOOSE_WEIGHT = 4

        fun calculate(formulaType: Int, dataHolder: FormulaDataHolder): Double {
            return when (formulaType) {
                FORMULA_CATCH_MAC_ARDL -> catchMacArdl(dataHolder)
                FORMULA_MIFFLINA_SAN_JEORA -> mifflinSanJeora(dataHolder)
                else -> catchMacArdl(dataHolder)
            }
        }

        private fun catchMacArdl(dataHolder: FormulaDataHolder): Double {
            var lbm : Double = dataHolder.weight*(100.0 - dataHolder.fatPercent) / 100
            var bmr : Double = 370 + (21.6 * lbm)
            return bmr
        }

        private fun mifflinSanJeora(dataHolder: FormulaDataHolder): Double {
            var koeff = when(dataHolder.sex){
                SEX_MALE -> 5
                SEX_FEMALE -> -161
                else -> 0
            }
            var bmr: Double = 9.99 * dataHolder.weight + 6.25 * dataHolder.height - 4.92 * dataHolder.age + koeff
            return bmr
        }

    }


    inner class FormulaDataHolder(
            var weight: Int,
            var fatPercent: Int,
            var height: Int,
            var age: Int,
            var target: Int,
            var sex: Int,
            var activityKoeff: Double) {
    }
}