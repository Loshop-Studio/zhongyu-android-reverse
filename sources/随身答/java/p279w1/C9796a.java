package p279w1;

import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import com.liulishuo.okdownload.core.exception.InterruptException;
import com.liulishuo.okdownload.core.exception.RetryException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p209p1.C9315d;
import p219q1.AbstractC9353c;
import p229r1.C9417a;
import p229r1.C9419c;
import p239s1.InterfaceC9465a;
import p259u1.RunnableC9664f;
import p269v1.C9751d;

/* renamed from: w1.a */
/* loaded from: classes4.dex */
public class C9796a implements InterfaceC9798c, InterfaceC9799d {

    /* renamed from: a */
    public static final Pattern f17424a = Pattern.compile(".*\\d+ *- *(\\d+) */ *\\d+");

    /* renamed from: d */
    public static long m16600d(String str) {
        Matcher matcher = f17424a.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }

    @Override // p279w1.InterfaceC9799d
    /* renamed from: a */
    public long mo16601a(RunnableC9664f runnableC9664f) throws IOException {
        long jM16086j = runnableC9664f.m16086j();
        int iM16080d = runnableC9664f.m16080d();
        boolean z9 = jM16086j != -1;
        C9751d c9751dM16085i = runnableC9664f.m16085i();
        long j9 = 0;
        while (true) {
            try {
                long jM16090n = runnableC9664f.m16090n();
                if (jM16090n == -1) {
                    break;
                }
                j9 += jM16090n;
            } finally {
                runnableC9664f.m16079c();
                if (!runnableC9664f.m16081e().m16051k()) {
                    c9751dM16085i.m16308e(iM16080d);
                }
            }
        }
        if (z9) {
            c9751dM16085i.m16314k(iM16080d);
            if (j9 != jM16086j) {
                throw new IOException("Fetch-length isn't equal to the response content-length, " + j9 + "!= " + jM16086j);
            }
        }
        return j9;
    }

    @Override // p279w1.InterfaceC9798c
    /* renamed from: b */
    public InterfaceC9465a.a mo16602b(RunnableC9664f runnableC9664f) throws IOException {
        InterfaceC9465a.a aVarM16091o = runnableC9664f.m16091o();
        C9419c c9419cM16084h = runnableC9664f.m16084h();
        if (runnableC9664f.m16081e().m16046f()) {
            throw InterruptException.f5333a;
        }
        if (c9419cM16084h.m15523d() == 1 && !c9419cM16084h.m15532m()) {
            long jM16603c = m16603c(aVarM16091o);
            long jM15529j = c9419cM16084h.m15529j();
            if (jM16603c > 0 && jM16603c != jM15529j) {
                AbstractC9353c.m15306i("BreakpointInterceptor", "SingleBlock special check: the response instance-length[" + jM16603c + "] isn't equal to the instance length from trial-connection[" + jM15529j + "]");
                boolean z9 = c9419cM16084h.m15522c(0).m15513d() != 0;
                C9417a c9417a = new C9417a(0L, jM16603c);
                c9419cM16084h.m15535p();
                c9419cM16084h.m15520a(c9417a);
                if (z9) {
                    AbstractC9353c.m15323z("BreakpointInterceptor", "Discard breakpoint because of on this special case, we have to download from beginning");
                    throw new RetryException("Discard breakpoint because of on this special case, we have to download from beginning");
                }
                C9315d.m15182k().m15184b().m15841a().mo15177p(runnableC9664f.m16087k(), c9419cM16084h, ResumeFailedCause.CONTENT_LENGTH_CHANGED);
            }
        }
        try {
            if (runnableC9664f.m16083g().mo15558k(c9419cM16084h)) {
                return aVarM16091o;
            }
            throw new IOException("Update store failed!");
        } catch (Exception e10) {
            throw new IOException("Update store failed!", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m16603c(p239s1.InterfaceC9465a.a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Content-Range"
            java.lang.String r0 = r7.mo15639c(r0)
            boolean r1 = p219q1.AbstractC9353c.m15313p(r0)
            r2 = 0
            if (r1 != 0) goto L1a
            long r0 = m16600d(r0)
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
            java.lang.String r7 = r7.mo15639c(r2)
            boolean r2 = p219q1.AbstractC9353c.m15313p(r7)
            if (r2 != 0) goto L30
            long r0 = java.lang.Long.parseLong(r7)
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p279w1.C9796a.m16603c(s1.a$a):long");
    }
}
