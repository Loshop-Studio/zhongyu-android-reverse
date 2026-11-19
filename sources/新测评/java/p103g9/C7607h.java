package p103g9;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import p011a9.AbstractC0063z;
import p011a9.C0057t;

/* renamed from: g9.h */
/* loaded from: classes5.dex */
public final class C7607h extends AbstractC0063z {

    /* renamed from: a */
    public final String f12758a;

    /* renamed from: b */
    public final long f12759b;

    /* renamed from: c */
    public final BufferedSource f12760c;

    public C7607h(String str, long j10, BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f12758a = str;
        this.f12759b = j10;
        this.f12760c = source;
    }

    @Override // p011a9.AbstractC0063z
    public long contentLength() {
        return this.f12759b;
    }

    @Override // p011a9.AbstractC0063z
    public C0057t contentType() {
        String str = this.f12758a;
        if (str != null) {
            return C0057t.f189e.m279b(str);
        }
        return null;
    }

    @Override // p011a9.AbstractC0063z
    public BufferedSource source() {
        return this.f12760c;
    }
}
