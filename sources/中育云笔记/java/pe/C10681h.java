package pe;

import je.AbstractC9746z;
import je.C9740t;
import kotlin.jvm.internal.AbstractC9979u;
import okio.BufferedSource;

/* renamed from: pe.h */
/* loaded from: classes6.dex */
public final class C10681h extends AbstractC9746z {

    /* renamed from: c */
    public final String f25743c;

    /* renamed from: d */
    public final long f25744d;

    /* renamed from: e */
    public final BufferedSource f25745e;

    public C10681h(String str, long j10, BufferedSource source) {
        AbstractC9979u.m20294g(source, "source");
        this.f25743c = str;
        this.f25744d = j10;
        this.f25745e = source;
    }

    @Override // je.AbstractC9746z
    public long contentLength() {
        return this.f25744d;
    }

    @Override // je.AbstractC9746z
    public C9740t contentType() {
        String str = this.f25743c;
        if (str != null) {
            return C9740t.f22770e.m19489b(str);
        }
        return null;
    }

    @Override // je.AbstractC9746z
    public BufferedSource source() {
        return this.f25745e;
    }
}
