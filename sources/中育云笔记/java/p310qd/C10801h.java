package p310qd;

import id.InterfaceC9624a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: qd.h */
/* loaded from: classes6.dex */
public final class C10801h implements Iterator, InterfaceC9624a {

    /* renamed from: h */
    public static final a f26068h = new a(null);

    /* renamed from: c */
    public final CharSequence f26069c;

    /* renamed from: d */
    public int f26070d;

    /* renamed from: e */
    public int f26071e;

    /* renamed from: f */
    public int f26072f;

    /* renamed from: g */
    public int f26073g;

    /* renamed from: qd.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C10801h(CharSequence string) {
        AbstractC9979u.m20294g(string, "string");
        this.f26069c = string;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26070d = 0;
        int i10 = this.f26072f;
        int i11 = this.f26071e;
        this.f26071e = this.f26073g + i10;
        return this.f26069c.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f26070d;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f26073g < 0) {
            this.f26070d = 2;
            return false;
        }
        int length = this.f26069c.length();
        int length2 = this.f26069c.length();
        for (int i13 = this.f26071e; i13 < length2; i13++) {
            char cCharAt = this.f26069c.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f26069c.length() && this.f26069c.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f26070d = 1;
                this.f26073g = i10;
                this.f26072f = length;
                return true;
            }
        }
        i10 = -1;
        this.f26070d = 1;
        this.f26073g = i10;
        this.f26072f = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
