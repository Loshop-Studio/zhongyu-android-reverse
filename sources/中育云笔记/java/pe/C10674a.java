package pe;

import anet.channel.util.HttpConstant;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.List;
import je.AbstractC9744x;
import je.AbstractC9746z;
import je.C9730j;
import je.C9740t;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9731k;
import je.InterfaceC9739s;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9979u;
import okio.GzipSource;
import okio.Okio;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10978w;

/* renamed from: pe.a */
/* loaded from: classes6.dex */
public final class C10674a implements InterfaceC9739s {

    /* renamed from: a */
    public final InterfaceC9731k f25726a;

    public C10674a(InterfaceC9731k cookieJar) {
        AbstractC9979u.m20294g(cookieJar, "cookieJar");
        this.f25726a = cookieJar;
    }

    /* renamed from: a */
    public final String m22601a(List list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            C9730j c9730j = (C9730j) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(c9730j.m19329e());
            sb2.append('=');
            sb2.append(c9730j.m19331g());
            i10 = i11;
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // je.InterfaceC9739s
    public C9745y intercept(InterfaceC9739s.a chain) {
        AbstractC9746z abstractC9746zM19628e;
        AbstractC9979u.m20294g(chain, "chain");
        C9743w c9743wRequest = chain.request();
        C9743w.a aVarM19590h = c9743wRequest.m19590h();
        AbstractC9744x abstractC9744xM19583a = c9743wRequest.m19583a();
        if (abstractC9744xM19583a != null) {
            C9740t c9740tContentType = abstractC9744xM19583a.contentType();
            if (c9740tContentType != null) {
                aVarM19590h.m19600h("Content-Type", c9740tContentType.toString());
            }
            long jContentLength = abstractC9744xM19583a.contentLength();
            if (jContentLength != -1) {
                aVarM19590h.m19600h("Content-Length", String.valueOf(jContentLength));
                aVarM19590h.m19605m("Transfer-Encoding");
            } else {
                aVarM19590h.m19600h("Transfer-Encoding", "chunked");
                aVarM19590h.m19605m("Content-Length");
            }
        }
        boolean z10 = false;
        if (c9743wRequest.m19586d("Host") == null) {
            aVarM19590h.m19600h("Host", AbstractC9920d.m20010R(c9743wRequest.m19592j(), false, 1, null));
        }
        if (c9743wRequest.m19586d("Connection") == null) {
            aVarM19590h.m19600h("Connection", "Keep-Alive");
        }
        if (c9743wRequest.m19586d(HttpConstant.ACCEPT_ENCODING) == null && c9743wRequest.m19586d(HttpHeaders.RANGE) == null) {
            aVarM19590h.m19600h(HttpConstant.ACCEPT_ENCODING, HttpConstant.GZIP);
            z10 = true;
        }
        List listMo19341b = this.f25726a.mo19341b(c9743wRequest.m19592j());
        if (!listMo19341b.isEmpty()) {
            aVarM19590h.m19600h(HttpConstant.COOKIE, m22601a(listMo19341b));
        }
        if (c9743wRequest.m19586d(HttpHeaders.USER_AGENT) == null) {
            aVarM19590h.m19600h(HttpHeaders.USER_AGENT, "okhttp/4.12.0");
        }
        C9745y c9745yMo19477a = chain.mo19477a(aVarM19590h.m19595b());
        AbstractC10678e.m22619g(this.f25726a, c9743wRequest.m19592j(), c9745yMo19477a.m19637r());
        C9745y.a aVarM19663r = c9745yMo19477a.m19641v().m19663r(c9743wRequest);
        if (z10 && AbstractC10819z.m23230C(HttpConstant.GZIP, C9745y.m19626p(c9745yMo19477a, "Content-Encoding", null, 2, null), true) && AbstractC10678e.m22615c(c9745yMo19477a) && (abstractC9746zM19628e = c9745yMo19477a.m19628e()) != null) {
            GzipSource gzipSource = new GzipSource(abstractC9746zM19628e.source());
            aVarM19663r.m19656k(c9745yMo19477a.m19637r().m19391c().m19402h("Content-Encoding").m19402h("Content-Length").m19400f());
            aVarM19663r.m19647b(new C10681h(C9745y.m19626p(c9745yMo19477a, "Content-Type", null, 2, null), -1L, Okio.buffer(gzipSource)));
        }
        return aVarM19663r.m19648c();
    }
}
