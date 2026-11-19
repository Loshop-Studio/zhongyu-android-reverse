package p203o9;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import okio.GzipSource;
import okio.Okio;
import p113g8.AbstractC8687z;
import p134i7.AbstractC8809v;
import p136i9.AbstractC8901c0;
import p136i9.AbstractC8905e0;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.C8915m;
import p136i9.C8927y;
import p136i9.InterfaceC8916n;
import p136i9.InterfaceC8926x;
import p147j9.AbstractC9041k;

/* renamed from: o9.a */
/* loaded from: classes5.dex */
public final class C9546a implements InterfaceC8926x {

    /* renamed from: a */
    public final InterfaceC8916n f18908a;

    public C9546a(InterfaceC8916n cookieJar) {
        AbstractC9133u.m16133g(cookieJar, "cookieJar");
        this.f18908a = cookieJar;
    }

    /* renamed from: a */
    public final String m17822a(List list) {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            C8915m c8915m = (C8915m) obj;
            if (i10 > 0) {
                sb.append("; ");
            }
            sb.append(c8915m.m15198e());
            sb.append('=');
            sb.append(c8915m.m15200g());
            i10 = i11;
        }
        return sb.toString();
    }

    @Override // p136i9.InterfaceC8926x
    public C8903d0 intercept(InterfaceC8926x.a chain) {
        AbstractC8905e0 abstractC8905e0M15124b;
        AbstractC9133u.m16133g(chain, "chain");
        C8899b0 c8899b0Mo15332a = chain.mo15332a();
        C8899b0.a aVarM15049i = c8899b0Mo15332a.m15049i();
        AbstractC8901c0 abstractC8901c0M15041a = c8899b0Mo15332a.m15041a();
        if (abstractC8901c0M15041a != null) {
            C8927y c8927yContentType = abstractC8901c0M15041a.contentType();
            if (c8927yContentType != null) {
                aVarM15049i.m15067o(HttpHeaders.CONTENT_TYPE, c8927yContentType.toString());
            }
            long jContentLength = abstractC8901c0M15041a.contentLength();
            if (jContentLength != -1) {
                aVarM15049i.m15067o(HttpHeaders.CONTENT_LENGTH, String.valueOf(jContentLength));
                aVarM15049i.m15070r("Transfer-Encoding");
            } else {
                aVarM15049i.m15067o("Transfer-Encoding", "chunked");
                aVarM15049i.m15070r(HttpHeaders.CONTENT_LENGTH);
            }
        }
        boolean z10 = false;
        if (c8899b0Mo15332a.m15045e(HttpHeaders.HOST) == null) {
            aVarM15049i.m15067o(HttpHeaders.HOST, AbstractC9041k.m15791u(c8899b0Mo15332a.m15052l(), false, 1, null));
        }
        if (c8899b0Mo15332a.m15045e("Connection") == null) {
            aVarM15049i.m15067o("Connection", "Keep-Alive");
        }
        if (c8899b0Mo15332a.m15045e("Accept-Encoding") == null && c8899b0Mo15332a.m15045e(HttpHeaders.RANGE) == null) {
            aVarM15049i.m15067o("Accept-Encoding", "gzip");
            z10 = true;
        }
        List listMo15209a = this.f18908a.mo15209a(c8899b0Mo15332a.m15052l());
        if (!listMo15209a.isEmpty()) {
            aVarM15049i.m15067o("Cookie", m17822a(listMo15209a));
        }
        if (c8899b0Mo15332a.m15045e(HttpHeaders.USER_AGENT) == null) {
            aVarM15049i.m15067o(HttpHeaders.USER_AGENT, "okhttp/5.1.0");
        }
        C8899b0 c8899b0M15055b = aVarM15049i.m15055b();
        C8903d0 c8903d0Mo15333b = chain.mo15333b(c8899b0M15055b);
        AbstractC9550e.m17841f(this.f18908a, c8899b0M15055b.m15052l(), c8903d0Mo15333b.m15133l());
        C8903d0.a aVarM15159q = c8903d0Mo15333b.m15137p().m15159q(c8899b0M15055b);
        if (z10 && AbstractC8687z.m14093A("gzip", C8903d0.m15123k(c8903d0Mo15333b, "Content-Encoding", null, 2, null), true) && AbstractC9550e.m17837b(c8903d0Mo15333b) && (abstractC8905e0M15124b = c8903d0Mo15333b.m15124b()) != null) {
            GzipSource gzipSource = new GzipSource(abstractC8905e0M15124b.source());
            aVarM15159q.m15152j(c8903d0Mo15333b.m15133l().m15263d().m15274h("Content-Encoding").m15274h(HttpHeaders.CONTENT_LENGTH).m15272f());
            aVarM15159q.m15144b(new C9553h(C8903d0.m15123k(c8903d0Mo15333b, HttpHeaders.CONTENT_TYPE, null, 2, null), -1L, Okio.buffer(gzipSource)));
        }
        return aVarM15159q.m15145c();
    }
}
