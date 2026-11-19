package p102l5;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import p058f5.AbstractC6364e0;
import p058f5.C6386y;

/* renamed from: l5.h */
/* loaded from: classes4.dex */
public final class C7354h extends AbstractC6364e0 {

    /* renamed from: a */
    public final String f9340a;

    /* renamed from: b */
    public final long f9341b;

    /* renamed from: c */
    public final BufferedSource f9342c;

    public C7354h(String str, long j6, BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f9340a = str;
        this.f9341b = j6;
        this.f9342c = source;
    }

    @Override // p058f5.AbstractC6364e0
    public long contentLength() {
        return this.f9341b;
    }

    @Override // p058f5.AbstractC6364e0
    public C6386y contentType() {
        String str = this.f9340a;
        if (str != null) {
            return C6386y.f7983e.m6882b(str);
        }
        return null;
    }

    @Override // p058f5.AbstractC6364e0
    public BufferedSource source() {
        return this.f9342c;
    }
}
