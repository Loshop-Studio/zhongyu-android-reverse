package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Immutable
@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0017\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, m13558d2 = {"Landroidx/compose/material3/CardElevation;", "", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "animateElevation", "Landroidx/compose/runtime/State;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "hashCode", "", "shadowElevation", "shadowElevation$material3_release", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,851:1\n1223#2,6:852\n1223#2,6:858\n1223#2,6:864\n1223#2,6:870\n1223#2,6:876\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardElevation\n*L\n662#1:852,6\n672#1:858,6\n673#1:864,6\n725#1:870,6\n727#1:876,6\n*E\n"})
/* loaded from: classes2.dex */
public final class CardElevation {
    public static final int $stable = 0;
    private final float defaultElevation;
    private final float disabledElevation;
    private final float draggedElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ CardElevation(float f10, float f11, float f12, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15);
    }

    @Composable
    private final State<C3127Dp> animateElevation(boolean z9, InteractionSource interactionSource, Composer composer, int i10) {
        Animatable animatable;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1421890746, i10, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:670)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
        boolean z10 = true;
        boolean z11 = (((i10 & 112) ^ 48) > 32 && composer.changed(interactionSource)) || (i10 & 48) == 32;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z11 || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new CardElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, (i10 >> 3) & 14);
        Interaction interaction = (Interaction) CollectionsKt.lastOrNull((List) snapshotStateList);
        float f10 = !z9 ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : interaction instanceof DragInteraction.Start ? this.draggedElevation : this.defaultElevation;
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            Object animatable2 = new Animatable(C3127Dp.m23559boximpl(f10), VectorConvertersKt.getVectorConverter(C3127Dp.INSTANCE), null, null, 12, null);
            composer.updateRememberedValue(animatable2);
            objRememberedValue3 = animatable2;
        }
        Animatable animatable3 = (Animatable) objRememberedValue3;
        C3127Dp c3127DpM23559boximpl = C3127Dp.m23559boximpl(f10);
        boolean zChangedInstance = composer.changedInstance(animatable3) | composer.changed(f10) | ((((i10 & 14) ^ 6) > 4 && composer.changed(z9)) || (i10 & 6) == 4);
        if ((((i10 & 896) ^ 384) <= 256 || !composer.changed(this)) && (i10 & 384) != 256) {
            z10 = false;
        }
        boolean zChangedInstance2 = zChangedInstance | z10 | composer.changedInstance(interaction);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
            animatable = animatable3;
            Object cardElevation$animateElevation$2$1 = new CardElevation$animateElevation$2$1(animatable, f10, z9, this, interaction, null);
            composer.updateRememberedValue(cardElevation$animateElevation$2$1);
            objRememberedValue4 = cardElevation$animateElevation$2$1;
        } else {
            animatable = animatable3;
        }
        EffectsKt.LaunchedEffect(c3127DpM23559boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer, 0);
        State<C3127Dp> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAsState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof CardElevation)) {
            return false;
        }
        CardElevation cardElevation = (CardElevation) other;
        return C3127Dp.m23566equalsimpl0(this.defaultElevation, cardElevation.defaultElevation) && C3127Dp.m23566equalsimpl0(this.pressedElevation, cardElevation.pressedElevation) && C3127Dp.m23566equalsimpl0(this.focusedElevation, cardElevation.focusedElevation) && C3127Dp.m23566equalsimpl0(this.hoveredElevation, cardElevation.hoveredElevation) && C3127Dp.m23566equalsimpl0(this.disabledElevation, cardElevation.disabledElevation);
    }

    public int hashCode() {
        return (((((((C3127Dp.m23567hashCodeimpl(this.defaultElevation) * 31) + C3127Dp.m23567hashCodeimpl(this.pressedElevation)) * 31) + C3127Dp.m23567hashCodeimpl(this.focusedElevation)) * 31) + C3127Dp.m23567hashCodeimpl(this.hoveredElevation)) * 31) + C3127Dp.m23567hashCodeimpl(this.disabledElevation);
    }

    @Composable
    public final State<C3127Dp> shadowElevation$material3_release(boolean z9, InteractionSource interactionSource, Composer composer, int i10) {
        composer.startReplaceGroup(-1763481333);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763481333, i10, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:659)");
        }
        composer.startReplaceGroup(-734838460);
        if (interactionSource != null) {
            composer.endReplaceGroup();
            State<C3127Dp> stateAnimateElevation = animateElevation(z9, interactionSource, composer, i10 & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return stateAnimateElevation;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C3127Dp.m23559boximpl(this.defaultElevation), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return mutableState;
    }

    private CardElevation(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.focusedElevation = f12;
        this.hoveredElevation = f13;
        this.draggedElevation = f14;
        this.disabledElevation = f15;
    }
}
