package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Stable
@Metadata(m5174d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B2\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\bJ&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0010J(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0010R\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m5175d2 = {"Landroidx/compose/material3/ButtonElevation;", "", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "animateElevation", "Landroidx/compose/runtime/State;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "hashCode", "", "shadowElevation", "shadowElevation$material3_release", "tonalElevation", "tonalElevation$material3_release", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ButtonElevation {
    private final float defaultElevation;
    private final float disabledElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    @Metadata(m5176k = 3, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "androidx.compose.material3.ButtonElevation$animateElevation$2", m5192f = "Button.kt", m5193i = {}, m5194l = {855}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.material3.ButtonElevation$animateElevation$2 */
    public static final class C09412 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<C1700Dp, AnimationVector1D> $animatable;
        final /* synthetic */ float $target;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09412(Animatable<C1700Dp, AnimationVector1D> animatable, float f4, Continuation<? super C09412> continuation) {
            super(2, continuation);
            this.$animatable = animatable;
            this.$target = f4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C09412(this.$animatable, this.$target, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<C1700Dp, AnimationVector1D> animatable = this.$animatable;
                C1700Dp c1700DpM11523boximpl = C1700Dp.m11523boximpl(this.$target);
                this.label = 1;
                if (animatable.snapTo(c1700DpM11523boximpl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09412) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m5176k = 3, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "androidx.compose.material3.ButtonElevation$animateElevation$3", m5192f = "Button.kt", m5193i = {}, m5194l = {864}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.material3.ButtonElevation$animateElevation$3 */
    public static final class C09423 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<C1700Dp, AnimationVector1D> $animatable;
        final /* synthetic */ Interaction $interaction;
        final /* synthetic */ float $target;
        int label;
        final /* synthetic */ ButtonElevation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09423(Animatable<C1700Dp, AnimationVector1D> animatable, ButtonElevation buttonElevation, float f4, Interaction interaction, Continuation<? super C09423> continuation) {
            super(2, continuation);
            this.$animatable = animatable;
            this.this$0 = buttonElevation;
            this.$target = f4;
            this.$interaction = interaction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C09423(this.$animatable, this.this$0, this.$target, this.$interaction, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                float fM11539unboximpl = this.$animatable.getTargetValue().m11539unboximpl();
                Interaction focus = null;
                if (C1700Dp.m11530equalsimpl0(fM11539unboximpl, this.this$0.pressedElevation)) {
                    focus = new PressInteraction.Press(Offset.INSTANCE.m8961getZeroF1C5BW0(), null);
                } else if (C1700Dp.m11530equalsimpl0(fM11539unboximpl, this.this$0.hoveredElevation)) {
                    focus = new HoverInteraction.Enter();
                } else if (C1700Dp.m11530equalsimpl0(fM11539unboximpl, this.this$0.focusedElevation)) {
                    focus = new FocusInteraction.Focus();
                }
                Animatable<C1700Dp, AnimationVector1D> animatable = this.$animatable;
                float f4 = this.$target;
                Interaction interaction = this.$interaction;
                this.label = 1;
                if (ElevationKt.m7964animateElevationrAjV9yQ(animatable, f4, focus, interaction, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09423) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ ButtonElevation(float f4, float f5, float f6, float f7, float f8, DefaultConstructorMarker defaultConstructorMarker) {
        this(f4, f5, f6, f7, f8);
    }

    @Composable
    private final State<C1700Dp> animateElevation(boolean z3, InteractionSource interactionSource, Composer composer, int i4) {
        composer.startReplaceableGroup(-1312510462);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1312510462, i4, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:803)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
        int i5 = (i4 >> 3) & 14;
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(interactionSource) | composer.changed(snapshotStateList);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new ButtonElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, i5 | 64);
        Interaction interaction = (Interaction) CollectionsKt___CollectionsKt.lastOrNull((List) snapshotStateList);
        float f4 = !z3 ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Animatable(C1700Dp.m11523boximpl(f4), VectorConvertersKt.getVectorConverter(C1700Dp.INSTANCE), null, 4, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue3;
        if (z3) {
            composer.startReplaceableGroup(-719929769);
            EffectsKt.LaunchedEffect(C1700Dp.m11523boximpl(f4), new C09423(animatable, this, f4, interaction, null), composer, 64);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-719929912);
            EffectsKt.LaunchedEffect(C1700Dp.m11523boximpl(f4), new C09412(animatable, f4, null), composer, 64);
            composer.endReplaceableGroup();
        }
        State<C1700Dp> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof ButtonElevation)) {
            return false;
        }
        ButtonElevation buttonElevation = (ButtonElevation) other;
        return C1700Dp.m11530equalsimpl0(this.defaultElevation, buttonElevation.defaultElevation) && C1700Dp.m11530equalsimpl0(this.pressedElevation, buttonElevation.pressedElevation) && C1700Dp.m11530equalsimpl0(this.focusedElevation, buttonElevation.focusedElevation) && C1700Dp.m11530equalsimpl0(this.hoveredElevation, buttonElevation.hoveredElevation) && C1700Dp.m11530equalsimpl0(this.disabledElevation, buttonElevation.disabledElevation);
    }

    public int hashCode() {
        return (((((((C1700Dp.m11531hashCodeimpl(this.defaultElevation) * 31) + C1700Dp.m11531hashCodeimpl(this.pressedElevation)) * 31) + C1700Dp.m11531hashCodeimpl(this.focusedElevation)) * 31) + C1700Dp.m11531hashCodeimpl(this.hoveredElevation)) * 31) + C1700Dp.m11531hashCodeimpl(this.disabledElevation);
    }

    @Composable
    public final State<C1700Dp> shadowElevation$material3_release(boolean z3, InteractionSource interactionSource, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-2045116089);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045116089, i4, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:795)");
        }
        State<C1700Dp> stateAnimateElevation = animateElevation(z3, interactionSource, composer, (i4 & 896) | (i4 & 14) | (i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateElevation;
    }

    @Composable
    public final State<C1700Dp> tonalElevation$material3_release(boolean z3, InteractionSource interactionSource, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-423890235);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-423890235, i4, -1, "androidx.compose.material3.ButtonElevation.tonalElevation (Button.kt:779)");
        }
        State<C1700Dp> stateAnimateElevation = animateElevation(z3, interactionSource, composer, (i4 & 896) | (i4 & 14) | (i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateElevation;
    }

    private ButtonElevation(float f4, float f5, float f6, float f7, float f8) {
        this.defaultElevation = f4;
        this.pressedElevation = f5;
        this.focusedElevation = f6;
        this.hoveredElevation = f7;
        this.disabledElevation = f8;
    }
}
