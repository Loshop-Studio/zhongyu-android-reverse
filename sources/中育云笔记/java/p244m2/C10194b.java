package p244m2;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: m2.b */
/* loaded from: classes3.dex */
public final class C10194b {

    /* renamed from: a */
    public Context f24262a;

    /* renamed from: b */
    public ViewDataBinding f24263b;

    /* renamed from: c */
    public PopupWindow f24264c;

    /* renamed from: d */
    public View f24265d;

    /* renamed from: e */
    public View f24266e;

    /* renamed from: f */
    public Window f24267f;

    /* renamed from: m2.b$a */
    public static final class a {

        /* renamed from: a */
        public Context f24268a;

        /* renamed from: b */
        public ViewDataBinding f24269b;

        /* renamed from: c */
        public int f24270c;

        /* renamed from: d */
        public int f24271d;

        /* renamed from: e */
        public boolean f24272e;

        /* renamed from: f */
        public boolean f24273f;

        /* renamed from: g */
        public Float f24274g;

        /* renamed from: h */
        public Integer f24275h;

        /* renamed from: i */
        public View f24276i;

        /* renamed from: j */
        public boolean f24277j;

        public a(Context context) {
            AbstractC9979u.m20294g(context, "context");
            this.f24268a = context;
            this.f24270c = -2;
            this.f24271d = -2;
            this.f24277j = true;
        }

        /* renamed from: a */
        public final void m21289a(C10194b controller) {
            Integer num;
            Float f10;
            AbstractC9979u.m20294g(controller, "controller");
            View view = this.f24276i;
            if (view != null) {
                controller.m21284c(view);
            }
            ViewDataBinding viewDataBinding = this.f24269b;
            if (viewDataBinding != null) {
                View root = viewDataBinding.getRoot();
                AbstractC9979u.m20293f(root, "getRoot(...)");
                controller.m21284c(root);
            }
            controller.m21288g(this.f24270c, this.f24271d);
            controller.m21287f(this.f24277j);
            if (this.f24272e && (f10 = this.f24274g) != null) {
                controller.m21286e(f10.floatValue());
            }
            if (!this.f24273f || (num = this.f24275h) == null) {
                return;
            }
            controller.m21285d(num.intValue());
        }

        /* renamed from: b */
        public final ViewDataBinding m21290b() {
            return this.f24269b;
        }

        /* renamed from: c */
        public final Context m21291c() {
            return this.f24268a;
        }

        /* renamed from: d */
        public final void m21292d(ViewDataBinding viewDataBinding) {
            this.f24269b = viewDataBinding;
        }

        /* renamed from: e */
        public final void m21293e(int i10) {
            this.f24271d = i10;
        }

        /* renamed from: f */
        public final void m21294f(boolean z10) {
            this.f24277j = z10;
        }

        /* renamed from: g */
        public final void m21295g(View view) {
            this.f24276i = view;
        }

        /* renamed from: h */
        public final void m21296h(int i10) {
            this.f24270c = i10;
        }
    }

    public C10194b(Context context, PopupWindow popupWindow) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(popupWindow, "popupWindow");
        this.f24262a = context;
        this.f24264c = popupWindow;
    }

    /* renamed from: a */
    public final View m21282a() {
        return this.f24265d;
    }

    /* renamed from: b */
    public final void m21283b() {
        ViewDataBinding viewDataBinding = this.f24263b;
        if (viewDataBinding != null) {
            this.f24265d = viewDataBinding.getRoot();
        }
        View view = this.f24266e;
        if (view != null) {
            this.f24265d = view;
        }
        this.f24264c.setContentView(this.f24265d);
    }

    /* renamed from: c */
    public final void m21284c(View view) {
        AbstractC9979u.m20294g(view, "view");
        this.f24266e = view;
        this.f24263b = null;
        m21283b();
    }

    /* renamed from: d */
    public final void m21285d(int i10) {
        this.f24264c.setAnimationStyle(i10);
    }

    /* renamed from: e */
    public final void m21286e(float f10) {
        Context context = this.f24262a;
        AbstractC9979u.m20292e(context, "null cannot be cast to non-null type android.app.Activity");
        Window window = ((Activity) context).getWindow();
        this.f24267f = window;
        AbstractC9979u.m20291d(window);
        WindowManager.LayoutParams attributes = window.getAttributes();
        AbstractC9979u.m20293f(attributes, "getAttributes(...)");
        attributes.alpha = f10;
        Window window2 = this.f24267f;
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
    }

    /* renamed from: f */
    public final void m21287f(boolean z10) {
        this.f24264c.setBackgroundDrawable(new ColorDrawable(0));
        this.f24264c.setOutsideTouchable(z10);
        this.f24264c.setFocusable(z10);
    }

    /* renamed from: g */
    public final void m21288g(int i10, int i11) {
        this.f24264c.setWidth(i10);
        this.f24264c.setHeight(i11);
    }
}
