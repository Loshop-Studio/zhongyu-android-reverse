package p420y7;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import io.github.inflationx.calligraphy3.TypefaceUtils;

/* renamed from: y7.b */
/* loaded from: classes5.dex */
public abstract class AbstractC11916b {

    /* renamed from: a */
    public static Application f28233a;

    /* renamed from: b */
    public static boolean f28234b;

    /* renamed from: c */
    public static int f28235c;

    /* renamed from: d */
    public static String f28236d;

    /* renamed from: a */
    public static int m26457a(Context context) {
        int i10 = context.getResources().getConfiguration().screenLayout & 15;
        if (i10 >= 3) {
            return i10 >= 4 ? 3 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static Context m26458b() {
        m26464h();
        return f28233a;
    }

    /* renamed from: c */
    public static Typeface m26459c() {
        if (TextUtils.isEmpty(f28236d)) {
            return null;
        }
        return TypefaceUtils.load(m26458b().getAssets(), f28236d);
    }

    /* renamed from: d */
    public static Typeface m26460d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = f28236d;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return TypefaceUtils.load(m26458b().getAssets(), str);
    }

    /* renamed from: e */
    public static int m26461e() {
        if (f28234b) {
            return f28235c;
        }
        int iM26457a = m26457a(m26458b());
        f28235c = iM26457a;
        f28234b = true;
        return iM26457a;
    }

    /* renamed from: f */
    public static void m26462f(Application application) {
        f28233a = application;
    }

    /* renamed from: g */
    public static boolean m26463g() {
        return m26461e() == 2 || m26461e() == 3;
    }

    /* renamed from: h */
    public static void m26464h() {
        if (f28233a == null) {
            throw new ExceptionInInitializerError("请先在全局Application中调用 XUI.init() 初始化！");
        }
    }
}
