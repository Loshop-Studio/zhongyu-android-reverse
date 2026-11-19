package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 2)
@Metadata(m13412d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\u001b\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H ¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0016H ¢\u0006\u0002\b\u001bR\"\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000@`X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000@`X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\t\u0082\u0001\u0003\u001c\u001d\u001e¨\u0006\u001f"}, m13413d2 = {"Landroidx/compose/animation/core/TransitionState;", ExifInterface.LATITUDE_SOUTH, "", "()V", "<set-?>", "currentState", "getCurrentState", "()Ljava/lang/Object;", "setCurrentState$animation_core_release", "(Ljava/lang/Object;)V", "", "isRunning", "isRunning$animation_core_release", "()Z", "setRunning$animation_core_release", "(Z)V", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "targetState", "getTargetState", "setTargetState$animation_core_release", "transitionConfigured", "", "transition", "Landroidx/compose/animation/core/Transition;", "transitionConfigured$animation_core_release", "transitionRemoved", "transitionRemoved$animation_core_release", "Landroidx/compose/animation/core/MutableTransitionState;", "Landroidx/compose/animation/core/PreventExhaustiveWhenTransitionState;", "Landroidx/compose/animation/core/SeekableTransitionState;", "animation-core_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2141:1\n85#2:2142\n113#2,2:2143\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n*L\n122#1:2142\n122#1:2143,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class TransitionState<S> {
    public static final int $stable = 0;

    /* renamed from: isRunning$delegate, reason: from kotlin metadata */
    private final MutableState isRunning;

    public /* synthetic */ TransitionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract S getCurrentState();

    public abstract S getTargetState();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRunning$animation_core_release() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public abstract void setCurrentState$animation_core_release(S s9);

    public final void setRunning$animation_core_release(boolean z9) {
        this.isRunning.setValue(Boolean.valueOf(z9));
    }

    public abstract void setTargetState$animation_core_release(S s9);

    public abstract void transitionConfigured$animation_core_release(Transition<S> transition);

    public abstract void transitionRemoved$animation_core_release();

    private TransitionState() {
        this.isRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }
}
