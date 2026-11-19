package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.p013ui.unit.VelocityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
public final class DraggableKt {
    private static final InterfaceC10575q NoOpOnDragStarted = new DraggableKt$NoOpOnDragStarted$1(null);
    private static final InterfaceC10575q NoOpOnDragStopped = new DraggableKt$NoOpOnDragStopped$1(null);

    public static final DraggableState DraggableState(InterfaceC10570l interfaceC10570l) {
        return new DefaultDraggableState(interfaceC10570l);
    }

    @Stable
    public static final Modifier draggable(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, InterfaceC10575q interfaceC10575q, InterfaceC10575q interfaceC10575q2, boolean z12) {
        return modifier.then(new DraggableElement(draggableState, orientation, z10, mutableInteractionSource, z11, interfaceC10575q, interfaceC10575q2, z12));
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, InterfaceC10575q interfaceC10575q, InterfaceC10575q interfaceC10575q2, boolean z12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            mutableInteractionSource = null;
        }
        return draggable(modifier, draggableState, orientation, z13, mutableInteractionSource, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? NoOpOnDragStarted : interfaceC10575q, (i10 & 64) != 0 ? NoOpOnDragStopped : interfaceC10575q2, (i10 & 128) != 0 ? false : z12);
    }

    @Composable
    public static final DraggableState rememberDraggableState(InterfaceC10570l interfaceC10570l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i10, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:127)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC10570l, composer, i10 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = DraggableState(new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).floatValue());
                    return C8736p.f16368a;
                }

                public final void invoke(float f10) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f10));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        DraggableState draggableState = (DraggableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m20582toFloat3MmeM6k(long j10, Orientation orientation) {
        return Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j10 & 4294967295L : j10 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m20583toFloatsFctU(long j10, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m27138getYimpl(j10) : Velocity.m27137getXimpl(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toValidVelocity-TH1AsA0, reason: not valid java name */
    public static final long m20584toValidVelocityTH1AsA0(long j10) {
        return VelocityKt.Velocity(Float.isNaN(Velocity.m27137getXimpl(j10)) ? 0.0f : Velocity.m27137getXimpl(j10), Float.isNaN(Velocity.m27138getYimpl(j10)) ? 0.0f : Velocity.m27138getYimpl(j10));
    }
}
