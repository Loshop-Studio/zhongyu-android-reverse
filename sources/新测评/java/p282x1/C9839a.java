package p282x1;

import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import com.liulishuo.okdownload.core.exception.InterruptException;
import com.liulishuo.okdownload.core.exception.RetryException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p207q1.C8879d;
import p218r1.AbstractC8999c;
import p229s1.C9124a;
import p229s1.C9126c;
import p240t1.InterfaceC9377a;
import p262v1.RunnableC9659f;
import p272w1.C9730d;

/* renamed from: x1.a */
/* loaded from: classes4.dex */
public class C9839a implements InterfaceC9841c, InterfaceC9842d {

    /* renamed from: a */
    public static final Pattern f17396a = Pattern.compile(".*\\d+ *- *(\\d+) */ *\\d+");

    /* renamed from: d */
    public static long m16481d(String str) {
        Matcher matcher = f17396a.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }

    @Override // p282x1.InterfaceC9841c
    /* renamed from: a */
    public InterfaceC9377a.a mo16482a(RunnableC9659f runnableC9659f) throws IOException {
        InterfaceC9377a.a aVarM16130o = runnableC9659f.m16130o();
        C9126c c9126cM16123h = runnableC9659f.m16123h();
        if (runnableC9659f.m16120e().m16085f()) {
            throw InterruptException.f4725a;
        }
        if (c9126cM16123h.m15469d() == 1 && !c9126cM16123h.m15478m()) {
            long jM16484c = m16484c(aVarM16130o);
            long jM15475j = c9126cM16123h.m15475j();
            if (jM16484c > 0 && jM16484c != jM15475j) {
                AbstractC8999c.m15125i("BreakpointInterceptor", "SingleBlock special check: the response instance-length[" + jM16484c + "] isn't equal to the instance length from trial-connection[" + jM15475j + "]");
                boolean z9 = c9126cM16123h.m15468c(0).m15459d() != 0;
                C9124a c9124a = new C9124a(0L, jM16484c);
                c9126cM16123h.m15481p();
                c9126cM16123h.m15466a(c9124a);
                if (z9) {
                    AbstractC8999c.m15142z("BreakpointInterceptor", "Discard breakpoint because of on this special case, we have to download from beginning");
                    throw new RetryException("Discard breakpoint because of on this special case, we have to download from beginning");
                }
                C8879d.m14905k().m14907b().m15910a().mo14901p(runnableC9659f.m16126k(), c9126cM16123h, ResumeFailedCause.CONTENT_LENGTH_CHANGED);
            }
        }
        try {
            if (runnableC9659f.m16122g().mo15499b(c9126cM16123h)) {
                return aVarM16130o;
            }
            throw new IOException("Update store failed!");
        } catch (Exception e10) {
            throw new IOException("Update store failed!", e10);
        }
    }

    @Override // p282x1.InterfaceC9842d
    /* renamed from: b */
    public long mo16483b(RunnableC9659f runnableC9659f) throws IOException {
        long jM16125j = runnableC9659f.m16125j();
        int iM16119d = runnableC9659f.m16119d();
        boolean z9 = jM16125j != -1;
        C9730d c9730dM16124i = runnableC9659f.m16124i();
        long j10 = 0;
        while (true) {
            try {
                long jM16129n = runnableC9659f.m16129n();
                if (jM16129n == -1) {
                    break;
                }
                j10 += jM16129n;
            } finally {
                runnableC9659f.m16118c();
                if (!runnableC9659f.m16120e().m16090k()) {
                    c9730dM16124i.m16275e(iM16119d);
                }
            }
        }
        if (z9) {
            c9730dM16124i.m16281k(iM16119d);
            if (j10 != jM16125j) {
                throw new IOException("Fetch-length isn't equal to the response content-length, " + j10 + "!= " + jM16125j);
            }
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m16484c(p240t1.InterfaceC9377a.a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Content-Range"
            java.lang.String r0 = r7.mo15675c(r0)
            boolean r1 = p218r1.AbstractC8999c.m15132p(r0)
            r2 = 0
            if (r1 != 0) goto L1a
            long r0 = m16481d(r0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1a
            r4 = 1
            long r0 = r0 + r4
            goto L1c
        L1a:
            r0 = -1
        L1c:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L30
            java.lang.String r2 = "Content-Length"
            java.lang.String r7 = r7.mo15675c(r2)
            boolean r2 = p218r1.AbstractC8999c.m15132p(r7)
            if (r2 != 0) goto L30
            long r0 = java.lang.Long.parseLong(r7)
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p282x1.C9839a.m16484c(t1.a$a):long");
    }
}
