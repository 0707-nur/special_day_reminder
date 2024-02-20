package com.example.specialdayreminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.specialdayreminder.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener{
            if (binding.phoneNumberET.getText().toString() == "user" && binding.passwordET.getText().toString() == "1234") {
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show();
            }
        }
        binding.forgotPasswordTV.setOnClickListener {
            forgotPassword()
        }
        binding.googleButton.setOnClickListener{
            signWithGoogle()
        }

        binding.signUpTV.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

    }

    private fun signWithGoogle() {
    }


    private fun forgotPassword() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Forgot Password")
        val input = EditText(this)
        input.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
        builder.setView(input)
        builder.setPositiveButton("Reset") { _, _ ->
            val emailAddress = input.text.toString()
            // Şifre sıfırlama bağlantısını göndermek için gerekli işlemleri yapın
            // Örneğin, bu e-posta adresine bir sıfırlama bağlantısı içeren bir e-posta gönderin
        }
        builder.setNegativeButton("Cancel") { dialog, _ -> dialog.cancel() }
        builder.show()

    }
}