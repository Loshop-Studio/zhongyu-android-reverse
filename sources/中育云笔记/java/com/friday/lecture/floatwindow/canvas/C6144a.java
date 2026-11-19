package com.friday.lecture.floatwindow.canvas;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.WindowManager;
import androidx.lifecycle.Observer;
import com.blankj.utilcode.util.Utils;
import com.friday.lecture.floatwindow.canvas.C6144a;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* renamed from: com.friday.lecture.floatwindow.canvas.a */
/* loaded from: classes4.dex */
public final class C6144a {

    /* renamed from: d */
    public static final a f8725d = new a(null);

    /* renamed from: e */
    public static final int f8726e = 8;

    /* renamed from: f */
    public static final InterfaceC10773d f8727f = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23256c, new InterfaceC9529a() { // from class: e3.o
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return C6144a.m6564d();
        }
    });

    /* renamed from: a */
    public final Context f8728a;

    /* renamed from: b */
    public CanvasListLayout f8729b;

    /* renamed from: c */
    public final InterfaceC10773d f8730c = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: e3.p
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return C6144a.m6567j(this.f21262c);
        }
    });

    /* renamed from: com.friday.lecture.floatwindow.canvas.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C6144a m6571a() {
            return (C6144a) C6144a.f8727f.getValue();
        }

        public a() {
        }
    }

    public C6144a(Context context) {
        this.f8728a = context;
        this.f8729b = new CanvasListLayout(context);
        LiveEventBus.get("resetCanvas").observeForever(new Observer() { // from class: e3.q
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C6144a.m6565e(this.f21263c, obj);
            }
        });
    }

    /* renamed from: d */
    public static final C6144a m6564d() {
        Application app = Utils.getApp();
        AbstractC9979u.m20293f(app, "getApp(...)");
        return new C6144a(app);
    }

    /* renamed from: e */
    public static final void m6565e(C6144a c6144a, Object obj) {
        c6144a.f8729b = new CanvasListLayout(c6144a.f8728a);
    }

    /* renamed from: j */
    public static final WindowManager m6567j(C6144a c6144a) {
        Object systemService = c6144a.f8728a.getSystemService("window");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    /* renamed from: g */
    public final WindowManager m6568g() {
        return (WindowManager) this.f8730c.getValue();
    }

    /* renamed from: h */
    public final void m6569h() {
        try {
            m6568g().removeViewImmediate(this.f8729b);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: i */
    public final void m6570i() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.gravity = 17;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.format = 1;
        m6568g().addView(this.f8729b, layoutParams);
    }
}
