package com.xuexiang.xui.widget.textview;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes3.dex */
public class ReadMoreTextView extends AppCompatTextView {

    /* renamed from: b */
    public CharSequence f5510b;

    /* renamed from: c */
    public TextView.BufferType f5511c;

    /* renamed from: d */
    public boolean f5512d;

    /* renamed from: e */
    public CharSequence f5513e;

    /* renamed from: f */
    public CharSequence f5514f;

    /* renamed from: g */
    public CharSequence f5515g;

    /* renamed from: h */
    public int f5516h;

    /* renamed from: i */
    public boolean f5517i;

    /* renamed from: j */
    public int f5518j;

    /* renamed from: k */
    public int f5519k;

    /* renamed from: l */
    public int f5520l;

    /* renamed from: m */
    public int f5521m;

    private CharSequence getDisplayableText() {
        return m4973c(this.f5510b);
    }

    /* renamed from: b */
    public final CharSequence m4972b(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        spannableStringBuilder.setSpan(null, spannableStringBuilder.length() - charSequence.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    public final CharSequence m4973c(CharSequence charSequence) {
        return (this.f5518j != 1 || charSequence == null || charSequence.length() <= this.f5519k) ? (this.f5518j != 0 || charSequence == null || this.f5521m <= 0) ? charSequence : this.f5512d ? getLayout().getLineCount() > this.f5520l ? m4975e() : charSequence : m4976f() : this.f5512d ? m4975e() : m4976f();
    }

    /* renamed from: d */
    public final void m4974d() {
        super.setText(getDisplayableText(), this.f5511c);
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(0);
    }

    /* renamed from: e */
    public final CharSequence m4975e() {
        int i6;
        int length = this.f5510b.length();
        int i7 = this.f5518j;
        if (i7 == 0) {
            length = this.f5521m - ((this.f5515g.length() + this.f5513e.length()) + 1);
            if (length < 0) {
                i6 = this.f5519k;
                length = i6 + 1;
            }
        } else if (i7 == 1) {
            i6 = this.f5519k;
            length = i6 + 1;
        }
        return m4972b(new SpannableStringBuilder(this.f5510b, 0, length).append(this.f5515g).append(this.f5513e), this.f5513e);
    }

    /* renamed from: f */
    public final CharSequence m4976f() {
        if (!this.f5517i) {
            return this.f5510b;
        }
        CharSequence charSequence = this.f5510b;
        return m4972b(new SpannableStringBuilder(charSequence, 0, charSequence.length()).append(this.f5514f), this.f5514f);
    }

    public void setColorClickableText(int i6) {
        this.f5516h = i6;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f5510b = charSequence;
        this.f5511c = bufferType;
        m4974d();
    }

    public void setTrimCollapsedText(CharSequence charSequence) {
        this.f5513e = charSequence;
    }

    public void setTrimExpandedText(CharSequence charSequence) {
        this.f5514f = charSequence;
    }

    public void setTrimLength(int i6) {
        this.f5519k = i6;
        m4974d();
    }

    public void setTrimLines(int i6) {
        this.f5520l = i6;
    }

    public void setTrimMode(int i6) {
        this.f5518j = i6;
    }
}
