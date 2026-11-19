package kotlin.uuid;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: kotlin.uuid.a */
/* loaded from: classes6.dex */
public abstract class AbstractC9989a {
    /* renamed from: a */
    public static final void m20361a(long j10, byte[] dst, int i10, int i11, int i12) {
        AbstractC9979u.m20294g(dst, "dst");
        AbstractC9990b.m20367g(j10, dst, i10, i11, i12);
    }

    /* renamed from: b */
    public static final Object m20362b(Uuid uuid) {
        AbstractC9979u.m20294g(uuid, "uuid");
        return new UuidSerialized(uuid.m20356e(), uuid.m20355d());
    }

    /* renamed from: c */
    public static final Uuid m20363c(String hexString) {
        AbstractC9979u.m20294g(hexString, "hexString");
        return AbstractC9990b.m20369i(hexString);
    }

    /* renamed from: d */
    public static final Uuid m20364d(String hexDashString) {
        AbstractC9979u.m20294g(hexDashString, "hexDashString");
        return AbstractC9990b.m20370j(hexDashString);
    }
}
