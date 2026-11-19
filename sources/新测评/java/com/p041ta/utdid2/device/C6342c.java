package com.p041ta.utdid2.device;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p074e2.C7329a;
import p129j2.AbstractC7785e;
import p129j2.AbstractC7787g;
import p129j2.AbstractC7788h;
import p140k2.AbstractC7871b;
import p140k2.AbstractC7873d;
import p140k2.AbstractC7874e;
import p140k2.AbstractC7875f;
import p153l2.C8492c;

/* renamed from: com.ta.utdid2.device.c */
/* loaded from: classes4.dex */
public class C6342c {

    /* renamed from: a */
    private static C6342c f4827a;

    /* renamed from: a */
    private C8492c f4833a;

    /* renamed from: e */
    private String f4834e = null;
    private Context mContext;

    /* renamed from: b */
    private static Pattern f4828b = Pattern.compile("[^0-9a-zA-Z=/+]+");

    /* renamed from: d */
    private static final Object f4829d = new Object();

    /* renamed from: i */
    private static final String f4831i = ".UTSystemConfig" + File.separator + "Global";

    /* renamed from: f */
    private static int f4830f = 0;

    /* renamed from: j */
    private static String f4832j = "";

    /* renamed from: com.ta.utdid2.device.c$a */
    public interface a {
        /* renamed from: i */
        void mo4501i();
    }

    private C6342c(Context context) {
        this.f4833a = null;
        this.mContext = context;
        C7329a.m11708b().m11712e(context);
        this.f4833a = new C8492c(context, f4831i, "Alvin2");
    }

