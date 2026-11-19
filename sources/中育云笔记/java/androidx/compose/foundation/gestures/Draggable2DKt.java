package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.unit.Velocity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class Draggable2DKt {
    private static final InterfaceC9540l NoOpOnDragStart = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStart$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m27177invokek4lQ0M(((Offset) obj).m30647unboximpl());
            return C10786q.f26013a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m27177invokek4lQ0M(long j10) {
        }
    };
    private static final InterfaceC9540l NoOpOnDragStop = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStop$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m27178invokeTH1AsA0(((Velocity) obj).m33748unboximpl());
            return C10786q.f26013a;
        }

        /* renamed from: invoke-TH1AsA0, reason: not valid java name */
        public final void m27178invokeTH1AsA0(long j10) {
        }
    };

    public static final Draggable2DState Draggable2DState(InterfaceC9540l interfaceC9540l) {
        return new DefaultDraggable2DState(interfaceC9540l);
    }

    @Stable
    public static final Modifier draggable2D(Modifier modifier, Draggable2DState draggable2DState, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, boolean z12) {
        return modifier.then(new Draggable2DElement(draggable2DState, z10, mutableInteractionSource, z11, interfaceC9540l, interfaceC9540l2, z12));
    }

    @Composable
    public static final Draggable2DState rememberDraggable2DState(InterfaceC9540l interfaceC9540l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1150277615, i10, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:106)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC9540l, composer, i10 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = Draggable2DState(new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$rememberDraggable2DState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m27179invokek4lQ0M(((Offset) obj).m30647unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m27179invokek4lQ0M(long j10) {
                    stateRememberUpdatedState.getValue().invoke(Offset.m30626boximpl(j10));
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
