package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.p011ui.unit.VelocityKt;
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
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aÍ\u0001\u0010\u001f\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2>\b\u0002\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012¢\u0006\u0002\b\u001a2>\b\u0002\u0010\u001d\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012¢\u0006\u0002\b\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001e\u0010#\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001e\u0010#\u001a\u00020\u0001*\u00020$2\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010\"\u001a\u0016\u0010(\u001a\u00020$*\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\"J\u0010)\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012¢\u0006\u0002\b\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"J\u0010+\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012¢\u0006\u0002\b\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, m5110d2 = {"Lkotlin/Function1;", "", "Ld6/s;", "onDelta", "Landroidx/compose/foundation/gestures/DraggableState;", "DraggableState", "(Lr6/c;)Landroidx/compose/foundation/gestures/DraggableState;", "rememberDraggableState", "(Lr6/c;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/v;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startedPosition", "Lh6/c;", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "velocity", "onDragStopped", "reverseDirection", "draggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLr6/f;Lr6/f;Z)Landroidx/compose/ui/Modifier;", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "toFloat", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "toValidVelocity-TH1AsA0", "(J)J", "toValidVelocity", "NoOpOnDragStarted", "Lr6/f;", "NoOpOnDragStopped", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,640:1\n1247#2,6:641\n69#3:647\n65#3:650\n70#4:648\n60#4:651\n22#5:649\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n130#1:641,6\n630#1:647\n630#1:650\n630#1:648\n630#1:651\n630#1:649\n*E\n"})
/* loaded from: classes.dex */
public final class DraggableKt {

    @NotNull
    private static final InterfaceC6474f NoOpOnDragStarted = new DraggableKt$NoOpOnDragStarted$1(null);

    @NotNull
    private static final InterfaceC6474f NoOpOnDragStopped = new DraggableKt$NoOpOnDragStopped$1(null);

    @NotNull
    public static final DraggableState DraggableState(@NotNull InterfaceC6471c interfaceC6471c) {
        return new DefaultDraggableState(interfaceC6471c);
    }

    @Stable
    @NotNull
    public static final Modifier draggable(@NotNull Modifier modifier, @NotNull DraggableState draggableState, @NotNull Orientation orientation, boolean z8, @Nullable MutableInteractionSource mutableInteractionSource, boolean z9, @NotNull InterfaceC6474f interfaceC6474f, @NotNull InterfaceC6474f interfaceC6474f2, boolean z10) {
        return modifier.then(new DraggableElement(draggableState, orientation, z8, mutableInteractionSource, z9, interfaceC6474f, interfaceC6474f2, z10));
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z8, MutableInteractionSource mutableInteractionSource, boolean z9, InterfaceC6474f interfaceC6474f, InterfaceC6474f interfaceC6474f2, boolean z10, int i, Object obj) {
        if ((i & 4) != 0) {
            z8 = true;
        }
        boolean z11 = z8;
        if ((i & 8) != 0) {
            mutableInteractionSource = null;
        }
        return draggable(modifier, draggableState, orientation, z11, mutableInteractionSource, (i & 16) != 0 ? false : z9, (i & 32) != 0 ? NoOpOnDragStarted : interfaceC6474f, (i & 64) != 0 ? NoOpOnDragStopped : interfaceC6474f2, (i & 128) != 0 ? false : z10);
    }

    @Composable
    @NotNull
    public static final DraggableState rememberDraggableState(@NotNull InterfaceC6471c interfaceC6471c, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:127)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC6471c, composer, i & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = DraggableState(new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).floatValue());
                    return C5443s.f8405a;
                }

                public final void invoke(float f) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f));
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
    public static final float m6988toFloat3MmeM6k(long j7, Orientation orientation) {
        return Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j7 & 4294967295L : j7 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m6989toFloatsFctU(long j7, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m13544getYimpl(j7) : Velocity.m13543getXimpl(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toValidVelocity-TH1AsA0, reason: not valid java name */
    public static final long m6990toValidVelocityTH1AsA0(long j7) {
        return VelocityKt.Velocity(Float.isNaN(Velocity.m13543getXimpl(j7)) ? 0.0f : Velocity.m13543getXimpl(j7), Float.isNaN(Velocity.m13544getYimpl(j7)) ? 0.0f : Velocity.m13544getYimpl(j7));
    }
}
