package okhttp3;

import android.support.v4.media.AbstractC0037f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: okhttp3.c0 */
/* loaded from: classes4.dex */
public final class C6289c0 {

    /* renamed from: a */
    public final C6330r f10075a;

    /* renamed from: b */
    public final String f10076b;

    /* renamed from: c */
    public final C6329q f10077c;

    /* renamed from: d */
    public final AbstractC6297g0 f10078d;

    /* renamed from: e */
    public final Map f10079e;

    /* renamed from: f */
    public C6288c f10080f;

    public C6289c0(C6330r url, String method, C6329q c6329q, AbstractC6297g0 abstractC6297g0, Map map) {
        AbstractC5830k.m5330g(url, "url");
        AbstractC5830k.m5330g(method, "method");
        this.f10075a = url;
        this.f10076b = method;
        this.f10077c = c6329q;
        this.f10078d = abstractC6297g0;
        this.f10079e = map;
    }

    /* renamed from: a */
    public final C6287b0 m5889a() {
        C6287b0 c6287b0 = new C6287b0();
        c6287b0.f10060e = new LinkedHashMap();
        c6287b0.f10056a = this.f10075a;
        c6287b0.f10057b = this.f10076b;
        c6287b0.f10059d = this.f10078d;
        Map map = this.f10079e;
        c6287b0.f10060e = map.isEmpty() ? new LinkedHashMap() : AbstractC5785e0.m5158L(map);
        c6287b0.f10058c = this.f10077c.m5964c();
        return c6287b0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f10076b);
        sb.append(", url=");
        sb.append(this.f10075a);
        C6329q c6329q = this.f10077c;
        if (c6329q.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : c6329q) {
                int i8 = i + 1;
                if (i < 0) {
                    AbstractC5806u.m5258L();
                    throw null;
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i8;
            }
            sb.append(']');
        }
        Map map = this.f10079e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        return AbstractC0037f.m80e('}', "StringBuilder().apply(builderAction).toString()", sb);
    }
}
