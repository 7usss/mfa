package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var Email:EditText? = null
    var pass:EditText? = null
    var login:Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectview()
        Login()
    }
    private fun connectview() {
        Email = findViewById(R.id.email)
        pass = findViewById(R.id.password)
        login = findViewById(R.id.buttom)
    }
    private fun Login() {
        var array : ArrayList<User> = ArrayList()
        array.add(User("7uss@gmail.com","23498333m"))
        array.add(User("7uss2@gmail.com","23498333mm"))
        array.add(User("7uss3@gmail.com","23498333mmm"))
        login?.setOnClickListener {
            var email1 = Email?.text.toString()
            var passWord1 = pass?.text.toString()
            val user = User(email1,passWord1)
            for (userArry in array){
                if(userArry.EmailU == user.EmailU && userArry.passwordU == user.passwordU){
                    Toast.makeText(this," Login Welcome",Toast.LENGTH_LONG).show()
                    break
                }

                else{
                    Toast.makeText(this," Faild to login",Toast.LENGTH_LONG).show()
                    break
                }

            }
        }
    }
}
