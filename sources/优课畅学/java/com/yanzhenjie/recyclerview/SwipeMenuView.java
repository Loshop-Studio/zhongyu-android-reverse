package com.yanzhenjie.recyclerview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p306y2.C10607f;
import p306y2.C10608g;
import p306y2.C10610i;
import p306y2.InterfaceC10603b;
import p306y2.InterfaceC10606e;

/* loaded from: classes4.dex */
public class SwipeMenuView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    public RecyclerView.ViewHolder f8498a;

    /* renamed from: b */
    public InterfaceC10606e f8499b;

    public SwipeMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final ImageView m7293a(C10610i c10610i) {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(c10610i.m19795c());
        return imageView;
    }

    /* renamed from: b */
    public void m7294b(RecyclerView.ViewHolder viewHolder, C10607f c10607f, InterfaceC10603b interfaceC10603b, int i10, InterfaceC10606e interfaceC10606e) {
        removeAllViews();
        this.f8498a = viewHolder;
        this.f8499b = interfaceC10606e;
        List listM19789b = c10607f.m19789b();
        for (int i11 = 0; i11 < listM19789b.size(); i11++) {
            C10610i c10610i = (C10610i) listM19789b.get(i11);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c10610i.m19802j(), c10610i.m19794b());
            layoutParams.weight = c10610i.m19801i();
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setId(i11);
            linearLayout.setGravity(17);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(layoutParams);
            ViewCompat.setBackground(linearLayout, c10610i.m19793a());
            linearLayout.setOnClickListener(this);
            addView(linearLayout);
            linearLayout.setTag(new C10608g(interfaceC10603b, i10, i11));
            if (c10610i.m19795c() != null) {
                linearLayout.addView(m7293a(c10610i));
            }
            if (!TextUtils.isEmpty(c10610i.m19796d())) {
                linearLayout.addView(m7295c(c10610i));
            }
        }
    }

    /* renamed from: c */
    public final TextView m7295c(C10610i c10610i) {
        TextView textView = new TextView(getContext());
        textView.setText(c10610i.m19796d());
        textView.setGravity(17);
        int iM19798f = c10610i.m19798f();
        if (iM19798f > 0) {
            textView.setTextSize(2, iM19798f);
        }
        ColorStateList colorStateListM19800h = c10610i.m19800h();
        if (colorStateListM19800h != null) {
            textView.setTextColor(colorStateListM19800h);
        }
        int iM19797e = c10610i.m19797e();
        if (iM19797e != 0) {
            TextViewCompat.setTextAppearance(textView, iM19797e);
        }
        Typeface typefaceM19799g = c10610i.m19799g();
        if (typefaceM19799g != null) {
            textView.setTypeface(typefaceM19799g);
        }
        return textView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC10606e interfaceC10606e = this.f8499b;
        if (interfaceC10606e != null) {
            interfaceC10606e.mo7304a((C10608g) view.getTag(), this.f8498a.getAdapterPosition());
        }
    }

    public SwipeMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setGravity(16);
    }
}
