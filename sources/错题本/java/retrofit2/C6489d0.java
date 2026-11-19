package retrofit2;

import android.support.v4.media.AbstractC0037f;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.AbstractC6297g0;
import okhttp3.AbstractC6326o;
import okhttp3.C6329q;

/* renamed from: retrofit2.d0 */
/* loaded from: classes4.dex */
public final class C6489d0 extends AbstractC6522v {

    /* renamed from: d */
    public final /* synthetic */ int f10687d = 0;

    /* renamed from: e */
    public final Method f10688e;

    /* renamed from: f */
    public final int f10689f;

    /* renamed from: g */
    public final InterfaceC6506m f10690g;

    /* renamed from: h */
    public final Object f10691h;

    public C6489d0(Method method, int i, C6329q c6329q, InterfaceC6506m interfaceC6506m) {
        this.f10688e = method;
        this.f10689f = i;
        this.f10691h = c6329q;
        this.f10690g = interfaceC6506m;
    }

    @Override // retrofit2.AbstractC6522v
    /* renamed from: a */
    public final void mo6137a(C6503k0 c6503k0, Object obj) {
        switch (this.f10687d) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    c6503k0.m6148c((C6329q) this.f10691h, (AbstractC6297g0) this.f10690g.convert(obj));
                    return;
                } catch (IOException e) {
                    throw AbstractC6522v.m6172n(this.f10688e, this.f10689f, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                int i = this.f10689f;
                Method method = this.f10688e;
                if (map == null) {
                    throw AbstractC6522v.m6172n(method, i, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC6522v.m6172n(method, i, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC6522v.m6172n(method, i, AbstractC0037f.m86k("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    c6503k0.m6148c(AbstractC6326o.m5957g(HttpHeaders.CONTENT_DISPOSITION, AbstractC0037f.m86k("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) this.f10691h), (AbstractC6297g0) this.f10690g.convert(value));
                }
                return;
        }
    }

    public C6489d0(Method method, int i, InterfaceC6506m interfaceC6506m, String str) {
        this.f10688e = method;
        this.f10689f = i;
        this.f10690g = interfaceC6506m;
        this.f10691h = str;
    }
}
