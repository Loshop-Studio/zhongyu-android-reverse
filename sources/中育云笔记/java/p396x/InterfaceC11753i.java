package p396x;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.C9997c;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p396x.InterfaceC11745a;
import p409xc.AbstractC11831f;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

/* renamed from: x.i */
/* loaded from: classes3.dex */
public interface InterfaceC11753i extends InterfaceC11751g {

    /* renamed from: x.i$a */
    public static final class a implements InterfaceC9540l {

        /* renamed from: d */
        public final /* synthetic */ ViewTreeObserver f27930d;

        /* renamed from: e */
        public final /* synthetic */ b f27931e;

        public a(ViewTreeObserver viewTreeObserver, b bVar) {
            this.f27930d = viewTreeObserver;
            this.f27931e = bVar;
        }

        /* renamed from: a */
        public final void m26009a(Throwable th) {
            InterfaceC11753i.this.m26008e(this.f27930d, this.f27931e);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m26009a((Throwable) obj);
            return C10786q.f26013a;
        }
    }

    /* renamed from: x.i$b */
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: c */
        public boolean f27932c;

        /* renamed from: e */
        public final /* synthetic */ ViewTreeObserver f27934e;

        /* renamed from: f */
        public final /* synthetic */ InterfaceC11125j f27935f;

        public b(ViewTreeObserver viewTreeObserver, InterfaceC11125j interfaceC11125j) {
            this.f27934e = viewTreeObserver;
            this.f27935f = interfaceC11125j;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C11749e size = InterfaceC11753i.this.getSize();
            if (size != null) {
                InterfaceC11753i.this.m26008e(this.f27934e, this);
                if (!this.f27932c) {
                    this.f27932c = true;
                    this.f27935f.resumeWith(Result.m20054c(size));
                }
            }
            return true;
        }
    }

    /* renamed from: g */
    static /* synthetic */ Object m26006g(InterfaceC11753i interfaceC11753i, InterfaceC11588c interfaceC11588c) {
        C11749e size = interfaceC11753i.getSize();
        if (size != null) {
            return size;
        }
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        ViewTreeObserver viewTreeObserver = interfaceC11753i.getView().getViewTreeObserver();
        b bVar = interfaceC11753i.new b(viewTreeObserver, c9997c);
        viewTreeObserver.addOnPreDrawListener(bVar);
        c9997c.mo20536u(interfaceC11753i.new a(viewTreeObserver, bVar));
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    @Override // p396x.InterfaceC11751g
    /* renamed from: a */
    default Object mo25997a(InterfaceC11588c interfaceC11588c) {
        return m26006g(this, interfaceC11588c);
    }

    /* renamed from: d */
    default InterfaceC11745a m26007d(int i10, int i11, int i12) {
        if (i10 == -2) {
            return InterfaceC11745a.b.f27918a;
        }
        int i13 = i10 - i12;
        if (i13 > 0) {
            return InterfaceC11745a.a.m25990a(AbstractC11746b.m25996a(i13));
        }
        int i14 = i11 - i12;
        if (i14 > 0) {
            return InterfaceC11745a.a.m25990a(AbstractC11746b.m25996a(i14));
        }
        return null;
    }

    /* renamed from: e */
    default void m26008e(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    /* renamed from: f */
    boolean mo25998f();

    default InterfaceC11745a getHeight() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return m26007d(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), mo25998f() ? getView().getPaddingTop() + getView().getPaddingBottom() : 0);
    }

    default C11749e getSize() {
        InterfaceC11745a height;
        InterfaceC11745a width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new C11749e(width, height);
    }

    View getView();

    default InterfaceC11745a getWidth() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return m26007d(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), mo25998f() ? getView().getPaddingLeft() + getView().getPaddingRight() : 0);
    }
}
