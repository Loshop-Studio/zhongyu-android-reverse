package com.xuexiang.xui.utils;

import android.app.Activity;
import android.view.Window;

/* renamed from: com.xuexiang.xui.utils.f */
/* loaded from: classes4.dex */
public abstract class AbstractC6876f {

    /* renamed from: com.xuexiang.xui.utils.f$a */
    public interface a {
        /* renamed from: a */
        void mo6466a(Window window);
    }

    /* renamed from: a */
    public static void m6461a(Window window) {
        if (window == null) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(4615);
    }

    /* renamed from: b */
    public static boolean m6462b(Activity activity, Window window, a aVar) {
        if (activity == null || window == null || aVar == null) {
            return false;
        }
        window.addFlags(8);
        aVar.mo6466a(window);
        m6464d(activity, window);
        window.clearFlags(8);
        return true;
    }

    /* renamed from: c */
    public static void m6463c(Window window, a aVar) {
        if (window == null || aVar == null) {
            return;
        }
        window.addFlags(8);
        aVar.mo6466a(window);
        m6461a(window);
        window.clearFlags(8);
    }

    /* renamed from: d */
    public static boolean m6464d(Activity activity, Window window) {
        if (activity == null) {
            return false;
        }
        return m6465e(activity.getWindow(), window);
    }

    /* renamed from: e */
    public static boolean m6465e(Window window, Window window2) {
        if (window == null || window2 == null) {
            return false;
        }
        window2.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility());
        return true;
    }
}
