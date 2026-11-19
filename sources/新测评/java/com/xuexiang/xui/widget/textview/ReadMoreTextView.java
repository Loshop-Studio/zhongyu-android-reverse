package com.xuexiang.xui.widget.textview;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public class ReadMoreTextView extends AppCompatTextView {

    /* renamed from: b */
    public CharSequence f6786b;

    /* renamed from: c */
    public TextView.BufferType f6787c;

    /* renamed from: d */
    public boolean f6788d;

    /* renamed from: e */
    public CharSequence f6789e;

    /* renamed from: f */
    public CharSequence f6790f;

    /* renamed from: g */
    public CharSequence f6791g;

    /* renamed from: h */
    public int f6792h;

    /* renamed from: i */
    public boolean f6793i;

    /* renamed from: j */
    public int f6794j;

    /* renamed from: k */
    public int f6795k;

    /* renamed from: l */
    public int f6796l;

    /* renamed from: m */
    public int f6797m;

    private CharSequence getDisplayableText() {
        return m5958c(this.f6786b);
    }

    /* renamed from: b */
    public final CharSequence m5957b(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        spannableStringBuilder.setSpan(null, spannableStringBuilder.length() - charSequence.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    public final CharSequence m5958c(CharSequence charSequence) {
        return (this.f6794j != 1 || charSequence == null || charSequence.length() <= this.f6795k) ? (this.f6794j != 0 || charSequence == null || this.f6797m <= 0) ? charSequence : this.f6788d ? getLayout().getLineCount() > this.f6796l ? m5960e() : charSequence : m5961f() : this.f6788d ? m5960e() : m5961f();
    }

    /* renamed from: d */
    public final void m5959d() {
        super.setText(getDisplayableText(), this.f6787c);
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(0);
    }

    /* renamed from: e */
    public final CharSequence m5960e() {
        int i10;
        int length = this.f6786b.length();
        int i11 = this.f6794j;
        if (i11 == 0) {
            length = this.f6797m - ((this.f6791g.length() + this.f6789e.length()) + 1);
            if (length < 0) {
                i10 = this.f6795k;
                length = i10 + 1;
            }
        } else if (i11 == 1) {
            i10 = this.f6795k;
            length = i10 + 1;
        }
        return m5957b(new SpannableStringBuilder(this.f6786b, 0, length).append(this.f6791g).append(this.f6789e), this.f6789e);
    }

    /* renamed from: f */
    public final CharSequence m5961f() {
        if (!this.f6793i) {
            return this.f6786b;
        }
        CharSequence charSequence = this.f6786b;
        return m5957b(new SpannableStringBuilder(charSequence, 0, charSequence.length()).append(this.f6790f), this.f6790f);
    }

    public void setColorClickableText(int i10) {
        this.f6792h = i10;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f6786b = charSequence;
        this.f6787c = bufferType;
        m5959d();
    }

    public void setTrimCollapsedText(CharSequence charSequence) {
        this.f6789e = charSequence;
    }

    public void setTrimExpandedText(CharSequence charSequence) {
        this.f6790f = charSequence;
    }

    public void setTrimLength(int i10) {
        this.f6795k = i10;
        m5959d();
    }

    public void setTrimLines(int i10) {
        this.f6796l = i10;
    }

    public void setTrimMode(int i10) {
        this.f6794j = i10;
    }
}
