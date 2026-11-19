package p307z;

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
import p307z.InterfaceC9971a;

/* renamed from: z.i */
/* loaded from: classes3.dex */
public interface InterfaceC9979i extends InterfaceC9977g {

    /* renamed from: z.i$a */
    public static final class a implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ ViewTreeObserver f17951b;

        /* renamed from: c */
        public final /* synthetic */ b f17952c;

        public a(ViewTreeObserver viewTreeObserver, b bVar) {
            this.f17951b = viewTreeObserver;
            this.f17952c = bVar;
        }

        /* renamed from: a */
        public final void m17268a(Throwable th) {
            InterfaceC9979i.this.m17267f(this.f17951b, this.f17952c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m17268a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: z.i$b */
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public boolean f17953a;

        /* renamed from: c */
        public final /* synthetic */ ViewTreeObserver f17955c;

        /* renamed from: d */
        public final /* synthetic */ CancellableContinuation f17956d;

        public b(ViewTreeObserver viewTreeObserver, CancellableContinuation cancellableContinuation) {
            this.f17955c = viewTreeObserver;
            this.f17956d = cancellableContinuation;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C9975e size = InterfaceC9979i.this.getSize();
            if (size != null) {
                InterfaceC9979i.this.m17267f(this.f17955c, this);
                if (!this.f17953a) {
                    this.f17953a = true;
                    this.f17956d.resumeWith(Result.m24758constructorimpl(size));
                }
            }
            return true;
        }
    }

    /* renamed from: c */
    static /* synthetic */ Object m17264c(InterfaceC9979i interfaceC9979i, Continuation continuation) {
        C9975e size = interfaceC9979i.getSize();
        if (size != null) {
            return size;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ViewTreeObserver viewTreeObserver = interfaceC9979i.getView().getViewTreeObserver();
        b bVar = interfaceC9979i.new b(viewTreeObserver, cancellableContinuationImpl);
        viewTreeObserver.addOnPreDrawListener(bVar);
        cancellableContinuationImpl.invokeOnCancellation(interfaceC9979i.new a(viewTreeObserver, bVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // p307z.InterfaceC9977g
    /* renamed from: a */
    default Object mo2661a(Continuation continuation) {
        return m17264c(this, continuation);
    }

    /* renamed from: d */
    default InterfaceC9971a m17266d(int i9, int i10, int i11) {
        if (i9 == -2) {
            return InterfaceC9971a.b.f17939a;
        }
        int i12 = i9 - i11;
        if (i12 > 0) {
            return InterfaceC9971a.a.m17250a(AbstractC9972b.m17256a(i12));
        }
        int i13 = i10 - i11;
        if (i13 > 0) {
            return InterfaceC9971a.a.m17250a(AbstractC9972b.m17256a(i13));
        }
        return null;
    }

    /* renamed from: f */
    default void m17267f(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    /* renamed from: g */
    boolean mo17257g();

    default InterfaceC9971a getHeight() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return m17266d(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), mo17257g() ? getView().getPaddingTop() + getView().getPaddingBottom() : 0);
    }

    default C9975e getSize() {
        InterfaceC9971a height;
        InterfaceC9971a width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new C9975e(width, height);
    }

    View getView();

    default InterfaceC9971a getWidth() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return m17266d(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), mo17257g() ? getView().getPaddingLeft() + getView().getPaddingRight() : 0);
    }
}
