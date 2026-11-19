package p141x2;

import com.efs.sdk.base.Constants;
import com.zykj.http.interceptor.GzipInterceptor;
import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.GzipSource;
import okio.Okio;
import p117r2.AbstractC4498b0;
import p117r2.AbstractC4523z;
import p117r2.C4496a0;
import p117r2.C4509l;
import p117r2.C4519v;
import p117r2.C4522y;
import p117r2.InterfaceC4510m;
import p117r2.InterfaceC4518u;
import p121s2.AbstractC4550b;

/* renamed from: x2.a */
/* loaded from: classes2.dex */
public final class C4664a implements InterfaceC4518u {

    /* renamed from: a */
    public final InterfaceC4510m f5961a;

    public C4664a(InterfaceC4510m cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f5961a = cookieJar;
    }

    /* renamed from: a */
    public final String m6562a(List list) {
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            C4509l c4509l = (C4509l) obj;
            if (i4 > 0) {
                sb.append("; ");
            }
            sb.append(c4509l.m5903e());
            sb.append('=');
            sb.append(c4509l.m5905g());
            i4 = i5;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // p117r2.InterfaceC4518u
    public C4496a0 intercept(InterfaceC4518u.a chain) throws IOException {
        AbstractC4498b0 abstractC4498b0M5800a;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4522y c4522yMo6045S = chain.mo6045S();
        C4522y.a aVarM6139h = c4522yMo6045S.m6139h();
        AbstractC4523z abstractC4523zM6132a = c4522yMo6045S.m6132a();
        if (abstractC4523zM6132a != null) {
            C4519v contentType = abstractC4523zM6132a.getContentType();
            if (contentType != null) {
                aVarM6139h.m6144c("Content-Type", contentType.toString());
            }
            long jContentLength = abstractC4523zM6132a.contentLength();
            if (jContentLength != -1) {
                aVarM6139h.m6144c("Content-Length", String.valueOf(jContentLength));
                aVarM6139h.m6147f("Transfer-Encoding");
            } else {
                aVarM6139h.m6144c("Transfer-Encoding", "chunked");
                aVarM6139h.m6147f("Content-Length");
            }
        }
        boolean z3 = false;
        if (c4522yMo6045S.m6135d("Host") == null) {
            aVarM6139h.m6144c("Host", AbstractC4550b.m6210M(c4522yMo6045S.m6141j(), false, 1, null));
        }
        if (c4522yMo6045S.m6135d("Connection") == null) {
            aVarM6139h.m6144c("Connection", "Keep-Alive");
        }
        if (c4522yMo6045S.m6135d("Accept-Encoding") == null && c4522yMo6045S.m6135d("Range") == null) {
            aVarM6139h.m6144c("Accept-Encoding", Constants.CP_GZIP);
            z3 = true;
        }
        List listMo5914a = this.f5961a.mo5914a(c4522yMo6045S.m6141j());
        if (!listMo5914a.isEmpty()) {
            aVarM6139h.m6144c("Cookie", m6562a(listMo5914a));
        }
        if (c4522yMo6045S.m6135d("User-Agent") == null) {
            aVarM6139h.m6144c("User-Agent", "okhttp/4.9.0");
        }
        C4496a0 c4496a0Mo6046a = chain.mo6046a(aVarM6139h.m6143b());
        AbstractC4668e.m6579f(this.f5961a, c4522yMo6045S.m6141j(), c4496a0Mo6046a.m5808j());
        C4496a0.a aVarM5835r = c4496a0Mo6046a.m5812n().m5835r(c4522yMo6045S);
        if (z3 && StringsKt__StringsJVMKt.equals(Constants.CP_GZIP, C4496a0.m5799i(c4496a0Mo6046a, GzipInterceptor.CONTENT_ENCODING, null, 2, null), true) && AbstractC4668e.m6575b(c4496a0Mo6046a) && (abstractC4498b0M5800a = c4496a0Mo6046a.m5800a()) != null) {
            GzipSource gzipSource = new GzipSource(abstractC4498b0M5800a.mo5092f());
            aVarM5835r.m5828k(c4496a0Mo6046a.m5808j().m5961c().m5970g(GzipInterceptor.CONTENT_ENCODING).m5970g("Content-Length").m5968e());
            aVarM5835r.m5819b(new C4671h(C4496a0.m5799i(c4496a0Mo6046a, "Content-Type", null, 2, null), -1L, Okio.buffer(gzipSource)));
        }
        return aVarM5835r.m5820c();
    }
}
