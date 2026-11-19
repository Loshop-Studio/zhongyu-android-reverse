package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p006ui.AbstractC1266a;
import androidx.compose.p006ui.AbstractC1267b;
import androidx.compose.p006ui.ComposedModifierKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.input.key.Key;
import androidx.compose.p006ui.input.key.KeyEvent;
import androidx.compose.p006ui.input.key.KeyInputModifierKt;
import androidx.compose.p006ui.input.pointer.PointerInputScope;
import androidx.compose.p006ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p006ui.modifier.ModifierLocalConsumer;
import androidx.compose.p006ui.modifier.ModifierLocalReadScope;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.semantics.Role;
import androidx.compose.p006ui.semantics.SemanticsModifierKt;
import androidx.compose.p006ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p006ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(m5174d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a<\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0001ø\u0001\u0000¢\u0006\u0002\u0010\n\u001aW\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u0017\u001aE\u0010\u000b\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u0018\u001a\u0089\u0001\u0010\u0019\u001a\u00020\f*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u001d\u001aw\u0010\u0019\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u001e\u001a©\u0001\u0010\u001f\u001a\u00020\f*\u00020\f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020\"2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b&\u001aQ\u0010'\u001a\u00020\u0001*\u00020(2\u0006\u0010)\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00160$H\u0080@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006-"}, m5175d2 = {"PressedInteractionSourceDisposableEffect", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "pressedInteraction", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "currentKeyPressInteractions", "", "Landroidx/compose/ui/input/key/Key;", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Ljava/util/Map;Landroidx/compose/runtime/Composer;I)V", "clickable", "Landroidx/compose/ui/Modifier;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "clickable-O2vRcR0", "clickable-XHw0xAI", "combinedClickable", "onLongClickLabel", "onLongClick", "onDoubleClick", "combinedClickable-XVZzFYc", "combinedClickable-cJG_KMw", "genericClickableWithoutGesture", "gestureModifiers", "indicationScope", "Lkotlinx/coroutines/CoroutineScope;", "keyClickOffset", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/geometry/Offset;", "genericClickableWithoutGesture-bdNGguI", "handlePressInteraction", "Landroidx/compose/foundation/gestures/PressGestureScope;", "pressPoint", "delayPressInteraction", "handlePressInteraction-EPk0efs", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,565:1\n135#2:566\n135#2:567\n135#2:568\n135#2:569\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n86#1:566\n198#1:567\n243#1:568\n395#1:569\n*E\n"})
/* loaded from: classes.dex */
public final class ClickableKt {
    @Composable
    public static final void PressedInteractionSourceDisposableEffect(final MutableInteractionSource interactionSource, final MutableState<PressInteraction.Press> pressedInteraction, final Map<Key, PressInteraction.Press> currentKeyPressInteractions, Composer composer, final int i4) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(pressedInteraction, "pressedInteraction");
        Intrinsics.checkNotNullParameter(currentKeyPressInteractions, "currentKeyPressInteractions");
        Composer composerStartRestartGroup = composer.startRestartGroup(1297229208);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1297229208, i4, -1, "androidx.compose.foundation.PressedInteractionSourceDisposableEffect (Clickable.kt:409)");
        }
        EffectsKt.DisposableEffect(interactionSource, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.ClickableKt.PressedInteractionSourceDisposableEffect.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final MutableState<PressInteraction.Press> mutableState = pressedInteraction;
                final Map<Key, PressInteraction.Press> map = currentKeyPressInteractions;
                final MutableInteractionSource mutableInteractionSource = interactionSource;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        PressInteraction.Press press = (PressInteraction.Press) mutableState.getValue();
                        if (press != null) {
                            mutableInteractionSource.tryEmit(new PressInteraction.Cancel(press));
                            mutableState.setValue(null);
                        }
                        Iterator it = map.values().iterator();
                        while (it.hasNext()) {
                            mutableInteractionSource.tryEmit(new PressInteraction.Cancel((PressInteraction.Press) it.next()));
                        }
                        map.clear();
                    }
                };
            }
        }, composerStartRestartGroup, i4 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ClickableKt.PressedInteractionSourceDisposableEffect.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                ClickableKt.PressedInteractionSourceDisposableEffect(interactionSource, pressedInteraction, currentKeyPressInteractions, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
            }
        });
    }

    /* renamed from: clickable-O2vRcR0, reason: not valid java name */
    public static final Modifier m7089clickableO2vRcR0(Modifier clickable, final MutableInteractionSource interactionSource, final Indication indication, final boolean z3, final String str, final Role role, final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(clickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier composed, Composer composer, int i4) {
                Boolean bool;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(92076020);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(92076020, i4, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:135)");
                }
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onClick, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LinkedHashMap();
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Map map = (Map) objRememberedValue2;
                composer.startReplaceableGroup(1841981561);
                if (z3) {
                    ClickableKt.PressedInteractionSourceDisposableEffect(interactionSource, mutableState, map, composer, 560);
                }
                composer.endReplaceableGroup();
                final Function0<Boolean> function0IsComposeRootInScrollableContainer = Clickable_androidKt.isComposeRootInScrollableContainer(composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) objRememberedValue3;
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(mutableState2) | composer.changed(function0IsComposeRootInScrollableContainer);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$delayPressInteraction$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(mutableState2.getValue().booleanValue() || function0IsComposeRootInScrollableContainer.invoke().booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(objRememberedValue4, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue5 = composer.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m8934boximpl(Offset.INSTANCE.m8961getZeroF1C5BW0()), null, 2, null);
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceableGroup();
                MutableState mutableState3 = (MutableState) objRememberedValue5;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MutableInteractionSource mutableInteractionSource = interactionSource;
                Boolean boolValueOf = Boolean.valueOf(z3);
                MutableInteractionSource mutableInteractionSource2 = interactionSource;
                Object[] objArr = {mutableState3, Boolean.valueOf(z3), mutableInteractionSource2, mutableState, stateRememberUpdatedState2, stateRememberUpdatedState};
                boolean z4 = z3;
                composer.startReplaceableGroup(-568225417);
                int i5 = 0;
                boolean zChanged2 = false;
                for (int i6 = 6; i5 < i6; i6 = 6) {
                    zChanged2 |= composer.changed(objArr[i5]);
                    i5++;
                }
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    bool = boolValueOf;
                    objRememberedValue6 = new ClickableKt$clickable$4$gesture$1$1(mutableState3, z4, mutableInteractionSource2, mutableState, stateRememberUpdatedState2, stateRememberUpdatedState, null);
                    composer.updateRememberedValue(objRememberedValue6);
                } else {
                    bool = boolValueOf;
                }
                composer.endReplaceableGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource, bool, (Function2) objRememberedValue6);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue7 = composer.rememberedValue();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objRememberedValue7 == companion4.getEmpty()) {
                    objRememberedValue7 = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$1$1
                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
                        public /* synthetic */ boolean all(Function1 function1) {
                            return AbstractC1267b.m309a(this, function1);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
                        public /* synthetic */ boolean any(Function1 function1) {
                            return AbstractC1267b.m310b(this, function1);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
                        public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
                            return AbstractC1267b.m311c(this, obj, function2);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
                        public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
                            return AbstractC1267b.m312d(this, obj, function2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // androidx.compose.p006ui.modifier.ModifierLocalConsumer
                        public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
                            Intrinsics.checkNotNullParameter(scope, "scope");
                            mutableState2.setValue(scope.getCurrent(ScrollableKt.getModifierLocalScrollableContainer()));
                        }

                        @Override // androidx.compose.p006ui.Modifier
                        public /* synthetic */ Modifier then(Modifier modifier) {
                            return AbstractC1266a.m307a(this, modifier);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue7);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = companion3.then((Modifier) objRememberedValue7);
                MutableInteractionSource mutableInteractionSource3 = interactionSource;
                Indication indication2 = indication;
                composer.startReplaceableGroup(773894976);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue8 = composer.rememberedValue();
                if (objRememberedValue8 == companion4.getEmpty()) {
                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue8 = compositionScopedCoroutineScopeCanceller;
                }
                composer.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue8).getCoroutineScope();
                composer.endReplaceableGroup();
                Modifier modifierM7097genericClickableWithoutGesturebdNGguI = ClickableKt.m7097genericClickableWithoutGesturebdNGguI(modifierThen, modifierPointerInput, mutableInteractionSource3, indication2, coroutineScope, map, mutableState3, z3, str, role, null, null, onClick);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM7097genericClickableWithoutGesturebdNGguI;
            }
        });
    }

    /* renamed from: clickable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7090clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z3, String str, Role role, Function0 function0, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = true;
        }
        return m7089clickableO2vRcR0(modifier, mutableInteractionSource, indication, z3, (i4 & 8) != 0 ? null : str, (i4 & 16) != 0 ? null : role, function0);
    }

    /* renamed from: clickable-XHw0xAI, reason: not valid java name */
    public static final Modifier m7091clickableXHw0xAI(Modifier clickable, final boolean z3, final String str, final Role role, final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(clickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier composed, Composer composer, int i4) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-756081143);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-756081143, i4, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:92)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierM7089clickableO2vRcR0 = ClickableKt.m7089clickableO2vRcR0(companion, (MutableInteractionSource) objRememberedValue, indication, z3, str, role, onClick);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM7089clickableO2vRcR0;
            }
        });
    }

    /* renamed from: clickable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7092clickableXHw0xAI$default(Modifier modifier, boolean z3, String str, Role role, Function0 function0, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        if ((i4 & 4) != 0) {
            role = null;
        }
        return m7091clickableXHw0xAI(modifier, z3, str, role, function0);
    }

    @ExperimentalFoundationApi
    /* renamed from: combinedClickable-XVZzFYc, reason: not valid java name */
    public static final Modifier m7093combinedClickableXVZzFYc(Modifier combinedClickable, final MutableInteractionSource interactionSource, final Indication indication, final boolean z3, final String str, final Role role, final String str2, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(combinedClickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("combinedClickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
                inspectorInfo.getProperties().set("onDoubleClick", function02);
                inspectorInfo.getProperties().set("onLongClick", function0);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier composed, Composer composer, int i4) {
                Object[] objArr;
                Map map;
                Modifier.Companion companion;
                MutableState mutableState;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1841718000);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1841718000, i4, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:306)");
                }
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onClick, composer, 0);
                State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function0, composer, 0);
                State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(function02, composer, 0);
                boolean z4 = function0 != null;
                boolean z5 = function02 != null;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) objRememberedValue;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = new LinkedHashMap();
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Map map2 = (Map) objRememberedValue2;
                composer.startReplaceableGroup(1321107720);
                if (z3) {
                    Boolean boolValueOf = Boolean.valueOf(z4);
                    final MutableInteractionSource mutableInteractionSource = interactionSource;
                    composer.startReplaceableGroup(511388516);
                    boolean zChanged = composer.changed(mutableState2) | composer.changed(mutableInteractionSource);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final MutableState<PressInteraction.Press> mutableState3 = mutableState2;
                                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$1$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        PressInteraction.Press press = (PressInteraction.Press) mutableState3.getValue();
                                        if (press != null) {
                                            mutableInteractionSource2.tryEmit(new PressInteraction.Cancel(press));
                                            mutableState3.setValue(null);
                                        }
                                    }
                                };
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    EffectsKt.DisposableEffect(boolValueOf, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
                    ClickableKt.PressedInteractionSourceDisposableEffect(interactionSource, mutableState2, map2, composer, 560);
                }
                composer.endReplaceableGroup();
                final Function0<Boolean> function0IsComposeRootInScrollableContainer = Clickable_androidKt.isComposeRootInScrollableContainer(composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState3 = (MutableState) objRememberedValue4;
                composer.startReplaceableGroup(511388516);
                boolean zChanged2 = composer.changed(mutableState3) | composer.changed(function0IsComposeRootInScrollableContainer);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue5 == companion2.getEmpty()) {
                    objRememberedValue5 = new Function0<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$delayPressInteraction$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(mutableState3.getValue().booleanValue() || function0IsComposeRootInScrollableContainer.invoke().booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceableGroup();
                State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(objRememberedValue5, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue6 = composer.rememberedValue();
                if (objRememberedValue6 == companion2.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m8934boximpl(Offset.INSTANCE.m8961getZeroF1C5BW0()), null, 2, null);
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceableGroup();
                MutableState mutableState4 = (MutableState) objRememberedValue6;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Object[] objArr2 = {interactionSource, Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z3)};
                MutableInteractionSource mutableInteractionSource2 = interactionSource;
                Object[] objArr3 = {mutableState4, Boolean.valueOf(z5), Boolean.valueOf(z3), stateRememberUpdatedState3, Boolean.valueOf(z4), stateRememberUpdatedState2, mutableInteractionSource2, mutableState2, stateRememberUpdatedState4, stateRememberUpdatedState};
                boolean z6 = z3;
                composer.startReplaceableGroup(-568225417);
                int i5 = 0;
                boolean zChanged3 = false;
                for (int i6 = 10; i5 < i6; i6 = 10) {
                    zChanged3 |= composer.changed(objArr3[i5]);
                    i5++;
                }
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objArr = objArr2;
                    map = map2;
                    companion = companion3;
                    mutableState = mutableState3;
                    objRememberedValue7 = new ClickableKt$combinedClickable$4$gesture$1$1(mutableState4, z5, z6, z4, stateRememberUpdatedState3, stateRememberUpdatedState2, mutableInteractionSource2, mutableState2, stateRememberUpdatedState4, stateRememberUpdatedState, null);
                    composer.updateRememberedValue(objRememberedValue7);
                } else {
                    objArr = objArr2;
                    map = map2;
                    companion = companion3;
                    mutableState = mutableState3;
                }
                composer.endReplaceableGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion, objArr, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue8 = composer.rememberedValue();
                Composer.Companion companion5 = Composer.INSTANCE;
                if (objRememberedValue8 == companion5.getEmpty()) {
                    final MutableState mutableState5 = mutableState;
                    objRememberedValue8 = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$2$1
                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
                        public /* synthetic */ boolean all(Function1 function1) {
                            return AbstractC1267b.m309a(this, function1);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
                        public /* synthetic */ boolean any(Function1 function1) {
                            return AbstractC1267b.m310b(this, function1);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
                        public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
                            return AbstractC1267b.m311c(this, obj, function2);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
                        public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
                            return AbstractC1267b.m312d(this, obj, function2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // androidx.compose.p006ui.modifier.ModifierLocalConsumer
                        public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
                            Intrinsics.checkNotNullParameter(scope, "scope");
                            mutableState5.setValue(scope.getCurrent(ScrollableKt.getModifierLocalScrollableContainer()));
                        }

                        @Override // androidx.compose.p006ui.Modifier
                        public /* synthetic */ Modifier then(Modifier modifier) {
                            return AbstractC1266a.m307a(this, modifier);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue8);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = companion4.then((Modifier) objRememberedValue8);
                MutableInteractionSource mutableInteractionSource3 = interactionSource;
                Indication indication2 = indication;
                composer.startReplaceableGroup(773894976);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue9 = composer.rememberedValue();
                if (objRememberedValue9 == companion5.getEmpty()) {
                    objRememberedValue9 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                    composer.updateRememberedValue(objRememberedValue9);
                }
                composer.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue9).getCoroutineScope();
                composer.endReplaceableGroup();
                Modifier modifierM7097genericClickableWithoutGesturebdNGguI = ClickableKt.m7097genericClickableWithoutGesturebdNGguI(modifierThen, modifierPointerInput, mutableInteractionSource3, indication2, coroutineScope, map, mutableState4, z3, str, role, str2, function0, onClick);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM7097genericClickableWithoutGesturebdNGguI;
            }
        });
    }

    @ExperimentalFoundationApi
    /* renamed from: combinedClickable-cJG_KMw, reason: not valid java name */
    public static final Modifier m7095combinedClickablecJG_KMw(Modifier combinedClickable, final boolean z3, final String str, final Role role, final String str2, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(combinedClickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("combinedClickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
                inspectorInfo.getProperties().set("onDoubleClick", function02);
                inspectorInfo.getProperties().set("onLongClick", function0);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier composed, Composer composer, int i4) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1969174843);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1969174843, i4, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:252)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierM7093combinedClickableXVZzFYc = ClickableKt.m7093combinedClickableXVZzFYc(companion, (MutableInteractionSource) objRememberedValue, indication, z3, str, role, str2, function0, function02, onClick);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM7093combinedClickableXVZzFYc;
            }
        });
    }

    /* renamed from: genericClickableWithoutGesture-bdNGguI, reason: not valid java name */
    public static final Modifier m7097genericClickableWithoutGesturebdNGguI(Modifier genericClickableWithoutGesture, Modifier gestureModifiers, MutableInteractionSource interactionSource, Indication indication, CoroutineScope indicationScope, Map<Key, PressInteraction.Press> currentKeyPressInteractions, State<Offset> keyClickOffset, boolean z3, String str, Role role, String str2, Function0<Unit> function0, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(genericClickableWithoutGesture, "$this$genericClickableWithoutGesture");
        Intrinsics.checkNotNullParameter(gestureModifiers, "gestureModifiers");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(indicationScope, "indicationScope");
        Intrinsics.checkNotNullParameter(currentKeyPressInteractions, "currentKeyPressInteractions");
        Intrinsics.checkNotNullParameter(keyClickOffset, "keyClickOffset");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(m159x602ad71b(genericClickableWithoutGesture_bdNGguI$clickSemantics(genericClickableWithoutGesture, role, str, function0, str2, z3, onClick), z3, currentKeyPressInteractions, keyClickOffset, indicationScope, onClick, interactionSource), interactionSource, indication), interactionSource, z3), z3, interactionSource).then(gestureModifiers);
    }

    private static final Modifier genericClickableWithoutGesture_bdNGguI$clickSemantics(Modifier modifier, final Role role, final String str, final Function0<Unit> function0, final String str2, final boolean z3, final Function0<Unit> function02) {
        return SemanticsModifierKt.semantics(modifier, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                Role role2 = role;
                if (role2 != null) {
                    SemanticsPropertiesKt.m10938setRolekuIjeqM(semantics, role2.getValue());
                }
                String str3 = str;
                final Function0<Unit> function03 = function02;
                SemanticsPropertiesKt.onClick(semantics, str3, new Function0<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        function03.invoke();
                        return Boolean.TRUE;
                    }
                });
                final Function0<Unit> function04 = function0;
                if (function04 != null) {
                    SemanticsPropertiesKt.onLongClick(semantics, str2, new Function0<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            function04.invoke();
                            return Boolean.TRUE;
                        }
                    });
                }
                if (z3) {
                    return;
                }
                SemanticsPropertiesKt.disabled(semantics);
            }
        });
    }

    /* renamed from: genericClickableWithoutGesture_bdNGguI$detectPressAndClickFromKey */
    private static final Modifier m159x602ad71b(Modifier modifier, final boolean z3, final Map<Key, PressInteraction.Press> map, final State<Offset> state, final CoroutineScope coroutineScope, final Function0<Unit> function0, final MutableInteractionSource mutableInteractionSource) {
        return KeyInputModifierKt.onKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1

            @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
            @DebugMetadata(m5191c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1", m5192f = "Clickable.kt", m5193i = {}, m5194l = {540}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
            /* renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ PressInteraction.Press $press;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$interactionSource = mutableInteractionSource;
                    this.$press = press;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$interactionSource, this.$press, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i4 = this.label;
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                        PressInteraction.Press press = this.$press;
                        this.label = 1;
                        if (mutableInteractionSource.emit(press, this) == coroutine_suspended) {
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
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m7106invokeZmokQxo(keyEvent.m10355unboximpl());
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean m7106invokeZmokQxo(android.view.KeyEvent r11) {
                /*
                    r10 = this;
                    java.lang.String r0 = "keyEvent"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                    boolean r0 = r1
                    r1 = 1
                    r2 = 0
                    r3 = 0
                    if (r0 == 0) goto L51
                    boolean r0 = androidx.compose.foundation.Clickable_androidKt.m7109isPressZmokQxo(r11)
                    if (r0 == 0) goto L51
                    java.util.Map<androidx.compose.ui.input.key.Key, androidx.compose.foundation.interaction.PressInteraction$Press> r0 = r2
                    long r4 = androidx.compose.p006ui.input.key.KeyEvent_androidKt.m10366getKeyZmokQxo(r11)
                    androidx.compose.ui.input.key.Key r4 = androidx.compose.p006ui.input.key.Key.m9768boximpl(r4)
                    boolean r0 = r0.containsKey(r4)
                    if (r0 != 0) goto L83
                    androidx.compose.foundation.interaction.PressInteraction$Press r0 = new androidx.compose.foundation.interaction.PressInteraction$Press
                    androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> r2 = r3
                    java.lang.Object r2 = r2.getValue()
                    androidx.compose.ui.geometry.Offset r2 = (androidx.compose.p006ui.geometry.Offset) r2
                    long r4 = r2.getPackedValue()
                    r0.<init>(r4, r3)
                    java.util.Map<androidx.compose.ui.input.key.Key, androidx.compose.foundation.interaction.PressInteraction$Press> r2 = r2
                    long r4 = androidx.compose.p006ui.input.key.KeyEvent_androidKt.m10366getKeyZmokQxo(r11)
                    androidx.compose.ui.input.key.Key r11 = androidx.compose.p006ui.input.key.Key.m9768boximpl(r4)
                    r2.put(r11, r0)
                    kotlinx.coroutines.CoroutineScope r4 = r4
                    r5 = 0
                    r6 = 0
                    androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1 r7 = new androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1
                    androidx.compose.foundation.interaction.MutableInteractionSource r11 = r6
                    r7.<init>(r11, r0, r3)
                    r8 = 3
                    r9 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
                    goto L84
                L51:
                    boolean r0 = r1
                    if (r0 == 0) goto L83
                    boolean r0 = androidx.compose.foundation.Clickable_androidKt.m7107isClickZmokQxo(r11)
                    if (r0 == 0) goto L83
                    java.util.Map<androidx.compose.ui.input.key.Key, androidx.compose.foundation.interaction.PressInteraction$Press> r0 = r2
                    long r4 = androidx.compose.p006ui.input.key.KeyEvent_androidKt.m10366getKeyZmokQxo(r11)
                    androidx.compose.ui.input.key.Key r11 = androidx.compose.p006ui.input.key.Key.m9768boximpl(r4)
                    java.lang.Object r11 = r0.remove(r11)
                    androidx.compose.foundation.interaction.PressInteraction$Press r11 = (androidx.compose.foundation.interaction.PressInteraction.Press) r11
                    if (r11 == 0) goto L7d
                    kotlinx.coroutines.CoroutineScope r4 = r4
                    androidx.compose.foundation.interaction.MutableInteractionSource r0 = r6
                    r5 = 0
                    r6 = 0
                    androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1 r7 = new androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1
                    r7.<init>(r0, r11, r3)
                    r8 = 3
                    r9 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
                L7d:
                    kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r5
                    r11.invoke()
                    goto L84
                L83:
                    r1 = r2
                L84:
                    java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C0398x6b176470.m7106invokeZmokQxo(android.view.KeyEvent):java.lang.Boolean");
            }
        });
    }

    /* renamed from: handlePressInteraction-EPk0efs, reason: not valid java name */
    public static final Object m7099handlePressInteractionEPk0efs(PressGestureScope pressGestureScope, long j4, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, State<? extends Function0<Boolean>> state, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new ClickableKt$handlePressInteraction$2(pressGestureScope, j4, mutableInteractionSource, mutableState, state, null), continuation);
        return objCoroutineScope == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
