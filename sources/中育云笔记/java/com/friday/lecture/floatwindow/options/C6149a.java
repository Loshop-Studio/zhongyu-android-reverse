package com.friday.lecture.floatwindow.options;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.Utils;
import com.friday.lecture.R$dimen;
import com.friday.lecture.floatwindow.FloatWindowStatus;
import com.friday.lecture.floatwindow.options.C6149a;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* renamed from: com.friday.lecture.floatwindow.options.a */
/* loaded from: classes4.dex */
public final class C6149a {

    /* renamed from: g */
    public static final a f8778g = new a(null);

    /* renamed from: h */
    public static final int f8779h = 8;

    /* renamed from: i */
    public static final InterfaceC10773d f8780i = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23256c, new InterfaceC9529a() { // from class: g3.g
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return C6149a.m6645b();
        }
    });

    /* renamed from: a */
    public final Context f8781a;

    /* renamed from: b */
    public OptionLayout f8782b;

    /* renamed from: c */
    public WindowManager.LayoutParams f8783c;

    /* renamed from: d */
    public int f8784d;

    /* renamed from: e */
    public int f8785e;

    /* renamed from: f */
    public final WindowManager f8786f;

    /* renamed from: com.friday.lecture.floatwindow.options.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C6149a m6662a() {
            return (C6149a) C6149a.f8780i.getValue();
        }

        public a() {
        }
    }

    /* renamed from: com.friday.lecture.floatwindow.options.a$b */
    public static final class b implements View.OnTouchListener {

        /* renamed from: c */
        public float f8787c;

        /* renamed from: d */
        public float f8788d;

        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            AbstractC9979u.m20294g(view, "view");
            AbstractC9979u.m20294g(motionEvent, "motionEvent");
            this.f8787c = motionEvent.getRawX();
            this.f8788d = motionEvent.getRawY() - BarUtils.getStatusBarHeight();
            int action = motionEvent.getAction();
            WindowManager.LayoutParams layoutParams = null;
            if (action == 1) {
                C6149a c6149a = C6149a.this;
                WindowManager.LayoutParams layoutParams2 = c6149a.f8783c;
                if (layoutParams2 == null) {
                    AbstractC9979u.m20312y("layoutParams");
                    layoutParams2 = null;
                }
                c6149a.f8784d = layoutParams2.x;
                C6149a c6149a2 = C6149a.this;
                WindowManager.LayoutParams layoutParams3 = c6149a2.f8783c;
                if (layoutParams3 == null) {
                    AbstractC9979u.m20312y("layoutParams");
                } else {
                    layoutParams = layoutParams3;
                }
                c6149a2.f8785e = layoutParams.y;
            } else if (action == 2) {
                WindowManager.LayoutParams layoutParams4 = C6149a.this.f8783c;
                if (layoutParams4 == null) {
                    AbstractC9979u.m20312y("layoutParams");
                    layoutParams4 = null;
                }
                float f10 = this.f8787c;
                OptionLayout optionLayoutM6652h = C6149a.this.m6652h();
                AbstractC9979u.m20291d(optionLayoutM6652h);
                layoutParams4.x = (int) (f10 - optionLayoutM6652h.getTouchDownX());
                WindowManager.LayoutParams layoutParams5 = C6149a.this.f8783c;
                if (layoutParams5 == null) {
                    AbstractC9979u.m20312y("layoutParams");
                    layoutParams5 = null;
                }
                float f11 = this.f8788d;
                OptionLayout optionLayoutM6652h2 = C6149a.this.m6652h();
                AbstractC9979u.m20291d(optionLayoutM6652h2);
                layoutParams5.y = (int) (f11 - optionLayoutM6652h2.getTouchDownY());
                WindowManager windowManager = C6149a.this.f8786f;
                OptionLayout optionLayoutM6652h3 = C6149a.this.m6652h();
                WindowManager.LayoutParams layoutParams6 = C6149a.this.f8783c;
                if (layoutParams6 == null) {
                    AbstractC9979u.m20312y("layoutParams");
                } else {
                    layoutParams = layoutParams6;
                }
                windowManager.updateViewLayout(optionLayoutM6652h3, layoutParams);
            }
            return true;
        }
    }

    public C6149a(Context context) {
        this.f8781a = context;
        Object systemService = context.getSystemService("window");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f8786f = (WindowManager) systemService;
    }

    /* renamed from: b */
    public static final C6149a m6645b() {
        Application app = Utils.getApp();
        AbstractC9979u.m20293f(app, "getApp(...)");
        return new C6149a(app);
    }

    /* renamed from: q */
    public static /* synthetic */ void m6651q(C6149a c6149a, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c6149a.m6660p(z10);
    }

    /* renamed from: h */
    public final OptionLayout m6652h() {
        return this.f8782b;
    }

    /* renamed from: i */
    public final void m6653i() {
        if (this.f8782b == null) {
            this.f8782b = new OptionLayout(this.f8781a);
        }
    }

    /* renamed from: j */
    public final void m6654j() {
        try {
            this.f8786f.removeViewImmediate(this.f8782b);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: k */
    public final void m6655k() {
        m6653i();
        OptionLayout optionLayout = this.f8782b;
        if (optionLayout != null) {
            optionLayout.m6641q();
        }
    }

    /* renamed from: l */
    public final void m6656l(boolean z10) {
        m6653i();
        OptionLayout optionLayout = this.f8782b;
        if (optionLayout != null) {
            optionLayout.setAirPlayState(z10);
        }
    }

    /* renamed from: m */
    public final void m6657m(FloatWindowStatus state) {
        AbstractC9979u.m20294g(state, "state");
        m6653i();
        OptionLayout optionLayout = this.f8782b;
        if (optionLayout != null) {
            optionLayout.setClassState(state);
        }
    }

    /* renamed from: n */
    public final void m6658n() {
        WindowManager.LayoutParams layoutParams = this.f8783c;
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            AbstractC9979u.m20312y("layoutParams");
            layoutParams = null;
        }
        int i10 = this.f8784d;
        layoutParams.x = i10 == 0 ? (int) this.f8781a.getResources().getDimension(R$dimen.view_36) : i10 + ((int) this.f8781a.getResources().getDimension(R$dimen.view_15));
        WindowManager.LayoutParams layoutParams3 = this.f8783c;
        if (layoutParams3 == null) {
            AbstractC9979u.m20312y("layoutParams");
            layoutParams3 = null;
        }
        int i11 = this.f8785e;
        layoutParams3.y = i11 == 0 ? (int) this.f8781a.getResources().getDimension(R$dimen.view_305) : i11 - ((int) this.f8781a.getResources().getDimension(R$dimen.view_5));
        WindowManager windowManager = this.f8786f;
        OptionLayout optionLayout = this.f8782b;
        WindowManager.LayoutParams layoutParams4 = this.f8783c;
        if (layoutParams4 == null) {
            AbstractC9979u.m20312y("layoutParams");
        } else {
            layoutParams2 = layoutParams4;
        }
        windowManager.updateViewLayout(optionLayout, layoutParams2);
    }

    /* renamed from: o */
    public final void m6659o() {
        m6653i();
        WindowManager.LayoutParams layoutParams = this.f8783c;
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            AbstractC9979u.m20312y("layoutParams");
            layoutParams = null;
        }
        int i10 = this.f8784d;
        layoutParams.x = i10 == 0 ? (int) this.f8781a.getResources().getDimension(R$dimen.view_7) : i10 - ((int) this.f8781a.getResources().getDimension(R$dimen.view_15));
        WindowManager.LayoutParams layoutParams3 = this.f8783c;
        if (layoutParams3 == null) {
            AbstractC9979u.m20312y("layoutParams");
            layoutParams3 = null;
        }
        int i11 = this.f8785e;
        layoutParams3.y = i11 == 0 ? (int) this.f8781a.getResources().getDimension(R$dimen.view_310) : i11 + ((int) this.f8781a.getResources().getDimension(R$dimen.view_5));
        WindowManager windowManager = this.f8786f;
        OptionLayout optionLayout = this.f8782b;
        WindowManager.LayoutParams layoutParams4 = this.f8783c;
        if (layoutParams4 == null) {
            AbstractC9979u.m20312y("layoutParams");
        } else {
            layoutParams2 = layoutParams4;
        }
        windowManager.updateViewLayout(optionLayout, layoutParams2);
    }

    /* renamed from: p */
    public final void m6660p(boolean z10) {
        m6653i();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f8783c = layoutParams;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        WindowManager.LayoutParams layoutParams2 = this.f8783c;
        WindowManager.LayoutParams layoutParams3 = null;
        if (layoutParams2 == null) {
            AbstractC9979u.m20312y("layoutParams");
            layoutParams2 = null;
        }
        layoutParams2.gravity = 8388659;
        WindowManager.LayoutParams layoutParams4 = this.f8783c;
        if (layoutParams4 == null) {
            AbstractC9979u.m20312y("layoutParams");
            layoutParams4 = null;
        }
        layoutParams4.width = -2;
        WindowManager.LayoutParams layoutParams5 = this.f8783c;
        if (layoutParams5 == null) {
            AbstractC9979u.m20312y("layoutParams");
            layoutParams5 = null;
        }
        layoutParams5.height = -2;
        WindowManager.LayoutParams layoutParams6 = this.f8783c;
        if (layoutParams6 == null) {
            AbstractC9979u.m20312y("layoutParams");
            layoutParams6 = null;
        }
        int dimension = this.f8784d;
        if (dimension == 0) {
            dimension = (int) this.f8781a.getResources().getDimension(R$dimen.view_36);
        }
        layoutParams6.x = dimension;
        WindowManager.LayoutParams layoutParams7 = this.f8783c;
        if (layoutParams7 == null) {
            AbstractC9979u.m20312y("layoutParams");
            layoutParams7 = null;
        }
        int dimension2 = this.f8785e;
        if (dimension2 == 0) {
            dimension2 = (int) this.f8781a.getResources().getDimension(R$dimen.view_305);
        }
        layoutParams7.y = dimension2;
        WindowManager.LayoutParams layoutParams8 = this.f8783c;
        if (layoutParams8 == null) {
            AbstractC9979u.m20312y("layoutParams");
            layoutParams8 = null;
        }
        layoutParams8.format = 1;
        WindowManager.LayoutParams layoutParams9 = this.f8783c;
        if (layoutParams9 == null) {
            AbstractC9979u.m20312y("layoutParams");
            layoutParams9 = null;
        }
        layoutParams9.flags = 262184;
        OptionLayout optionLayout = this.f8782b;
        AbstractC9979u.m20291d(optionLayout);
        optionLayout.setOnTouchListener(new b());
        if (z10) {
            LiveEventBus.get("CanvasEnable", Boolean.TYPE).postDelay(Boolean.TRUE, 200L);
        }
        WindowManager windowManager = this.f8786f;
        OptionLayout optionLayout2 = this.f8782b;
        WindowManager.LayoutParams layoutParams10 = this.f8783c;
        if (layoutParams10 == null) {
            AbstractC9979u.m20312y("layoutParams");
        } else {
            layoutParams3 = layoutParams10;
        }
        windowManager.addView(optionLayout2, layoutParams3);
    }

    /* renamed from: r */
    public final void m6661r(int i10) {
        m6653i();
        OptionLayout optionLayout = this.f8782b;
        if (optionLayout != null) {
            optionLayout.m6643s(i10);
        }
    }
}
