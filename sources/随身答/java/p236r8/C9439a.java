package p236r8;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.efs.sdk.base.Constants;
import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.GzipSource;
import okio.Okio;
import p172l8.AbstractC8925x;
import p172l8.AbstractC8927z;
import p172l8.C8911j;
import p172l8.C8921t;
import p172l8.C8924w;
import p172l8.C8926y;
import p172l8.InterfaceC8912k;
import p172l8.InterfaceC8920s;
import p182m8.AbstractC9045d;

/* renamed from: r8.a */
/* loaded from: classes5.dex */
public final class C9439a implements InterfaceC8920s {

    /* renamed from: a */
    public final InterfaceC8912k f16453a;

    public C9439a(InterfaceC8912k cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f16453a = cookieJar;
    }

    /* renamed from: a */
    public final String m15575a(List list) {
        StringBuilder sb = new StringBuilder();
        int i9 = 0;
        for (Object obj : list) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C8911j c8911j = (C8911j) obj;
            if (i9 > 0) {
                sb.append("; ");
            }
            sb.append(c8911j.m13877e());
            sb.append('=');
            sb.append(c8911j.m13879g());
            i9 = i10;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // p172l8.InterfaceC8920s
    public C8926y intercept(InterfaceC8920s.a chain) throws IOException {
        AbstractC8927z abstractC8927zM14170a;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C8924w c8924wMo14024a = chain.mo14024a();
        C8924w.a aVarM14135h = c8924wMo14024a.m14135h();
        AbstractC8925x abstractC8925xM14128a = c8924wMo14024a.m14128a();
        if (abstractC8925xM14128a != null) {
            C8921t contentType = abstractC8925xM14128a.getContentType();
            if (contentType != null) {
                aVarM14135h.m14145h(HttpHeaders.CONTENT_TYPE, contentType.toString());
            }
            long jContentLength = abstractC8925xM14128a.contentLength();
            if (jContentLength != -1) {
                aVarM14135h.m14145h(HttpHeaders.CONTENT_LENGTH, String.valueOf(jContentLength));
                aVarM14135h.m14149l("Transfer-Encoding");
            } else {
                aVarM14135h.m14145h("Transfer-Encoding", "chunked");
                aVarM14135h.m14149l(HttpHeaders.CONTENT_LENGTH);
            }
        }
        boolean z9 = false;
        if (c8924wMo14024a.m14131d(HttpHeaders.HOST) == null) {
            aVarM14135h.m14145h(HttpHeaders.HOST, AbstractC9045d.m14476R(c8924wMo14024a.m14137j(), false, 1, null));
        }
        if (c8924wMo14024a.m14131d("Connection") == null) {
            aVarM14135h.m14145h("Connection", "Keep-Alive");
        }
        if (c8924wMo14024a.m14131d("Accept-Encoding") == null && c8924wMo14024a.m14131d(HttpHeaders.RANGE) == null) {
            aVarM14135h.m14145h("Accept-Encoding", Constants.CP_GZIP);
            z9 = true;
        }
        List listMo13889b = this.f16453a.mo13889b(c8924wMo14024a.m14137j());
        if (!listMo13889b.isEmpty()) {
            aVarM14135h.m14145h("Cookie", m15575a(listMo13889b));
        }
        if (c8924wMo14024a.m14131d(HttpHeaders.USER_AGENT) == null) {
            aVarM14135h.m14145h(HttpHeaders.USER_AGENT, "okhttp/4.12.0");
        }
        C8926y c8926yMo14025b = chain.mo14025b(aVarM14135h.m14140b());
        AbstractC9443e.m15593f(this.f16453a, c8924wMo14024a.m14137j(), c8926yMo14025b.m14179o());
        C8926y.a aVarM14206r = c8926yMo14025b.m14183s().m14206r(c8924wMo14024a);
        if (z9 && StringsKt.equals(Constants.CP_GZIP, C8926y.m14169n(c8926yMo14025b, "Content-Encoding", null, 2, null), true) && AbstractC9443e.m15589b(c8926yMo14025b) && (abstractC8927zM14170a = c8926yMo14025b.m14170a()) != null) {
            GzipSource gzipSource = new GzipSource(abstractC8927zM14170a.source());
            aVarM14206r.m14199k(c8926yMo14025b.m14179o().m13938c().m13949h("Content-Encoding").m13949h(HttpHeaders.CONTENT_LENGTH).m13947f());
            aVarM14206r.m14190b(new C9446h(C8926y.m14169n(c8926yMo14025b, HttpHeaders.CONTENT_TYPE, null, 2, null), -1L, Okio.buffer(gzipSource)));
        }
        return aVarM14206r.m14191c();
    }
}
