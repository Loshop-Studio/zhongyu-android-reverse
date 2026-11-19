package okhttp3;

import android.support.v4.media.AbstractC0037f;
import coil3.network.AbstractC3315g;
import com.zykj.mistake.feature.notebook.detail.C4916z4;
import java.io.EOFException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5834o;
import kotlin.text.AbstractC5862w;
import p139p7.AbstractC6396c;

/* renamed from: okhttp3.b0 */
/* loaded from: classes4.dex */
public final class C6287b0 {

    /* renamed from: a */
    public C6330r f10056a;

    /* renamed from: d */
    public AbstractC6297g0 f10059d;

    /* renamed from: e */
    public LinkedHashMap f10060e = new LinkedHashMap();

    /* renamed from: b */
    public String f10057b = "GET";

    /* renamed from: c */
    public C5834o f10058c = new C5834o(2, false);

    /* renamed from: a */
    public final void m5883a(String name, String value) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(value, "value");
        this.f10058c.m5344b(name, value);
    }

    /* renamed from: b */
    public final C6289c0 m5884b() {
        Map mapUnmodifiableMap;
        C6330r c6330r = this.f10056a;
        if (c6330r == null) {
            throw new IllegalStateException("url == null");
        }
        String str = this.f10057b;
        C6329q c6329qM5348f = this.f10058c.m5348f();
        AbstractC6297g0 abstractC6297g0 = this.f10059d;
        LinkedHashMap linkedHashMap = this.f10060e;
        byte[] bArr = AbstractC6396c.f10486a;
        AbstractC5830k.m5330g(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = AbstractC5785e0.m5147A();
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            AbstractC5830k.m5329f(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new C6289c0(c6330r, str, c6329qM5348f, abstractC6297g0, mapUnmodifiableMap);
    }

    /* renamed from: c */
    public final void m5885c(String str, String value) {
        AbstractC5830k.m5330g(value, "value");
        C5834o c5834o = this.f10058c;
        c5834o.getClass();
        AbstractC6326o.m5952b(str);
        AbstractC6326o.m5953c(value, str);
        c5834o.m5351i(str);
        c5834o.m5345c(str, value);
    }

    /* renamed from: d */
    public final void m5886d(String method, AbstractC6297g0 abstractC6297g0) {
        AbstractC5830k.m5330g(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (abstractC6297g0 == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC0037f.m86k("method ", method, " must have a request body.").toString());
            }
        } else if (!AbstractC3315g.m2243k(method)) {
            throw new IllegalArgumentException(AbstractC0037f.m86k("method ", method, " must not have a request body.").toString());
        }
        this.f10057b = method;
        this.f10059d = abstractC6297g0;
    }

    /* renamed from: e */
    public final void m5887e(Class type, Object obj) {
        AbstractC5830k.m5330g(type, "type");
        if (obj == null) {
            this.f10060e.remove(type);
            return;
        }
        if (this.f10060e.isEmpty()) {
            this.f10060e = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = this.f10060e;
        Object objCast = type.cast(obj);
        AbstractC5830k.m5327d(objCast);
        linkedHashMap.put(type, objCast);
    }

    /* renamed from: f */
    public final void m5888f(String url) throws NumberFormatException, EOFException {
        AbstractC5830k.m5330g(url, "url");
        if (AbstractC5862w.m5409C(url, "ws:", true)) {
            String strSubstring = url.substring(3);
            AbstractC5830k.m5329f(strSubstring, "this as java.lang.String).substring(startIndex)");
            url = "http:".concat(strSubstring);
        } else if (AbstractC5862w.m5409C(url, "wss:", true)) {
            String strSubstring2 = url.substring(4);
            AbstractC5830k.m5329f(strSubstring2, "this as java.lang.String).substring(startIndex)");
            url = "https:".concat(strSubstring2);
        }
        AbstractC5830k.m5330g(url, "<this>");
        C4916z4 c4916z4 = new C4916z4();
        c4916z4.m4288d(null, url);
        this.f10056a = c4916z4.m4285a();
    }
}
