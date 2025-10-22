package mx.edu.tesoem.isc.maps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro)

        val etNombre: EditText = findViewById(R.id.etNombre)
        val etCorreo: EditText = findViewById(R.id.etCorreo)
        val etMatricula: EditText = findViewById(R.id.etMatricula)
        val etCarrera: EditText = findViewById(R.id.etCarrera)
        val etPassword: EditText = findViewById(R.id.etPassword)
        val btnRegistrar: Button = findViewById(R.id.btnRegistrar)

        btnRegistrar.setOnClickListener {
            val intent = Intent(this, WelcomeActivity::class.java)
            intent.putExtra("nombre", etNombre.text.toString())
            intent.putExtra("correo", etCorreo.text.toString())
            intent.putExtra("matricula", etMatricula.text.toString())
            intent.putExtra("carrera", etCarrera.text.toString())
            intent.putExtra("contrasena", etPassword.text.toString())
            startActivity(intent)
        }
    }
}

