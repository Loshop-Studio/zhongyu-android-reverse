package p203o9;

import kotlin.jvm.internal.AbstractC9133u;
import okio.BufferedSource;
import p136i9.AbstractC8905e0;
import p136i9.C8927y;

/* renamed from: o9.h */
/* loaded from: classes5.dex */
public final class C9553h extends AbstractC8905e0 {

    /* renamed from: a */
    public final String f18927a;

    /* renamed from: b */
    public final long f18928b;

    /* renamed from: c */
    public final BufferedSource f18929c;

    public C9553h(String str, long j10, BufferedSource source) {
        AbstractC9133u.m16133g(source, "source");
        this.f18927a = str;
        this.f18928b = j10;
        this.f18929c = source;
    }

    @Override // p136i9.AbstractC8905e0
    public long contentLength() {
        return this.f18928b;
    }

    @Override // p136i9.AbstractC8905e0
    public C8927y contentType() {
        String str = this.f18927a;
        if (str != null) {
            return C8927y.f16815e.m15343b(str);
        }
        return null;
    }

    @Override // p136i9.AbstractC8905e0
    public BufferedSource source() {
        return this.f18929c;
    }
}
