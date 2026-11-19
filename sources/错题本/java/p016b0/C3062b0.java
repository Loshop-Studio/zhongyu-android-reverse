package p016b0;

import java.io.IOException;

/* renamed from: b0.b0 */
/* loaded from: classes2.dex */
public final class C3062b0 implements Appendable {

    /* renamed from: a */
    public final Appendable f1390a;

    /* renamed from: b */
    public boolean f1391b = true;

    public C3062b0(Appendable appendable) {
        this.f1390a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        boolean z8 = this.f1391b;
        Appendable appendable = this.f1390a;
        if (z8) {
            this.f1391b = false;
            appendable.append("  ");
        }
        this.f1391b = c == '\n';
        appendable.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i8) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z8 = this.f1391b;
        Appendable appendable = this.f1390a;
        boolean z9 = false;
        if (z8) {
            this.f1391b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i8 - 1) == '\n') {
            z9 = true;
        }
        this.f1391b = z9;
        appendable.append(charSequence, i, i8);
        return this;
    }
}
