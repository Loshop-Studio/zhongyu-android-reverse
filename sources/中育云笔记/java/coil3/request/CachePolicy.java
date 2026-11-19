package coil3.request;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class CachePolicy {

    /* renamed from: e */
    public static final CachePolicy f3884e = new CachePolicy("ENABLED", 0, true, true);

    /* renamed from: f */
    public static final CachePolicy f3885f = new CachePolicy("READ_ONLY", 1, true, false);

    /* renamed from: g */
    public static final CachePolicy f3886g = new CachePolicy("WRITE_ONLY", 2, false, true);

    /* renamed from: h */
    public static final CachePolicy f3887h = new CachePolicy("DISABLED", 3, false, false);

    /* renamed from: i */
    public static final /* synthetic */ CachePolicy[] f3888i;

    /* renamed from: j */
    public static final /* synthetic */ InterfaceC11943a f3889j;

    /* renamed from: c */
    public final boolean f3890c;

    /* renamed from: d */
    public final boolean f3891d;

    static {
        CachePolicy[] cachePolicyArrM3266a = m3266a();
        f3888i = cachePolicyArrM3266a;
        f3889j = AbstractC9953a.m20230a(cachePolicyArrM3266a);
    }

    public CachePolicy(String str, int i10, boolean z10, boolean z11) {
        this.f3890c = z10;
        this.f3891d = z11;
    }

    /* renamed from: a */
    public static final /* synthetic */ CachePolicy[] m3266a() {
        return new CachePolicy[]{f3884e, f3885f, f3886g, f3887h};
    }

    public static CachePolicy valueOf(String str) {
        return (CachePolicy) Enum.valueOf(CachePolicy.class, str);
    }

    public static CachePolicy[] values() {
        return (CachePolicy[]) f3888i.clone();
    }

    /* renamed from: c */
    public final boolean m3267c() {
        return this.f3890c;
    }

    /* renamed from: d */
    public final boolean m3268d() {
        return this.f3891d;
    }
}
