package p077j0;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import io.github.inflationx.calligraphy3.TypefaceUtils;

/* renamed from: j0.b */
/* loaded from: classes2.dex */
public abstract class AbstractC3799b {

    /* renamed from: a */
    public static Application f4547a;

    /* renamed from: b */
    public static String f4548b;

    /* renamed from: a */
    public static Context m4958a() {
        m4962e();
        return f4547a;
    }

    /* renamed from: b */
    public static Typeface m4959b() {
        if (TextUtils.isEmpty(f4548b)) {
            return null;
        }
        return TypefaceUtils.load(m4958a().getAssets(), f4548b);
    }

    /* renamed from: c */
    public static Typeface m4960c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = f4548b;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return TypefaceUtils.load(m4958a().getAssets(), str);
    }

    /* renamed from: d */
    public static void m4961d(Application application) {
        f4547a = application;
    }

    /* renamed from: e */
    public static void m4962e() {
        if (f4547a == null) {
            throw new ExceptionInInitializerError("请先在全局Application中调用 XUI.init() 初始化！");
        }
    }
}
