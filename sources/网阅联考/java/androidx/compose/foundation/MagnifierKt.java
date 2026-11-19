package androidx.compose.foundation;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.MagnifierKt;
import androidx.compose.p006ui.ComposedModifierKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.draw.DrawModifierKt;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.graphics.drawscope.DrawScope;
import androidx.compose.p006ui.layout.LayoutCoordinates;
import androidx.compose.p006ui.layout.LayoutCoordinatesKt;
import androidx.compose.p006ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p006ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p006ui.platform.CompositionLocalsKt;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.semantics.SemanticsModifierKt;
import androidx.compose.p006ui.semantics.SemanticsPropertyKey;
import androidx.compose.p006ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.DpSize;
import androidx.compose.p006ui.unit.IntSize;
import androidx.compose.p006ui.unit.IntSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(m5174d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001\u001ao\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000f2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\rH\u0007ø\u0001\u0000\u001ao\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0001ø\u0001\u0000\"#\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m5175d2 = {"MagnifierPositionInRoot", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "getMagnifierPositionInRoot", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "isPlatformMagnifierSupported", "", "sdkVersion", "", "magnifier", "Landroidx/compose/ui/Modifier;", "sourceCenter", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/ExtensionFunctionType;", "magnifierCenter", "zoom", "", "style", "Landroidx/compose/foundation/MagnifierStyle;", "onSizeChanged", "Landroidx/compose/ui/unit/DpSize;", "", "platformMagnifierFactory", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,394:1\n135#2:395\n146#2:396\n*S KotlinDebug\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n*L\n233#1:395\n231#1:396\n*E\n"})
/* loaded from: classes.dex */
public final class MagnifierKt {
    private static final SemanticsPropertyKey<Function0<Offset>> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    @Metadata(m5174d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m5175d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt$magnifier$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,394:1\n76#2:395\n76#2:396\n25#3:397\n25#3:404\n25#3:411\n25#3:418\n36#3:425\n36#3:432\n1114#4,6:398\n1114#4,6:405\n1114#4,6:412\n1114#4,6:419\n1114#4,6:426\n1114#4,6:433\n76#5:439\n102#5,2:440\n76#5:442\n76#5:443\n76#5:444\n76#5:445\n76#5:446\n76#5:447\n*S KotlinDebug\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt$magnifier$4\n*L\n274#1:395\n275#1:396\n276#1:397\n281#1:404\n291#1:411\n296#1:418\n374#1:425\n386#1:432\n276#1:398,6\n281#1:405,6\n291#1:412,6\n296#1:419,6\n374#1:426,6\n386#1:433,6\n276#1:439\n276#1:440,2\n277#1:442\n278#1:443\n279#1:444\n280#1:445\n281#1:446\n291#1:447\n*E\n"})
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4 */
    public static final class C04134 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ Function1<Density, Offset> $magnifierCenter;
        final /* synthetic */ Function1<DpSize, Unit> $onSizeChanged;
        final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
        final /* synthetic */ Function1<Density, Offset> $sourceCenter;
        final /* synthetic */ MagnifierStyle $style;
        final /* synthetic */ float $zoom;

        @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m5191c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", m5192f = "Magnifier.kt", m5193i = {0}, m5194l = {365}, m5195m = "invokeSuspend", m5196n = {"magnifier"}, m5197s = {"L$0"})
        /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
            final /* synthetic */ Density $density;
            final /* synthetic */ State<Boolean> $isMagnifierShown$delegate;
            final /* synthetic */ MutableSharedFlow<Unit> $onNeedsUpdate;
            final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
            final /* synthetic */ State<Offset> $sourceCenterInRoot$delegate;
            final /* synthetic */ MagnifierStyle $style;
            final /* synthetic */ State<Function1<Density, Offset>> $updatedMagnifierCenter$delegate;
            final /* synthetic */ State<Function1<DpSize, Unit>> $updatedOnSizeChanged$delegate;
            final /* synthetic */ State<Float> $updatedZoom$delegate;
            final /* synthetic */ View $view;
            final /* synthetic */ float $zoom;
            private /* synthetic */ Object L$0;
            int label;

            @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m5191c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", m5192f = "Magnifier.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
            /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C47211 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                final /* synthetic */ PlatformMagnifier $magnifier;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C47211(PlatformMagnifier platformMagnifier, Continuation<? super C47211> continuation) {
                    super(2, continuation);
                    this.$magnifier = platformMagnifier;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C47211(this.$magnifier, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$magnifier.updateContent();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return ((C47211) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle, View view, Density density, float f4, MutableSharedFlow<Unit> mutableSharedFlow, State<? extends Function1<? super DpSize, Unit>> state, State<Boolean> state2, State<Offset> state3, State<? extends Function1<? super Density, Offset>> state4, MutableState<Offset> mutableState, State<Float> state5, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$platformMagnifierFactory = platformMagnifierFactory;
                this.$style = magnifierStyle;
                this.$view = view;
                this.$density = density;
                this.$zoom = f4;
                this.$onNeedsUpdate = mutableSharedFlow;
                this.$updatedOnSizeChanged$delegate = state;
                this.$isMagnifierShown$delegate = state2;
                this.$sourceCenterInRoot$delegate = state3;
                this.$updatedMagnifierCenter$delegate = state4;
                this.$anchorPositionInRoot$delegate = mutableState;
                this.$updatedZoom$delegate = state5;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$platformMagnifierFactory, this.$style, this.$view, this.$density, this.$zoom, this.$onNeedsUpdate, this.$updatedOnSizeChanged$delegate, this.$isMagnifierShown$delegate, this.$sourceCenterInRoot$delegate, this.$updatedMagnifierCenter$delegate, this.$anchorPositionInRoot$delegate, this.$updatedZoom$delegate, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PlatformMagnifier platformMagnifier;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    platformMagnifier = (PlatformMagnifier) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        platformMagnifier.dismiss();
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        platformMagnifier.dismiss();
                        throw th;
                    }
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final PlatformMagnifier platformMagnifierCreate = this.$platformMagnifierFactory.create(this.$style, this.$view, this.$density, this.$zoom);
                final Ref.LongRef longRef = new Ref.LongRef();
                long jMo7132getSizeYbymL2g = platformMagnifierCreate.mo7132getSizeYbymL2g();
                Density density = this.$density;
                Function1 function1Invoke$lambda$6 = C04134.invoke$lambda$6(this.$updatedOnSizeChanged$delegate);
                if (function1Invoke$lambda$6 != null) {
                    function1Invoke$lambda$6.invoke(DpSize.m11611boximpl(density.mo7204toDpSizekrfVVM(IntSizeKt.m11695toSizeozmzZPI(jMo7132getSizeYbymL2g))));
                }
                longRef.element = jMo7132getSizeYbymL2g;
                FlowKt.launchIn(FlowKt.onEach(this.$onNeedsUpdate, new C47211(platformMagnifierCreate, null)), coroutineScope);
                try {
                    final Density density2 = this.$density;
                    final State<Boolean> state = this.$isMagnifierShown$delegate;
                    final State<Offset> state2 = this.$sourceCenterInRoot$delegate;
                    final State<Function1<Density, Offset>> state3 = this.$updatedMagnifierCenter$delegate;
                    final MutableState<Offset> mutableState = this.$anchorPositionInRoot$delegate;
                    final State<Float> state4 = this.$updatedZoom$delegate;
                    final State<Function1<DpSize, Unit>> state5 = this.$updatedOnSizeChanged$delegate;
                    Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<Unit>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (!C04134.invoke$lambda$10(state)) {
                                platformMagnifierCreate.dismiss();
                                return;
                            }
                            PlatformMagnifier platformMagnifier2 = platformMagnifierCreate;
                            long jInvoke$lambda$8 = C04134.invoke$lambda$8(state2);
                            Object objInvoke = C04134.invoke$lambda$4(state3).invoke(density2);
                            MutableState<Offset> mutableState2 = mutableState;
                            long packedValue = ((Offset) objInvoke).getPackedValue();
                            platformMagnifier2.mo7133updateWko1d7g(jInvoke$lambda$8, OffsetKt.m8964isSpecifiedk4lQ0M(packedValue) ? Offset.m8950plusMKHz9U(C04134.invoke$lambda$1(mutableState2), packedValue) : Offset.INSTANCE.m8960getUnspecifiedF1C5BW0(), C04134.invoke$lambda$5(state4));
                            long jMo7132getSizeYbymL2g2 = platformMagnifierCreate.mo7132getSizeYbymL2g();
                            Ref.LongRef longRef2 = longRef;
                            Density density3 = density2;
                            State<Function1<DpSize, Unit>> state6 = state5;
                            if (IntSize.m11683equalsimpl0(jMo7132getSizeYbymL2g2, longRef2.element)) {
                                return;
                            }
                            longRef2.element = jMo7132getSizeYbymL2g2;
                            Function1 function1Invoke$lambda$62 = C04134.invoke$lambda$6(state6);
                            if (function1Invoke$lambda$62 != null) {
                                function1Invoke$lambda$62.invoke(DpSize.m11611boximpl(density3.mo7204toDpSizekrfVVM(IntSizeKt.m11695toSizeozmzZPI(jMo7132getSizeYbymL2g2))));
                            }
                        }
                    });
                    this.L$0 = platformMagnifierCreate;
                    this.label = 1;
                    if (FlowKt.collect(flowSnapshotFlow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    platformMagnifier = platformMagnifierCreate;
                    platformMagnifier.dismiss();
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    platformMagnifier = platformMagnifierCreate;
                    platformMagnifier.dismiss();
                    throw th;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04134(Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, float f4, Function1<? super DpSize, Unit> function13, PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle) {
            super(3);
            this.$sourceCenter = function1;
            this.$magnifierCenter = function12;
            this.$zoom = f4;
            this.$onSizeChanged = function13;
            this.$platformMagnifierFactory = platformMagnifierFactory;
            this.$style = magnifierStyle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$1(MutableState<Offset> mutableState) {
            return mutableState.getValue().getPackedValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$10(State<Boolean> state) {
            return state.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(MutableState<Offset> mutableState, long j4) {
            mutableState.setValue(Offset.m8934boximpl(j4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Function1<Density, Offset> invoke$lambda$3(State<? extends Function1<? super Density, Offset>> state) {
            return (Function1) state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Function1<Density, Offset> invoke$lambda$4(State<? extends Function1<? super Density, Offset>> state) {
            return (Function1) state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$lambda$5(State<Float> state) {
            return state.getValue().floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Function1<DpSize, Unit> invoke$lambda$6(State<? extends Function1<? super DpSize, Unit>> state) {
            return (Function1) state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$8(State<Offset> state) {
            return state.getValue().getPackedValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        public final Modifier invoke(Modifier composed, Composer composer, int i4) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceableGroup(-454877003);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-454877003, i4, -1, "androidx.compose.foundation.magnifier.<anonymous> (Magnifier.kt:272)");
            }
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m8934boximpl(Offset.INSTANCE.m8960getUnspecifiedF1C5BW0()), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$sourceCenter, composer, 0);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$magnifierCenter, composer, 0);
            State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(this.$zoom), composer, 0);
            State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(this.$onSizeChanged, composer, 0);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$sourceCenterInRoot$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Offset invoke() {
                        return Offset.m8934boximpl(m7114invokeF1C5BW0());
                    }

                    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m7114invokeF1C5BW0() {
                        long packedValue = ((Offset) MagnifierKt.C04134.invoke$lambda$3(stateRememberUpdatedState).invoke(density)).getPackedValue();
                        return (OffsetKt.m8964isSpecifiedk4lQ0M(MagnifierKt.C04134.invoke$lambda$1(mutableState)) && OffsetKt.m8964isSpecifiedk4lQ0M(packedValue)) ? Offset.m8950plusMKHz9U(MagnifierKt.C04134.invoke$lambda$1(mutableState), packedValue) : Offset.INSTANCE.m8960getUnspecifiedF1C5BW0();
                    }
                });
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final State state = (State) objRememberedValue2;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$isMagnifierShown$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(OffsetKt.m8964isSpecifiedk4lQ0M(MagnifierKt.C04134.invoke$lambda$8(state)));
                    }
                });
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            State state2 = (State) objRememberedValue3;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            final MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) objRememberedValue4;
            float f4 = this.$platformMagnifierFactory.getCanUpdateZoom() ? 0.0f : this.$zoom;
            MagnifierStyle magnifierStyle = this.$style;
            EffectsKt.LaunchedEffect(new Object[]{view, density, Float.valueOf(f4), magnifierStyle, Boolean.valueOf(Intrinsics.areEqual(magnifierStyle, MagnifierStyle.INSTANCE.getTextDefault()))}, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass1(this.$platformMagnifierFactory, this.$style, view, density, this.$zoom, mutableSharedFlow, stateRememberUpdatedState4, state2, state, stateRememberUpdatedState2, mutableState, stateRememberUpdatedState3, null), composer, 72);
            composer.startReplaceableGroup(1157296644);
            boolean zChanged = composer.changed(mutableState);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        MagnifierKt.C04134.invoke$lambda$2(mutableState, LayoutCoordinatesKt.positionInRoot(it));
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(OnGloballyPositionedModifierKt.onGloballyPositioned(composed, (Function1) objRememberedValue5), new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope drawBehind) {
                    Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                    mutableSharedFlow.tryEmit(Unit.INSTANCE);
                }
            });
            composer.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer.changed(state);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$4$1
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
                        SemanticsPropertyKey<Function0<Offset>> magnifierPositionInRoot = MagnifierKt.getMagnifierPositionInRoot();
                        final State<Offset> state3 = state;
                        semantics.set(magnifierPositionInRoot, new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$4$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Offset invoke() {
                                return Offset.m8934boximpl(m7113invokeF1C5BW0());
                            }

                            /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                            public final long m7113invokeF1C5BW0() {
                                return MagnifierKt.C04134.invoke$lambda$8(state3);
                            }
                        });
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceableGroup();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierDrawBehind, false, (Function1) objRememberedValue6, 1, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierSemantics$default;
        }
    }

    public static final SemanticsPropertyKey<Function0<Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isPlatformMagnifierSupported(int i4) {
        return i4 >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i4);
    }

    @RequiresApi(28)
    @SuppressLint({"ModifierInspectorInfo"})
    public static final Modifier magnifier(Modifier modifier, Function1<? super Density, Offset> sourceCenter, Function1<? super Density, Offset> magnifierCenter, float f4, MagnifierStyle style, Function1<? super DpSize, Unit> function1, PlatformMagnifierFactory platformMagnifierFactory) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(platformMagnifierFactory, "platformMagnifierFactory");
        return ComposedModifierKt.composed$default(modifier, null, new C04134(sourceCenter, magnifierCenter, f4, function1, platformMagnifierFactory, style), 1, null);
    }

    public static /* synthetic */ Modifier magnifier$default(Modifier modifier, Function1 function1, Function1 function12, float f4, MagnifierStyle magnifierStyle, Function1 function13, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            function12 = new Function1<Density, Offset>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Offset invoke(Density density) {
                    return Offset.m8934boximpl(m7112invoketuRUvjQ(density));
                }

                /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
                public final long m7112invoketuRUvjQ(Density density) {
                    Intrinsics.checkNotNullParameter(density, "$this$null");
                    return Offset.INSTANCE.m8960getUnspecifiedF1C5BW0();
                }
            };
        }
        Function1 function14 = function12;
        if ((i4 & 4) != 0) {
            f4 = Float.NaN;
        }
        float f5 = f4;
        if ((i4 & 8) != 0) {
            magnifierStyle = MagnifierStyle.INSTANCE.getDefault();
        }
        MagnifierStyle magnifierStyle2 = magnifierStyle;
        if ((i4 & 16) != 0) {
            function13 = null;
        }
        return magnifier(modifier, function1, function14, f5, magnifierStyle2, function13);
    }

    @ExperimentalFoundationApi
    public static final Modifier magnifier(Modifier modifier, final Function1<? super Density, Offset> sourceCenter, final Function1<? super Density, Offset> magnifierCenter, final float f4, final MagnifierStyle style, Function1<? super DpSize, Unit> function1) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        Function1<InspectorInfo, Unit> noInspectorInfo = InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName(MagnifierKt.isPlatformMagnifierSupported$default(0, 1, null) ? "magnifier" : "magnifier (not supported)");
                inspectorInfo.getProperties().set("sourceCenter", sourceCenter);
                inspectorInfo.getProperties().set("magnifierCenter", magnifierCenter);
                inspectorInfo.getProperties().set("zoom", Float.valueOf(f4));
                inspectorInfo.getProperties().set("style", style);
            }
        } : InspectableValueKt.getNoInspectorInfo();
        Modifier modifierMagnifier = Modifier.INSTANCE;
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            modifierMagnifier = magnifier(modifierMagnifier, sourceCenter, magnifierCenter, f4, style, function1, PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform());
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, modifierMagnifier);
    }
}
