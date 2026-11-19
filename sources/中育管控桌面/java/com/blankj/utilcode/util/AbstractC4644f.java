package com.blankj.utilcode.util;

import android.graphics.Rect;
import android.util.Log;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: com.blankj.utilcode.util.f */
/* loaded from: classes3.dex */
public abstract class AbstractC4644f {

    /* renamed from: com.blankj.utilcode.util.f$a */
    public class a extends c {

        /* renamed from: e */
        public final /* synthetic */ View.OnClickListener f2064e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z6, long j6, View.OnClickListener onClickListener) {
            super(z6, j6);
            this.f2064e = onClickListener;
        }

        @Override // com.blankj.utilcode.util.AbstractC4644f.c
        /* renamed from: c */
        public void mo2175c(View view) {
            this.f2064e.onClick(view);
        }
    }

    /* renamed from: com.blankj.utilcode.util.f$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f2065a;

        /* renamed from: b */
        public final /* synthetic */ int f2066b;

        /* renamed from: c */
        public final /* synthetic */ int f2067c;

        /* renamed from: d */
        public final /* synthetic */ int f2068d;

        /* renamed from: e */
        public final /* synthetic */ int f2069e;

        /* renamed from: f */
        public final /* synthetic */ View f2070f;

        public b(View view, int i6, int i7, int i8, int i9, View view2) {
            this.f2065a = view;
            this.f2066b = i6;
            this.f2067c = i7;
            this.f2068d = i8;
            this.f2069e = i9;
            this.f2070f = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            this.f2065a.getHitRect(rect);
            rect.top -= this.f2066b;
            rect.bottom += this.f2067c;
            rect.left -= this.f2068d;
            rect.right += this.f2069e;
            this.f2070f.setTouchDelegate(new TouchDelegate(rect, this.f2065a));
        }
    }

    /* renamed from: com.blankj.utilcode.util.f$c */
    public static abstract class c implements View.OnClickListener {

        /* renamed from: c */
        public static boolean f2071c = true;

        /* renamed from: d */
        public static final Runnable f2072d = new a();

        /* renamed from: a */
        public long f2073a;

        /* renamed from: b */
        public boolean f2074b;

        /* renamed from: com.blankj.utilcode.util.f$c$a */
        public class a implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                boolean unused = c.f2071c = true;
            }
        }

        public c(boolean z6, long j6) {
            this.f2074b = z6;
            this.f2073a = j6;
        }

        /* renamed from: b */
        public static boolean m2177b(View view, long j6) {
            return AbstractC4663o0.m2305H(view, j6);
        }

        /* renamed from: c */
        public abstract void mo2175c(View view);

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!this.f2074b) {
                if (m2177b(view, this.f2073a)) {
                    mo2175c(view);
                }
            } else if (f2071c) {
                f2071c = false;
                view.postDelayed(f2072d, this.f2073a);
                mo2175c(view);
            }
        }
    }

    /* renamed from: a */
    public static void m2170a(View[] viewArr, boolean z6, long j6, View.OnClickListener onClickListener) {
        if (viewArr == null || viewArr.length == 0 || onClickListener == null) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setOnClickListener(new a(z6, j6, onClickListener));
            }
        }
    }

    /* renamed from: b */
    public static void m2171b(View view, long j6, View.OnClickListener onClickListener) {
        m2172c(new View[]{view}, j6, onClickListener);
    }

    /* renamed from: c */
    public static void m2172c(View[] viewArr, long j6, View.OnClickListener onClickListener) {
        m2170a(viewArr, false, j6, onClickListener);
    }

    /* renamed from: d */
    public static void m2173d(View view, int i6) {
        m2174e(view, i6, i6, i6, i6);
    }

    /* renamed from: e */
    public static void m2174e(View view, int i6, int i7, int i8, int i9) {
        View view2 = (View) view.getParent();
        if (view2 == null) {
            Log.e("ClickUtils", "expandClickArea must have parent view.");
        } else {
            view2.post(new b(view, i6, i9, i7, i8, view2));
        }
    }
}
