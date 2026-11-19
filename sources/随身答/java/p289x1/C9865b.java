package p289x1;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.exception.InterruptException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p209p1.C9315d;
import p219q1.AbstractC9353c;
import p229r1.C9417a;
import p229r1.C9419c;
import p239s1.InterfaceC9465a;
import p259u1.RunnableC9664f;
import p279w1.InterfaceC9798c;

/* renamed from: x1.b */
/* loaded from: classes4.dex */
public class C9865b implements InterfaceC9798c {
    @Override // p279w1.InterfaceC9798c
    /* renamed from: b */
    public InterfaceC9465a.a mo16602b(RunnableC9664f runnableC9664f) throws IOException {
        C9419c c9419cM16084h = runnableC9664f.m16084h();
        InterfaceC9465a interfaceC9465aM16082f = runnableC9664f.m16082f();
        C6593a c6593aM16087k = runnableC9664f.m16087k();
        Map mapM4599o = c6593aM16087k.m4599o();
        if (mapM4599o != null) {
            AbstractC9353c.m15300c(mapM4599o, interfaceC9465aM16082f);
        }
        if (mapM4599o == null || !mapM4599o.containsKey(HttpHeaders.USER_AGENT)) {
            AbstractC9353c.m15298a(interfaceC9465aM16082f);
        }
        int iM16080d = runnableC9664f.m16080d();
        C9417a c9417aM15522c = c9419cM16084h.m15522c(iM16080d);
        if (c9417aM15522c == null) {
            throw new IOException("No block-info found on " + iM16080d);
        }
        interfaceC9465aM16082f.mo15635b(HttpHeaders.RANGE, ("bytes=" + c9417aM15522c.m15513d() + "-") + c9417aM15522c.m15514e());
        AbstractC9353c.m15306i("HeaderInterceptor", "AssembleHeaderRange (" + c6593aM16087k.mo4589c() + ") block(" + iM16080d + ") downloadFrom(" + c9417aM15522c.m15513d() + ") currentOffset(" + c9417aM15522c.m15512c() + ")");
        String strM15524e = c9419cM16084h.m15524e();
        if (!AbstractC9353c.m15313p(strM15524e)) {
            interfaceC9465aM16082f.mo15635b("If-Match", strM15524e);
        }
        if (runnableC9664f.m16081e().m16046f()) {
            throw InterruptException.f5333a;
        }
        C9315d.m15182k().m15184b().m15841a().mo10270u(c6593aM16087k, iM16080d, interfaceC9465aM16082f.mo15637f());
        InterfaceC9465a.a aVarM16091o = runnableC9664f.m16091o();
        if (runnableC9664f.m16081e().m16046f()) {
            throw InterruptException.f5333a;
        }
        Map mapMo15641g = aVarM16091o.mo15641g();
        if (mapMo15641g == null) {
            mapMo15641g = new HashMap();
        }
        C9315d.m15182k().m15184b().m15841a().mo10269o(c6593aM16087k, iM16080d, aVarM16091o.mo15642h(), mapMo15641g);
        C9315d.m15182k().m15188f().m16106i(aVarM16091o, iM16080d, c9419cM16084h).m16113a();
        String strMo15639c = aVarM16091o.mo15639c(HttpHeaders.CONTENT_LENGTH);
        runnableC9664f.m16096t((strMo15639c == null || strMo15639c.length() == 0) ? AbstractC9353c.m15320w(aVarM16091o.mo15639c("Content-Range")) : AbstractC9353c.m15319v(strMo15639c));
        return aVarM16091o;
    }
}
