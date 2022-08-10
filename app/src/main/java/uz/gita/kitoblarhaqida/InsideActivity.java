package uz.gita.kitoblarhaqida;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import uz.gita.kitoblarhaqida.bookdata.BookData;

public class InsideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside);

//        // About app
//        findViewById(R.id.aboutApp).setOnClickListener(view -> {
//            AboutActivity.start(this);
//        });


        TextView bookName = findViewById(R.id.bookName);
        TextView bookAuthorName = findViewById(R.id.bookAuthorName);
        TextView bookDescription = findViewById(R.id.bookDescription);
        ImageView bookImage = findViewById(R.id.bookImage);


        Intent intent = getIntent();
        BookData data = (BookData) intent.getSerializableExtra("bookData");

        bookName.setText(data.getBookName());
        bookAuthorName.setText(data.getBookAuthorName());
        bookDescription.setText(data.getBookDescription());
        bookImage.setImageResource(data.getImage());


        findViewById(R.id.btnBack).setOnClickListener(v -> onBackPressed());
    }
}