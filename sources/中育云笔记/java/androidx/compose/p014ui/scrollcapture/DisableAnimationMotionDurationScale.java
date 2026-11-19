package androidx.compose.p014ui.scrollcapture;

import androidx.compose.p014ui.MotionDurationScale;
import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
final class DisableAnimationMotionDurationScale implements MotionDurationScale {
    public static final DisableAnimationMotionDurationScale INSTANCE = new DisableAnimationMotionDurationScale();

    private DisableAnimationMotionDurationScale() {
    }

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
        return 0.0f;
    }

    @Override // androidx.compose.p014ui.MotionDurationScale, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c cVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.p014ui.MotionDurationScale, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d plus(InterfaceC9945d interfaceC9945d) {
        return MotionDurationScale.DefaultImpls.plus(this, interfaceC9945d);
    }
}
