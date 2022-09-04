package com.example.islam360;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.black));

        database db = new database(this);
        db.insert("1","1","0"," شروع کرتا ہوں اللہ تعا لٰی کے نام سے جو بڑا مہربان نہایت رحم والا ہے ۔  ","بِسۡمِ اللّٰہِ الرَّحۡمٰنِ الرَّحِیۡمِ");
        db.insert("1","1","1","  سب تعریف اللہ تعالٰی کے لیے ہے جو تمام جہانوں کا پالنے والا ہے ۔    ","اَلۡحَمۡدُ لِلّٰہِ رَبِّ الۡعٰلَمِیۡنَ ۙ﴿۱﴾");
        db.insert("1","1","2","  بڑا مہربان نہایت رحم کرنے والا ۔    ","الرَّحۡمٰنِ الرَّحِیۡمِ ۙ﴿۲﴾ِ");
        db.insert("1","1","3","  بدلے کے دن  ( یعنی قیامت  )  کا مالک ہے ۔    ","مٰلِکِ یَوۡمِ الدِّیۡنِ ؕ﴿۳﴾");
        db.insert("1","1","4","  ہم صرف تیری ہی عبادت کرتے ہیں اور صرف تجھ ہی سے مدد چاہتے ہیں  ۔    ","اِیَّاکَ نَعۡبُدُ وَ اِیَّاکَ نَسۡتَعِیۡنُ ؕ﴿۴﴾ِ");
        db.insert("1","1","5","ہمیں سیدھی  ( اور سچی  ) راہ دکھا ۔    ","اِہۡدِ نَا الصِّرَاطَ الۡمُسۡتَقِیۡمَ ۙ﴿۵﴾");
        db.insert("1","1","6"," اُن لوگوں کی راہ جن پر تو نے انعام کیا ۔    ","صِرَاطَ الَّذِیۡنَ اَنۡعَمۡتَ عَلَیۡہِمۡ    ۙ ۬    ");
        db.insert("1","1","7","  ان کی نہیں جن پر غضب کیا گیا اور نہ گمراہوں کی ۔    ","غَیۡرِ الۡمَغۡضُوۡبِ عَلَیۡہِمۡ وَ لَا الضَّآلِّیۡنَ ٪﴿۷﴾                  \uE015 1");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent c = new Intent(MainActivity.this,Home.class);
                startActivity(c);
                finish();
            }
        },2000);
    }
}