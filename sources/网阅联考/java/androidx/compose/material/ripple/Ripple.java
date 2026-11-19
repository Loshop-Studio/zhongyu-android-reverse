package androidx.compose.material.ripple;

import androidx.compose.foundation.AbstractC0431c;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Stable
@Metadata(m5174d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014JI\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H'ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, m5175d2 = {"Landroidx/compose/material/ripple/Ripple;", "Landroidx/compose/foundation/Indication;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "equals", "other", "", "hashCode", "", "rememberUpdatedInstance", "Landroidx/compose/foundation/IndicationInstance;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/IndicationInstance;", "rememberUpdatedRippleInstance", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "material-ripple_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,355:1\n76#2:356\n654#3:357\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n*L\n117#1:356\n119#1:357\n*E\n"})
/* loaded from: classes.dex */
public abstract class Ripple implements Indication {
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", m5192f = "Ripple.kt", m5193i = {}, m5194l = {136}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1 */
    public static final class C09161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RippleIndicationInstance $instance;
        final /* synthetic */ InteractionSource $interactionSource;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09161(InteractionSource interactionSource, RippleIndicationInstance rippleIndicationInstance, Continuation<? super C09161> continuation) {
            super(2, continuation);
            this.$interactionSource = interactionSource;
            this.$instance = rippleIndicationInstance;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C09161 c09161 = new C09161(this.$interactionSource, this.$instance, continuation);
            c09161.L$0 = obj;
            return c09161;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow<Interaction> interactions = this.$interactionSource.getInteractions();
                final RippleIndicationInstance rippleIndicationInstance = this.$instance;
                FlowCollector<Interaction> flowCollector = new FlowCollector<Interaction>() { // from class: androidx.compose.material.ripple.Ripple.rememberUpdatedInstance.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Interaction interaction, Continuation continuation) {
                        return emit2(interaction, (Continuation<? super Unit>) continuation);
                    }

                    /* renamed from: emit, reason: avoid collision after fix types in other method */
                    public final Object emit2(Interaction interaction, Continuation<? super Unit> continuation) {
                        if (interaction instanceof PressInteraction.Press) {
                            rippleIndicationInstance.addRipple((PressInteraction.Press) interaction, coroutineScope);
                        } else if (interaction instanceof PressInteraction.Release) {
                            rippleIndicationInstance.removeRipple(((PressInteraction.Release) interaction).getPress());
                        } else if (interaction instanceof PressInteraction.Cancel) {
                            rippleIndicationInstance.removeRipple(((PressInteraction.Cancel) interaction).getPress());
                        } else {
                            rippleIndicationInstance.updateStateLayer$material_ripple_release(interaction, coroutineScope);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (interactions.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C09161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ Ripple(boolean z3, float f4, State state, DefaultConstructorMarker defaultConstructorMarker) {
        this(z3, f4, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) other;
        return this.bounded == ripple.bounded && C1700Dp.m11530equalsimpl0(this.radius, ripple.radius) && Intrinsics.areEqual(this.color, ripple.color);
    }

    public int hashCode() {
        return (((AbstractC0431c.m162a(this.bounded) * 31) + C1700Dp.m11531hashCodeimpl(this.radius)) * 31) + this.color.hashCode();
    }

    @Override // androidx.compose.foundation.Indication
    @Composable
    public final IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(988743187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(988743187, i4, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:113)");
        }
        RippleTheme rippleTheme = (RippleTheme) composer.consume(RippleThemeKt.getLocalRippleTheme());
        composer.startReplaceableGroup(-1524341038);
        long jM9188unboximpl = (this.color.getValue().m9188unboximpl() > Color.INSTANCE.m9214getUnspecified0d7_KjU() ? 1 : (this.color.getValue().m9188unboximpl() == Color.INSTANCE.m9214getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? this.color.getValue().m9188unboximpl() : rippleTheme.mo7787defaultColorWaAFU9c(composer, 0);
        composer.endReplaceableGroup();
        RippleIndicationInstance rippleIndicationInstanceMo7785rememberUpdatedRippleInstance942rkJo = mo7785rememberUpdatedRippleInstance942rkJo(interactionSource, this.bounded, this.radius, SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(jM9188unboximpl), composer, 0), SnapshotStateKt.rememberUpdatedState(rippleTheme.rippleAlpha(composer, 0), composer, 0), composer, (i4 & 14) | ((i4 << 12) & 458752));
        EffectsKt.LaunchedEffect(rippleIndicationInstanceMo7785rememberUpdatedRippleInstance942rkJo, interactionSource, new C09161(interactionSource, rippleIndicationInstanceMo7785rememberUpdatedRippleInstance942rkJo, null), composer, ((i4 << 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 520);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rippleIndicationInstanceMo7785rememberUpdatedRippleInstance942rkJo;
    }

    @Composable
    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract RippleIndicationInstance mo7785rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z3, float f4, State<Color> state, State<RippleAlpha> state2, Composer composer, int i4);

    private Ripple(boolean z3, float f4, State<Color> state) {
        this.bounded = z3;
        this.radius = f4;
        this.color = state;
    }
}
