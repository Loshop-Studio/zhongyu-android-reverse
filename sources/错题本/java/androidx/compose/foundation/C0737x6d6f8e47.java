package androidx.compose.foundation;

import android.view.Surface;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC6009v;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003JW\u0010\r\u001a\u00020\u000b*\u00020\u00042A\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\b\fH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u00020\u000b*\u00020\u00042\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\fH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m5110d2 = {"androidx/compose/foundation/BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1", "Landroidx/compose/foundation/SurfaceCoroutineScope;", "Landroidx/compose/foundation/SurfaceScope;", "Lkotlinx/coroutines/v;", "Landroid/view/Surface;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "width", "height", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "onChanged", "(Landroid/view/Surface;Lr6/f;)V", "Lkotlin/Function1;", "onDestroyed", "(Landroid/view/Surface;Lr6/c;)V", "Lh6/h;", "getCoroutineContext", "()Lh6/h;", "coroutineContext", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 */
/* loaded from: classes.dex */
public final class C0737x6d6f8e47 implements SurfaceCoroutineScope, SurfaceScope, InterfaceC6009v {
    private final /* synthetic */ BaseAndroidExternalSurfaceState $$delegate_0;
    private final /* synthetic */ InterfaceC6009v $$delegate_1;

    public C0737x6d6f8e47(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, InterfaceC6009v interfaceC6009v) {
        this.$$delegate_0 = baseAndroidExternalSurfaceState;
        this.$$delegate_1 = interfaceC6009v;
    }

    @Override // androidx.compose.foundation.SurfaceCoroutineScope, kotlinx.coroutines.InterfaceC6009v
    public InterfaceC5636h getCoroutineContext() {
        return this.$$delegate_1.getCoroutineContext();
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(Surface surface, InterfaceC6474f interfaceC6474f) {
        this.$$delegate_0.onChanged(surface, interfaceC6474f);
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(Surface surface, InterfaceC6471c interfaceC6471c) {
        this.$$delegate_0.onDestroyed(surface, interfaceC6471c);
    }
}
