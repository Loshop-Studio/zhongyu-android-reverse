package p124h8;

import kotlin.time.DurationUnit;
import p124h8.C8745h;

/* renamed from: h8.g */
/* loaded from: classes5.dex */
public final class C8744g {

    /* renamed from: a */
    public static final C8744g f16376a = new C8744g();

    /* renamed from: b */
    public static final long f16377b = System.nanoTime();

    /* renamed from: a */
    public final long m14398a(long j10, long j11) {
        return AbstractC8743f.m14397c(j10, j11, DurationUnit.f17527b);
    }

    /* renamed from: b */
    public long m14399b() {
        return C8745h.a.m14402a(m14400c());
    }

    /* renamed from: c */
    public final long m14400c() {
        return System.nanoTime() - f16377b;
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
