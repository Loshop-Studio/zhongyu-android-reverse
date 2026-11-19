package p162t;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.C5961g;
import p075h6.InterfaceC5631c;
import p185v7.AbstractC6683l;

/* renamed from: t.e */
/* loaded from: classes2.dex */
public final class C6575e implements InterfaceC6577g {

    /* renamed from: a */
    public final View f10976a;

    public C6575e(View view) {
        this.f10976a = view;
    }

    /* renamed from: b */
    public static InterfaceC6573c m6215b(int i, int i8, int i9) {
        if (i == -2) {
            return C6572b.f10975a;
        }
        int i10 = i - i9;
        if (i10 > 0) {
            AbstractC5806u.m5263b(i10);
            return new C6571a(i10);
        }
        int i11 = i8 - i9;
        if (i11 <= 0) {
            return null;
        }
        AbstractC5806u.m5263b(i11);
        return new C6571a(i11);
    }

    @Override // p162t.InterfaceC6577g
    /* renamed from: a */
    public final Object mo2180a(InterfaceC5631c interfaceC5631c) {
        C6576f c6576fM6216c = m6216c();
        if (c6576fM6216c != null) {
            return c6576fM6216c;
        }
        C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
        c5961g.m5584u();
        ViewTreeObserver viewTreeObserver = this.f10976a.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC6579i viewTreeObserverOnPreDrawListenerC6579i = new ViewTreeObserverOnPreDrawListenerC6579i(this, viewTreeObserver, c5961g);
        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC6579i);
        c5961g.mo4966m(new C6578h(this, viewTreeObserver, viewTreeObserverOnPreDrawListenerC6579i));
        Object objM5583t = c5961g.m5583t();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM5583t;
    }

    /* renamed from: c */
    public final C6576f m6216c() {
        View view = this.f10976a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        InterfaceC6573c interfaceC6573cM6215b = m6215b(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (interfaceC6573cM6215b == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        InterfaceC6573c interfaceC6573cM6215b2 = m6215b(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (interfaceC6573cM6215b2 == null) {
            return null;
        }
        return new C6576f(interfaceC6573cM6215b, interfaceC6573cM6215b2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6575e) && AbstractC5830k.m5325b(this.f10976a, ((C6575e) obj).f10976a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f10976a.hashCode() * 31);
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.f10976a + ", subtractPadding=true)";
    }
}
