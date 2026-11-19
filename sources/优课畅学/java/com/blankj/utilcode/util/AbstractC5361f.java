package com.blankj.utilcode.util;

import android.view.View;

/* renamed from: com.blankj.utilcode.util.f */
/* loaded from: classes3.dex */
public abstract class AbstractC5361f {

    /* renamed from: com.blankj.utilcode.util.f$a */
    public class a extends b {

        /* renamed from: e */
        public final /* synthetic */ View.OnClickListener f2695e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, long j10, View.OnClickListener onClickListener) {
            super(z10, j10);
            this.f2695e = onClickListener;
        }

        @Override // com.blankj.utilcode.util.AbstractC5361f.b
        /* renamed from: c */
        public void mo2456c(View view) {
            this.f2695e.onClick(view);
        }
    }

    /* renamed from: com.blankj.utilcode.util.f$b */
    public static abstract class b implements View.OnClickListener {

        /* renamed from: c */
        public static boolean f2696c = true;

        /* renamed from: d */
        public static final Runnable f2697d = new a();

        /* renamed from: a */
        public long f2698a;

        /* renamed from: b */
        public boolean f2699b;

        /* renamed from: com.blankj.utilcode.util.f$b$a */
        public class a implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                boolean unused = b.f2696c = true;
            }
        }

        public b(boolean z10, long j10) {
            this.f2699b = z10;
            this.f2698a = j10;
        }

        /* renamed from: b */
        public static boolean m2458b(View view, long j10) {
            return AbstractC5372k0.m2534E(view, j10);
        }

        /* renamed from: c */
        public abstract void mo2456c(View view);

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!this.f2699b) {
                if (m2458b(view, this.f2698a)) {
                    mo2456c(view);
                }
            } else if (f2696c) {
                f2696c = false;
                view.postDelayed(f2697d, this.f2698a);
                mo2456c(view);
            }
        }
    }

    /* renamed from: a */
    public static void m2450a(View[] viewArr, boolean z10, long j10, View.OnClickListener onClickListener) {
        if (viewArr == null || viewArr.length == 0 || onClickListener == null) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setOnClickListener(new a(z10, j10, onClickListener));
            }
        }
    }

    /* renamed from: b */
    public static void m2451b(View view, View.OnClickListener onClickListener) {
        m2453d(new View[]{view}, onClickListener);
    }

    /* renamed from: c */
    public static void m2452c(View[] viewArr, long j10, View.OnClickListener onClickListener) {
        m2450a(viewArr, true, j10, onClickListener);
    }

    /* renamed from: d */
    public static void m2453d(View[] viewArr, View.OnClickListener onClickListener) {
        m2452c(viewArr, 1000L, onClickListener);
    }

    /* renamed from: e */
    public static void m2454e(View view, long j10, View.OnClickListener onClickListener) {
        m2455f(new View[]{view}, j10, onClickListener);
    }

    /* renamed from: f */
    public static void m2455f(View[] viewArr, long j10, View.OnClickListener onClickListener) {
        m2450a(viewArr, false, j10, onClickListener);
    }
}
