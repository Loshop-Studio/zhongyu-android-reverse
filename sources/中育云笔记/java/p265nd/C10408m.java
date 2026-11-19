package p265nd;

import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: nd.m */
/* loaded from: classes6.dex */
public final class C10408m extends AbstractC10406k implements InterfaceC10402g {

    /* renamed from: g */
    public static final a f24770g = new a(null);

    /* renamed from: h */
    public static final C10408m f24771h = new C10408m(1, 0);

    /* renamed from: nd.m$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C10408m(long j10, long j11) {
        super(j10, j11, 1L);
    }

    @Override // p265nd.InterfaceC10402g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Long getEndInclusive() {
        return Long.valueOf(m21744c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10408m)) {
            return false;
        }
        if (isEmpty() && ((C10408m) obj).isEmpty()) {
            return true;
        }
        C10408m c10408m = (C10408m) obj;
        return m21743b() == c10408m.m21743b() && m21744c() == c10408m.m21744c();
    }

    @Override // p265nd.InterfaceC10402g
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Long getStart() {
        return Long.valueOf(m21743b());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (m21743b() ^ (m21743b() >>> 32))) + (m21744c() ^ (m21744c() >>> 32)));
    }

    @Override // p265nd.InterfaceC10402g
    public boolean isEmpty() {
        return m21743b() > m21744c();
    }

    public String toString() {
        return m21743b() + ".." + m21744c();
    }
}
