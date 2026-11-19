package com.xuexiang.xui.utils;

import android.os.Handler;
import android.os.Looper;
import p150k1.AbstractC9051b;
import p295x2.AbstractC10492b;

/* renamed from: com.xuexiang.xui.utils.j */
/* loaded from: classes4.dex */
public abstract class AbstractC6880j {

    /* renamed from: a */
    public static final Handler f7090a = new Handler(Looper.getMainLooper());

    /* renamed from: com.xuexiang.xui.utils.j$a */
    public static class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f7091a;

        public a(CharSequence charSequence) {
            this.f7091a = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC10492b.m19706f(AbstractC9051b.m15847b(), this.f7091a).show();
        }
    }

    static {
        AbstractC10492b.b.m19736k().m19738l(200).m19740n(AbstractC9051b.m15849d()).m19737j(false);
    }

    /* renamed from: a */
    public static void m6505a(CharSequence charSequence) {
        m6506b(new a(charSequence));
    }

    /* renamed from: b */
    public static void m6506b(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f7090a.post(runnable);
        }
    }
}
