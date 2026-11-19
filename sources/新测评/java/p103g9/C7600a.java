package p103g9;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.GzipSource;
import okio.Okio;
import p011a9.AbstractC0061x;
import p011a9.AbstractC0063z;
import p011a9.C0047j;
import p011a9.C0057t;
import p011a9.C0060w;
import p011a9.C0062y;
import p011a9.InterfaceC0048k;
import p011a9.InterfaceC0056s;
import p028b9.AbstractC5070d;

/* renamed from: g9.a */
/* loaded from: classes5.dex */
public final class C7600a implements InterfaceC0056s {

    /* renamed from: a */
    public final InterfaceC0048k f12741a;

    public C7600a(InterfaceC0048k cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f12741a = cookieJar;
    }

    /* renamed from: a */
    public final String m12488a(List list) {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C0047j c0047j = (C0047j) obj;
            if (i10 > 0) {
                sb.append("; ");
            }
            sb.append(c0047j.m120e());
            sb.append('=');
            sb.append(c0047j.m122g());
            i10 = i11;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // p011a9.InterfaceC0056s
    public C0062y intercept(InterfaceC0056s.a chain) throws IOException {
        AbstractC0063z abstractC0063zM414a;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C0060w c0060wMo268a = chain.mo268a();
        C0060w.a aVarM379h = c0060wMo268a.m379h();
        AbstractC0061x abstractC0061xM372a = c0060wMo268a.m372a();
        if (abstractC0061xM372a != null) {
            C0057t contentType = abstractC0061xM372a.getContentType();
            if (contentType != null) {
                aVarM379h.m389h(HttpHeaders.CONTENT_TYPE, contentType.toString());
            }
            long jContentLength = abstractC0061xM372a.contentLength();
            if (jContentLength != -1) {
                aVarM379h.m389h(HttpHeaders.CONTENT_LENGTH, String.valueOf(jContentLength));
                aVarM379h.m393l("Transfer-Encoding");
            } else {
                aVarM379h.m389h("Transfer-Encoding", "chunked");
                aVarM379h.m393l(HttpHeaders.CONTENT_LENGTH);
            }
        }
        boolean z9 = false;
        if (c0060wMo268a.m375d(HttpHeaders.HOST) == null) {
            aVarM379h.m389h(HttpHeaders.HOST, AbstractC5070d.m2627R(c0060wMo268a.m381j(), false, 1, null));
        }
        if (c0060wMo268a.m375d("Connection") == null) {
            aVarM379h.m389h("Connection", "Keep-Alive");
        }
        if (c0060wMo268a.m375d("Accept-Encoding") == null && c0060wMo268a.m375d(HttpHeaders.RANGE) == null) {
            aVarM379h.m389h("Accept-Encoding", "gzip");
            z9 = true;
        }
        List listMo131a = this.f12741a.mo131a(c0060wMo268a.m381j());
        if (!listMo131a.isEmpty()) {
            aVarM379h.m389h("Cookie", m12488a(listMo131a));
        }
        if (c0060wMo268a.m375d(HttpHeaders.USER_AGENT) == null) {
            aVarM379h.m389h(HttpHeaders.USER_AGENT, "okhttp/4.12.0");
        }
        C0062y c0062yMo269b = chain.mo269b(aVarM379h.m384b());
        AbstractC7604e.m12506f(this.f12741a, c0060wMo268a.m381j(), c0062yMo269b.m423o());
        C0062y.a aVarM450r = c0062yMo269b.m427s().m450r(c0060wMo268a);
        if (z9 && StringsKt.equals("gzip", C0062y.m413n(c0062yMo269b, "Content-Encoding", null, 2, null), true) && AbstractC7604e.m12502b(c0062yMo269b) && (abstractC0063zM414a = c0062yMo269b.m414a()) != null) {
            GzipSource gzipSource = new GzipSource(abstractC0063zM414a.source());
            aVarM450r.m443k(c0062yMo269b.m423o().m182c().m193h("Content-Encoding").m193h(HttpHeaders.CONTENT_LENGTH).m191f());
            aVarM450r.m434b(new C7607h(C0062y.m413n(c0062yMo269b, HttpHeaders.CONTENT_TYPE, null, 2, null), -1L, Okio.buffer(gzipSource)));
        }
        return aVarM450r.m435c();
    }
}
