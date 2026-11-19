package p290x2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.umeng.analytics.pro.C6769d;
import com.umeng.commonsdk.config.C6780a;
import com.umeng.commonsdk.framework.AbstractC6782a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ssl.SSLSocketFactory;
import p092e2.C7840b;
import p176m2.AbstractC8959h;
import p176m2.C8957f;
import p186n2.AbstractC9089c;
import p196o2.C9160b;
import p210p2.AbstractC9318a;
import p260u2.AbstractC9666a;
import p260u2.AbstractC9667b;
import p260u2.AbstractC9668c;
import p260u2.C9670e;
import p270v2.AbstractC9753a;
import p270v2.AbstractC9754b;
import p270v2.AbstractC9755c;
import p280w2.C9802b;

/* renamed from: x2.g */
/* loaded from: classes4.dex */
public class C9872g {

    /* renamed from: e */
    public static boolean f17620e = false;

    /* renamed from: f */
    public static boolean f17621f = false;

    /* renamed from: g */
    public static boolean f17622g = false;

    /* renamed from: a */
    public String f17623a = "10.0.0.172";

    /* renamed from: b */
    public int f17624b = 80;

    /* renamed from: c */
    public Context f17625c;

    /* renamed from: d */
    public InterfaceC9871f f17626d;

    /* renamed from: x2.g$a */
    public class a implements InterfaceC9868c {
        public a() {
        }

        @Override // p290x2.InterfaceC9868c
        /* renamed from: b */
        public void mo12451b(String str, String str2) {
            if (C6780a.m6261f()) {
                C6780a.m6259b().m6263d(C9872g.this.f17625c, str2);
                AbstractC8959h.m14292b("MobclickRT", "--->>> apply imprint change and exit: key=" + str + "; value= " + str2);
                AbstractC9089c.m14596m(C9872g.this.f17625c, 32788, C9160b.m14737a(C9872g.this.f17625c).m14738b(), null);
            }
        }
    }

    /* renamed from: x2.g$b */
    public class b implements InterfaceC9869d {
        public b() {
        }

