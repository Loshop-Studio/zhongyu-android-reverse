package kotlin.uuid;

import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: kotlin.uuid.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9143a {
    /* renamed from: a */
    public static final void m16201a(long j10, byte[] dst, int i10, int i11, int i12) {
        AbstractC9133u.m16133g(dst, "dst");
        AbstractC9144b.m16207g(j10, dst, i10, i11, i12);
    }

    /* renamed from: b */
    public static final Object m16202b(Uuid uuid) {
        AbstractC9133u.m16133g(uuid, "uuid");
        return new UuidSerialized(uuid.m16196d(), uuid.m16195c());
    }

    /* renamed from: c */
    public static final Uuid m16203c(String hexString) {
        AbstractC9133u.m16133g(hexString, "hexString");
        return AbstractC9144b.m16209i(hexString);
    }

    /* renamed from: d */
    public static final Uuid m16204d(String hexDashString) {
        AbstractC9133u.m16133g(hexDashString, "hexDashString");
        return AbstractC9144b.m16210j(hexDashString);
    }
}
