package com.zykj.huiwei.launcher.p035ui.dialog.screenShoot;

import androidx.appcompat.app.AppCompatActivity;
import com.zykj.huiwei.launcher.p035ui.dialog.screenShoot.C6132a;
import com.zykj.huiwei.launcher.p035ui.dialog.screenShoot.CommonDialogFragment;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p050e4.C6275g;

/* renamed from: com.zykj.huiwei.launcher.ui.dialog.screenShoot.a */
/* loaded from: classes4.dex */
public final class C6132a {

    /* renamed from: a */
    public final AppCompatActivity f6604a;

    /* renamed from: b */
    public final boolean f6605b;

    /* renamed from: c */
    public final Lazy f6606c;

    public C6132a(AppCompatActivity activity, boolean z6) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f6604a = activity;
        this.f6605b = z6;
        this.f6606c = LazyKt.lazy(new Function0() { // from class: e4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6132a.m5825b(this.f7625a);
            }
        });
    }

    /* renamed from: b */
    public static final CommonDialogFragment m5825b(C6132a c6132a) {
        return c6132a.f6605b ? C6275g.f7642a.m6405a() : new CommonDialogFragment();
    }

    /* renamed from: g */
    public static /* synthetic */ C6132a m5826g(C6132a c6132a, String str, Integer num, Float f6, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            num = null;
        }
        if ((i6 & 4) != 0) {
            f6 = null;
        }
        return c6132a.m5833f(str, num, f6);
    }

    /* renamed from: i */
    public static /* synthetic */ C6132a m5827i(C6132a c6132a, String str, Integer num, Float f6, Integer num2, Integer num3, Integer num4, Integer num5, CommonDialogFragment.InterfaceC6131b interfaceC6131b, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            num = null;
        }
        if ((i6 & 4) != 0) {
            f6 = null;
        }
        if ((i6 & 8) != 0) {
            num2 = null;
        }
        if ((i6 & 16) != 0) {
            num3 = null;
        }
        if ((i6 & 32) != 0) {
            num4 = null;
        }
        if ((i6 & 64) != 0) {
            num5 = null;
        }
        if ((i6 & 128) != 0) {
            interfaceC6131b = null;
        }
        return c6132a.m5834h(str, num, f6, num2, num3, num4, num5, interfaceC6131b);
    }

    /* renamed from: k */
    public static /* synthetic */ C6132a m5828k(C6132a c6132a, String str, Integer num, Float f6, Integer num2, Integer num3, Integer num4, Integer num5, CommonDialogFragment.InterfaceC6131b interfaceC6131b, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            num = null;
        }
        if ((i6 & 4) != 0) {
            f6 = null;
        }
        if ((i6 & 8) != 0) {
            num2 = null;
        }
        if ((i6 & 16) != 0) {
            num3 = null;
        }
        if ((i6 & 32) != 0) {
            num4 = null;
        }
        if ((i6 & 64) != 0) {
            num5 = null;
        }
        if ((i6 & 128) != 0) {
            interfaceC6131b = null;
        }
        return c6132a.m5835j(str, num, f6, num2, num3, num4, num5, interfaceC6131b);
    }

    /* renamed from: m */
    public static /* synthetic */ C6132a m5829m(C6132a c6132a, String str, Integer num, Float f6, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            num = null;
        }
        if ((i6 & 4) != 0) {
            f6 = null;
        }
        return c6132a.m5836l(str, num, f6);
    }

    /* renamed from: c */
    public final CommonDialogFragment m5830c() {
        return (CommonDialogFragment) this.f6606c.getValue();
    }

    /* renamed from: d */
    public final boolean m5831d() {
        return m5830c().isAdded() && m5830c().isVisible();
    }

    /* renamed from: e */
    public final C6132a m5832e(boolean z6) {
        m5830c().m5818k(z6);
        return this;
    }

    /* renamed from: f */
    public final C6132a m5833f(String message, Integer num, Float f6) {
        Intrinsics.checkNotNullParameter(message, "message");
        m5830c().m5819l(message, num, f6);
        return this;
    }

    /* renamed from: h */
    public final C6132a m5834h(String text, Integer num, Float f6, Integer num2, Integer num3, Integer num4, Integer num5, CommonDialogFragment.InterfaceC6131b interfaceC6131b) {
        Intrinsics.checkNotNullParameter(text, "text");
        m5830c().m5820m(text, num, f6, num2, num3, num4, num5, interfaceC6131b);
        return this;
    }

    /* renamed from: j */
    public final C6132a m5835j(String text, Integer num, Float f6, Integer num2, Integer num3, Integer num4, Integer num5, CommonDialogFragment.InterfaceC6131b interfaceC6131b) {
        Intrinsics.checkNotNullParameter(text, "text");
        m5830c().m5821n(text, num, f6, num2, num3, num4, num5, interfaceC6131b);
        return this;
    }

    /* renamed from: l */
    public final C6132a m5836l(String title, Integer num, Float f6) {
        Intrinsics.checkNotNullParameter(title, "title");
        m5830c().m5822o(title, num, f6);
        return this;
    }

    /* renamed from: n */
    public final void m5837n() {
        boolean z6 = this.f6605b;
        if (z6) {
            if (m5831d()) {
                return;
            }
            m5830c().show(this.f6604a.getSupportFragmentManager(), "");
        } else {
            if (z6) {
                throw new NoWhenBranchMatchedException();
            }
            m5830c().show(this.f6604a.getSupportFragmentManager(), "");
        }
    }
}
