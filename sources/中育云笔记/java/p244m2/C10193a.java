package p244m2;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9545q;
import p244m2.C10194b;

/* renamed from: m2.a */
/* loaded from: classes3.dex */
public final class C10193a extends PopupWindow {

    /* renamed from: a */
    public Context f24257a;

    /* renamed from: b */
    public C10194b f24258b;

    /* renamed from: m2.a$a */
    public final class a {

        /* renamed from: a */
        public C10194b.a f24259a;

        /* renamed from: b */
        public InterfaceC9545q f24260b;

        public a() {
            this.f24259a = new C10194b.a(C10193a.this.f24257a);
        }

        /* renamed from: a */
        public final C10193a m21277a() {
            View viewM21282a;
            ViewDataBinding viewDataBindingM21290b;
            C10193a c10193a = new C10193a(this.f24259a.m21291c());
            this.f24259a.m21289a(c10193a.m21276b());
            InterfaceC9545q interfaceC9545q = this.f24260b;
            if (interfaceC9545q != null && (viewM21282a = c10193a.m21276b().m21282a()) != null && (viewDataBindingM21290b = this.f24259a.m21290b()) != null) {
                interfaceC9545q.invoke(viewM21282a, c10193a, viewDataBindingM21290b);
            }
            return c10193a;
        }

        /* renamed from: b */
        public final a m21278b(ViewDataBinding t10) {
            AbstractC9979u.m20294g(t10, "t");
            this.f24259a.m21295g(null);
            this.f24259a.m21292d(t10);
            return this;
        }

        /* renamed from: c */
        public final a m21279c(InterfaceC9545q listener) {
            AbstractC9979u.m20294g(listener, "listener");
            this.f24260b = listener;
            return this;
        }

        /* renamed from: d */
        public final a m21280d(boolean z10) {
            this.f24259a.m21294f(z10);
            return this;
        }

        /* renamed from: e */
        public final a m21281e(int i10, int i11) {
            this.f24259a.m21296h(i10);
            this.f24259a.m21293e(i11);
            return this;
        }
    }

    public C10193a(Context context) {
        AbstractC9979u.m20294g(context, "context");
        this.f24257a = context;
        this.f24258b = new C10194b(context, this);
    }

    /* renamed from: b */
    public final C10194b m21276b() {
        return this.f24258b;
    }

    @Override // android.widget.PopupWindow
    public int getHeight() {
        View viewM21282a = this.f24258b.m21282a();
        AbstractC9979u.m20291d(viewM21282a);
        return viewM21282a.getMeasuredHeight();
    }

    @Override // android.widget.PopupWindow
    public int getWidth() {
        View viewM21282a = this.f24258b.m21282a();
        AbstractC9979u.m20291d(viewM21282a);
        return viewM21282a.getMeasuredWidth();
    }
}
