package com.xuexiang.xui.utils;

import android.app.Activity;
import android.view.Window;

/* renamed from: com.xuexiang.xui.utils.f */
/* loaded from: classes4.dex */
public abstract class AbstractC6481f {

    /* renamed from: com.xuexiang.xui.utils.f$a */
    public interface a {
        /* renamed from: a */
        void mo5369a(Window window);
    }

    /* renamed from: a */
    public static void m5364a(Window window) {
        if (window == null) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(4615);
    }

    /* renamed from: b */
    public static boolean m5365b(Activity activity, Window window, a aVar) {
        if (activity == null || window == null || aVar == null) {
            return false;
        }
        window.addFlags(8);
        aVar.mo5369a(window);
        m5367d(activity, window);
        window.clearFlags(8);
        return true;
    }

    /* renamed from: c */
    public static void m5366c(Window window, a aVar) {
        if (window == null || aVar == null) {
            return;
        }
        window.addFlags(8);
        aVar.mo5369a(window);
        m5364a(window);
        window.clearFlags(8);
    }

    /* renamed from: d */
    public static boolean m5367d(Activity activity, Window window) {
        if (activity == null) {
            return false;
        }
        return m5368e(activity.getWindow(), window);
    }

    /* renamed from: e */
    public static boolean m5368e(Window window, Window window2) {
        if (window == null || window2 == null) {
            return false;
        }
        window2.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility());
        return true;
    }
}
