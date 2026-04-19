package com.siupn.app.homepage

class MainActivity : androidx.appcompat.app.AppCompatActivity() {

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        _root_ide_package_.androidx.appcompat.app.AppCompatActivity.setContentView(
            _root_ide_package_.com.siupn.app.R.layout.activity_main
        )

        val menuLayout =
            _root_ide_package_.androidx.appcompat.app.AppCompatActivity.findViewById<android.view.View>(
                _root_ide_package_.com.siupn.app.R.id.menu
            )

        val menuKantin = menuLayout.findViewById<android.widget.LinearLayout>(_root_ide_package_.com.siupn.app.R.id.menu2)

        menuKantin.setOnClickListener {
            val intent =
                _root_ide_package_.android.content.Intent(this, MenuListActivity::class.java)
            startActivity(intent)
        }
    }
}