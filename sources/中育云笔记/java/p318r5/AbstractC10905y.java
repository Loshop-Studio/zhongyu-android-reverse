package p318r5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.hms.hatool.AbstractC7317o;

/* renamed from: r5.y */
/* loaded from: classes5.dex */
public abstract class AbstractC10905y {
    /* renamed from: a */
    public static String m23703a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(AbstractC10882m1.m23551a(str, str2))) {
            return AbstractC10882m1.m23551a(str, str2);
        }
        AbstractC10861f1.m23430b("hmsSdk", "getAndroidId(): to getConfigByType()");
        return m23705c(context, str, str2);
    }

    /* renamed from: b */
    public static String m23704b(Context context, String str, String str2) {
        if (str2.equals("oper")) {
            return m23706d(context, str, str2);
        }
        if (str2.equals("maint")) {
            return m23706d(context, str, str2);
        }
        if (str2.equals("diffprivacy")) {
            return m23706d(context, str, str2);
        }
        if (str2.equals("preins")) {
            return m23706d(context, str, str2);
        }
        AbstractC10861f1.m23441m("hmsSdk", "getChannel(): Invalid type: " + str2);
        return "";
    }

    /* renamed from: c */
    public static String m23705c(Context context, String str, String str2) {
        if (!AbstractC10882m1.m23552b(str, str2)) {
            return "";
        }
        if (TextUtils.isEmpty(AbstractC10900v0.m23672g())) {
            C10908z0.m23741e().m23746d().m23635e(AbstractC7317o.m8637d(context));
        }
        return AbstractC10900v0.m23672g();
    }

    /* renamed from: d */
    public static String m23706d(Context context, String str, String str2) throws PackageManager.NameNotFoundException {
        if (!TextUtils.isEmpty(AbstractC10850c.m23366e(str, str2))) {
            return AbstractC10850c.m23366e(str, str2);
        }
        C10895t c10895tM23746d = C10908z0.m23741e().m23746d();
        if (TextUtils.isEmpty(c10895tM23746d.m23646p())) {
            String strM8641h = AbstractC7317o.m8641h(context);
            if (!AbstractC10883n.m23564c("channel", strM8641h, 256)) {
                strM8641h = "";
            }
            c10895tM23746d.m23643m(strM8641h);
        }
        return c10895tM23746d.m23646p();
    }
}
