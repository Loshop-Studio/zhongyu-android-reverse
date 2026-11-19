package androidx.camera.core.processing;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.CancellationSignal;
import androidx.transition.FragmentTransitionSupport;
import androidx.transition.Transition;
import java.util.Map;

/* renamed from: androidx.camera.core.processing.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C0425g implements CallbackToFutureAdapter.Resolver, CancellationSignal.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ int f530a;

    /* renamed from: b */
    public final /* synthetic */ Object f531b;

    /* renamed from: c */
    public final /* synthetic */ Object f532c;

    /* renamed from: d */
    public final /* synthetic */ Object f533d;

    public /* synthetic */ C0425g(Object obj, Object obj2, int i, Object obj3) {
        this.f530a = i;
        this.f533d = obj;
        this.f531b = obj2;
        this.f532c = obj3;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f530a) {
            case 0:
                return ((DefaultSurfaceProcessor) this.f533d).lambda$initGlRenderer$10((DynamicRange) this.f531b, (Map) this.f532c, completer);
            default:
                return ((DualSurfaceProcessor) this.f533d).lambda$initGlRenderer$6((DynamicRange) this.f531b, (Map) this.f532c, completer);
        }
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        FragmentTransitionSupport.lambda$setListenerForTransitionEnd$0((Runnable) this.f533d, (Transition) this.f531b, (Runnable) this.f532c);
    }
}
