package com.example.lambda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lambda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val contrasenya = "Hello1234!!"

        var numeros = contrasenya.count ({
            char: Char -> char.isDigit()
        })
        var mayusculas = contrasenya.count ({
            char: Char -> char.isUpperCase()
        })
        var minusculas = contrasenya.count ({
            char: Char -> char.isLowerCase()
        })
        var simolos = contrasenya.count ({
            char: Char -> !char.isLetterOrDigit()
        })
        var longitud = contrasenya.length

        var resultado = "La contraseña tiene $numeros numeros, $mayusculas mayusculas, $minusculas minusculas, $simolos simbolos y $longitud de longitud"
        binding.texto.text = resultado
        setContentView(binding.root)

    }
}