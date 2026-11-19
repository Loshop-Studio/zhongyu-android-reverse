package com.xuexiang.xui.widget.textview.supertextview;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.HasTypeface;

/* loaded from: classes3.dex */
public class BaseTextView extends LinearLayout implements HasTypeface {

    /* renamed from: a */
    public Context f5062a;

    /* renamed from: b */
    public TextView f5063b;

    /* renamed from: c */
    public TextView f5064c;

    /* renamed from: d */
    public TextView f5065d;

    /* renamed from: e */
    public LinearLayout.LayoutParams f5066e;

    /* renamed from: f */
    public LinearLayout.LayoutParams f5067f;

    /* renamed from: g */
    public LinearLayout.LayoutParams f5068g;

    public BaseTextView(Context context) {
        super(context);
        m3618a(context);
    }

    /* renamed from: a */
    public final void m3618a(Context context) {
        setOrientation(1);
        this.f5062a = context;
        LinearLayout.LayoutParams layoutParams = this.f5066e;
        if (layoutParams == null) {
            if (layoutParams == null) {
                layoutParams = new LinearLayout.LayoutParams(-2, -2);
            }
            this.f5066e = layoutParams;
        }
        TextView textView = this.f5063b;
        if (textView == null) {
            this.f5063b = m3619b(this.f5066e, textView);
        }
        LinearLayout.LayoutParams layoutParams2 = this.f5067f;
        if (layoutParams2 == null) {
            if (layoutParams2 == null) {
                layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            }
            this.f5067f = layoutParams2;
        }
        TextView textView2 = this.f5064c;
        if (textView2 == null) {
            this.f5064c = m3619b(this.f5067f, textView2);
        }
        LinearLayout.LayoutParams layoutParams3 = this.f5068g;
        if (layoutParams3 == null) {
            if (layoutParams3 == null) {
                layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            }
            this.f5068g = layoutParams3;
        }
        TextView textView3 = this.f5065d;
        if (textView3 == null) {
            this.f5065d = m3619b(this.f5068g, textView3);
        }
    }

    /* renamed from: b */
    public final TextView m3619b(LinearLayout.LayoutParams layoutParams, TextView textView) {
        if (textView == null) {
            textView = new TextView(this.f5062a);
            textView.setLayoutParams(layoutParams);
            textView.setVisibility(8);
        }
        textView.setGravity(17);
        addView(textView);
        return textView;
    }

    public TextView getBottomTextView() {
        return this.f5065d;
    }

    public TextView getCenterTextView() {
        return this.f5064c;
    }

    public TextView getTopTextView() {
        return this.f5063b;
    }

    public void setBottomTextString(CharSequence charSequence) {
        TextView textView = this.f5065d;
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setVisibility(0);
    }

    public void setCenterSpaceHeight(int i) {
        int i8 = i / 2;
        this.f5066e.setMargins(0, 0, 0, i8);
        this.f5067f.setMargins(0, i8, 0, i8);
        this.f5068g.setMargins(0, i8, 0, 0);
    }

    public void setCenterTextString(CharSequence charSequence) {
        TextView textView = this.f5064c;
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setVisibility(0);
    }

    public void setTopTextString(CharSequence charSequence) {
        TextView textView = this.f5063b;
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setVisibility(0);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.f5063b;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.f5064c;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
        TextView textView3 = this.f5065d;
        if (textView3 != null) {
            textView3.setTypeface(typeface);
        }
    }

    public BaseTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3618a(context);
    }

    public BaseTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3618a(context);
    }
}
