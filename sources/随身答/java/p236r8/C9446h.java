package p236r8;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import p172l8.AbstractC8927z;
import p172l8.C8921t;

/* renamed from: r8.h */
/* loaded from: classes5.dex */
public final class C9446h extends AbstractC8927z {

    /* renamed from: a */
    public final String f16470a;

    /* renamed from: b */
    public final long f16471b;

    /* renamed from: c */
    public final BufferedSource f16472c;

    public C9446h(String str, long j9, BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f16470a = str;
        this.f16471b = j9;
        this.f16472c = source;
    }

    @Override // p172l8.AbstractC8927z
    public long contentLength() {
        return this.f16471b;
    }

    @Override // p172l8.AbstractC8927z
    public C8921t contentType() {
        String str = this.f16470a;
        if (str != null) {
            return C8921t.f14817e.m14035b(str);
        }
        return null;
    }

    @Override // p172l8.AbstractC8927z
    public BufferedSource source() {
        return this.f16472c;
    }
}
