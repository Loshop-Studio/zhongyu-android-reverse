package p265nd;

import id.InterfaceC9624a;
import kotlin.jvm.internal.AbstractC9972n;
import p325rc.AbstractC10963o0;
import p439zc.AbstractC12039c;

/* renamed from: nd.k */
/* loaded from: classes6.dex */
public abstract class AbstractC10406k implements Iterable, InterfaceC9624a {

    /* renamed from: f */
    public static final a f24762f = new a(null);

    /* renamed from: c */
    public final long f24763c;

    /* renamed from: d */
    public final long f24764d;

    /* renamed from: e */
    public final long f24765e;

    /* renamed from: nd.k$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public AbstractC10406k(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f24763c = j10;
        this.f24764d = AbstractC12039c.m26666d(j10, j11, j12);
        this.f24765e = j12;
    }

    /* renamed from: b */
    public final long m21743b() {
        return this.f24763c;
    }

    /* renamed from: c */
    public final long m21744c() {
        return this.f24764d;
    }

    @Override // java.lang.Iterable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC10963o0 iterator() {
        return new C10407l(this.f24763c, this.f24764d, this.f24765e);
    }
}
