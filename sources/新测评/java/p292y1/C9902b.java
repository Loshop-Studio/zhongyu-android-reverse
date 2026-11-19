package p292y1;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.exception.InterruptException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p207q1.C8879d;
import p218r1.AbstractC8999c;
import p229s1.C9124a;
import p229s1.C9126c;
import p240t1.InterfaceC9377a;
import p262v1.RunnableC9659f;
import p282x1.InterfaceC9841c;

/* renamed from: y1.b */
/* loaded from: classes4.dex */
public class C9902b implements InterfaceC9841c {
    @Override // p282x1.InterfaceC9841c
    /* renamed from: a */
    public InterfaceC9377a.a mo16482a(RunnableC9659f runnableC9659f) throws IOException {
        C9126c c9126cM16123h = runnableC9659f.m16123h();
        InterfaceC9377a interfaceC9377aM16121f = runnableC9659f.m16121f();
        C6327a c6327aM16126k = runnableC9659f.m16126k();
        Map mapM4395o = c6327aM16126k.m4395o();
        if (mapM4395o != null) {
            AbstractC8999c.m15119c(mapM4395o, interfaceC9377aM16121f);
        }
        if (mapM4395o == null || !mapM4395o.containsKey(HttpHeaders.USER_AGENT)) {
            AbstractC8999c.m15117a(interfaceC9377aM16121f);
        }
        int iM16119d = runnableC9659f.m16119d();
        C9124a c9124aM15468c = c9126cM16123h.m15468c(iM16119d);
        if (c9124aM15468c == null) {
            throw new IOException("No block-info found on " + iM16119d);
        }
        interfaceC9377aM16121f.mo15671b(HttpHeaders.RANGE, ("bytes=" + c9124aM15468c.m15459d() + "-") + c9124aM15468c.m15460e());
        AbstractC8999c.m15125i("HeaderInterceptor", "AssembleHeaderRange (" + c6327aM16126k.mo4385c() + ") block(" + iM16119d + ") downloadFrom(" + c9124aM15468c.m15459d() + ") currentOffset(" + c9124aM15468c.m15458c() + ")");
        String strM15470e = c9126cM16123h.m15470e();
        if (!AbstractC8999c.m15132p(strM15470e)) {
            interfaceC9377aM16121f.mo15671b("If-Match", strM15470e);
        }
        if (runnableC9659f.m16120e().m16085f()) {
            throw InterruptException.f4725a;
        }
        C8879d.m14905k().m14907b().m15910a().mo10541u(c6327aM16126k, iM16119d, interfaceC9377aM16121f.mo15673f());
        InterfaceC9377a.a aVarM16130o = runnableC9659f.m16130o();
        if (runnableC9659f.m16120e().m16085f()) {
            throw InterruptException.f4725a;
        }
        Map mapMo15677g = aVarM16130o.mo15677g();
        if (mapMo15677g == null) {
            mapMo15677g = new HashMap();
        }
        C8879d.m14905k().m14907b().m15910a().mo10540r(c6327aM16126k, iM16119d, aVarM16130o.mo15678h(), mapMo15677g);
        C8879d.m14905k().m14911f().m16145i(aVarM16130o, iM16119d, c9126cM16123h).m16152a();
        String strMo15675c = aVarM16130o.mo15675c(HttpHeaders.CONTENT_LENGTH);
        runnableC9659f.m16135t((strMo15675c == null || strMo15675c.length() == 0) ? AbstractC8999c.m15139w(aVarM16130o.mo15675c("Content-Range")) : AbstractC8999c.m15138v(strMo15675c));
        return aVarM16130o;
    }
}
