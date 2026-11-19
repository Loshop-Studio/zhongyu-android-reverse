package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class Draggable2DKt {
    private static final InterfaceC10570l NoOpOnDragStart = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStart$1
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20575invokek4lQ0M(((Offset) obj).m24045unboximpl());
            return C8736p.f16368a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m20575invokek4lQ0M(long j10) {
        }
    };
    private static final InterfaceC10570l NoOpOnDragStop = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStop$1
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20576invokeTH1AsA0(((Velocity) obj).m27146unboximpl());
            return C8736p.f16368a;
        }

        /* renamed from: invoke-TH1AsA0, reason: not valid java name */
        public final void m20576invokeTH1AsA0(long j10) {
        }
    };

    public static final Draggable2DState Draggable2DState(InterfaceC10570l interfaceC10570l) {
        return new DefaultDraggable2DState(interfaceC10570l);
    }

    @Stable
    public static final Modifier draggable2D(Modifier modifier, Draggable2DState draggable2DState, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, boolean z12) {
        return modifier.then(new Draggable2DElement(draggable2DState, z10, mutableInteractionSource, z11, interfaceC10570l, interfaceC10570l2, z12));
    }

    @Composable
    public static final Draggable2DState rememberDraggable2DState(InterfaceC10570l interfaceC10570l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1150277615, i10, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:106)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC10570l, composer, i10 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = Draggable2DState(new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$rememberDraggable2DState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m20577invokek4lQ0M(((Offset) obj).m24045unboximpl());
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m20577invokek4lQ0M(long j10) {
                    stateRememberUpdatedState.getValue().invoke(Offset.m24024boximpl(j10));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        Draggable2DState draggable2DState = (Draggable2DState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return draggable2DState;
    }
}
