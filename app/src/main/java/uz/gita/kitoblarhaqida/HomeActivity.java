package uz.gita.kitoblarhaqida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import uz.gita.kitoblarhaqida.bookdata.BookData;

public class HomeActivity extends AppCompatActivity {
    BookData bookSiyosatnoma;
    BookData bookDiqqat;
    BookData bookZukkolarVaLandovurlar;
    BookData bookOqshomXabarlari;
    BookData bookOyinlarNazariyasi;
    BookData bookYuqumlilik;
    BookData bookTanaHaqida;
    BookData bookAtomOdatlar;
    BookData bookShavqatsizAsr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // about app
        findViewById(R.id.aboutApp).setOnClickListener(view -> {
            AboutActivity.start(this);
        });


        // kitoblar buttons

        findViewById(R.id.book_siyosatnoma).setOnClickListener(v -> {
            Intent intent = new Intent(this, InsideActivity.class);
            intent.putExtra("bookData", bookSiyosatnoma);
            startActivity(intent);
        });

        findViewById(R.id.book_diqqat).setOnClickListener(v -> {
            Intent intent = new Intent(this, InsideActivity.class);
            intent.putExtra("bookData", bookDiqqat);
            startActivity(intent);
        });

        findViewById(R.id.book_oqshom_xabarlari).setOnClickListener(v -> {
            Intent intent = new Intent(this, InsideActivity.class);
            intent.putExtra("bookData", bookOqshomXabarlari);
            startActivity(intent);
        });

        findViewById(R.id.book_zukkolar_va_landovurlar).setOnClickListener(v -> {
            Intent intent = new Intent(this, InsideActivity.class);
            intent.putExtra("bookData", bookZukkolarVaLandovurlar);
            startActivity(intent);
        });

        findViewById(R.id.book_oyinlar_nazariyasi).setOnClickListener(v -> {
            Intent intent = new Intent(this, InsideActivity.class);
            intent.putExtra("bookData", bookOyinlarNazariyasi);
            startActivity(intent);
        });

        findViewById(R.id.book_zukkolar_va_landovurlar).setOnClickListener(v -> {
            Intent intent = new Intent(this, InsideActivity.class);
            intent.putExtra("bookData", bookZukkolarVaLandovurlar);
            startActivity(intent);
        });

        findViewById(R.id.book_yuqumlilik).setOnClickListener(v -> {
            Intent intent = new Intent(this, InsideActivity.class);
            intent.putExtra("bookData", bookYuqumlilik);
            startActivity(intent);
        });

        findViewById(R.id.book_har_bir_tana).setOnClickListener(v -> {
            Intent intent = new Intent(this, InsideActivity.class);
            intent.putExtra("bookData", bookTanaHaqida);
            startActivity(intent);
        });

        findViewById(R.id.book_atom_odatlar).setOnClickListener(v -> {
            Intent intent = new Intent(this, InsideActivity.class);
            intent.putExtra("bookData", bookAtomOdatlar);
            startActivity(intent);
        });

        findViewById(R.id.book_shafqatsiz_asr).setOnClickListener(v -> {
            Intent intent = new Intent(this, InsideActivity.class);
            intent.putExtra("bookData", bookShavqatsizAsr);
            startActivity(intent);
        });

