package p113g8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p311y7.InterfaceC10668a;

/* renamed from: g8.h */
/* loaded from: classes5.dex */
public final class C8669h implements Iterator, InterfaceC10668a {

    /* renamed from: f */
    public static final a f16255f = new a(null);

    /* renamed from: a */
    public final CharSequence f16256a;

    /* renamed from: b */
    public int f16257b;

    /* renamed from: c */
    public int f16258c;

    /* renamed from: d */
    public int f16259d;

    /* renamed from: e */
    public int f16260e;

    /* renamed from: g8.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public C8669h(CharSequence string) {
        AbstractC9133u.m16133g(string, "string");
        this.f16256a = string;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16257b = 0;
        int i10 = this.f16259d;
        int i11 = this.f16258c;
        this.f16258c = this.f16260e + i10;
        return this.f16256a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f16257b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f16260e < 0) {
            this.f16257b = 2;
            return false;
        }
        int length = this.f16256a.length();
        int length2 = this.f16256a.length();
        for (int i13 = this.f16258c; i13 < length2; i13++) {
            char cCharAt = this.f16256a.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f16256a.length() && this.f16256a.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f16257b = 1;
                this.f16260e = i10;
                this.f16259d = length;
                return true;
            }
        }
        i10 = -1;
        this.f16257b = 1;
        this.f16260e = i10;
        this.f16259d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
