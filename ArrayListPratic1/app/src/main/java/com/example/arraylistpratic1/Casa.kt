package com.example.arraylistpratic1

import android.util.Log

class Casa (var cor: String = "", var qtdAberturas: Int) {

//    var cor: String = ""

    fun abrirJanela(){
        Log.i("JanCasa", "A janela foi aberta $qtdAberturas vezes")
}
    fun abrirCasa(){
        Log.i("JanCasa", "A casa foi aberta $qtdAberturas vezes")

    }

}