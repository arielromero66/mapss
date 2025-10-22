package mx.edu.tesoem.isc.maps
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button


class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bienvenida)

        val tvDatos: TextView = findViewById(R.id.tvDatos)

        val nombre = intent.getStringExtra("nombre")
        val correo = intent.getStringExtra("correo")
        val matricula = intent.getStringExtra("matricula")
        val carrera = intent.getStringExtra("carrera")
        val contrasena = intent.getStringExtra("contrasena")


        val mensaje = """
            ¡Bienvenido!
            
            Nombre: $nombre
            
            Matrícula: $matricula
            
            Carrera: $carrera
            
            
            
        """.trimIndent()

        tvDatos.text = mensaje


        val btnMapa: Button = findViewById(R.id.btnmaps)

        btnMapa.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }


    }

}
