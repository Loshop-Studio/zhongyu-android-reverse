package p093e3;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import io.github.inflationx.calligraphy3.TypefaceUtils;

/* renamed from: e3.b */
/* loaded from: classes4.dex */
public abstract class AbstractC7843b {

    /* renamed from: a */
    public static Application f13180a;

    /* renamed from: b */
    public static String f13181b;

    /* renamed from: a */
    public static Context m12290a() {
        m12295f();
        return f13180a;
    }

    /* renamed from: b */
    public static String m12291b() {
        return f13181b;
    }

    /* renamed from: c */
    public static Typeface m12292c() {
        if (TextUtils.isEmpty(f13181b)) {
            return null;
        }
        return TypefaceUtils.load(m12290a().getAssets(), f13181b);
    }

    /* renamed from: d */
    public static Typeface m12293d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = f13181b;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return TypefaceUtils.load(m12290a().getAssets(), str);
    }

    /* renamed from: e */
    public static void m12294e(Application application) {
        f13180a = application;
    }

    /* renamed from: f */
    public static void m12295f() {
        if (f13180a == null) {
            throw new ExceptionInInitializerError("请先在全局Application中调用 XUI.init() 初始化！");
        }
    }
}
