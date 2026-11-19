package androidx.compose.foundation;

import android.view.Surface;
import kotlin.coroutines.InterfaceC9100d;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

/* renamed from: androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 */
/* loaded from: classes.dex */
public final class C1146x6d6f8e47 implements SurfaceCoroutineScope, SurfaceScope, InterfaceC8822b0 {
    private final /* synthetic */ BaseAndroidExternalSurfaceState $$delegate_0;
    private final /* synthetic */ InterfaceC8822b0 $$delegate_1;

    public C1146x6d6f8e47(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, InterfaceC8822b0 interfaceC8822b0) {
        this.$$delegate_0 = baseAndroidExternalSurfaceState;
        this.$$delegate_1 = interfaceC8822b0;
    }

    @Override // androidx.compose.foundation.SurfaceCoroutineScope, p135i8.InterfaceC8822b0
    public InterfaceC9100d getCoroutineContext() {
        return this.$$delegate_1.getCoroutineContext();
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(Surface surface, InterfaceC10575q interfaceC10575q) {
        this.$$delegate_0.onChanged(surface, interfaceC10575q);
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(Surface surface, InterfaceC10570l interfaceC10570l) {
        this.$$delegate_0.onDestroyed(surface, interfaceC10570l);
    }
}
