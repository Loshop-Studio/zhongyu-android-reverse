package p262v1;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.exception.DownloadSecurityException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p207q1.C8879d;
import p207q1.InterfaceC8876a;
import p218r1.AbstractC8999c;
import p229s1.C9126c;
import p240t1.InterfaceC9377a;

/* renamed from: v1.c */
/* loaded from: classes4.dex */
public class C9656c {

    /* renamed from: h */
    public static final Pattern f16864h = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");

    /* renamed from: i */
    public static final Pattern f16865i = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");

    /* renamed from: a */
    public final C6327a f16866a;

    /* renamed from: b */
    public final C9126c f16867b;

    /* renamed from: c */
    public boolean f16868c;

    /* renamed from: d */
    public long f16869d;

    /* renamed from: e */
    public String f16870e;

    /* renamed from: f */
    public String f16871f;

    /* renamed from: g */
    public int f16872g;

    public C9656c(C6327a c6327a, C9126c c9126c) {
        this.f16866a = c6327a;
        this.f16867b = c9126c;
    }

    /* renamed from: b */
    public static String m16064b(InterfaceC9377a.a aVar) {
        return aVar.mo15675c("Etag");
    }

    /* renamed from: c */
    public static String m16065c(InterfaceC9377a.a aVar) {
        return m16068m(aVar.mo15675c(HttpHeaders.CONTENT_DISPOSITION));
    }

    /* renamed from: d */
    public static long m16066d(InterfaceC9377a.a aVar) {
        long jM16069n = m16069n(aVar.mo15675c("Content-Range"));
        if (jM16069n != -1) {
            return jM16069n;
        }
        if (!m16070o(aVar.mo15675c("Transfer-Encoding"))) {
            AbstractC8999c.m15142z("ConnectTrial", "Transfer-Encoding isn't chunked but there is no valid instance length found either!");
        }
        return -1L;
    }

    /* renamed from: j */
    public static boolean m16067j(InterfaceC9377a.a aVar) {
        if (aVar.mo15678h() == 206) {
            return true;
        }
        return "bytes".equals(aVar.mo15675c("Accept-Ranges"));
    }

    /* renamed from: m */
    public static String m16068m(String str) throws DownloadSecurityException {
        String strGroup;
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = f16864h.matcher(str);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                Matcher matcher2 = f16865i.matcher(str);
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
    public static long m16069n(String str) {
        if (str == null) {
            return -1L;
        }
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length >= 2) {
            try {
                return Long.parseLong(strArrSplit[1]);
            } catch (NumberFormatException unused) {
                AbstractC8999c.m15142z("ConnectTrial", "parse instance length failed with " + str);
            }
        }
        return -1L;
    }

    /* renamed from: o */
    public static boolean m16070o(String str) {
        return str != null && str.equals("chunked");
    }

    /* renamed from: a */
    public void m16071a() throws IOException {
        C8879d.m14905k().m14911f().m16142f(this.f16866a);
        C8879d.m14905k().m14911f().m16141e();
        InterfaceC9377a interfaceC9377aMo15679a = C8879d.m14905k().m14908c().mo15679a(this.f16866a.mo4388f());
        try {
            if (!AbstractC8999c.m15132p(this.f16867b.m15470e())) {
                interfaceC9377aMo15679a.mo15671b("If-Match", this.f16867b.m15470e());
            }
            interfaceC9377aMo15679a.mo15671b(HttpHeaders.RANGE, "bytes=0-0");
            Map mapM4395o = this.f16866a.m4395o();
            if (mapM4395o != null) {
                AbstractC8999c.m15119c(mapM4395o, interfaceC9377aMo15679a);
            }
            InterfaceC8876a interfaceC8876aM15910a = C8879d.m14905k().m14907b().m15910a();
            interfaceC8876aM15910a.mo14900o(this.f16866a, interfaceC9377aMo15679a.mo15673f());
            InterfaceC9377a.a aVarExecute = interfaceC9377aMo15679a.execute();
            this.f16866a.m4383I(aVarExecute.mo15674a());
            AbstractC8999c.m15125i("ConnectTrial", "task[" + this.f16866a.mo4385c() + "] redirect location: " + this.f16866a.m4402v());
            this.f16872g = aVarExecute.mo15678h();
            this.f16868c = m16067j(aVarExecute);
            this.f16869d = m16066d(aVarExecute);
            this.f16870e = m16064b(aVarExecute);
            this.f16871f = m16065c(aVarExecute);
            Map mapMo15677g = aVarExecute.mo15677g();
            if (mapMo15677g == null) {
                mapMo15677g = new HashMap();
            }
            interfaceC8876aM15910a.mo14902s(this.f16866a, this.f16872g, mapMo15677g);
            boolean zM16078l = m16078l(this.f16869d, aVarExecute);
            interfaceC9377aMo15679a.release();
            if (zM16078l) {
                m16079p();
            }
        } catch (Throwable th) {
            interfaceC9377aMo15679a.release();
            throw th;
        }
    }

    /* renamed from: e */
    public long m16072e() {
        return this.f16869d;
    }

    /* renamed from: f */
    public int m16073f() {
        return this.f16872g;
    }

    /* renamed from: g */
    public String m16074g() {
        return this.f16870e;
    }

    /* renamed from: h */
    public String m16075h() {
        return this.f16871f;
    }

    /* renamed from: i */
    public boolean m16076i() {
        return this.f16868c;
    }

    /* renamed from: k */
    public boolean m16077k() {
        return this.f16869d == -1;
    }

    /* renamed from: l */
    public boolean m16078l(long j10, InterfaceC9377a.a aVar) {
        String strMo15675c;
        if (j10 != -1) {
            return false;
        }
        String strMo15675c2 = aVar.mo15675c("Content-Range");
        return (strMo15675c2 == null || strMo15675c2.length() <= 0) && !m16070o(aVar.mo15675c("Transfer-Encoding")) && (strMo15675c = aVar.mo15675c(HttpHeaders.CONTENT_LENGTH)) != null && strMo15675c.length() > 0;
    }

    /* renamed from: p */
    public void m16079p() {
        InterfaceC9377a interfaceC9377aMo15679a = C8879d.m14905k().m14908c().mo15679a(this.f16866a.mo4388f());
        InterfaceC8876a interfaceC8876aM15910a = C8879d.m14905k().m14907b().m15910a();
        try {
            interfaceC9377aMo15679a.mo15672d("HEAD");
            Map mapM4395o = this.f16866a.m4395o();
            if (mapM4395o != null) {
                AbstractC8999c.m15119c(mapM4395o, interfaceC9377aMo15679a);
            }
            interfaceC8876aM15910a.mo14900o(this.f16866a, interfaceC9377aMo15679a.mo15673f());
            InterfaceC9377a.a aVarExecute = interfaceC9377aMo15679a.execute();
            interfaceC8876aM15910a.mo14902s(this.f16866a, aVarExecute.mo15678h(), aVarExecute.mo15677g());
            this.f16869d = AbstractC8999c.m15138v(aVarExecute.mo15675c(HttpHeaders.CONTENT_LENGTH));
            interfaceC9377aMo15679a.release();
        } catch (Throwable th) {
            interfaceC9377aMo15679a.release();
            throw th;
        }
    }
}
