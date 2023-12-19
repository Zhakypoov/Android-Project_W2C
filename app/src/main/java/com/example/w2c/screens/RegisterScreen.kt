import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.w2c.R
import com.example.w2c.data.AppDatabase
import com.example.w2c.data.User
import com.example.w2c.databinding.RegisterPageBinding

class RegisterScreen : AppCompatActivity() {
    private lateinit var binding: RegisterPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {



        binding = RegisterPageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val db = AppDatabase.getDatabase(this)

        binding.nextButton.setOnClickListener {
            val item = User(
                1,
                binding.cityEntered.text.toString(),
                binding.numberPhone.text.toString(),
                binding.passwordText.text.toString(),
                binding.passwordAgainText.text.toString()

            )

            Thread {
                db.usersDao().insertUser(item)


            }
                .start()

            super.onCreate(savedInstanceState)
        }
    }
}
