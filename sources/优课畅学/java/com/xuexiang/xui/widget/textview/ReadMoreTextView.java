package com.xuexiang.xui.widget.textview;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public class ReadMoreTextView extends AppCompatTextView {

    /* renamed from: b */
    public CharSequence f8267b;

    /* renamed from: c */
    public TextView.BufferType f8268c;

    /* renamed from: d */
    public boolean f8269d;

    /* renamed from: e */
    public CharSequence f8270e;

    /* renamed from: f */
    public CharSequence f8271f;

    /* renamed from: g */
    public CharSequence f8272g;

    /* renamed from: h */
    public int f8273h;

    /* renamed from: i */
    public boolean f8274i;

    /* renamed from: j */
    public int f8275j;

    /* renamed from: k */
    public int f8276k;

    /* renamed from: l */
    public int f8277l;

    /* renamed from: m */
    public int f8278m;

    private CharSequence getDisplayableText() {
        return m7207c(this.f8267b);
    }

    /* renamed from: b */
    public final CharSequence m7206b(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        spannableStringBuilder.setSpan(null, spannableStringBuilder.length() - charSequence.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    public final CharSequence m7207c(CharSequence charSequence) {
        return (this.f8275j != 1 || charSequence == null || charSequence.length() <= this.f8276k) ? (this.f8275j != 0 || charSequence == null || this.f8278m <= 0) ? charSequence : this.f8269d ? getLayout().getLineCount() > this.f8277l ? m7209e() : charSequence : m7210f() : this.f8269d ? m7209e() : m7210f();
    }

    /* renamed from: d */
    public final void m7208d() {
        super.setText(getDisplayableText(), this.f8268c);
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(0);
    }

    /* renamed from: e */
    public final CharSequence m7209e() {
        int i10;
        int length = this.f8267b.length();
        int i11 = this.f8275j;
        if (i11 == 0) {
            length = this.f8278m - ((this.f8272g.length() + this.f8270e.length()) + 1);
            if (length < 0) {
                i10 = this.f8276k;
                length = i10 + 1;
            }
        } else if (i11 == 1) {
            i10 = this.f8276k;
            length = i10 + 1;
        }
        return m7206b(new SpannableStringBuilder(this.f8267b, 0, length).append(this.f8272g).append(this.f8270e), this.f8270e);
    }

    /* renamed from: f */
    public final CharSequence m7210f() {
        if (!this.f8274i) {
            return this.f8267b;
        }
        CharSequence charSequence = this.f8267b;
        return m7206b(new SpannableStringBuilder(charSequence, 0, charSequence.length()).append(this.f8271f), this.f8271f);
    }

    public void setColorClickableText(int i10) {
        this.f8273h = i10;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f8267b = charSequence;
        this.f8268c = bufferType;
        m7208d();
    }

    public void setTrimCollapsedText(CharSequence charSequence) {
        this.f8270e = charSequence;
    }

    public void setTrimExpandedText(CharSequence charSequence) {
        this.f8271f = charSequence;
    }

    public void setTrimLength(int i10) {
        this.f8276k = i10;
        m7208d();
    }

    public void setTrimLines(int i10) {
        this.f8277l = i10;
    }

    public void setTrimMode(int i10) {
        this.f8275j = i10;
    }
}
