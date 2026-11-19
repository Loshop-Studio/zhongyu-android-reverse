package p068g7;

import java.util.concurrent.TimeUnit;
import p054e7.AbstractC5469a;
import p054e7.AbstractC5487s;

/* renamed from: g7.k */
/* loaded from: classes4.dex */
public abstract class AbstractC5615k {

    /* renamed from: a */
    public static final String f8738a;

    /* renamed from: b */
    public static final long f8739b;

    /* renamed from: c */
    public static final int f8740c;

    /* renamed from: d */
    public static final int f8741d;

    /* renamed from: e */
    public static final long f8742e;

    /* renamed from: f */
    public static final C5611g f8743f;

    static {
        String property;
        int i = AbstractC5487s.f8482a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f8738a = property;
        f8739b = AbstractC5469a.m4835k(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i8 = AbstractC5487s.f8482a;
        if (i8 < 2) {
            i8 = 2;
        }
        f8740c = AbstractC5469a.m4836l(i8, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f8741d = AbstractC5469a.m4836l(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f8742e = TimeUnit.SECONDS.toNanos(AbstractC5469a.m4835k(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f8743f = C5611g.f8733a;
    }
}
