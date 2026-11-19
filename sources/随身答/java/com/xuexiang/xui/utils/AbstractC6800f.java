package com.xuexiang.xui.utils;

import android.view.Window;

/* renamed from: com.xuexiang.xui.utils.f */
/* loaded from: classes4.dex */
public abstract class AbstractC6800f {

    /* renamed from: com.xuexiang.xui.utils.f$a */
    public interface a {
        /* renamed from: a */
        void mo6467a(Window window);
    }

    /* renamed from: a */
    public static void m6465a(Window window) {
        if (window == null) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(4615);
    }

    /* renamed from: b */
    public static void m6466b(Window window, a aVar) {
        if (window == null || aVar == null) {
            return;
        }
        window.addFlags(8);
        aVar.mo6467a(window);
        m6465a(window);
        window.clearFlags(8);
    }
}
