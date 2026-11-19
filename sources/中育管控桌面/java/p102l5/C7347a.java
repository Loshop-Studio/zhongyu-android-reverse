package p102l5;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.GzipSource;
import okio.Okio;
import p058f5.AbstractC6360c0;
import p058f5.AbstractC6364e0;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p058f5.C6374m;
import p058f5.C6386y;
import p058f5.InterfaceC6375n;
import p058f5.InterfaceC6385x;
import p065g5.AbstractC6427k;

/* renamed from: l5.a */
/* loaded from: classes4.dex */
public final class C7347a implements InterfaceC6385x {

    /* renamed from: a */
    public final InterfaceC6375n f9321a;

    public C7347a(InterfaceC6375n cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f9321a = cookieJar;
    }

    /* renamed from: a */
    public final String m8317a(List list) {
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        for (Object obj : list) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C6374m c6374m = (C6374m) obj;
            if (i6 > 0) {
                sb.append("; ");
            }
            sb.append(c6374m.m6737e());
            sb.append('=');
            sb.append(c6374m.m6739g());
            i6 = i7;
        }
        return sb.toString();
    }

    @Override // p058f5.InterfaceC6385x
    public C6362d0 intercept(InterfaceC6385x.a chain) {
        AbstractC6364e0 abstractC6364e0M6661c;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C6358b0 c6358b0Mo6871a = chain.mo6871a();
        C6358b0.a aVarM6585i = c6358b0Mo6871a.m6585i();
        AbstractC6360c0 abstractC6360c0M6577a = c6358b0Mo6871a.m6577a();
        if (abstractC6360c0M6577a != null) {
            C6386y contentType = abstractC6360c0M6577a.getContentType();
            if (contentType != null) {
                aVarM6585i.m6603o(HttpHeaders.CONTENT_TYPE, contentType.toString());
            }
            long jContentLength = abstractC6360c0M6577a.contentLength();
            if (jContentLength != -1) {
                aVarM6585i.m6603o(HttpHeaders.CONTENT_LENGTH, String.valueOf(jContentLength));
                aVarM6585i.m6607s("Transfer-Encoding");
            } else {
                aVarM6585i.m6603o("Transfer-Encoding", "chunked");
                aVarM6585i.m6607s(HttpHeaders.CONTENT_LENGTH);
            }
        }
        boolean z6 = false;
        if (c6358b0Mo6871a.m6581e(HttpHeaders.HOST) == null) {
            aVarM6585i.m6603o(HttpHeaders.HOST, AbstractC6427k.m7033u(c6358b0Mo6871a.m6588l(), false, 1, null));
        }
        if (c6358b0Mo6871a.m6581e("Connection") == null) {
            aVarM6585i.m6603o("Connection", "Keep-Alive");
        }
        if (c6358b0Mo6871a.m6581e("Accept-Encoding") == null && c6358b0Mo6871a.m6581e(HttpHeaders.RANGE) == null) {
            aVarM6585i.m6603o("Accept-Encoding", "gzip");
            z6 = true;
        }
        List listMo6748a = this.f9321a.mo6748a(c6358b0Mo6871a.m6588l());
        if (!listMo6748a.isEmpty()) {
            aVarM6585i.m6603o("Cookie", m8317a(listMo6748a));
        }
        if (c6358b0Mo6871a.m6581e(HttpHeaders.USER_AGENT) == null) {
            aVarM6585i.m6603o(HttpHeaders.USER_AGENT, "okhttp/5.1.0");
        }
        C6358b0 c6358b0M6591b = aVarM6585i.m6591b();
        C6362d0 c6362d0Mo6872b = chain.mo6872b(c6358b0M6591b);
        AbstractC7351e.m8336f(this.f9321a, c6358b0M6591b.m6588l(), c6362d0Mo6872b.m6670p());
        C6362d0.a aVarM6696q = c6362d0Mo6872b.m6674t().m6696q(c6358b0M6591b);
        if (z6 && StringsKt.equals("gzip", C6362d0.m6660o(c6362d0Mo6872b, "Content-Encoding", null, 2, null), true) && AbstractC7351e.m8332b(c6362d0Mo6872b) && (abstractC6364e0M6661c = c6362d0Mo6872b.m6661c()) != null) {
            GzipSource gzipSource = new GzipSource(abstractC6364e0M6661c.source());
            aVarM6696q.m6689j(c6362d0Mo6872b.m6670p().m6802d().m6813h("Content-Encoding").m6813h(HttpHeaders.CONTENT_LENGTH).m6811f());
            aVarM6696q.m6681b(new C7354h(C6362d0.m6660o(c6362d0Mo6872b, HttpHeaders.CONTENT_TYPE, null, 2, null), -1L, Okio.buffer(gzipSource)));
        }
        return aVarM6696q.m6682c();
    }
}
