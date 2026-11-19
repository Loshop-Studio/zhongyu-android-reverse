package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u008f\u0001\u0010\u0018\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2#\b\u0002\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00020\u00002#\b\u0002\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"/\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"/\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m5110d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Ld6/s;", "onDelta", "Landroidx/compose/foundation/gestures/Draggable2DState;", "Draggable2DState", "(Lr6/c;)Landroidx/compose/foundation/gestures/Draggable2DState;", "rememberDraggable2DState", "(Lr6/c;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/Draggable2DState;", "Landroidx/compose/ui/Modifier;", "state", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startedPosition", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped", "reverseDirection", "draggable2D", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/Draggable2DState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLr6/c;Lr6/c;Z)Landroidx/compose/ui/Modifier;", "NoOpOnDragStart", "Lr6/c;", "NoOpOnDragStop", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDraggable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,329:1\n1247#2,6:330\n*S KotlinDebug\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DKt\n*L\n109#1:330,6\n*E\n"})
/* loaded from: classes.dex */
public final class Draggable2DKt {

    @NotNull
    private static final InterfaceC6471c NoOpOnDragStart = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStart$1
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m6981invokek4lQ0M(((Offset) obj).m10451unboximpl());
            return C5443s.f8405a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m6981invokek4lQ0M(long j7) {
        }
    };

    @NotNull
    private static final InterfaceC6471c NoOpOnDragStop = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStop$1
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m6982invokeTH1AsA0(((Velocity) obj).getPackedValue());
            return C5443s.f8405a;
        }

        /* renamed from: invoke-TH1AsA0, reason: not valid java name */
        public final void m6982invokeTH1AsA0(long j7) {
        }
    };

    @NotNull
    public static final Draggable2DState Draggable2DState(@NotNull InterfaceC6471c interfaceC6471c) {
        return new DefaultDraggable2DState(interfaceC6471c);
    }

    @Stable
    @NotNull
    public static final Modifier draggable2D(@NotNull Modifier modifier, @NotNull Draggable2DState draggable2DState, boolean z8, @Nullable MutableInteractionSource mutableInteractionSource, boolean z9, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6471c interfaceC6471c2, boolean z10) {
        return modifier.then(new Draggable2DElement(draggable2DState, z8, mutableInteractionSource, z9, interfaceC6471c, interfaceC6471c2, z10));
    }

    @Composable
    @NotNull
    public static final Draggable2DState rememberDraggable2DState(@NotNull InterfaceC6471c interfaceC6471c, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1150277615, i, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:106)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC6471c, composer, i & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = Draggable2DState(new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$rememberDraggable2DState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m6983invokek4lQ0M(((Offset) obj).m10451unboximpl());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m6983invokek4lQ0M(long j7) {
                    stateRememberUpdatedState.getValue().invoke(Offset.m10430boximpl(j7));
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
