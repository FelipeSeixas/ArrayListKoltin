package com.example.arraylistpratic1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

//List --> É uma coleção estática no tamanho/conteúdo e serve apenas para leitura
//ArrayList --> Dinâmica no tamanho/conteúdo e serve para leitura e escrita multaneamente.

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var listaItens = listOf("SP", "RJ","MG")
//        Log.i("Listas", "Conteúdo --> $listaItens")
//        listaItens[0] = "RN"
//        listaItens.add("RN")

        var listaItensArray = arrayListOf("BA", "PE", "AL")
        listaItensArray.add("RN")

        Log.i("MeuArray", "Tamanho --> ${listaItensArray.size}")

        Log.i("MeuArray", "Conteúdo --> $listaItensArray")

        listaItensArray.remove("AL")
        listaItensArray.removeAt(0)

        Log.i("MeuArray", "Removidos AL e o index 0")

        Log.i("MeuArray", "Conteúdo --> $listaItensArray")

        Log.i("MeuArray", "Tamanho --> ${listaItensArray.size}")
    }
}

//fun CheckGroupComponent(
//    value: SnapshotStateList<Int>,
//    errorState: MutableState<Boolean> = remember { mutableStateOf(false) },
/*
 ==========================================  CONCEITOS - Coleções e geral =====================================================
//            Geralmente contém vários objetos do mesmo tipo. Que são chamados de elementos ou itens .

//        Mutável (Mutable Collection) -->  Pode ser atualizada in-place, alterando o seu estado ou elemento, via:
            - Adição      - Remoção     - Substituição de um elemento.
            * É invariante em seu tipo de elemento.
            * MutableList<E>  ---> Tipo
            * mutableListOf() ---> Função

//        Imutável (List) --> Cria uma NOVA LISTA (coleção), mantendo a original inalterada. Mesmo permitindo o uso das funções da lista Mutável.

PRINCIPAIS FUNÇÕES:
//    Remover único
//        .remove(element: E) : Boolean

//    Remover todos
//        .removeAll(element: E) : Boolean

//    Adicionar único
//        .add(element: E) : Boolean

//    Adicionar tudo
//        .addAll()

//      Converter uma coleção de array em uma coleção diferente (p.320)
//      val longs = longArrayOf(1,2,3,4,5,6)
//      val arrayConvetido: List<Long> = longs.toList()
//      val mutableList: MutableList<Long> = longs.toMutableList()
 */