    /* renamed from: b */
    private static String m4508b(byte[] bArr) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(AbstractC7787g.m13174c(new byte[]{69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, -96, -17, -99, 64, 23, -95, -126, -82, -64, 113, 116, -16, -103, 49, -30, 9, -39, 33, -80, -68, -78, -117, 53, 30, -122, 64, -104, 74, -49, 106, 85, -38, -93}), mac.getAlgorithm()));
        return AbstractC7871b.m13397f(mac.doFinal(bArr), 2);
    }

    /* renamed from: c */
    public static boolean m4509c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.endsWith(SignParameters.NEW_LINE)) {
            str = str.substring(0, str.length() - 1);
        }
        if (24 == str.length()) {
            return !f4828b.matcher(str).find();
        }
        return false;
    }

    /* renamed from: f */
    private void m4511f(final String str) {
        if (m4509c(str)) {
            f4830f = 6;
            AbstractC7788h.m13179e("UTUtdid", "utdid type:", 6);
            this.f4833a.m13930d(str, f4830f);
            m4506a(new a() { // from class: com.ta.utdid2.device.c.1
                @Override // com.p041ta.utdid2.device.C6342c.a
                /* renamed from: i */
                public void mo4501i() {
                    C6342c.this.m4513h(str);
                    C6342c.this.f4833a.m13932f();
                }
            });
        }
    }

    /* renamed from: g */
    private void m4512g(final String str) {
        if (m4509c(str)) {
            m4506a(new a() { // from class: com.ta.utdid2.device.c.2
                @Override // com.p041ta.utdid2.device.C6342c.a
                /* renamed from: i */
                public void mo4501i() {
                    if (str.equals(C6342c.this.f4833a.m13934h())) {
                        return;
                    }
                    C6342c.this.f4833a.m13933g(str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m4513h(String str) {
        if (m4509c(str)) {
            try {
                Settings.System.putString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk", str);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: s */
    private String m4514s() {
        String strM4515t = m4515t();
        if (m4509c(strM4515t)) {
            if (TextUtils.isEmpty(strM4515t) || !strM4515t.endsWith(SignParameters.NEW_LINE)) {
                this.f4834e = strM4515t;
            } else {
                this.f4834e = strM4515t.substring(0, strM4515t.length() - 1);
            }
            return this.f4834e;
        }
        try {
            byte[] bArrM4510c = m4510c();
            if (bArrM4510c == null) {
                return null;
            }
            String strM13397f = AbstractC7871b.m13397f(bArrM4510c, 2);
            this.f4834e = strM13397f;
            f4830f = 6;
            m4511f(strM13397f);
            return this.f4834e;
        } catch (Exception e10) {
            AbstractC7788h.m13178d("", e10, new Object[0]);
            return null;
        }
    }

    public static void setExtendFactor(String str) {
        f4832j = str;
    }

    public static void setType(int i10) {
        f4830f = i10;
    }

    /* renamed from: t */
    private String m4515t() {
        String strM4516u = m4516u();
        if (m4509c(strM4516u)) {
            f4830f = 2;
            AbstractC7788h.m13179e("UTUtdid", "utdid type", 2);
            m4512g(strM4516u);
            return strM4516u;
        }
        String strM4517v = m4517v();
        if (m4509c(strM4517v)) {
            f4830f = 2;
            AbstractC7788h.m13179e("UTUtdid", "utdid type", 2);
            m4512g(strM4517v);
            return strM4517v;
        }
        final String strM13934h = this.f4833a.m13934h();
        if (m4509c(strM13934h)) {
            int iM13927a = this.f4833a.m13927a();
            if (iM13927a == 0) {
                f4830f = 1;
            } else {
                f4830f = iM13927a;
            }
            AbstractC7788h.m13179e("UTUtdid", "get utdid from sp. type", Integer.valueOf(f4830f));
            m4506a(new a() { // from class: com.ta.utdid2.device.c.3
                @Override // com.p041ta.utdid2.device.C6342c.a
                /* renamed from: i */
                public void mo4501i() {
                    C6342c.this.m4513h(strM13934h);
                    if (C6342c.m4509c(C6342c.this.f4833a.m13935i())) {
                        return;
                    }
                    C6342c.this.f4833a.m13932f();
                }
            });
            return strM13934h;
        }
        final String strM13935i = this.f4833a.m13935i();
        if (!m4509c(strM13935i)) {
            AbstractC7788h.m13179e("UTUtdid", "read utdid is null");
            return null;
        }
        f4830f = 3;
        AbstractC7788h.m13179e("UTUtdid", "utdid type", 3);
        this.f4833a.m13931e(f4830f);
        m4506a(new a() { // from class: com.ta.utdid2.device.c.4
            @Override // com.p041ta.utdid2.device.C6342c.a
            /* renamed from: i */
            public void mo4501i() {
                C6342c.this.m4513h(strM13935i);
            }
        });
        return strM13935i;
    }

    /* renamed from: u */
    private String m4516u() {
        try {
            return Settings.System.getString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: v */
    private String m4517v() {
        String string;
        try {
            string = Settings.System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
        } catch (Exception unused) {
            string = null;
        }
        try {
            if (AbstractC7875f.m13409c(string)) {
                return "";
            }
            C6344e c6344e = new C6344e();
            String strM4520h = c6344e.m4520h(string);
            if (m4509c(strM4520h)) {
                AbstractC7788h.m13179e("UTUtdid", "OldSettings_1", strM4520h);
                m4513h(strM4520h);
                return strM4520h;
            }
            String strM4519g = c6344e.m4519g(string);
            if (m4509c(strM4519g)) {
                AbstractC7788h.m13179e("UTUtdid", "OldSettings_2", strM4519g);
                m4513h(strM4519g);
                return strM4519g;
            }
            String strM4518g = new C6343d().m4518g(string);
            if (!m4509c(strM4518g)) {
                return "";
            }
            AbstractC7788h.m13179e("UTUtdid", "OldSettings_3", strM4518g);
            m4513h(strM4518g);
            return strM4518g;
        } catch (Throwable th) {
            AbstractC7788h.m13180f("UTUtdid", th, new Object[0]);
            return "";
        }
    }

    public synchronized String getValue() {
        String str = this.f4834e;
        if (str != null) {
            return str;
        }
        return m4514s();
    }

    /* renamed from: a */
    public static C6342c m4504a(Context context) {
        if (context != null && f4827a == null) {
            synchronized (f4829d) {
                try {
                    if (f4827a == null) {
                        f4827a = new C6342c(context);
                    }
                } finally {
                }
            }
        }
        return f4827a;
    }

    /* renamed from: c */
    private byte[] m4510c() throws Exception {
        String str;
        AbstractC7788h.m13179e("UTUtdid", "generateUtdid");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNextInt = new Random().nextInt();
        byte[] bArrM13401a = AbstractC7873d.m13401a(iCurrentTimeMillis);
        byte[] bArrM13401a2 = AbstractC7873d.m13401a(iNextInt);
        byteArrayOutputStream.write(bArrM13401a, 0, 4);
        byteArrayOutputStream.write(bArrM13401a2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = f4832j + AbstractC7874e.m13402a(this.mContext);
        } catch (Exception unused) {
            str = f4832j + new Random().nextInt();
        }
        byteArrayOutputStream.write(AbstractC7873d.m13401a(AbstractC7875f.m13407a(str)), 0, 4);
        byteArrayOutputStream.write(AbstractC7873d.m13401a(AbstractC7875f.m13407a(m4508b(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static void m4506a(final a aVar) {
        new Thread(new Runnable() { // from class: com.ta.utdid2.device.c.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!AbstractC7785e.m13167a()) {
                        AbstractC7785e.m13170d();
                    } else {
                        aVar.mo4501i();
                        AbstractC7785e.m13170d();
                    }
                } catch (Throwable unused) {
                    AbstractC7785e.m13170d();
                }
            }
        }).start();
    }
}