        @Override // p290x2.InterfaceC9869d
        /* renamed from: d */
        public boolean mo12452d(String str, String str2) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> onImprintValueChanged: key=" + str + "; value= " + str2);
            C6780a.m6259b().m6262c(C9872g.this.f17625c);
            AbstractC9089c.m14596m(C9872g.this.f17625c, 32784, C9160b.m14737a(C9872g.this.f17625c).m14738b(), null);
            C9802b.m16620u(C9872g.this.f17625c).m16624g("iscfg");
            return true;
        }
    }

    /* renamed from: x2.g$c */
    public class c implements InterfaceC9868c {
        public c() {
        }

        @Override // p290x2.InterfaceC9868c
        /* renamed from: b */
        public void mo12451b(String str, String str2) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> first onImprintValueChanged: key=" + str + "; value= " + str2);
            C6780a.m6259b().m6263d(C9872g.this.f17625c, str2);
            AbstractC9089c.m14596m(C9872g.this.f17625c, 32784, C9160b.m14737a(C9872g.this.f17625c).m14738b(), null);
            if (C6780a.m6260e("header_foreground_count")) {
                AbstractC8959h.m14293c("MobclickRT", "--->>> recv zcfg response: foregound count timer enabled.");
                if (!AbstractC9089c.m14588e()) {
                    AbstractC9089c.m14597n(C9872g.this.f17625c, 8213, C7840b.m12281f(C9872g.this.f17625c), null, 0L);
                }
            }
            if (C6780a.m6260e("header_first_resume")) {
                AbstractC8959h.m14293c("MobclickRT", "--->>> recv zcfg response: FirstResumeTrigger enabled.");
                C6769d.m6132b(C9872g.this.f17625c).m6149k(C9872g.this.f17625c);
            }
            C9802b.m16620u(C9872g.this.f17625c).m16637x("cfgfd", this);
        }
    }

    public C9872g(Context context) {
        this.f17625c = context;
    }

    /* renamed from: b */
    public final void m16864b() {
        String strM6274h = AbstractC6782a.m6274h(this.f17625c, "domain_p", "");
        String strM6274h2 = AbstractC6782a.m6274h(this.f17625c, "domain_s", "");
        if (!TextUtils.isEmpty(strM6274h)) {
            AbstractC9668c.f17075b = AbstractC9753a.m16336b(strM6274h);
        }
        if (!TextUtils.isEmpty(strM6274h2)) {
            AbstractC9668c.f17076c = AbstractC9753a.m16336b(strM6274h2);
        }
        AbstractC9666a.f17070b = new String[]{AbstractC9668c.f17075b, AbstractC9668c.f17076c};
    }

    /* renamed from: c */
    public void m16865c(InterfaceC9871f interfaceC9871f) {
        this.f17626d = interfaceC9871f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0185: IF  (r6 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:88:0x0191 (LINE:390), block:B:83:0x0185 */
    /* renamed from: d */
    public byte[] m16866d(byte[] bArr, String str) throws IOException {
        HttpsURLConnection httpsURLConnection;
        OutputStream outputStream;
        OutputStream outputStream2;
        boolean z9;
        try {
            try {
                InterfaceC9871f interfaceC9871f = this.f17626d;
                if (interfaceC9871f != null) {
                    interfaceC9871f.mo16845c();
                }
                if (m16871i()) {
                    httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f17623a, this.f17624b)));
                } else {
                    httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                }
                try {
                    z9 = true;
                    if (!f17620e) {
                        httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, new SecureRandom());
                        httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                        f17620e = true;
                    }
                    httpsURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                    httpsURLConnection.setRequestProperty("X-Umeng-Sdk", C9870e.m16853b(this.f17625c).m16856d());
                    httpsURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, C9870e.m16853b(this.f17625c).m16854a());
                    httpsURLConnection.setRequestProperty("Msg-Type", "envelope/json");
                    httpsURLConnection.setRequestProperty("X-Umeng-Pro-Ver", "1.0.0");
                    httpsURLConnection.setConnectTimeout(30000);
                    httpsURLConnection.setReadTimeout(30000);
                    httpsURLConnection.setRequestMethod("POST");
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setUseCaches(false);
                    outputStream = httpsURLConnection.getOutputStream();
                } catch (UnknownHostException unused) {
                    outputStream = null;
                } catch (SSLHandshakeException unused2) {
                    outputStream = null;
                } catch (Throwable unused3) {
                    outputStream = null;
                }
            } catch (Throwable th) {
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (Exception e10) {
                        AbstractC9318a.m15200b(this.f17625c, e10);
                    }
                }
                if (str == 0) {
                    throw th;
                }
                try {
                    str.getInputStream().close();
                } catch (IOException unused4) {
                }
                str.disconnect();
                throw th;
            }
        } catch (UnknownHostException unused5) {
            httpsURLConnection = null;
            outputStream = null;
        } catch (SSLHandshakeException unused6) {
            httpsURLConnection = null;
            outputStream = null;
        } catch (Throwable unused7) {
            httpsURLConnection = null;
            outputStream = null;
        }
        try {
            outputStream.write(bArr);
            outputStream.flush();
            httpsURLConnection.connect();
            InterfaceC9871f interfaceC9871f2 = this.f17626d;
            if (interfaceC9871f2 != null) {
                interfaceC9871f2.mo16843a();
            }
            int responseCode = httpsURLConnection.getResponseCode();
            String headerField = httpsURLConnection.getHeaderField(HttpHeaders.CONTENT_TYPE);
            if (TextUtils.isEmpty(headerField) || !headerField.equalsIgnoreCase("application/thrift")) {
                z9 = false;
            }
            boolean z10 = AbstractC9666a.f17069a;
            if (responseCode != 200 || !z9) {
                try {
                    outputStream.close();
                } catch (Exception e11) {
                    AbstractC9318a.m15200b(this.f17625c, e11);
                }
                try {
                    httpsURLConnection.getInputStream().close();
                } catch (IOException unused8) {
                }
                httpsURLConnection.disconnect();
                return null;
            }
            InputStream inputStream = httpsURLConnection.getInputStream();
            try {
                byte[] bArrM16396e = AbstractC9755c.m16396e(inputStream);
                try {
                    outputStream.close();
                } catch (Exception e12) {
                    AbstractC9318a.m15200b(this.f17625c, e12);
                }
                try {
                    httpsURLConnection.getInputStream().close();
                } catch (IOException unused9) {
                }
                httpsURLConnection.disconnect();
                return bArrM16396e;
            } finally {
                AbstractC9755c.m16397f(inputStream);
            }
        } catch (UnknownHostException unused10) {
            C8957f.m14280a("A_10200", 2, "\\|");
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e13) {
                    AbstractC9318a.m15200b(this.f17625c, e13);
                }
            }
            if (httpsURLConnection != null) {
                try {
                    httpsURLConnection.getInputStream().close();
                } catch (IOException unused11) {
                }
                httpsURLConnection.disconnect();
            }
            return null;
        } catch (SSLHandshakeException unused12) {
            C8957f.m14280a("A_10201", 2, "\\|");
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e14) {
                    AbstractC9318a.m15200b(this.f17625c, e14);
                }
            }
            if (httpsURLConnection != null) {
                try {
                    httpsURLConnection.getInputStream().close();
                } catch (IOException unused13) {
                }
                httpsURLConnection.disconnect();
            }
            return null;
        } catch (Throwable unused14) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e15) {
                    AbstractC9318a.m15200b(this.f17625c, e15);
                }
            }
            if (httpsURLConnection != null) {
                try {
                    httpsURLConnection.getInputStream().close();
                } catch (IOException unused15) {
                }
                httpsURLConnection.disconnect();
            }
            return null;
        }
    }

    /* renamed from: e */
    public byte[] m16867e(byte[] bArr, boolean z9, boolean z10, String str) throws IOException {
        if (AbstractC9667b.f17073a == 0) {
            m16864b();
        } else {
            AbstractC9668c.f17075b = AbstractC9668c.f17083j;
            AbstractC9668c.f17076c = AbstractC9668c.f17084k;
            m16868f();
        }
        byte[] bArrM16866d = null;
        int i9 = 0;
        while (true) {
            String[] strArr = AbstractC9666a.f17070b;
            if (i9 >= strArr.length) {
                return bArrM16866d;
            }
            String str2 = strArr[i9];
            if (z10) {
                m16870h();
            } else {
                m16869g();
            }
            bArrM16866d = m16866d(bArr, str2 + File.separator + str);
            if (bArrM16866d != null) {
                InterfaceC9871f interfaceC9871f = this.f17626d;
                if (interfaceC9871f != null) {
                    interfaceC9871f.mo16844b(z9);
                }
                return bArrM16866d;
            }
            InterfaceC9871f interfaceC9871f2 = this.f17626d;
            if (interfaceC9871f2 != null) {
                interfaceC9871f2.mo16846d();
            }
            i9++;
        }
    }

    /* renamed from: f */
    public final void m16868f() {
        String strM6274h = AbstractC6782a.m6274h(this.f17625c, "domain_p", "");
        String strM6274h2 = AbstractC6782a.m6274h(this.f17625c, "domain_s", "");
        if (!TextUtils.isEmpty(strM6274h)) {
            AbstractC9668c.f17075b = AbstractC9753a.m16336b(strM6274h);
        }
        if (!TextUtils.isEmpty(strM6274h2)) {
            AbstractC9668c.f17076c = AbstractC9753a.m16336b(strM6274h2);
        }
        String strM6274h3 = AbstractC6782a.m6274h(this.f17625c, "oversea_domain_p", "");
        String strM6274h4 = AbstractC6782a.m6274h(this.f17625c, "oversea_domain_s", "");
        if (!TextUtils.isEmpty(strM6274h3)) {
            AbstractC9668c.f17083j = AbstractC9753a.m16336b(strM6274h3);
        }
        if (!TextUtils.isEmpty(strM6274h4)) {
            AbstractC9668c.f17084k = AbstractC9753a.m16336b(strM6274h4);
        }
        AbstractC9666a.f17070b = new String[]{AbstractC9668c.f17083j, AbstractC9668c.f17084k};
        if (TextUtils.isEmpty(C9670e.f17091f)) {
            return;
        }
        if (C9670e.f17091f.startsWith("460") || C9670e.f17091f.startsWith("461")) {
            AbstractC9666a.f17070b = new String[]{AbstractC9668c.f17075b, AbstractC9668c.f17076c};
        }
    }

    /* renamed from: g */
    public final void m16869g() {
        if (f17622g) {
            return;
        }
        C9802b.m16620u(this.f17625c).m16635v("cfgfd", new a());
        f17622g = true;
    }

    /* renamed from: h */
    public final void m16870h() {
        if (f17621f) {
            return;
        }
        AbstractC8959h.m14292b("MobclickRT", "--->>> 注册零号报文 imprint 应答处理回调。");
        C9802b.m16620u(this.f17625c).m16636w("iscfg", new b());
        C9802b.m16620u(this.f17625c).m16635v("cfgfd", new c());
        f17621f = true;
    }

    /* renamed from: i */
    public final boolean m16871i() {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        if (this.f17625c.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f17625c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f17625c.getSystemService("connectivity");
            if (AbstractC9754b.m16367b(this.f17625c, "android.permission.ACCESS_NETWORK_STATE") && connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 1 && (extraInfo = activeNetworkInfo.getExtraInfo()) != null) {
                if (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap")) {
                    if (extraInfo.equals("uniwap")) {
                    }
                }
                return true;
            }
        } catch (Throwable th) {
            AbstractC9318a.m15200b(this.f17625c, th);
        }
        return false;
    }
}
