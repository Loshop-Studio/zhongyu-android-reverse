package p300z;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p300z.InterfaceC9954a;

/* renamed from: z.i */
/* loaded from: classes3.dex */
public interface InterfaceC9962i extends InterfaceC9960g {

    /* renamed from: z.i$a */
    public static final class a implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ ViewTreeObserver f17807b;

        /* renamed from: c */
        public final /* synthetic */ b f17808c;

        public a(ViewTreeObserver viewTreeObserver, b bVar) {
            this.f17807b = viewTreeObserver;
            this.f17808c = bVar;
        }

        /* renamed from: a */
        public final void m16781a(Throwable th) {
            InterfaceC9962i.this.m16780f(this.f17807b, this.f17808c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m16781a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: z.i$b */
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public boolean f17809a;

        /* renamed from: c */
        public final /* synthetic */ ViewTreeObserver f17811c;

        /* renamed from: d */
        public final /* synthetic */ CancellableContinuation f17812d;

        public b(ViewTreeObserver viewTreeObserver, CancellableContinuation cancellableContinuation) {
            this.f17811c = viewTreeObserver;
            this.f17812d = cancellableContinuation;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C9958e size = InterfaceC9962i.this.getSize();
            if (size != null) {
                InterfaceC9962i.this.m16780f(this.f17811c, this);
                if (!this.f17809a) {
                    this.f17809a = true;
                    this.f17812d.resumeWith(Result.m24299constructorimpl(size));
                }
            }
            return true;
        }
    }

    /* renamed from: c */
    static /* synthetic */ Object m16777c(InterfaceC9962i interfaceC9962i, Continuation continuation) {
        C9958e size = interfaceC9962i.getSize();
        if (size != null) {
            return size;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ViewTreeObserver viewTreeObserver = interfaceC9962i.getView().getViewTreeObserver();
        b bVar = interfaceC9962i.new b(viewTreeObserver, cancellableContinuationImpl);
        viewTreeObserver.addOnPreDrawListener(bVar);
        cancellableContinuationImpl.invokeOnCancellation(interfaceC9962i.new a(viewTreeObserver, bVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // p300z.InterfaceC9960g
    /* renamed from: a */
    default Object mo2933a(Continuation continuation) {
        return m16777c(this, continuation);
    }

    /* renamed from: d */
    default InterfaceC9954a m16779d(int i10, int i11, int i12) {
        if (i10 == -2) {
            return InterfaceC9954a.b.f17795a;
        }
        int i13 = i10 - i12;
        if (i13 > 0) {
            return InterfaceC9954a.a.m16763a(AbstractC9955b.m16769a(i13));
        }
        int i14 = i11 - i12;
        if (i14 > 0) {
            return InterfaceC9954a.a.m16763a(AbstractC9955b.m16769a(i14));
        }
        return null;
    }

    /* renamed from: f */
    default void m16780f(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    /* renamed from: g */
    boolean mo16770g();

    default InterfaceC9954a getHeight() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return m16779d(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), mo16770g() ? getView().getPaddingTop() + getView().getPaddingBottom() : 0);
    }

    default C9958e getSize() {
        InterfaceC9954a height;
        InterfaceC9954a width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new C9958e(width, height);
    }

    View getView();

    default InterfaceC9954a getWidth() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return m16779d(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), mo16770g() ? getView().getPaddingLeft() + getView().getPaddingRight() : 0);
    }
}
