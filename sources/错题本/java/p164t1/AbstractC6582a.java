package p164t1;

import android.text.TextUtils;

/* renamed from: t1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6582a {
    /* renamed from: a */
    public static void m6217a() {
        throw new ExceptionInInitializerError("请先在全局Application中调用 XUI.init() 初始化！");
    }

    /* renamed from: b */
    public static void m6218b() {
        if (TextUtils.isEmpty(null)) {
            return;
        }
        m6217a();
        throw null;
    }

    /* renamed from: c */
    public static void m6219c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m6217a();
        throw null;
    }
}
