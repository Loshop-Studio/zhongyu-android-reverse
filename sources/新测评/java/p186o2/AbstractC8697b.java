package p186o2;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import io.github.inflationx.calligraphy3.TypefaceUtils;

/* renamed from: o2.b */
/* loaded from: classes4.dex */
public abstract class AbstractC8697b {

    /* renamed from: a */
    public static Application f14465a;

    /* renamed from: b */
    public static String f14466b;

    /* renamed from: a */
    public static Context m14299a() {
        m14304f();
        return f14465a;
    }

    /* renamed from: b */
    public static String m14300b() {
        return f14466b;
    }

    /* renamed from: c */
    public static Typeface m14301c() {
        if (TextUtils.isEmpty(f14466b)) {
            return null;
        }
        return TypefaceUtils.load(m14299a().getAssets(), f14466b);
    }

    /* renamed from: d */
    public static Typeface m14302d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = f14466b;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return TypefaceUtils.load(m14299a().getAssets(), str);
    }

    /* renamed from: e */
    public static void m14303e(Application application) {
        f14465a = application;
    }

    /* renamed from: f */
    public static void m14304f() {
        if (f14465a == null) {
            throw new ExceptionInInitializerError("请先在全局Application中调用 XUI.init() 初始化！");
        }
    }
}
