package p259u1;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.exception.DownloadSecurityException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p209p1.C9315d;
import p209p1.InterfaceC9312a;
import p219q1.AbstractC9353c;
import p229r1.C9419c;
import p239s1.InterfaceC9465a;

/* renamed from: u1.c */
/* loaded from: classes4.dex */
public class C9661c {

    /* renamed from: h */
    public static final Pattern f17016h = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");

    /* renamed from: i */
    public static final Pattern f17017i = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");

    /* renamed from: a */
    public final C6593a f17018a;

    /* renamed from: b */
    public final C9419c f17019b;

    /* renamed from: c */
    public boolean f17020c;

    /* renamed from: d */
    public long f17021d;

    /* renamed from: e */
    public String f17022e;

    /* renamed from: f */
    public String f17023f;

    /* renamed from: g */
    public int f17024g;

    public C9661c(C6593a c6593a, C9419c c9419c) {
        this.f17018a = c6593a;
        this.f17019b = c9419c;
    }

    /* renamed from: b */
    public static String m16025b(InterfaceC9465a.a aVar) {
        return aVar.mo15639c("Etag");
    }

    /* renamed from: c */
    public static String m16026c(InterfaceC9465a.a aVar) {
        return m16029m(aVar.mo15639c(HttpHeaders.CONTENT_DISPOSITION));
    }

    /* renamed from: d */
    public static long m16027d(InterfaceC9465a.a aVar) {
        long jM16030n = m16030n(aVar.mo15639c("Content-Range"));
        if (jM16030n != -1) {
            return jM16030n;
        }
        if (!m16031o(aVar.mo15639c("Transfer-Encoding"))) {
            AbstractC9353c.m15323z("ConnectTrial", "Transfer-Encoding isn't chunked but there is no valid instance length found either!");
        }
        return -1L;
    }

    /* renamed from: j */
    public static boolean m16028j(InterfaceC9465a.a aVar) {
        if (aVar.mo15642h() == 206) {
            return true;
        }
        return "bytes".equals(aVar.mo15639c("Accept-Ranges"));
    }

    /* renamed from: m */
    public static String m16029m(String str) throws DownloadSecurityException {
        String strGroup;
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = f17016h.matcher(str);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                Matcher matcher2 = f17017i.matcher(str);
                strGroup = matcher2.find() ? matcher2.group(1) : null;
            }
            if (strGroup != null && strGroup.contains("../")) {
                throw new DownloadSecurityException("The filename [" + strGroup + "] from the response is not allowable, because it contains '../', which can raise the directory traversal vulnerability");
            }
            return strGroup;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static long m16030n(String str) {
        if (str == null) {
            return -1L;
        }
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length >= 2) {
            try {
                return Long.parseLong(strArrSplit[1]);
            } catch (NumberFormatException unused) {
                AbstractC9353c.m15323z("ConnectTrial", "parse instance length failed with " + str);
            }
        }
        return -1L;
    }

    /* renamed from: o */
    public static boolean m16031o(String str) {
        return str != null && str.equals("chunked");
    }

    /* renamed from: a */
    public void m16032a() throws IOException {
        C9315d.m15182k().m15188f().m16103f(this.f17018a);
        C9315d.m15182k().m15188f().m16102e();
        InterfaceC9465a interfaceC9465aMo15643a = C9315d.m15182k().m15185c().mo15643a(this.f17018a.mo4592f());
        try {
            if (!AbstractC9353c.m15313p(this.f17019b.m15524e())) {
                interfaceC9465aMo15643a.mo15635b("If-Match", this.f17019b.m15524e());
            }
            interfaceC9465aMo15643a.mo15635b(HttpHeaders.RANGE, "bytes=0-0");
            Map mapM4599o = this.f17018a.m4599o();
            if (mapM4599o != null) {
                AbstractC9353c.m15300c(mapM4599o, interfaceC9465aMo15643a);
            }
            InterfaceC9312a interfaceC9312aM15841a = C9315d.m15182k().m15184b().m15841a();
            interfaceC9312aM15841a.mo15176m(this.f17018a, interfaceC9465aMo15643a.mo15637f());
            InterfaceC9465a.a aVarExecute = interfaceC9465aMo15643a.execute();
            this.f17018a.m4587I(aVarExecute.mo15638a());
            AbstractC9353c.m15306i("ConnectTrial", "task[" + this.f17018a.mo4589c() + "] redirect location: " + this.f17018a.m4606v());
            this.f17024g = aVarExecute.mo15642h();
            this.f17020c = m16028j(aVarExecute);
            this.f17021d = m16027d(aVarExecute);
            this.f17022e = m16025b(aVarExecute);
            this.f17023f = m16026c(aVarExecute);
            Map mapMo15641g = aVarExecute.mo15641g();
            if (mapMo15641g == null) {
                mapMo15641g = new HashMap();
            }
            interfaceC9312aM15841a.mo15179t(this.f17018a, this.f17024g, mapMo15641g);
            boolean zM16039l = m16039l(this.f17021d, aVarExecute);
            interfaceC9465aMo15643a.release();
            if (zM16039l) {
                m16040p();
            }
        } catch (Throwable th) {
            interfaceC9465aMo15643a.release();
            throw th;
        }
    }

    /* renamed from: e */
    public long m16033e() {
        return this.f17021d;
    }

    /* renamed from: f */
    public int m16034f() {
        return this.f17024g;
    }

    /* renamed from: g */
    public String m16035g() {
        return this.f17022e;
    }

    /* renamed from: h */
    public String m16036h() {
        return this.f17023f;
    }

    /* renamed from: i */
    public boolean m16037i() {
        return this.f17020c;
    }

    /* renamed from: k */
    public boolean m16038k() {
        return this.f17021d == -1;
    }

    /* renamed from: l */
    public boolean m16039l(long j9, InterfaceC9465a.a aVar) {
        String strMo15639c;
        if (j9 != -1) {
            return false;
        }
        String strMo15639c2 = aVar.mo15639c("Content-Range");
        return (strMo15639c2 == null || strMo15639c2.length() <= 0) && !m16031o(aVar.mo15639c("Transfer-Encoding")) && (strMo15639c = aVar.mo15639c(HttpHeaders.CONTENT_LENGTH)) != null && strMo15639c.length() > 0;
    }

    /* renamed from: p */
    public void m16040p() {
        InterfaceC9465a interfaceC9465aMo15643a = C9315d.m15182k().m15185c().mo15643a(this.f17018a.mo4592f());
        InterfaceC9312a interfaceC9312aM15841a = C9315d.m15182k().m15184b().m15841a();
        try {
            interfaceC9465aMo15643a.mo15636d("HEAD");
            Map mapM4599o = this.f17018a.m4599o();
            if (mapM4599o != null) {
                AbstractC9353c.m15300c(mapM4599o, interfaceC9465aMo15643a);
            }
            interfaceC9312aM15841a.mo15176m(this.f17018a, interfaceC9465aMo15643a.mo15637f());
            InterfaceC9465a.a aVarExecute = interfaceC9465aMo15643a.execute();
            interfaceC9312aM15841a.mo15179t(this.f17018a, aVarExecute.mo15642h(), aVarExecute.mo15641g());
            this.f17021d = AbstractC9353c.m15319v(aVarExecute.mo15639c(HttpHeaders.CONTENT_LENGTH));
            interfaceC9465aMo15643a.release();
        } catch (Throwable th) {
            interfaceC9465aMo15643a.release();
            throw th;
        }
    }
}
