package com.xuexiang.xui.utils;

import android.graphics.BlurMaskFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import p164t1.AbstractC6582a;

/* renamed from: com.xuexiang.xui.utils.i */
/* loaded from: classes3.dex */
public final class C4159i {

    /* renamed from: a */
    public CharSequence f3944a;

    /* renamed from: b */
    public int f3945b;

    /* renamed from: c */
    public int f3946c;

    /* renamed from: d */
    public int f3947d;

    /* renamed from: e */
    public int f3948e;

    /* renamed from: f */
    public int f3949f;

    /* renamed from: g */
    public int f3950g;

    /* renamed from: h */
    public int f3951h;

    /* renamed from: i */
    public int f3952i;

    /* renamed from: j */
    public int f3953j;

    /* renamed from: k */
    public int f3954k;

    /* renamed from: l */
    public float f3955l;

    /* renamed from: m */
    public float f3956m;

    /* renamed from: n */
    public float f3957n;

    /* renamed from: o */
    public float f3958o;

    /* renamed from: p */
    public Drawable f3959p;

    /* renamed from: q */
    public int f3960q;

    /* renamed from: r */
    public int f3961r;

    /* renamed from: s */
    public int f3962s;

    /* renamed from: t */
    public SpannableStringBuilder f3963t;

    /* renamed from: u */
    public int f3964u;

    static {
        System.getProperty("line.separator");
    }

    /* renamed from: a */
    public final void m3432a() {
        SpannableStringBuilder spannableStringBuilder = this.f3963t;
        int i = this.f3964u;
        if (i == 0) {
            if (this.f3944a.length() != 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(this.f3944a);
                int length2 = spannableStringBuilder.length();
                if (this.f3946c != -16777217) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f3946c), length, length2, this.f3945b);
                }
                if (this.f3947d != -16777217) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f3947d), length, length2, this.f3945b);
                }
                if (this.f3950g != -1) {
                    spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(this.f3950g, 0), length, length2, this.f3945b);
                }
                int i8 = this.f3949f;
                if (i8 != -16777217) {
                    spannableStringBuilder.setSpan(new C4156f(i8), length, length2, this.f3945b);
                }
                int i9 = this.f3951h;
                if (i9 != -16777217) {
                    spannableStringBuilder.setSpan(new C4153c(i9), length, length2, this.f3945b);
                }
                if (this.f3953j != -1 && this.f3952i != -1) {
                    AbstractC6582a.m6217a();
                    throw null;
                }
                if (this.f3954k != -1) {
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.f3954k, false), length, length2, this.f3945b);
                }
                if (this.f3955l != -1.0f) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(this.f3955l), length, length2, this.f3945b);
                }
                if (this.f3956m != -1.0f) {
                    spannableStringBuilder.setSpan(new ScaleXSpan(this.f3956m), length, length2, this.f3945b);
                }
                if (this.f3948e != -1) {
                    spannableStringBuilder.setSpan(new C4155e(this.f3948e), length, length2, this.f3945b);
                }
                if (this.f3957n != -1.0f) {
                    spannableStringBuilder.setSpan(new MaskFilterSpan(new BlurMaskFilter(this.f3957n, null)), length, length2, this.f3945b);
                }
                if (this.f3958o != -1.0f) {
                    float f = this.f3958o;
                    C4157g c4157g = new C4157g();
                    c4157g.f3942a = f;
                    spannableStringBuilder.setSpan(c4157g, length, length2, this.f3945b);
                }
            }
        } else if (i == 1) {
            int length3 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "<img>");
            int i10 = length3 + 5;
            if (this.f3959p != null) {
                Drawable drawable = this.f3959p;
                C4154d c4154d = new C4154d(this.f3961r);
                c4154d.f3938c = drawable;
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                spannableStringBuilder.setSpan(c4154d, length3, i10, this.f3945b);
            } else if (this.f3960q != -1) {
                int i11 = this.f3960q;
                C4154d c4154d2 = new C4154d(this.f3961r);
                c4154d2.f3939d = i11;
                spannableStringBuilder.setSpan(c4154d2, length3, i10, this.f3945b);
            }
        } else if (i == 2) {
            int length4 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "< >");
            spannableStringBuilder.setSpan(new C4158h(this.f3962s), length4, length4 + 3, this.f3945b);
        }
        m3433b();
    }

    /* renamed from: b */
    public final void m3433b() {
        this.f3945b = 33;
        this.f3946c = -16777217;
        this.f3947d = -16777217;
        this.f3948e = -1;
        this.f3949f = -16777217;
        this.f3950g = -1;
        this.f3951h = -16777217;
        this.f3952i = -1;
        this.f3953j = -1;
        this.f3954k = -1;
        this.f3955l = -1.0f;
        this.f3956m = -1.0f;
        this.f3957n = -1.0f;
        this.f3958o = -1.0f;
        this.f3959p = null;
        this.f3960q = -1;
        this.f3962s = -1;
    }
}
