package androidx.compose.p013ui.scrollcapture;

import androidx.compose.p013ui.MotionDurationScale;
import kotlin.coroutines.InterfaceC9100d;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
final class DisableAnimationMotionDurationScale implements MotionDurationScale {
    public static final DisableAnimationMotionDurationScale INSTANCE = new DisableAnimationMotionDurationScale();

    private DisableAnimationMotionDurationScale() {
    }

    @Override // androidx.compose.p013ui.MotionDurationScale, kotlin.coroutines.InterfaceC9100d
    public <R> R fold(R r10, InterfaceC10574p interfaceC10574p) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r10, interfaceC10574p);
    }

    @Override // androidx.compose.p013ui.MotionDurationScale, kotlin.coroutines.InterfaceC9100d.b, kotlin.coroutines.InterfaceC9100d
    public <E extends InterfaceC9100d.b> E get(InterfaceC9100d.c cVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.p013ui.MotionDurationScale
    public float getScaleFactor() {
        return 0.0f;
    }

    @Override // androidx.compose.p013ui.MotionDurationScale, kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d minusKey(InterfaceC9100d.c cVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.p013ui.MotionDurationScale, kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d plus(InterfaceC9100d interfaceC9100d) {
        return MotionDurationScale.DefaultImpls.plus(this, interfaceC9100d);
    }
}
