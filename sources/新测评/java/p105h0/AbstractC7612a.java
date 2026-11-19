package p105h0;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import p083f0.C7422a;
import p127j0.AbstractC7771b;
import p127j0.AbstractC7773d;
import p127j0.AbstractC7774e;
import p175n2.AbstractC8619a;

/* renamed from: h0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7612a {

    /* renamed from: a */
    public static boolean f12769a = false;

    /* renamed from: b */
    public static String f12770b;

    /* renamed from: c */
    public static long f12771c;

    /* renamed from: a */
    public static String m12532a(C7422a c7422a, String str, Context context) {
        String str2;
        String str3 = c7422a.f12121e;
        String str4 = str3 == null ? "" : str3;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "Unknown";
        }
        String str5 = str2;
        String str6 = c7422a.f12122f;
        String str7 = String.format("ak=%s&av=%s&avsys=%s&c=%s&d=%s&sv=%s", str, str4, str5, str6 == null ? "" : str6, AbstractC8619a.m14191a(context), "6.5.1.3");
        AbstractC7774e.m13121d("send url :" + str7);
        return str7;
    }

    /* renamed from: b */
    public static byte[] m12533b(C7422a c7422a, String str, Context context, Map map) {
        return m12534c(c7422a, str, context, map, 1);
    }

    /* renamed from: c */
    public static byte[] m12534c(C7422a c7422a, String str, Context context, Map map, int i10) throws Throwable {
        byte[] bArrM13116a = AbstractC7773d.m13116a(m12535d(c7422a, str, context, map));
        if (bArrM13116a == null || bArrM13116a.length >= 16777216) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(AbstractC7771b.m13101d(bArrM13116a.length));
        byteArrayOutputStream.write(i10);
        byte b10 = (byte) 9;
        if (f12769a) {
            b10 = (byte) (b10 | 32);
        }
        byteArrayOutputStream.write(b10);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(bArrM13116a);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e10) {
            AbstractC7774e.m13119b(e10.toString());
            return byteArray;
        }
    }

    /* renamed from: d */
    public static byte[] m12535d(C7422a c7422a, String str, Context context, Map map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String strM12532a = m12532a(c7422a, str, context);
        if (strM12532a == null || strM12532a.length() <= 0) {
            byteArrayOutputStream.write(AbstractC7771b.m13100c(0));
        } else {
            byteArrayOutputStream.write(AbstractC7771b.m13100c(strM12532a.getBytes().length));
            byteArrayOutputStream.write(strM12532a.getBytes());
        }
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                byteArrayOutputStream.write(AbstractC7771b.m13102e(Integer.valueOf(str2).intValue()));
                String str3 = (String) map.get(str2);
                if (str3 != null) {
                    byteArrayOutputStream.write(AbstractC7771b.m13102e(str3.getBytes().length));
                    byteArrayOutputStream.write(str3.getBytes());
                } else {
                    byteArrayOutputStream.write(AbstractC7771b.m13102e(0));
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e10) {
            AbstractC7774e.m13119b(e10.toString());
            return byteArray;
        }
    }

    /* renamed from: e */
    public static int m12536e(byte[] bArr) throws Throwable {
        int iM13099b = -1;
        if (bArr == null || bArr.length < 12) {
            AbstractC7774e.m13119b("recv errCode UNKNOWN_ERROR");
        } else {
            f12771c = bArr.length;
            if (AbstractC7771b.m13099b(bArr, 1, 3) + 8 != bArr.length) {
                AbstractC7774e.m13119b("recv len error");
            } else {
                boolean z9 = 1 == (bArr[5] & 1);
                iM13099b = AbstractC7771b.m13099b(bArr, 8, 4);
                int length = bArr.length - 12 >= 0 ? bArr.length - 12 : 0;
                if (length <= 0) {
                    f12770b = null;
                } else if (z9) {
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 12, bArr2, 0, length);
                    byte[] bArrM13117b = AbstractC7773d.m13117b(bArr2);
                    f12770b = new String(bArrM13117b, 0, bArrM13117b.length);
                } else {
                    f12770b = new String(bArr, 12, length);
                }
            }
        }
        AbstractC7774e.m13118a("errCode:" + iM13099b);
        return iM13099b;
    }
}
