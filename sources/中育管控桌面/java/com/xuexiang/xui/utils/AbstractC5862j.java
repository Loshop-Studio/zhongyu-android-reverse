package com.xuexiang.xui.utils;

import android.os.Handler;
import android.os.Looper;
import p126p1.AbstractC7591b;
import p183x2.AbstractC7832b;

/* renamed from: com.xuexiang.xui.utils.j */
/* loaded from: classes3.dex */
public abstract class AbstractC5862j {

    /* renamed from: a */
    public static final Handler f4492a = new Handler(Looper.getMainLooper());

    /* renamed from: com.xuexiang.xui.utils.j$a */
    public static class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f4493a;

        public a(int i6) {
            this.f4493a = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC7832b.m9482n(AbstractC7591b.m8998a(), this.f4493a).show();
        }
    }

    /* renamed from: com.xuexiang.xui.utils.j$b */
    public static class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f4494a;

        public b(CharSequence charSequence) {
            this.f4494a = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC7832b.m9474f(AbstractC7591b.m8998a(), this.f4494a).show();
        }
    }

    static {
        AbstractC7832b.b.m9504k().m9506l(200).m9508n(AbstractC7591b.m9000c()).m9505j(false);
    }

    /* renamed from: a */
    public static void m4412a(CharSequence charSequence) {
        m4413b(new b(charSequence));
    }

    /* renamed from: b */
    public static void m4413b(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f4492a.post(runnable);
        }
    }

    /* renamed from: c */
    public static void m4414c(int i6) {
        m4413b(new a(i6));
    }
}
