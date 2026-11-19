package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5830k;
import p160s6.InterfaceC6560a;

/* renamed from: kotlin.text.i */
/* loaded from: classes4.dex */
public final class C5848i implements Iterator, InterfaceC6560a {

    /* renamed from: a */
    public final CharSequence f9256a;

    /* renamed from: b */
    public int f9257b;

    /* renamed from: c */
    public int f9258c;

    /* renamed from: d */
    public int f9259d;

    /* renamed from: e */
    public int f9260e;

    public C5848i(CharSequence string) {
        AbstractC5830k.m5330g(string, "string");
        this.f9256a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i8;
        int i9 = this.f9257b;
        if (i9 != 0) {
            return i9 == 1;
        }
        if (this.f9260e < 0) {
            this.f9257b = 2;
            return false;
        }
        CharSequence charSequence = this.f9256a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i10 = this.f9258c; i10 < length2; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i8 = i10 + 1) < charSequence.length() && charSequence.charAt(i8) == '\n') ? 2 : 1;
                length = i10;
                this.f9257b = 1;
                this.f9260e = i;
                this.f9259d = length;
                return true;
            }
        }
        i = -1;
        this.f9257b = 1;
        this.f9260e = i;
        this.f9259d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f9257b = 0;
        int i = this.f9259d;
        int i8 = this.f9258c;
        this.f9258c = this.f9260e + i;
        return this.f9256a.subSequence(i8, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
