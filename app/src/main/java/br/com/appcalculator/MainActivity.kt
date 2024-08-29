package br.com.appcalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "SetTextI18n") // Suprime o aviso de ID faltando após a inflação da interface e a possível concatenação de strings sem usar recursos.
    override fun onCreate(savedInstanceState: Bundle?) { // Método chamado ao criar a Activity
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Ativa o modo de tela cheia, utilizando bordas edge-to-edge
        setContentView(R.layout.activity_main) // Define o layout da Activity a partir do XML

        // Referências aos TextViews para exibir o cálculo e o resultado
        val calculo = findViewById<TextView>(R.id.calculo)
        val resultado = findViewById<TextView>(R.id.resultado)

        // Referências aos botões numéricos e operacionais
        val button1 = findViewById<Button>(R.id.um)
        val button2 = findViewById<Button>(R.id.dois)
        val button3 = findViewById<Button>(R.id.tres)
        val button4 = findViewById<Button>(R.id.quatro)
        val button5 = findViewById<Button>(R.id.cinco)
        val button6 = findViewById<Button>(R.id.seis)
        val button7 = findViewById<Button>(R.id.sete)
        val button8 = findViewById<Button>(R.id.oito)
        val button9 = findViewById<Button>(R.id.nove)
        val button0 = findViewById<Button>(R.id.zero)

        // Referências aos botões de ponto decimal e operações matemáticas
        val buttonponto = findViewById<Button>(R.id.ponto)
        val buttonsoma = findViewById<Button>(R.id.soma)
        val buttonsubtrair = findViewById<Button>(R.id.subtrair)
        val buttonmultiplicar = findViewById<Button>(R.id.multiplicar)
        val buttondividir = findViewById<Button>(R.id.dividir)

        // Referências aos botões de resultado, limpar um dígito e limpar tudo
        val buttonigual = findViewById<Button>(R.id.igual)
        val buttonlimpar = findViewById<ImageButton>(R.id.limpar)
        val buttonparentese_abrindo = findViewById<Button>(R.id.parentese_abrindo)
        val buttonparentese_fechando = findViewById<Button>(R.id.parentese_fechando)
        val buttonCE = findViewById<Button>(R.id.ce)

        // Configurações de cliques para os botões numéricos
        button1.setOnClickListener { // Quando o botão "1" é clicado
            calculo.text = "${calculo.text}1" // Adiciona "1" ao cálculo
        }

        button2.setOnClickListener { // Quando o botão "2" é clicado
            calculo.text = "${calculo.text}2" // Adiciona "2" ao cálculo
        }

        button3.setOnClickListener { // Quando o botão "3" é clicado
            calculo.text = "${calculo.text}3" // Adiciona "3" ao cálculo
        }

        button4.setOnClickListener { // Quando o botão "4" é clicado
            calculo.text = "${calculo.text}4" // Adiciona "4" ao cálculo
        }

        button5.setOnClickListener { // Quando o botão "5" é clicado
            calculo.text = "${calculo.text}5" // Adiciona "5" ao cálculo
        }

        button6.setOnClickListener { // Quando o botão "6" é clicado
            calculo.text = "${calculo.text}6" // Adiciona "6" ao cálculo
        }

        button7.setOnClickListener { // Quando o botão "7" é clicado
            calculo.text = "${calculo.text}7" // Adiciona "7" ao cálculo
        }

        button8.setOnClickListener { // Quando o botão "8" é clicado
            calculo.text = "${calculo.text}8" // Adiciona "8" ao cálculo
        }

        button9.setOnClickListener { // Quando o botão "9" é clicado
            calculo.text = "${calculo.text}9" // Adiciona "9" ao cálculo
        }

        button0.setOnClickListener { // Quando o botão "0" é clicado
            calculo.text = "${calculo.text}0" // Adiciona "0" ao cálculo
        }

        buttonponto.setOnClickListener { // Quando o botão "." é clicado
            calculo.text = "${calculo.text}." // Adiciona "." ao cálculo
        }

        // Configurações de cliques para os botões de operações matemáticas
        buttonsoma.setOnClickListener { // Quando o botão "+" é clicado
            calculo.text = "${calculo.text}+" // Adiciona "+" ao cálculo
        }

        buttonsubtrair.setOnClickListener { // Quando o botão "-" é clicado
            calculo.text = "${calculo.text}-" // Adiciona "-" ao cálculo
        }

        buttonmultiplicar.setOnClickListener { // Quando o botão "*" é clicado
            calculo.text = "${calculo.text}*" // Adiciona "*" ao cálculo
        }

        buttondividir.setOnClickListener { // Quando o botão "/" é clicado
            calculo.text = "${calculo.text}/" // Adiciona "/" ao cálculo
        }

        buttonigual.setOnClickListener { // Quando o botão "=" é clicado
            val resultadoCalculo = Expression(calculo.text.toString()).calculate() // Avalia a expressão matemática

            if (resultadoCalculo.isNaN()) { // Verifica se o resultado é válido
                resultado.text = "" // Se não for válido, limpa o campo de resultado
            } else
                resultado.text = resultadoCalculo.toString() // Se válido, exibe o resultado
        }

        buttonlimpar.setOnClickListener { // Quando o botão de limpar (um dígito) é clicado
            calculo.text = calculo.text.dropLast(1) // Remove o último caractere do cálculo
        }

        // Configurações de cliques para os botões de parênteses
        buttonparentese_abrindo.setOnClickListener { // Quando o botão "(" é clicado
            calculo.text = "${calculo.text}(" // Adiciona "(" ao cálculo
        }

        buttonparentese_fechando.setOnClickListener { // Quando o botão ")" é clicado
            calculo.text = "${calculo.text})" // Adiciona ")" ao cálculo
        }

        buttonCE.setOnClickListener { // Quando o botão "CE" é clicado
            calculo.text = "" // Limpa todo o cálculo
            resultado.text = "" // Limpa o resultado
        }

    }
}