        bookSiyosatnoma = new BookData(R.drawable.book_siyosatnoma, R.drawable.author_nizomulmulk, R.string.book_name_siyosatnoma, R.string.book_author_name_siyosatnoma, R.string.book_siyosatnoma_author_info, R.string.book_siyosatnoma_description);
        bookDiqqat = new BookData(R.drawable.book_diqqat, R.drawable.author_call_newport, R.string.book_name_diqqat, R.string.book_author_name_diqqat, R.string.book_diqqat_author_info, R.string.book_diqqat_description);
        bookOqshomXabarlari = new BookData(R.drawable.book_oqshom_xabarlari, R.drawable.author_arthur_hailey, R.string.book_name_oqshom_xabarlari, R.string.book_author_name_oqshom_xabarlari, R.string.book_oqshom_xabarlari_author_info, R.string.book_oqshom_xabarlari_description);
        bookZukkolarVaLandovurlar = new BookData(R.drawable.zukko_va_landovur, R.drawable.author_malcolm_gladuell, R.string.book_name_zukkolar_va_landovurlar, R.string.book_author_name_zukkolar_va_landovurlar, R.string.book_zukkolar_va_landovurlar_author_info, R.string.book_zukkolar_va_landovurlart_description);
        bookOyinlarNazariyasi = new BookData(R.drawable.oyinlar_nazariyasi, R.drawable.author_avinash_diksit, R.string.book_name_oyinlar_nazariyasi, R.string.book_author_name_oyinlar_nazariyasi, R.string.book_oyinlar_nazariyasi_author_info, R.string.book_oyinlar_nazariyasi_description);
        bookYuqumlilik = new BookData(R.drawable.book_yuqumlilik, R.drawable.author_yona_berger, R.string.book_name_yuqumlilik, R.string.book_author_name_yuqumlilik, R.string.book_yuqumlilik_author_info, R.string.book_yuqumlilik_description);
        bookTanaHaqida = new BookData(R.drawable.body_saying, R.drawable.author_joe_navarro, R.string.book_name_tana_tili, R.string.book_author_name_tana_tili, R.string.book_tana_tili_author_info, R.string.book_tana_tili_description);
        bookAtomOdatlar = new BookData(R.drawable.atom_odatlar, R.drawable.author_james_clear, R.string.book_name_atom_odatlar, R.string.book_author_name_atom_odatlar, R.string.book_atom_odatlar_author_info, R.string.book_atom_odatlar_description);
        bookShavqatsizAsr = new BookData(R.drawable.shafqatsiz_asr, R.drawable.author_isay_kalashnikov, R.string.book_name_shavqatsiz_asr, R.string.book_author_name_shavqatsiz_asr, R.string.book_shavqatsiz_asr_author_info, R.string.book_shavqatsiz_asr_description);


        findViewById(R.id.authorNizomulmulk).setOnClickListener(view -> {
            Intent intent = new Intent(this, InsideAuthorsActivity.class);
            intent.putExtra("bookData", bookSiyosatnoma);
            startActivity(intent);
        });

        findViewById(R.id.authorCallNewport).setOnClickListener(view -> {
            Intent intent = new Intent(this, InsideAuthorsActivity.class);
            intent.putExtra("bookData", bookDiqqat);
            startActivity(intent);
        });

        findViewById(R.id.authorArturHeyli).setOnClickListener(view -> {
            Intent intent = new Intent(this, InsideAuthorsActivity.class);
            intent.putExtra("bookData", bookOqshomXabarlari);
            startActivity(intent);
        });

        findViewById(R.id.authorMalkolmGladuell).setOnClickListener(view -> {
            Intent intent = new Intent(this, InsideAuthorsActivity.class);
            intent.putExtra("bookData", bookZukkolarVaLandovurlar);
            startActivity(intent);
        });

        findViewById(R.id.authorAvinashDiksit).setOnClickListener(view -> {
            Intent intent = new Intent(this, InsideAuthorsActivity.class);
            intent.putExtra("bookData", bookOyinlarNazariyasi);
            startActivity(intent);
        });

        findViewById(R.id.authorYonaBerger).setOnClickListener(view -> {
            Intent intent = new Intent(this, InsideAuthorsActivity.class);
            intent.putExtra("bookData", bookYuqumlilik);
            startActivity(intent);
        });

        findViewById(R.id.authorJoeNavarro).setOnClickListener(view -> {
            Intent intent = new Intent(this, InsideAuthorsActivity.class);
            intent.putExtra("bookData", bookTanaHaqida);
            startActivity(intent);
        });


        findViewById(R.id.authorJamesClear).setOnClickListener(view -> {
            Intent intent = new Intent(this, InsideAuthorsActivity.class);
            intent.putExtra("bookData", bookAtomOdatlar);
            startActivity(intent);
        });

        findViewById(R.id.authorIsayKalashnikov).setOnClickListener(view -> {
            Intent intent = new Intent(this, InsideAuthorsActivity.class);
            intent.putExtra("bookData", bookShavqatsizAsr);
            startActivity(intent);
        });


    }
}