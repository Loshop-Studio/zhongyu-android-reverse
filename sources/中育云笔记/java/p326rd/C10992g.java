package p326rd;

import kotlin.time.DurationUnit;
import p326rd.C10993h;

/* renamed from: rd.g */
/* loaded from: classes6.dex */
public final class C10992g {

    /* renamed from: a */
    public static final C10992g f26498a = new C10992g();

    /* renamed from: b */
    public static final long f26499b = System.nanoTime();

    /* renamed from: a */
    public final long m24239a(long j10, long j11) {
        return AbstractC10991f.m24238c(j10, j11, DurationUnit.f23456d);
    }

    /* renamed from: b */
    public long m24240b() {
        return C10993h.a.m24243a(m24241c());
    }

    /* renamed from: c */
    public final long m24241c() {
        return System.nanoTime() - f26499b;
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
