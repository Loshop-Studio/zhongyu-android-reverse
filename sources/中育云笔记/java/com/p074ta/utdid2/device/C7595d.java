package com.p074ta.utdid2.device;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p074ta.p075a.C7569a;
import com.p074ta.p075a.p078c.C7584e;
import com.p074ta.p075a.p078c.C7585f;
import com.p074ta.utdid2.p079a.p080a.C7586a;
import com.p074ta.utdid2.p079a.p080a.C7587b;
import com.p074ta.utdid2.p079a.p080a.C7588c;
import com.p074ta.utdid2.p079a.p080a.C7589d;
import com.p074ta.utdid2.p081b.p082a.C7591a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;

/* renamed from: com.ta.utdid2.device.d */
/* loaded from: classes5.dex */
public class C7595d {

    /* renamed from: a */
    private static C7595d f12871a;

    /* renamed from: a */
    private C7591a f12877a;

    /* renamed from: d */
    private String f12878d = null;
    private Context mContext;

    /* renamed from: b */
    private static Pattern f12873b = Pattern.compile("[^0-9a-zA-Z=/+]+");

    /* renamed from: a */
    private static final Object f12872a = new Object();

    /* renamed from: f */
    private static final String f12875f = ".UTSystemConfig" + File.separator + "Global";

    /* renamed from: e */
    private static int f12874e = 0;

    /* renamed from: g */
    private static String f12876g = "";

    private C7595d(Context context) {
        this.f12877a = null;
        this.mContext = context;
        C7569a.m9757a().m9761a(context);
        this.f12877a = new C7591a(context, f12875f, "Alvin2");
    }

    /* renamed from: a */
    public static C7595d m9828a(Context context) {
        if (context != null && f12871a == null) {
            synchronized (f12872a) {
                try {
                    if (f12871a == null) {
                        f12871a = new C7595d(context);
                    }
                } finally {
                }
            }
        }
        return f12871a;
    }

    /* renamed from: b */
    private static String m9830b(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArr2 = {69, 114, 116, -33, 125, -54, -31, 86, -11, MqttWireMessage.MESSAGE_TYPE_UNSUBACK, -78, -96, -17, -99, 64, 23, -95, -126, -82, -64, 113, 116, -16, -103, 49, -30, 9, -39, 33, -80, -68, -78, -117, 53, 30, -122, 64, -104, 74, -49, 106, 85, -38, -93};
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(C7584e.m9791b(bArr2), mac.getAlgorithm()));
        return C7586a.encodeToString(mac.doFinal(bArr), 2);
    }

    /* renamed from: c */
    private void m9831c(String str) {
        if (m9832c(str)) {
            f12874e = 6;
            C7585f.m9796a("UTUtdid", "utdid type:", 6);
            this.f12877a.m9812a(str, f12874e);
        }
    }

    /* renamed from: p */
    private String m9833p() {
        String strM9834q = m9834q();
        if (m9832c(strM9834q)) {
            if (TextUtils.isEmpty(strM9834q) || !strM9834q.endsWith(SignParameters.NEW_LINE)) {
                this.f12878d = strM9834q;
            } else {
                this.f12878d = strM9834q.substring(0, strM9834q.length() - 1);
            }
            return this.f12878d;
        }
        try {
            byte[] bArrM9829a = m9829a();
            if (bArrM9829a == null) {
                return null;
            }
            String strEncodeToString = C7586a.encodeToString(bArrM9829a, 2);
            this.f12878d = strEncodeToString;
            f12874e = 6;
            m9831c(strEncodeToString);
            return this.f12878d;
        } catch (Exception e10) {
            C7585f.m9795a("", e10, new Object[0]);
            return null;
        }
    }

    /* renamed from: q */
    private String m9834q() {
        String strM9813k = this.f12877a.m9813k();
        if (!m9832c(strM9813k)) {
            C7585f.m9796a("UTUtdid", "read utdid is null");
            return null;
        }
        int iM9811a = this.f12877a.m9811a();
        if (iM9811a == 0) {
            f12874e = 1;
        } else {
            f12874e = iM9811a;
        }
        C7585f.m9796a("UTUtdid", "get utdid from sp. type", Integer.valueOf(f12874e));
        return strM9813k;
    }

    public static void setExtendFactor(String str) {
        f12876g = str;
    }

    public static void setType(int i10) {
        f12874e = i10;
    }

    public synchronized String getValue() {
        String str = this.f12878d;
        if (str != null) {
            return str;
        }
        return m9833p();
    }

    /* renamed from: c */
    public static boolean m9832c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.endsWith(SignParameters.NEW_LINE)) {
            str = str.substring(0, str.length() - 1);
        }
        if (24 == str.length()) {
            return !f12873b.matcher(str).find();
        }
        return false;
    }

    /* renamed from: a */
    private byte[] m9829a() throws IOException {
        String str;
        C7585f.m9796a("UTUtdid", "generateUtdid");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNextInt = new Random().nextInt();
        byte[] bytes = C7587b.getBytes(iCurrentTimeMillis);
        byte[] bytes2 = C7587b.getBytes(iNextInt);
        byteArrayOutputStream.write(bytes, 0, 4);
        byteArrayOutputStream.write(bytes2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = f12876g + C7588c.m9803b(this.mContext);
        } catch (Exception unused) {
            str = f12876g + new Random().nextInt();
        }
        byteArrayOutputStream.write(C7587b.getBytes(C7589d.m9807a(str)), 0, 4);
        byteArrayOutputStream.write(C7587b.getBytes(C7589d.m9807a(m9830b(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }
}
