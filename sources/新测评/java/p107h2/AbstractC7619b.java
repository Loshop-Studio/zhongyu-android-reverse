package p107h2;

import android.text.TextUtils;
import p129j2.AbstractC7787g;
import p129j2.AbstractC7788h;
import p140k2.AbstractC7871b;

/* renamed from: h2.b */
/* loaded from: classes4.dex */
public abstract class AbstractC7619b {
    /* renamed from: a */
    public static String m12544a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new String(AbstractC7871b.m13395d(AbstractC7787g.m13174c(str.getBytes()), 2), "UTF-8");
        } catch (Exception e10) {
            AbstractC7788h.m13178d("", e10, new Object[0]);
            return "";
        }
    }
}
