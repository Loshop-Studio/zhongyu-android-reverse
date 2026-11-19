package com.xuexiang.xui.utils;

import android.app.Activity;
import android.view.Window;

/* renamed from: com.xuexiang.xui.utils.f */
/* loaded from: classes3.dex */
public abstract class AbstractC5858f {

    /* renamed from: com.xuexiang.xui.utils.f$a */
    public interface a {
        /* renamed from: a */
        void mo4374a(Window window);
    }

    /* renamed from: a */
    public static void m4369a(Window window) {
        if (window == null) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(4615);
    }

    /* renamed from: b */
    public static boolean m4370b(Activity activity, Window window, a aVar) {
        if (activity == null || window == null || aVar == null) {
            return false;
        }
        window.addFlags(8);
        aVar.mo4374a(window);
        m4372d(activity, window);
        window.clearFlags(8);
        return true;
    }

    /* renamed from: c */
    public static void m4371c(Window window, a aVar) {
        if (window == null || aVar == null) {
            return;
        }
        window.addFlags(8);
        aVar.mo4374a(window);
        m4369a(window);
        window.clearFlags(8);
    }

    /* renamed from: d */
    public static boolean m4372d(Activity activity, Window window) {
        if (activity == null) {
            return false;
        }
        return m4373e(activity.getWindow(), window);
    }

    /* renamed from: e */
    public static boolean m4373e(Window window, Window window2) {
        if (window == null || window2 == null) {
            return false;
        }
        window2.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility());
        return true;
    }
}
