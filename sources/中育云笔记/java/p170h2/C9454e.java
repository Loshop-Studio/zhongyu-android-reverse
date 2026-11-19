package p170h2;

import android.util.Log;
import anet.channel.request.Request;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Locale;
import je.AbstractC9744x;
import je.C9738r;
import je.C9740t;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9739s;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.text.Regex;
import okio.Buffer;
import p310qd.AbstractC10793c0;

/* renamed from: h2.e */
/* loaded from: classes3.dex */
public final class C9454e implements InterfaceC9739s {
    /* renamed from: a */
    public final String m18641a(StringBuffer stringBuffer) throws UnsupportedEncodingException {
        String string = stringBuffer.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        try {
            string = new Regex("\\+").m20343m(new Regex("%(?![0-9a-fA-F]{2})").m20343m(string, "%25"), "%2B");
            String strDecode = URLDecoder.decode(string, "utf-8");
            AbstractC9979u.m20293f(strDecode, "decode(...)");
            return strDecode;
        } catch (Exception e10) {
            e10.printStackTrace();
            return string;
        }
    }

    @Override // je.InterfaceC9739s
    public C9745y intercept(InterfaceC9739s.a chain) {
        AbstractC9979u.m20294g(chain, "chain");
        C9743w c9743wRequest = chain.request();
        Charset charsetForName = Charset.forName(Request.DEFAULT_CHARSET);
        String strM19589g = c9743wRequest.m19589g();
        Locale locale = Locale.getDefault();
        AbstractC9979u.m20293f(locale, "getDefault(...)");
        String lowerCase = strM19589g.toLowerCase(locale);
        AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
        String string = AbstractC10793c0.m23129e1(lowerCase).toString();
        C9738r c9738rM19592j = c9743wRequest.m19592j();
        String string2 = AbstractC10793c0.m23129e1(c9738rM19592j.m19428r() + "://" + c9738rM19592j.m19419i() + ":" + c9738rM19592j.m19424n() + c9738rM19592j.m19415d()).toString();
        if (!AbstractC9979u.m20289b(string, "get") && !AbstractC9979u.m20289b(string, RequestParameters.SUBRESOURCE_DELETE)) {
            AbstractC9744x abstractC9744xM19583a = c9743wRequest.m19583a();
            if (abstractC9744xM19583a != null) {
                C9740t c9740tContentType = abstractC9744xM19583a.contentType();
                if (c9740tContentType != null) {
                    charsetForName = c9740tContentType.m19484c(charsetForName);
                    String strM19487i = c9740tContentType.m19487i();
                    Locale locale2 = Locale.getDefault();
                    AbstractC9979u.m20293f(locale2, "getDefault(...)");
                    String lowerCase2 = strM19487i.toLowerCase(locale2);
                    AbstractC9979u.m20293f(lowerCase2, "toLowerCase(...)");
                    if (AbstractC9979u.m20289b(lowerCase2, "multipart")) {
                        return chain.mo19477a(c9743wRequest);
                    }
                }
                try {
                    Buffer buffer = new Buffer();
                    abstractC9744xM19583a.writeTo(buffer);
                    AbstractC9979u.m20291d(charsetForName);
                    String strM18634d = AbstractC9450a.m18634d(m18641a(new StringBuffer(buffer.readString(charsetForName))), AbstractC9451b.m18639b());
                    AbstractC9744x.a aVar = AbstractC9744x.Companion;
                    AbstractC9979u.m20291d(strM18634d);
                    AbstractC9744x abstractC9744xM19614b = aVar.m19614b(strM18634d, c9740tContentType);
                    C9743w.a aVarM19590h = c9743wRequest.m19590h();
                    if (AbstractC9979u.m20289b(string, "post")) {
                        aVarM19590h.m19603k(abstractC9744xM19614b);
                    } else if (AbstractC9979u.m20289b(string, "put")) {
                        aVarM19590h.m19604l(abstractC9744xM19614b);
                    }
                    c9743wRequest = aVarM19590h.m19595b();
                } catch (Exception e10) {
                    Log.e("-----", "加密异常====》" + e10);
                    return chain.mo19477a(c9743wRequest);
                }
            }
        } else if (c9738rM19592j.m19417f() != null) {
            try {
                c9743wRequest = c9743wRequest.m19590h().m19608p(string2 + "?" + AbstractC9450a.m18634d(c9743wRequest.m19592j().m19417f(), AbstractC9451b.m18639b())).m19595b();
            } catch (Exception e11) {
                e11.printStackTrace();
                return chain.mo19477a(c9743wRequest);
            }
        }
        return chain.mo19477a(c9743wRequest);
    }
}
