package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.MotionDurationScale;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
final class MotionDurationScaleImpl implements MotionDurationScale {
    private final MutableFloatState scaleFactor$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    @Override // androidx.compose.p014ui.MotionDurationScale, kotlin.coroutines.InterfaceC9945d
    public <R> R fold(R r10, InterfaceC9544p interfaceC9544p) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r10, interfaceC9544p);
    }

    @Override // androidx.compose.p014ui.MotionDurationScale, kotlin.coroutines.InterfaceC9945d.b, kotlin.coroutines.InterfaceC9945d
    public <E extends InterfaceC9945d.b> E get(InterfaceC9945d.c cVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.p014ui.MotionDurationScale
    public float getScaleFactor() {
        return this.scaleFactor$delegate.getFloatValue();
    }

    @Override // androidx.compose.p014ui.MotionDurationScale, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c cVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.p014ui.MotionDurationScale, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d plus(InterfaceC9945d interfaceC9945d) {
        return MotionDurationScale.DefaultImpls.plus(this, interfaceC9945d);
    }

    public void setScaleFactor(float f10) {
        this.scaleFactor$delegate.setFloatValue(f10);
    }
}
