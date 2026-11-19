package p126p1;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import io.github.inflationx.calligraphy3.TypefaceUtils;

/* renamed from: p1.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7591b {

    /* renamed from: a */
    public static Application f10051a;

    /* renamed from: b */
    public static String f10052b;

    /* renamed from: a */
    public static Context m8998a() {
        m9003f();
        return f10051a;
    }

    /* renamed from: b */
    public static String m8999b() {
        return f10052b;
    }

    /* renamed from: c */
    public static Typeface m9000c() {
        if (TextUtils.isEmpty(f10052b)) {
            return null;
        }
        return TypefaceUtils.load(m8998a().getAssets(), f10052b);
    }

    /* renamed from: d */
    public static Typeface m9001d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = f10052b;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return TypefaceUtils.load(m8998a().getAssets(), str);
    }

    /* renamed from: e */
    public static void m9002e(Application application) {
        f10051a = application;
    }

    /* renamed from: f */
    public static void m9003f() {
        if (f10051a == null) {
            throw new ExceptionInInitializerError("请先在全局Application中调用 XUI.init() 初始化！");
        }
    }
}
