package com.example.admin.cutspannable;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t;
    Button b;
    boolean reverse=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=findViewById(R.id.spanText);
        b=findViewById(R.id.button1);

         final SpannableStringBuilder s=new SpannableStringBuilder("Bee-keepers and those interested in taking up apiculture can learn more as the city's first Honey and Organic Mela will be conducted at the Kadri Park here for two days from Saturday.\n" +
                 "Organised by the Department of Horticulture, Dakshina Kannada, the mela would have 25 stalls exclusively devoted to display and sale of honey and honey products, according to P.I. Sreevidya, Chief Executive Officer, Dakshina Kannada Zilla Panchayat.\n" +
                 "Addressing media heree on Thursday, she said that the mela would display varieties of honey produced depending on seasons. Honey's quality differed based on the flowering seasons. The mela would also display by-products of honey.\n" +
                 "She said that as honeeeey was being used for medicinal purpose, its medicinal values would be highlighted at the mela. The exhibition would be open from 10 a.m. to 8 p.m. The entry will be free. The mela would also have a seminar-cum-training session on Sunday at 10 a.m.\n" +
                 "Yogesh H.R., Deputy Director, Department of Horticulture, Dakshina Kannada, said that students of SDM College of Naturopathy and Yogic Sciences, Ujire, would prepare different beverages from honey at the mela. There would be sale of different ayurvedic medicinal products made from honey.\n"
       );
        s.setSpan(new BackgroundColorSpan(Color.GREEN),0,s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        t.setText(s);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                changeSpan(s);
                reverse=!reverse;
            }
        });


    }

    private void changeSpan(SpannableStringBuilder s) {
        if(reverse){
            t.setText(s.subSequence(0,s.length()));
        }else{
           /* SpannableString s1=new SpannableString("\n-----------\n");
           t.setText(TextUtils.concat( TextUtils.concat(s.subSequence(0,50), s1),s.subSequence(50,s.length())));
*/
           // t.setText(s.subSequence(0,50)+s1+s.subSequence(50,s.length()));
           // t.setText(s.subSequence(0,50));
         ///   SpannableStringBuilder s1=new SpannableStringBuilder(TextUtils.concat(s.subSequence(0,50),s.subSequence(50,s.length())));
            s.insert(50,new SpannableStringBuilder("######"));
            t.setText(s);
        }

    }

}
