package p118i2;

import android.text.TextUtils;
import p129j2.AbstractC7784d;
import p129j2.AbstractC7788h;
import p140k2.AbstractC7871b;

/* renamed from: i2.a */
/* loaded from: classes4.dex */
public class C7653a {

    /* renamed from: a */
    public int f12905a = -1;

    /* renamed from: b */
    public long f12906b = 0;

    /* renamed from: c */
    public String f12907c = "";

    /* renamed from: d */
    public byte[] f12908d = null;

    /* renamed from: e */
    public long f12909e = 0;

    /* renamed from: a */
    public static boolean m12708a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return false;
            }
            AbstractC7788h.m13181g("", "result", str, "signature", str2);
            if (str2.equals(AbstractC7871b.m13397f(AbstractC7784d.m13165e(str).getBytes(), 2))) {
                AbstractC7788h.m13179e("", "signature is ok");
                return true;
            }
            AbstractC7788h.m13179e("", "signature is error");
            return false;
        } catch (Exception e10) {
            AbstractC7788h.m13179e("", e10);
            return false;
        }
    }
}
