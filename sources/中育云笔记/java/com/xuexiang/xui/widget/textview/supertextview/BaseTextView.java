package com.xuexiang.xui.widget.textview.supertextview;

import android.content.Context;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.HasTypeface;

/* loaded from: classes5.dex */
public class BaseTextView extends LinearLayout implements HasTypeface {

    /* renamed from: c */
    public Context f17354c;

    /* renamed from: d */
    public TextView f17355d;

    /* renamed from: e */
    public TextView f17356e;

    /* renamed from: f */
    public TextView f17357f;

    /* renamed from: g */
    public LinearLayout.LayoutParams f17358g;

    /* renamed from: h */
    public LinearLayout.LayoutParams f17359h;

    /* renamed from: i */
    public LinearLayout.LayoutParams f17360i;

    public BaseTextView(Context context) {
        super(context);
        m13587c(context);
    }

    /* renamed from: c */
    private void m13587c(Context context) {
        setOrientation(1);
        this.f17354c = context;
        m13588h();
    }

    /* renamed from: h */
    private void m13588h() {
        m13594g();
        m13592e();
        m13591d();
    }

    /* renamed from: a */
    public LinearLayout.LayoutParams m13589a(LinearLayout.LayoutParams layoutParams) {
        return layoutParams == null ? new LinearLayout.LayoutParams(-2, -2) : layoutParams;
    }

    /* renamed from: b */
    public TextView m13590b(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (textView != null) {
            return textView;
        }
        TextView textView2 = new TextView(this.f17354c);
        textView2.setLayoutParams(layoutParams);
        textView2.setVisibility(8);
        return textView2;
    }

    /* renamed from: d */
    public final void m13591d() {
        LinearLayout.LayoutParams layoutParams = this.f17360i;
        if (layoutParams == null) {
            this.f17360i = m13589a(layoutParams);
        }
        TextView textView = this.f17357f;
        if (textView == null) {
            this.f17357f = m13593f(this.f17360i, textView);
        }
    }

    /* renamed from: e */
    public final void m13592e() {
        LinearLayout.LayoutParams layoutParams = this.f17359h;
        if (layoutParams == null) {
            this.f17359h = m13589a(layoutParams);
        }
        TextView textView = this.f17356e;
        if (textView == null) {
            this.f17356e = m13593f(this.f17359h, textView);
        }
    }

    /* renamed from: f */
    public final TextView m13593f(LinearLayout.LayoutParams layoutParams, TextView textView) {
        TextView textViewM13590b = m13590b(textView, layoutParams);
        textViewM13590b.setGravity(17);
        addView(textViewM13590b);
        return textViewM13590b;
    }

    /* renamed from: g */
    public final void m13594g() {
        LinearLayout.LayoutParams layoutParams = this.f17358g;
        if (layoutParams == null) {
            this.f17358g = m13589a(layoutParams);
        }
        TextView textView = this.f17355d;
        if (textView == null) {
            this.f17355d = m13593f(this.f17358g, textView);
        }
    }

    public TextView getBottomTextView() {
        return this.f17357f;
    }

    public TextView getCenterTextView() {
        return this.f17356e;
    }

    public TextView getTopTextView() {
        return this.f17355d;
    }

    /* renamed from: i */
    public void m13595i(int i10, int i11, int i12) {
        TextView textView = this.f17355d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.f17356e.setEllipsize(truncateAt);
        this.f17357f.setEllipsize(truncateAt);
        this.f17355d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        this.f17356e.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i11)});
        this.f17357f.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i12)});
    }

    /* renamed from: j */
    public final void m13596j(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setVisibility(0);
    }

    public void setBottomTextString(CharSequence charSequence) {
        m13596j(this.f17357f, charSequence);
    }

    public void setCenterSpaceHeight(int i10) {
        int i11 = i10 / 2;
        this.f17358g.setMargins(0, 0, 0, i11);
        this.f17359h.setMargins(0, i11, 0, i11);
        this.f17360i.setMargins(0, i11, 0, 0);
    }

    public void setCenterTextString(CharSequence charSequence) {
        m13596j(this.f17356e, charSequence);
    }

    public void setTopTextString(CharSequence charSequence) {
        m13596j(this.f17355d, charSequence);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.f17355d;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.f17356e;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
        TextView textView3 = this.f17357f;
        if (textView3 != null) {
            textView3.setTypeface(typeface);
        }
    }

    public BaseTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13587c(context);
    }

    public BaseTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m13587c(context);
    }
}
