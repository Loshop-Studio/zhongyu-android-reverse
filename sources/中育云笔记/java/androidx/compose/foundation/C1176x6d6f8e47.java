package androidx.compose.foundation;

import android.view.Surface;
import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import sd.InterfaceC11122i0;

/* renamed from: androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 */
/* loaded from: classes.dex */
public final class C1176x6d6f8e47 implements SurfaceCoroutineScope, SurfaceScope, InterfaceC11122i0 {
    private final /* synthetic */ BaseAndroidExternalSurfaceState $$delegate_0;
    private final /* synthetic */ InterfaceC11122i0 $$delegate_1;

    public C1176x6d6f8e47(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, InterfaceC11122i0 interfaceC11122i0) {
        this.$$delegate_0 = baseAndroidExternalSurfaceState;
        this.$$delegate_1 = interfaceC11122i0;
    }

    @Override // androidx.compose.foundation.SurfaceCoroutineScope, sd.InterfaceC11122i0
    public InterfaceC9945d getCoroutineContext() {
        return this.$$delegate_1.getCoroutineContext();
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(Surface surface, InterfaceC9545q interfaceC9545q) {
        this.$$delegate_0.onChanged(surface, interfaceC9545q);
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(Surface surface, InterfaceC9540l interfaceC9540l) {
        this.$$delegate_0.onDestroyed(surface, interfaceC9540l);
    }
}
