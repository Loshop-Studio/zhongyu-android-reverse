package p290x2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import p210p2.AbstractC9318a;
import p270v2.AbstractC9755c;
import p310z2.AbstractC9993d;

/* renamed from: x2.e */
/* loaded from: classes4.dex */
public class C9870e {

    /* renamed from: c */
    public static Context f17616c;

    /* renamed from: a */
    public String f17617a;

    /* renamed from: b */
    public String f17618b;

    /* renamed from: x2.e$b */
    public static class b {

        /* renamed from: a */
        public static final C9870e f17619a = new C9870e();
    }

    /* renamed from: b */
    public static C9870e m16853b(Context context) {
        if (f17616c == null && context != null) {
            f17616c = context.getApplicationContext();
        }
        return b.f17619a;
    }

    /* renamed from: a */
    public String m16854a() {
        return this.f17618b;
    }

    /* renamed from: c */
    public boolean m16855c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("a");
    }

    /* renamed from: d */
    public String m16856d() {
        return this.f17617a;
    }

    /* renamed from: e */
    public boolean m16857e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("t");
    }

    /* renamed from: f */
    public boolean m16858f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("z");
    }

    /* renamed from: g */
    public void m16859g(String str) {
        String strSubstring = str.substring(0, str.indexOf(95));
        m16861i(strSubstring);
        m16860h(strSubstring);
    }

    /* renamed from: h */
    public final void m16860h(String str) {
        try {
            this.f17617a = str.replaceAll("&=", " ").replaceAll("&&", " ").replaceAll("==", "/") + "/Android/" + Build.DISPLAY + "/" + Build.MODEL + "/" + Build.VERSION.RELEASE + " " + AbstractC9755c.m16394c(AbstractC9993d.m17321f(f17616c));
        } catch (Throwable th) {
            AbstractC9318a.m15200b(f17616c, th);
        }
    }

    /* renamed from: i */
    public final void m16861i(String str) {
        try {
            String str2 = str.split("&&")[0];
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String[] strArrSplit = str2.split("&=");
            StringBuilder sb = new StringBuilder();
            sb.append("ut/");
            for (String str3 : strArrSplit) {
                if (!TextUtils.isEmpty(str3)) {
                    String strSubstring = str3.substring(0, 2);
                    if (strSubstring.endsWith("=")) {
                        strSubstring = strSubstring.replace("=", "");
                    }
                    sb.append(strSubstring);
                }
            }
            this.f17618b = sb.toString();
        } catch (Throwable th) {
            AbstractC9318a.m15200b(f17616c, th);
        }
    }

    public C9870e() {
        this.f17617a = null;
        this.f17618b = null;
    }
}
