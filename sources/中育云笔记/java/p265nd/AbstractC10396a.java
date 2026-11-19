package p265nd;

import id.InterfaceC9624a;
import kotlin.jvm.internal.AbstractC9972n;
import p325rc.AbstractC10974u;
import p439zc.AbstractC12039c;

/* renamed from: nd.a */
/* loaded from: classes6.dex */
public abstract class AbstractC10396a implements Iterable, InterfaceC9624a {

    /* renamed from: f */
    public static final a f24740f = new a(null);

    /* renamed from: c */
    public final char f24741c;

    /* renamed from: d */
    public final char f24742d;

    /* renamed from: e */
    public final int f24743e;

    /* renamed from: nd.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public AbstractC10396a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f24741c = c10;
        this.f24742d = (char) AbstractC12039c.m26665c(c10, c11, i10);
        this.f24743e = i10;
    }

    /* renamed from: b */
    public final char m21720b() {
        return this.f24741c;
    }

    /* renamed from: c */
    public final char m21721c() {
        return this.f24742d;
    }

    @Override // java.lang.Iterable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC10974u iterator() {
        return new C10397b(this.f24741c, this.f24742d, this.f24743e);
    }
}
