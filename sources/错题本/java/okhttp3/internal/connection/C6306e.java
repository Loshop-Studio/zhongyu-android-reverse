package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.C6284a;
import okhttp3.C6325n0;
import okhttp3.C6330r;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p041d2.C5413c;

/* renamed from: okhttp3.internal.connection.e */
/* loaded from: classes4.dex */
public final class C6306e {

    /* renamed from: a */
    public final C6314m f10135a;

    /* renamed from: b */
    public final C6284a f10136b;

    /* renamed from: c */
    public final C6310i f10137c;

    /* renamed from: d */
    public C5413c f10138d;

    /* renamed from: e */
    public C6315n f10139e;

    /* renamed from: f */
    public int f10140f;

    /* renamed from: g */
    public int f10141g;

    /* renamed from: h */
    public int f10142h;

    /* renamed from: i */
    public C6325n0 f10143i;

    public C6306e(C6314m connectionPool, C6284a c6284a, C6310i c6310i) {
        AbstractC5830k.m5330g(connectionPool, "connectionPool");
        this.f10135a = connectionPool;
        this.f10136b = c6284a;
        this.f10137c = c6310i;
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x02b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, java.util.List] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.internal.connection.C6312k m5907a(boolean r13, int r14, boolean r15, int r16, int r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C6306e.m5907a(boolean, int, boolean, int, int):okhttp3.internal.connection.k");
    }

    /* renamed from: b */
    public final boolean m5908b(C6330r url) {
        AbstractC5830k.m5330g(url, "url");
        C6330r c6330r = this.f10136b.f10050i;
        return url.f10269e == c6330r.f10269e && AbstractC5830k.m5325b(url.f10268d, c6330r.f10268d);
    }

    /* renamed from: c */
    public final void m5909c(IOException e) {
        AbstractC5830k.m5330g(e, "e");
        this.f10143i = null;
        if ((e instanceof StreamResetException) && ((StreamResetException) e).errorCode == ErrorCode.REFUSED_STREAM) {
            this.f10140f++;
        } else if (e instanceof ConnectionShutdownException) {
            this.f10141g++;
        } else {
            this.f10142h++;
        }
    }
}
