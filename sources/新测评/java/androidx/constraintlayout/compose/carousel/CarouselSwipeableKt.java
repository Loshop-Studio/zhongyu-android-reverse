package androidx.constraintlayout.compose.carousel;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.platform.InspectableValueKt;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aP\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002\u001a$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002\u001aZ\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\b\b\u0000\u0010\u0002*\u00020\u00132\u0006\u0010\u0014\u001a\u0002H\u00022\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00162#\b\u0002\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0018H\u0001¢\u0006\u0002\u0010\u001d\u001aI\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\b\b\u0000\u0010\u0002*\u00020\u00132\u0006\u0010\u001f\u001a\u0002H\u00022\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020!0\u00182\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0001¢\u0006\u0002\u0010\"\u001a¶\u0001\u0010#\u001a\u00020$\"\u0004\b\u0000\u0010\u0002*\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00020&2\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u001c2\b\b\u0002\u0010*\u001a\u00020\u001c2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,28\b\u0002\u0010\f\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(-\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/0\r2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u0010\u000f\u001a\u000202H\u0000ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a-\u00105\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00020&2\u0006\u0010%\u001a\u0002H\u0002H\u0002¢\u0006\u0002\u00106\"$\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, m13558d2 = {"PreUpPostDownNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;", "getPreUpPostDownNestedScrollConnection", "(Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "computeTarget", "", TypedValues.CycleType.S_WAVE_OFFSET, "lastValue", "anchors", "", "thresholds", "Lkotlin/Function2;", "velocity", "velocityThreshold", "findBounds", "", "rememberCarouselSwipeableState", "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "newValue", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;", "rememberCarouselSwipeableStateFor", "value", "onValueChange", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;", "carouselSwipeable", "Landroidx/compose/ui/Modifier;", "state", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "Landroidx/constraintlayout/compose/carousel/ThresholdConfig;", "resistance", "Landroidx/constraintlayout/compose/carousel/ResistanceConfig;", "Landroidx/compose/ui/unit/Dp;", "carouselSwipeable-pPrIpRY", "(Landroidx/compose/ui/Modifier;Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/constraintlayout/compose/carousel/ResistanceConfig;F)Landroidx/compose/ui/Modifier;", "getOffset", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;", "constraintlayout-compose_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCarouselSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,850:1\n1225#2,6:851\n1225#2,6:857\n1225#2,6:863\n1225#2,6:869\n1225#2,6:875\n135#3:881\n766#4:882\n857#4,2:883\n766#4:898\n857#4,2:899\n288#4,2:914\n171#5,13:885\n482#5,13:901\n*S KotlinDebug\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableKt\n*L\n459#1:851,6\n483#1:857,6\n490#1:863,6\n491#1:869,6\n496#1:875,6\n555#1:881\n708#1:882\n708#1:883,2\n709#1:898\n709#1:899,2\n766#1:914,2\n708#1:885,13\n709#1:901,13\n*E\n"})
/* loaded from: classes2.dex */
public final class CarouselSwipeableKt {
    /* renamed from: carouselSwipeable-pPrIpRY, reason: not valid java name */
    public static final <T> Modifier m24036carouselSwipeablepPrIpRY(Modifier modifier, final CarouselSwipeableState<T> carouselSwipeableState, final Map<Float, ? extends T> map, final Orientation orientation, final boolean z9, final boolean z10, final MutableInteractionSource mutableInteractionSource, final Function2<? super T, ? super T, ? extends ThresholdConfig> function2, final ResistanceConfig resistanceConfig, final float f10) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable-pPrIpRY$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("swipeable");
                inspectorInfo.getProperties().set("state", carouselSwipeableState);
                inspectorInfo.getProperties().set("anchors", map);
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z9));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("thresholds", function2);
                inspectorInfo.getProperties().set("resistance", resistanceConfig);
                inspectorInfo.getProperties().set("velocityThreshold", C3127Dp.m23559boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(1858597191);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1858597191, i10, -1, "androidx.constraintlayout.compose.carousel.carouselSwipeable.<anonymous> (CarouselSwipeable.kt:567)");
                }
                if (map.isEmpty()) {
                    throw new IllegalArgumentException("You must have at least one anchor.");
                }
                if (CollectionsKt.distinct(map.values()).size() != map.size()) {
                    throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                carouselSwipeableState.ensureInit$constraintlayout_compose_release(map);
                Object obj = map;
                Object obj2 = carouselSwipeableState;
                boolean zChanged = composer.changed(obj2) | composer.changedInstance(map) | composer.changed(resistanceConfig) | composer.changed(function2) | composer.changed(density) | composer.changed(f10);
                CarouselSwipeableState<T> carouselSwipeableState2 = carouselSwipeableState;
                Map<Float, T> map2 = map;
                ResistanceConfig resistanceConfig2 = resistanceConfig;
                Function2<T, T, ThresholdConfig> function22 = function2;
                float f11 = f10;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object carouselSwipeableKt$carouselSwipeable$3$3$1 = new CarouselSwipeableKt$carouselSwipeable$3$3$1(carouselSwipeableState2, map2, resistanceConfig2, density, function22, f11, null);
                    composer.updateRememberedValue(carouselSwipeableKt$carouselSwipeable$3$3$1);
                    objRememberedValue = carouselSwipeableKt$carouselSwipeable$3$3$1;
                }
                EffectsKt.LaunchedEffect(obj, obj2, (Function2) objRememberedValue, composer, 0);
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zIsAnimationRunning = carouselSwipeableState.isAnimationRunning();
                DraggableState draggableState = carouselSwipeableState.getDraggableState();
                Orientation orientation2 = orientation;
                boolean z11 = z9;
                MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                boolean zChanged2 = composer.changed(carouselSwipeableState);
                CarouselSwipeableState<T> carouselSwipeableState3 = carouselSwipeableState;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new CarouselSwipeableKt$carouselSwipeable$3$4$1(carouselSwipeableState3, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierDraggable$default = DraggableKt.draggable$default(companion, draggableState, orientation2, z11, mutableInteractionSource2, zIsAnimationRunning, null, (Function3) objRememberedValue2, z10, 32, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierDraggable$default;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float computeTarget(float f10, float f11, Set<Float> set, Function2<? super Float, ? super Float, Float> function2, float f12, float f13) {
        List<Float> listFindBounds = findBounds(f10, set);
        int size = listFindBounds.size();
        if (size == 0) {
            return f11;
        }
        if (size == 1) {
            return listFindBounds.get(0).floatValue();
        }
        float fFloatValue = listFindBounds.get(0).floatValue();
        float fFloatValue2 = listFindBounds.get(1).floatValue();
        return (f11 > f10 ? f12 > (-f13) && f10 > function2.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue)).floatValue() : f12 >= f13 || f10 >= function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue()) ? fFloatValue2 : fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static final List<Float> findBounds(float f10, Set<Float> set) {
        Object obj;
        Set<Float> set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() <= f10 + 0.001d) {
                arrayList.add(obj2);
            }
        }
        Float f11 = null;
        int i10 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            float fFloatValue = ((Number) obj).floatValue();
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i11 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i11);
                    float fFloatValue2 = ((Number) obj3).floatValue();
                    if (Float.compare(fFloatValue, fFloatValue2) < 0) {
                        obj = obj3;
                        fFloatValue = fFloatValue2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
        }
        Float f12 = (Float) obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : set2) {
            if (((Number) obj4).floatValue() >= f10 - 0.001d) {
                arrayList2.add(obj4);
            }
        }
        if (!arrayList2.isEmpty()) {
            ?? r13 = arrayList2.get(0);
            float fFloatValue3 = ((Number) r13).floatValue();
            int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
            boolean z9 = r13;
            if (1 <= lastIndex2) {
                while (true) {
                    Object obj5 = arrayList2.get(i10);
                    float fFloatValue4 = ((Number) obj5).floatValue();
                    r13 = z9;
                    if (Float.compare(fFloatValue3, fFloatValue4) > 0) {
                        r13 = obj5;
                        fFloatValue3 = fFloatValue4;
                    }
                    if (i10 == lastIndex2) {
                        break;
                    }
                    i10++;
                    z9 = r13;
                }
            }
            f11 = r13;
        }
        Float f13 = f11;
        return f12 == null ? CollectionsKt.listOfNotNull(f13) : f13 == null ? CollectionsKt.listOf(f12) : Intrinsics.areEqual(f12, f13) ? CollectionsKt.listOf(f12) : CollectionsKt.listOf((Object[]) new Float[]{f12, f13});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float getOffset(Map<Float, ? extends T> map, T t10) {
        T next;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Map.Entry) next).getValue(), t10)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static final <T> NestedScrollConnection getPreUpPostDownNestedScrollConnection(CarouselSwipeableState<T> carouselSwipeableState) {
        return new CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1(carouselSwipeableState);
    }

    @Composable
    public static final <T> CarouselSwipeableState<T> rememberCarouselSwipeableState(final T t10, final AnimationSpec<Float> animationSpec, final Function1<? super T, Boolean> function1, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i11 & 4) != 0) {
            function1 = new Function1<T, Boolean>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt.rememberCarouselSwipeableState.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(T t11) {
                    return Boolean.TRUE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                    return invoke((C32181<T>) obj);
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1633385233, i10, -1, "androidx.constraintlayout.compose.carousel.rememberCarouselSwipeableState (CarouselSwipeable.kt:451)");
        }
        Object[] objArr = new Object[0];
        Saver<CarouselSwipeableState<T>, T> Saver = CarouselSwipeableState.INSTANCE.Saver(animationSpec, function1);
        boolean zChangedInstance = ((((i10 & 14) ^ 6) > 4 && composer.changedInstance(t10)) || (i10 & 6) == 4) | composer.changedInstance(animationSpec) | ((((i10 & 896) ^ 384) > 256 && composer.changed(function1)) || (i10 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<CarouselSwipeableState<T>>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$rememberCarouselSwipeableState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final CarouselSwipeableState<T> invoke() {
                    return new CarouselSwipeableState<>(t10, animationSpec, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        CarouselSwipeableState<T> carouselSwipeableState = (CarouselSwipeableState) RememberSaveableKt.m20533rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return carouselSwipeableState;
    }

    @Composable
    public static final <T> CarouselSwipeableState<T> rememberCarouselSwipeableStateFor(final T t10, final Function1<? super T, Unit> function1, AnimationSpec<Float> animationSpec, Composer composer, int i10, int i11) {
        if ((i11 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2074386230, i10, -1, "androidx.constraintlayout.compose.carousel.rememberCarouselSwipeableStateFor (CarouselSwipeable.kt:481)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new CarouselSwipeableState(t10, animationSpec, new Function1<T, Boolean>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$rememberCarouselSwipeableStateFor$swipeableState$1$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(T t11) {
                    return Boolean.TRUE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                    return invoke((C3219x39864ea3<T>) obj);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        final CarouselSwipeableState<T> carouselSwipeableState = (CarouselSwipeableState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final MutableState mutableState = (MutableState) objRememberedValue2;
        Object value = mutableState.getValue();
        int i12 = (i10 & 14) ^ 6;
        boolean z9 = (i12 > 4 && composer.changedInstance(t10)) || (i10 & 6) == 4;
        Object objRememberedValue3 = composer.rememberedValue();
        if (z9 || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1(t10, carouselSwipeableState, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        int i13 = i10 & 8;
        EffectsKt.LaunchedEffect(t10, value, (Function2) objRememberedValue3, composer, i10 & 14);
        T currentValue = carouselSwipeableState.getCurrentValue();
        boolean z10 = ((i12 > 4 && composer.changedInstance(t10)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.changed(function1)) || (i10 & 48) == 32);
        Object objRememberedValue4 = composer.rememberedValue();
        if (z10 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$rememberCarouselSwipeableStateFor$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    if (!Intrinsics.areEqual(t10, carouselSwipeableState.getCurrentValue())) {
                        function1.invoke(carouselSwipeableState.getCurrentValue());
                        mutableState.setValue(Boolean.valueOf(!r2.getValue().booleanValue()));
                    }
                    return new DisposableEffectResult() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$rememberCarouselSwipeableStateFor$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        EffectsKt.DisposableEffect(currentValue, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composer, i13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return carouselSwipeableState;
    }
}
