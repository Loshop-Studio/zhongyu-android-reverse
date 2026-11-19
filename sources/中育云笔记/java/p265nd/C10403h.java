package p265nd;

import id.InterfaceC9624a;
import kotlin.jvm.internal.AbstractC9972n;
import p325rc.AbstractC10961n0;
import p439zc.AbstractC12039c;

/* renamed from: nd.h */
/* loaded from: classes6.dex */
public class C10403h implements Iterable, InterfaceC9624a {

    /* renamed from: f */
    public static final a f24752f = new a(null);

    /* renamed from: c */
    public final int f24753c;

    /* renamed from: d */
    public final int f24754d;

    /* renamed from: e */
    public final int f24755e;

    /* renamed from: nd.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C10403h m21737a(int i10, int i11, int i12) {
            return new C10403h(i10, i11, i12);
        }

        public a() {
        }
    }

    public C10403h(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f24753c = i10;
        this.f24754d = AbstractC12039c.m26665c(i10, i11, i12);
        this.f24755e = i12;
    }

    /* renamed from: b */
    public final int m21733b() {
        return this.f24753c;
    }

    /* renamed from: c */
    public final int m21734c() {
        return this.f24754d;
    }

    /* renamed from: d */
    public final int m21735d() {
        return this.f24755e;
    }

    @Override // java.lang.Iterable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC10961n0 iterator() {
        return new C10404i(this.f24753c, this.f24754d, this.f24755e);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10403h)) {
            return false;
        }
        if (isEmpty() && ((C10403h) obj).isEmpty()) {
            return true;
        }
        C10403h c10403h = (C10403h) obj;
        return this.f24753c == c10403h.f24753c && this.f24754d == c10403h.f24754d && this.f24755e == c10403h.f24755e;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f24753c * 31) + this.f24754d) * 31) + this.f24755e;
    }

    public boolean isEmpty() {
        return this.f24755e > 0 ? this.f24753c > this.f24754d : this.f24753c < this.f24754d;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f24755e > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f24753c);
            sb2.append("..");
            sb2.append(this.f24754d);
            sb2.append(" step ");
            i10 = this.f24755e;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f24753c);
            sb2.append(" downTo ");
            sb2.append(this.f24754d);
            sb2.append(" step ");
            i10 = -this.f24755e;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
