package uz.gita.kitoblarhaqida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import uz.gita.kitoblarhaqida.bookdata.BookData;

public class InsideAuthorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_authors);

//        findViewById(R.id.aboutApp).setOnClickListener(view -> {
//            AboutActivity.start(this);
//        });

        TextView bookName = findViewById(R.id.bookName);
        TextView bookAuthorName = findViewById(R.id.bookAuthorName);
        TextView bookDescription = findViewById(R.id.bookDescription);
        ImageView bookImage = findViewById(R.id.bookImage);

        Intent intent = getIntent();
        BookData data = (BookData) intent.getSerializableExtra("bookData");

        bookName.setText(data.getBookAuthorName());
        bookAuthorName.setText(data.getBookName());
        bookDescription.setText(data.getBookAuthorInfo());
        bookImage.setImageResource(data.getAuthorImage());

        findViewById(R.id.btnBack).setOnClickListener(v -> onBackPressed());
    }
}