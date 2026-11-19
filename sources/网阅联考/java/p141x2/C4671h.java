package p141x2;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import p117r2.AbstractC4498b0;
import p117r2.C4519v;

/* renamed from: x2.h */
/* loaded from: classes2.dex */
public final class C4671h extends AbstractC4498b0 {

    /* renamed from: c */
    public final String f5978c;

    /* renamed from: d */
    public final long f5979d;

    /* renamed from: e */
    public final BufferedSource f5980e;

    public C4671h(String str, long j4, BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f5978c = str;
        this.f5979d = j4;
        this.f5980e = source;
    }

    @Override // p117r2.AbstractC4498b0
    /* renamed from: c */
    public long mo5090c() {
        return this.f5979d;
    }

    @Override // p117r2.AbstractC4498b0
    /* renamed from: d */
    public C4519v mo5091d() {
        String str = this.f5978c;
        if (str != null) {
            return C4519v.f5558g.m6055b(str);
        }
        return null;
    }

    @Override // p117r2.AbstractC4498b0
    /* renamed from: f */
    public BufferedSource mo5092f() {
        return this.f5980e;
    }
}
