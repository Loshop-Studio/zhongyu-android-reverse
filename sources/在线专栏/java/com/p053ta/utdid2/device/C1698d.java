package com.p053ta.utdid2.device;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.p053ta.p054a.C1672a;
import com.p053ta.p054a.p057c.C1687e;
import com.p053ta.p054a.p057c.C1688f;
import com.p053ta.utdid2.p058a.p059a.C1689a;
import com.p053ta.utdid2.p058a.p059a.C1690b;
import com.p053ta.utdid2.p058a.p059a.C1691c;
import com.p053ta.utdid2.p058a.p059a.C1692d;
import com.p053ta.utdid2.p060b.p061a.C1694a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ta.utdid2.device.d */
/* loaded from: classes.dex */
public class C1698d {

    /* renamed from: a */
    private static C1698d f7473a;

    /* renamed from: a */
    private C1694a f7479a;

    /* renamed from: d */
    private String f7480d = null;
    private Context mContext;

    /* renamed from: b */
    private static Pattern f7475b = Pattern.compile("[^0-9a-zA-Z=/+]+");

    /* renamed from: a */
    private static final Object f7474a = new Object();

    /* renamed from: f */
    private static final String f7477f = ".UTSystemConfig" + File.separator + "Global";

    /* renamed from: e */
    private static int f7476e = 0;

    /* renamed from: g */
    private static String f7478g = "";

    private C1698d(Context context) {
        this.f7479a = null;
        this.mContext = context;
        C1672a.m5731a().m5735a(context);
        this.f7479a = new C1694a(context, f7477f, "Alvin2");
    }

    /* renamed from: a */
    public static C1698d m5802a(Context context) {
        if (context != null && f7473a == null) {
            synchronized (f7474a) {
                if (f7473a == null) {
                    f7473a = new C1698d(context);
                }
            }
        }
        return f7473a;
    }

    /* renamed from: b */
    private static String m5804b(byte[] bArr) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(C1687e.m5765b(new byte[]{69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, -96, -17, -99, 64, 23, -95, -126, -82, -64, 113, 116, -16, -103, 49, -30, 9, -39, 33, -80, -68, -78, -117, 53, 30, -122, 64, -104, 74, -49, 106, 85, -38, -93}), mac.getAlgorithm()));
        return C1689a.encodeToString(mac.doFinal(bArr), 2);
    }

    /* renamed from: c */
    private void m5805c(String str) {
        if (m5806c(str)) {
            f7476e = 6;
            C1688f.m5770a("UTUtdid", "utdid type:", 6);
            this.f7479a.m5786a(str, f7476e);
        }
    }

    /* renamed from: p */
    private String m5807p() {
        String strM5808q = m5808q();
        if (m5806c(strM5808q)) {
            if (TextUtils.isEmpty(strM5808q) || !strM5808q.endsWith("\n")) {
                this.f7480d = strM5808q;
            } else {
                this.f7480d = strM5808q.substring(0, strM5808q.length() - 1);
            }
            return this.f7480d;
        }
        try {
            byte[] bArrM5803a = m5803a();
            if (bArrM5803a == null) {
                return null;
            }
            String strEncodeToString = C1689a.encodeToString(bArrM5803a, 2);
            this.f7480d = strEncodeToString;
            f7476e = 6;
            m5805c(strEncodeToString);
            return this.f7480d;
        } catch (Exception e4) {
            C1688f.m5769a("", e4, new Object[0]);
            return null;
        }
    }

    /* renamed from: q */
    private String m5808q() {
        String strM5787k = this.f7479a.m5787k();
        if (!m5806c(strM5787k)) {
            C1688f.m5770a("UTUtdid", "read utdid is null");
            Log.d("UTUtdid", "read utdid is null");
            return null;
        }
        int iM5785a = this.f7479a.m5785a();
        if (iM5785a == 0) {
            f7476e = 1;
        } else {
            f7476e = iM5785a;
        }
        C1688f.m5770a("UTUtdid", "get utdid from sp. type", Integer.valueOf(f7476e));
        return strM5787k;
    }

    public static void setExtendFactor(String str) {
        f7478g = str;
    }

    static void setType(int i4) {
        f7476e = i4;
    }

    public synchronized String getValue() {
        String str = this.f7480d;
        if (str != null) {
            return str;
        }
        return m5807p();
    }

    /* renamed from: c */
    static boolean m5806c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.endsWith("\n")) {
            str = str.substring(0, str.length() - 1);
        }
        if (24 == str.length()) {
            return !f7475b.matcher(str).find();
        }
        return false;
    }

    /* renamed from: a */
    private byte[] m5803a() throws Exception {
        String str;
        C1688f.m5770a("UTUtdid", "generateUtdid");
        Log.d("UTUtdid", "generateUtdid");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNextInt = new Random().nextInt();
        byte[] bytes = C1690b.getBytes(iCurrentTimeMillis);
        byte[] bytes2 = C1690b.getBytes(iNextInt);
        byteArrayOutputStream.write(bytes, 0, 4);
        byteArrayOutputStream.write(bytes2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = f7478g + C1691c.m5777b(this.mContext);
        } catch (Exception unused) {
            str = f7478g + new Random().nextInt();
        }
        byteArrayOutputStream.write(C1690b.getBytes(C1692d.m5781a(str)), 0, 4);
        byteArrayOutputStream.write(C1690b.getBytes(C1692d.m5781a(m5804b(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }
}
