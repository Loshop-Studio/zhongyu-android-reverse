package com.xuexiang.xui.widget.activity;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.widget.banner.transform.DepthTransformer;
import com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner;
import com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopViewPager;
import java.util.ArrayList;
import java.util.List;
import p018b2.C3102b;
import p018b2.C3104d;
import p188w1.C6701a;
import p204y1.AbstractC6768a;

/* loaded from: classes3.dex */
public abstract class BaseGuideActivity extends AppCompatActivity {
    /* renamed from: o */
    public abstract List m3442o();

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(R$layout.xui_activity_guide);
        List listM3442o = m3442o();
        Class clsM3443p = m3443p();
        SimpleGuideBanner simpleGuideBanner = (SimpleGuideBanner) findViewById(R$id.sgb);
        simpleGuideBanner.f4051B = simpleGuideBanner.m3452a(6.0f);
        simpleGuideBanner.f4052C = simpleGuideBanner.m3452a(6.0f);
        simpleGuideBanner.f4053D = simpleGuideBanner.m3452a(12.0f);
        simpleGuideBanner.f4054E = simpleGuideBanner.m3452a(3.5f);
        simpleGuideBanner.f4059J = AbstractC6768a.class;
        simpleGuideBanner.f4038m = DepthTransformer.class;
        simpleGuideBanner.f4041p.setPadding(simpleGuideBanner.m3452a(0.0f), simpleGuideBanner.m3452a(10.0f), simpleGuideBanner.m3452a(0.0f), simpleGuideBanner.m3452a(10.0f));
        simpleGuideBanner.f4030e = listM3442o;
        simpleGuideBanner.f4045t = true;
        if (listM3442o == null) {
            throw new IllegalStateException("Data source is empty,you must setSource() before startScroll()");
        }
        if (listM3442o.size() > 0 && simpleGuideBanner.f4031f > simpleGuideBanner.f4030e.size() - 1) {
            simpleGuideBanner.f4031f = 0;
        }
        C3102b c3102b = simpleGuideBanner.f4049x;
        simpleGuideBanner.f4029d.setAdapter(new C3104d(simpleGuideBanner));
        simpleGuideBanner.f4029d.setOffscreenPageLimit(simpleGuideBanner.f4030e.size() - 1);
        try {
            Class cls = simpleGuideBanner.f4038m;
            if (cls != null) {
                simpleGuideBanner.f4029d.setPageTransformer(true, (ViewPager.PageTransformer) cls.newInstance());
                if (simpleGuideBanner.f4029d instanceof LoopViewPager) {
                    simpleGuideBanner.f4037l = 550;
                    simpleGuideBanner.m3457g();
                }
            } else if (simpleGuideBanner.f4029d instanceof LoopViewPager) {
                simpleGuideBanner.f4037l = 450;
                simpleGuideBanner.m3457g();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (c3102b != null) {
            simpleGuideBanner.f4029d.removeOnPageChangeListener(c3102b);
        }
        simpleGuideBanner.f4029d.addOnPageChangeListener(c3102b);
        ArrayList arrayList = simpleGuideBanner.f4061z;
        if (simpleGuideBanner.f4050A == 1) {
            int i = simpleGuideBanner.f4058I;
            float f = simpleGuideBanner.f4054E;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(f);
            gradientDrawable.setColor(i);
            simpleGuideBanner.f4056G = gradientDrawable;
            int i8 = simpleGuideBanner.f4057H;
            float f7 = simpleGuideBanner.f4054E;
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(f7);
            gradientDrawable2.setColor(i8);
            simpleGuideBanner.f4055F = gradientDrawable2;
        }
        int size = simpleGuideBanner.f4030e.size();
        arrayList.clear();
        simpleGuideBanner.f4060K.removeAllViews();
        int i9 = 0;
        while (i9 < size) {
            ImageView imageView = new ImageView(simpleGuideBanner.f4027b);
            imageView.setImageDrawable(i9 == simpleGuideBanner.f4031f ? simpleGuideBanner.f4055F : simpleGuideBanner.f4056G);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(simpleGuideBanner.f4051B, simpleGuideBanner.f4052C);
            layoutParams.setMarginStart(i9 == 0 ? 0 : simpleGuideBanner.f4053D);
            simpleGuideBanner.f4060K.addView(imageView, layoutParams);
            arrayList.add(imageView);
            i9++;
        }
        simpleGuideBanner.setCurrentIndicator(simpleGuideBanner.f4031f);
        LinearLayout linearLayout = simpleGuideBanner.f4060K;
        if (linearLayout != null) {
            simpleGuideBanner.f4043r.removeAllViews();
            simpleGuideBanner.f4043r.addView(linearLayout);
        }
        simpleGuideBanner.m3453b();
        simpleGuideBanner.setOnJumpClickListener(new C6701a(this, clsM3443p));
    }

    /* renamed from: p */
    public abstract Class m3443p();
}
