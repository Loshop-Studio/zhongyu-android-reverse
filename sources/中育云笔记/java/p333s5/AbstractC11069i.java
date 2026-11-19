package p333s5;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.request.Request;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import p007a6.AbstractC0061a;
import p007a6.AbstractC0063c;
import p007a6.AbstractC0066f;
import p007a6.C0065e;
import p130e6.AbstractC9106a;

/* renamed from: s5.i */
/* loaded from: classes5.dex */
public abstract class AbstractC11069i {

    /* renamed from: a */
    public static final String f26706a = "l";

    /* renamed from: b */
    public static Map f26707b = new HashMap();

    /* renamed from: c */
    public static final Object f26708c = new Object();

    /* renamed from: a */
    public static String m24545a(String str) {
        String str2 = (String) f26707b.get(str);
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    /* renamed from: b */
    public static void m24546b(String str, Context context) throws Throwable {
        String strM24525e = AbstractC11064d.m24525e(context.getApplicationContext());
        if (TextUtils.isEmpty(strM24525e)) {
            return;
        }
        try {
            m24547c("s", str, strM24525e + "/files/s");
        } catch (IOException unused) {
            HMSLog.m8725e(f26706a, "save keyS IOException.");
        }
    }

    /* renamed from: c */
    public static void m24547c(String str, String str2, String str3) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        HMSLog.m8727i(f26706a, "save local secret key.");
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(str3);
            AbstractC11070j.m24563b(file);
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), Request.DEFAULT_CHARSET);
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(outputStreamWriter);
                try {
                    bufferedWriter2.write(str2);
                    bufferedWriter2.flush();
                    f26707b.put(str, str2);
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter2);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStreamWriter = null;
        }
    }

    /* renamed from: d */
    public static void m24548d(String str, String str2, String str3, String str4, String str5, Context context) throws Throwable {
        String strM24525e = AbstractC11064d.m24525e(context.getApplicationContext());
        if (TextUtils.isEmpty(strM24525e)) {
            return;
        }
        try {
            m24547c("m", str, strM24525e + "/files/math/m");
            m24547c("p", str2, strM24525e + "/files/panda/p");
            m24547c("d", str3, strM24525e + "/files/panda/d");
            m24547c("t", str4, strM24525e + "/files/math/t");
            m24547c("s", str5, strM24525e + "/files/s");
        } catch (IOException unused) {
            HMSLog.m8725e(f26706a, "save key IOException.");
        }
    }

    /* renamed from: e */
    public static byte[] m24549e(String str, String str2, String str3, String str4) {
        return Build.VERSION.SDK_INT >= 26 ? AbstractC0061a.m116g(str, str2, str3, str4, 32, true) : AbstractC0061a.m116g(str, str2, str3, str4, 32, false);
    }

    /* renamed from: f */
    public static String m24550f(Context context) {
        if (!m24561q()) {
            HMSLog.m8727i(f26706a, "work key is empty, execute init.");
            m24553i(context);
        }
        String strM134b = AbstractC0066f.m134b(m24558n(), m24551g());
        return AbstractC11071k.m24564a(strM134b) ? strM134b : m24557m(context);
    }

    /* renamed from: g */
    public static byte[] m24551g() {
        return m24549e(m24554j(), m24556l(), m24552h(), m24559o());
    }

    /* renamed from: h */
    public static String m24552h() {
        return m24545a("d");
    }

    /* renamed from: i */
    public static void m24553i(Context context) {
        synchronized (f26708c) {
            try {
                m24555k(context.getApplicationContext());
                if (m24561q()) {
                    HMSLog.m8727i(f26706a, "The local secret is already in separate file mode.");
                    return;
                }
                File file = new File(AbstractC11064d.m24525e(context.getApplicationContext()) + "/shared_prefs/LocalAvengers.xml");
                if (file.exists()) {
                    AbstractC9106a.m17899a(file);
                    HMSLog.m8727i(f26706a, "destroy C, delete file LocalAvengers.xml.");
                }
                byte[] bArrM124d = AbstractC0063c.m124d(32);
                byte[] bArrM124d2 = AbstractC0063c.m124d(32);
                byte[] bArrM124d3 = AbstractC0063c.m124d(32);
                byte[] bArrM124d4 = AbstractC0063c.m124d(32);
                String strM24520a = AbstractC11063c.m24520a(bArrM124d);
                String strM24520a2 = AbstractC11063c.m24520a(bArrM124d2);
                String strM24520a3 = AbstractC11063c.m24520a(bArrM124d3);
                String strM24520a4 = AbstractC11063c.m24520a(bArrM124d4);
                m24548d(strM24520a, strM24520a2, strM24520a3, strM24520a4, AbstractC0066f.m135c(AbstractC11063c.m24520a(AbstractC0063c.m124d(32)), m24549e(strM24520a, strM24520a2, strM24520a3, strM24520a4)), context);
                HMSLog.m8727i(f26706a, "generate D.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public static String m24554j() {
        return m24545a("m");
    }

    /* renamed from: k */
    public static void m24555k(Context context) throws Throwable {
        if (m24561q()) {
            HMSLog.m8727i(f26706a, "secretKeyCache not empty.");
            return;
        }
        f26707b.clear();
        String strM24525e = AbstractC11064d.m24525e(context);
        if (TextUtils.isEmpty(strM24525e)) {
            return;
        }
        String strM24562a = AbstractC11070j.m24562a(strM24525e + "/files/math/m");
        String strM24562a2 = AbstractC11070j.m24562a(strM24525e + "/files/panda/p");
        String strM24562a3 = AbstractC11070j.m24562a(strM24525e + "/files/panda/d");
        String strM24562a4 = AbstractC11070j.m24562a(strM24525e + "/files/math/t");
        String strM24562a5 = AbstractC11070j.m24562a(strM24525e + "/files/s");
        if (AbstractC11071k.m24564a(strM24562a, strM24562a2, strM24562a3, strM24562a4, strM24562a5)) {
            f26707b.put("m", strM24562a);
            f26707b.put("p", strM24562a2);
            f26707b.put("d", strM24562a3);
            f26707b.put("t", strM24562a4);
            f26707b.put("s", strM24562a5);
        }
    }

    /* renamed from: l */
    public static String m24556l() {
        return m24545a("p");
    }

    /* renamed from: m */
    public static synchronized String m24557m(Context context) {
        String strM134b = AbstractC0066f.m134b(m24558n(), m24551g());
        if (AbstractC11071k.m24564a(strM134b)) {
            HMSLog.m8727i(f26706a, "keyS has been upgraded, no require operate again.");
            return strM134b;
        }
        String strM133a = AbstractC0066f.m133a(m24558n(), m24560p());
        if (AbstractC11071k.m24564a(strM133a)) {
            HMSLog.m8727i(f26706a, "keyS is encrypt by RootKeyUtil, upgrade encrypt mode.");
            m24546b(AbstractC0066f.m135c(strM133a, m24551g()), context);
            return strM133a;
        }
        String strM134b2 = AbstractC0066f.m134b(m24558n(), AbstractC0061a.m116g(m24554j(), m24556l(), m24552h(), m24559o(), 32, false));
        if (!AbstractC11071k.m24564a(strM134b2)) {
            HMSLog.m8725e(f26706a, "all mode unable to decrypt root key.");
            return "";
        }
        HMSLog.m8727i(f26706a, "keyS is encrypt by ExportRootKey with sha1, upgrade encrypt mode to sha256.");
        m24546b(AbstractC0066f.m135c(strM134b2, m24551g()), context);
        return strM134b2;
    }

    /* renamed from: n */
    public static String m24558n() {
        return m24545a("s");
    }

    /* renamed from: o */
    public static String m24559o() {
        return m24545a("t");
    }

    /* renamed from: p */
    public static C0065e m24560p() {
        return C0065e.m129d(m24554j(), m24556l(), m24552h(), m24559o());
    }

    /* renamed from: q */
    public static boolean m24561q() {
        return !TextUtils.isEmpty(m24558n());
    }
}
