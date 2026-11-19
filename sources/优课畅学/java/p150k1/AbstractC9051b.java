package p150k1;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import io.github.inflationx.calligraphy3.TypefaceUtils;

/* renamed from: k1.b */
/* loaded from: classes4.dex */
public abstract class AbstractC9051b {

    /* renamed from: a */
    public static Application f17319a;

    /* renamed from: b */
    public static boolean f17320b;

    /* renamed from: c */
    public static int f17321c;

    /* renamed from: d */
    public static String f17322d;

    /* renamed from: a */
    public static int m15846a(Context context) {
        int i10 = context.getResources().getConfiguration().screenLayout & 15;
        if (i10 >= 3) {
            return i10 >= 4 ? 3 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static Context m15847b() {
        m15854i();
        return f17319a;
    }

    /* renamed from: c */
    public static String m15848c() {
        return f17322d;
    }

    /* renamed from: d */
    public static Typeface m15849d() {
        if (TextUtils.isEmpty(f17322d)) {
            return null;
        }
        return TypefaceUtils.load(m15847b().getAssets(), f17322d);
    }

    /* renamed from: e */
    public static Typeface m15850e(String str) {
        if (TextUtils.isEmpty(str)) {
            str = f17322d;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return TypefaceUtils.load(m15847b().getAssets(), str);
    }

    /* renamed from: f */
    public static int m15851f() {
        if (f17320b) {
            return f17321c;
        }
        int iM15846a = m15846a(m15847b());
        f17321c = iM15846a;
        f17320b = true;
        return iM15846a;
    }

    /* renamed from: g */
    public static void m15852g(Application application) {
        f17319a = application;
    }

    /* renamed from: h */
    public static boolean m15853h() {
        return m15851f() == 2 || m15851f() == 3;
    }

    /* renamed from: i */
    public static void m15854i() {
        if (f17319a == null) {
            throw new ExceptionInInitializerError("请先在全局Application中调用 XUI.init() 初始化！");
        }
    }
}
