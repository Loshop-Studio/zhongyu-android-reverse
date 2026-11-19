package com.zykj.http.interceptor;

import android.util.Log;
import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import javax.inject.Inject;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.GzipSource;
import okio.Okio;
import p113g8.AbstractC8687z;
import p136i9.AbstractC8905e0;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.InterfaceC8926x;

@Keep
/* loaded from: classes4.dex */
public final class GzipInterceptor implements InterfaceC8926x {
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final C7299a Companion;
    private static final String TAG;

    /* renamed from: com.zykj.http.interceptor.GzipInterceptor$a */
    public static final class C7299a {
        public /* synthetic */ C7299a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7299a() {
        }
    }

    static {
        C7299a c7299a = new C7299a(null);
        Companion = c7299a;
        String name = c7299a.getClass().getName();
        AbstractC9133u.m16132f(name, "getName(...)");
        TAG = name;
    }

    @Inject
    public GzipInterceptor() {
    }

    private final boolean isGzipped(C8903d0 c8903d0) {
        return C8903d0.m15123k(c8903d0, "Content-Encoding", null, 2, null) != null && AbstractC8687z.m14094B(C8903d0.m15123k(c8903d0, "Content-Encoding", null, 2, null), "gzip", false, 2, null);
    }

    private final C8903d0 unzip(C8903d0 c8903d0) {
        if (c8903d0.m15124b() == null) {
            return c8903d0;
        }
        AbstractC8905e0 abstractC8905e0M15124b = c8903d0.m15124b();
        AbstractC9133u.m16130d(abstractC8905e0M15124b);
        String utf8 = Okio.buffer(new GzipSource(abstractC8905e0M15124b.source())).readUtf8();
        Log.i(TAG, "response.url=" + c8903d0.m15141t().m15052l() + " \n " + utf8);
        AbstractC8905e0.b bVar = AbstractC8905e0.Companion;
        AbstractC8905e0 abstractC8905e0M15124b2 = c8903d0.m15124b();
        return c8903d0.m15137p().m15152j(c8903d0.m15133l().m15263d().m15274h("Content-Encoding").m15274h(HttpHeaders.CONTENT_LENGTH).m15272f()).m15144b(bVar.m15170e(utf8, abstractC8905e0M15124b2 != null ? abstractC8905e0M15124b2.contentType() : null)).m15154l(c8903d0.m15135n()).m15145c();
    }

    @Override // p136i9.InterfaceC8926x
    public C8903d0 intercept(InterfaceC8926x.a chain) {
        AbstractC9133u.m16133g(chain, "chain");
        C8899b0.a aVarM15049i = chain.mo15332a().m15049i();
        aVarM15049i.m15054a("Accept-Encoding", "gzip");
        C8903d0 c8903d0Mo15333b = chain.mo15333b(aVarM15049i.m15055b());
        return isGzipped(c8903d0Mo15333b) ? unzip(c8903d0Mo15333b) : c8903d0Mo15333b;
    }
}
