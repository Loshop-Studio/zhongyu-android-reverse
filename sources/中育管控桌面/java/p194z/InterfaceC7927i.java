package p194z;

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
import p194z.InterfaceC7919a;

/* renamed from: z.i */
/* loaded from: classes3.dex */
public interface InterfaceC7927i extends InterfaceC7925g {

    /* renamed from: z.i$a */
    public static final class a implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ ViewTreeObserver f10650b;

        /* renamed from: c */
        public final /* synthetic */ b f10651c;

        public a(ViewTreeObserver viewTreeObserver, b bVar) {
            this.f10650b = viewTreeObserver;
            this.f10651c = bVar;
        }

        /* renamed from: a */
        public final void m9729a(Throwable th) {
            InterfaceC7927i.this.m9728f(this.f10650b, this.f10651c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m9729a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: z.i$b */
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public boolean f10652a;

        /* renamed from: c */
        public final /* synthetic */ ViewTreeObserver f10654c;

        /* renamed from: d */
        public final /* synthetic */ CancellableContinuation f10655d;

        public b(ViewTreeObserver viewTreeObserver, CancellableContinuation cancellableContinuation) {
            this.f10654c = viewTreeObserver;
            this.f10655d = cancellableContinuation;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C7923e size = InterfaceC7927i.this.getSize();
            if (size != null) {
                InterfaceC7927i.this.m9728f(this.f10654c, this);
                if (!this.f10652a) {
                    this.f10652a = true;
                    this.f10655d.resumeWith(Result.m17183constructorimpl(size));
                }
            }
            return true;
        }
    }

    /* renamed from: c */
    static /* synthetic */ Object m9725c(InterfaceC7927i interfaceC7927i, Continuation continuation) {
        C7923e size = interfaceC7927i.getSize();
        if (size != null) {
            return size;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ViewTreeObserver viewTreeObserver = interfaceC7927i.getView().getViewTreeObserver();
        b bVar = interfaceC7927i.new b(viewTreeObserver, cancellableContinuationImpl);
        viewTreeObserver.addOnPreDrawListener(bVar);
        cancellableContinuationImpl.invokeOnCancellation(interfaceC7927i.new a(viewTreeObserver, bVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // p194z.InterfaceC7925g
    /* renamed from: a */
    default Object mo1764a(Continuation continuation) {
        return m9725c(this, continuation);
    }

    /* renamed from: d */
    default InterfaceC7919a m9727d(int i6, int i7, int i8) {
        if (i6 == -2) {
            return InterfaceC7919a.b.f10638a;
        }
        int i9 = i6 - i8;
        if (i9 > 0) {
            return InterfaceC7919a.a.m9711a(AbstractC7920b.m9717a(i9));
        }
        int i10 = i7 - i8;
        if (i10 > 0) {
            return InterfaceC7919a.a.m9711a(AbstractC7920b.m9717a(i10));
        }
        return null;
    }

    /* renamed from: f */
    default void m9728f(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    /* renamed from: g */
    boolean mo9718g();

    default InterfaceC7919a getHeight() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return m9727d(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), mo9718g() ? getView().getPaddingTop() + getView().getPaddingBottom() : 0);
    }

    default C7923e getSize() {
        InterfaceC7919a height;
        InterfaceC7919a width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new C7923e(width, height);
    }

    View getView();

    default InterfaceC7919a getWidth() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return m9727d(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), mo9718g() ? getView().getPaddingLeft() + getView().getPaddingRight() : 0);
    }
}
