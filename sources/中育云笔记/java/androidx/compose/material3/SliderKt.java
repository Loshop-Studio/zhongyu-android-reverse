package androidx.compose.material3;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.C2638R;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.C2890xe3d9cdbd;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p014ui.layout.LayoutIdKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.DpKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.util.MathHelpersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p211jd.AbstractC9719c;
import p265nd.AbstractC10409n;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p265nd.InterfaceC10401f;
import p309qc.C10786q;
import p325rc.AbstractC10961n0;
import p325rc.AbstractC10968r;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class SliderKt {
    private static final double SliderRangeTolerance = 1.0E-4d;
    private static final float ThumbHeight;
    private static final long ThumbSize;
    private static final float ThumbTrackGapSize;
    private static final float ThumbWidth;
    private static final float TrackHeight;
    private static final float TrackInsideCornerSize;

    @InterfaceC11829d(m26210c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", m26211f = "Slider.kt", m26212l = {1651}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1 */
    public static final class C23581 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        final /* synthetic */ RangeSliderState $state;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", m26211f = "Slider.kt", m26212l = {1652}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ RangeSliderState $state;
            private /* synthetic */ Object L$0;
            int label;

            @InterfaceC11829d(m26210c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", m26211f = "Slider.kt", m26212l = {1653, 1665, 1687}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C120811 extends RestrictedSuspendLambda implements InterfaceC9544p {
                final /* synthetic */ InterfaceC11122i0 $$this$coroutineScope;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ RangeSliderState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;

                @InterfaceC11829d(m26210c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", m26211f = "Slider.kt", m26212l = {1705}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
                public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
                    final /* synthetic */ Ref$BooleanRef $draggingStart;
                    final /* synthetic */ DragInteraction $finishInteraction;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref$BooleanRef ref$BooleanRef, DragInteraction dragInteraction, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$draggingStart = ref$BooleanRef;
                        this.$finishInteraction = dragInteraction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objM25952f = AbstractC11725a.m25952f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9924b.m20071b(obj);
                            MutableInteractionSource mutableInteractionSourceActiveInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.f23398c);
                            DragInteraction dragInteraction = this.$finishInteraction;
                            this.label = 1;
                            if (mutableInteractionSourceActiveInteraction.emit(dragInteraction, this) == objM25952f) {
                                return objM25952f;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9924b.m20071b(obj);
                        }
                        return C10786q.f26013a;
                    }

                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C120811(RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C120811> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$state = rangeSliderState;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$$this$coroutineScope = interfaceC11122i0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    C120811 c120811 = new C120811(this.$state, this.$rangeSliderLogic, this.$$this$coroutineScope, interfaceC11588c);
                    c120811.L$0 = obj;
                    return c120811;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((C120811) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:51:0x0166, code lost:
                
                    if (r1 != r6) goto L53;
                 */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 423
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.C23581.AnonymousClass1.C120811.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$$this$pointerInput = pointerInputScope;
                this.$state = rangeSliderState;
                this.$rangeSliderLogic = rangeSliderLogic;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$state, this.$rangeSliderLogic, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C120811 c120811 = new C120811(this.$state, this.$rangeSliderLogic, interfaceC11122i0, null);
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c120811, this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23581(RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, InterfaceC11588c<? super C23581> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$state = rangeSliderState;
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C23581 c23581 = new C23581(this.$state, this.$startInteractionSource, this.$endInteractionSource, interfaceC11588c);
            c23581.L$0 = obj;
            return c23581;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C23581) create(pointerInputScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$state, new RangeSliderLogic(this.$state, this.$startInteractionSource, this.$endInteractionSource), null);
                this.label = 1;
                if (AbstractC10006d.m20748e(anonymousClass1, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.SliderKt$sliderTapModifier$1", m26211f = "Slider.kt", m26212l = {1627}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1 */
    public static final class C23621 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ SliderState $state;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", m26211f = "Slider.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9545q {
            final /* synthetic */ SliderState $state;
            /* synthetic */ long J$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SliderState sliderState, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(3, interfaceC11588c);
                this.$state = sliderState;
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m29115invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m30647unboximpl(), (InterfaceC11588c) obj3);
            }

            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final Object m29115invoked4ec7I(PressGestureScope pressGestureScope, long j10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, interfaceC11588c);
                anonymousClass1.J$0 = j10;
                return anonymousClass1.invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                this.$state.m29128onPressk4lQ0M$material3_release(this.J$0);
                return C10786q.f26013a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23621(SliderState sliderState, InterfaceC11588c<? super C23621> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$state = sliderState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C23621 c23621 = new C23621(this.$state, interfaceC11588c);
            c23621.L$0 = obj;
            return c23621;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C23621) create(pointerInputScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, null);
                final SliderState sliderState = this.$state;
                InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.material3.SliderKt.sliderTapModifier.1.2
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        m29116invokek4lQ0M(((Offset) obj2).m30647unboximpl());
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m29116invokek4lQ0M(long j10) {
                        sliderState.dispatchRawDelta(0.0f);
                        sliderState.getGestureEndAction$material3_release().invoke();
                    }
                };
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, interfaceC9540l, this, 3, null) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }
    }

    static {
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        TrackHeight = sliderTokens.m30111getInactiveTrackHeightD9Ej5fM();
        float fM30109getHandleWidthD9Ej5fM = sliderTokens.m30109getHandleWidthD9Ej5fM();
        ThumbWidth = fM30109getHandleWidthD9Ej5fM;
        float fM30108getHandleHeightD9Ej5fM = sliderTokens.m30108getHandleHeightD9Ej5fM();
        ThumbHeight = fM30108getHandleHeightD9Ej5fM;
        ThumbSize = DpKt.m33523DpSizeYgX7TsA(fM30109getHandleWidthD9Ej5fM, fM30108getHandleHeightD9Ej5fM);
        ThumbTrackGapSize = sliderTokens.m30101getActiveHandleLeadingSpaceD9Ej5fM();
        TrackInsideCornerSize = C3186Dp.m33501constructorimpl(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(final p265nd.InterfaceC10401f r28, final p181hd.InterfaceC9540l r29, androidx.compose.p014ui.Modifier r30, boolean r31, p265nd.InterfaceC10401f r32, @androidx.annotation.IntRange(from = 0) int r33, p181hd.InterfaceC9529a r34, androidx.compose.material3.SliderColors r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(nd.f, hd.l, androidx.compose.ui.Modifier, boolean, nd.f, int, hd.a, androidx.compose.material3.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void RangeSliderImpl(final Modifier modifier, final RangeSliderState rangeSliderState, final boolean z10, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final InterfaceC9545q interfaceC9545q, final InterfaceC9545q interfaceC9545q2, final InterfaceC9545q interfaceC9545q3, Composer composer, final int i10) {
        Modifier modifier2;
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1411725677);
        if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i11 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(rangeSliderState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9545q) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9545q2) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9545q3) ? 8388608 : 4194304;
        }
        if ((4793491 & i11) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1411725677, i11, -1, "androidx.compose.material3.RangeSliderImpl (Slider.kt:735)");
            }
            rangeSliderState.setRtl$material3_release(composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierRangeSliderPressDragModifier = rangeSliderPressDragModifier(companion, rangeSliderState, mutableInteractionSource, mutableInteractionSource2, z10);
            Strings.Companion companion2 = Strings.Companion;
            final String strM29589getString2EP1pXo = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2638R.string.range_start), composerStartRestartGroup, 0);
            final String strM29589getString2EP1pXo2 = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2638R.string.range_end), composerStartRestartGroup, 0);
            Modifier modifierThen = SizeKt.m27501requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), ThumbWidth, TrackHeight, 0.0f, 0.0f, 12, null).then(modifierRangeSliderPressDragModifier);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(rangeSliderState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1
                    @Override // androidx.compose.p014ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                        long j11 = j10;
                        int size = list.size();
                        int i12 = 0;
                        int i13 = 0;
                        while (i13 < size) {
                            Measurable measurable = list.get(i13);
                            if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                                final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j11);
                                int size2 = list.size();
                                int i14 = 0;
                                while (i14 < size2) {
                                    Measurable measurable2 = list.get(i14);
                                    if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                                        final Placeable placeableMo32229measureBRTryo02 = measurable2.mo32229measureBRTryo0(j11);
                                        int size3 = list.size();
                                        while (i12 < size3) {
                                            Measurable measurable3 = list.get(i12);
                                            if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                                final Placeable placeableMo32229measureBRTryo03 = measurable3.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(ConstraintsKt.m33474offsetNN6EwU$default(j11, (-(placeableMo32229measureBRTryo0.getWidth() + placeableMo32229measureBRTryo02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                                int width = placeableMo32229measureBRTryo03.getWidth() + ((placeableMo32229measureBRTryo0.getWidth() + placeableMo32229measureBRTryo02.getWidth()) / 2);
                                                int iMax = Math.max(placeableMo32229measureBRTryo03.getHeight(), Math.max(placeableMo32229measureBRTryo0.getHeight(), placeableMo32229measureBRTryo02.getHeight()));
                                                rangeSliderState.setTrackHeight$material3_release(placeableMo32229measureBRTryo03.getHeight());
                                                rangeSliderState.setTotalWidth$material3_release(width);
                                                rangeSliderState.updateMinMaxPx$material3_release();
                                                final int width2 = placeableMo32229measureBRTryo0.getWidth() / 2;
                                                final int iM19282d = AbstractC9719c.m19282d(placeableMo32229measureBRTryo03.getWidth() * rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release());
                                                final int iM19282d2 = AbstractC9719c.m19282d((placeableMo32229measureBRTryo03.getWidth() * rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release()) + ((placeableMo32229measureBRTryo0.getWidth() - placeableMo32229measureBRTryo02.getWidth()) / 2));
                                                final int height = (iMax - placeableMo32229measureBRTryo03.getHeight()) / 2;
                                                final int height2 = (iMax - placeableMo32229measureBRTryo0.getHeight()) / 2;
                                                final int height3 = (iMax - placeableMo32229measureBRTryo02.getHeight()) / 2;
                                                return MeasureScope.layout$default(measureScope, width, iMax, null, new InterfaceC9540l() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // p181hd.InterfaceC9540l
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        invoke((Placeable.PlacementScope) obj);
                                                        return C10786q.f26013a;
                                                    }

                                                    public final void invoke(Placeable.PlacementScope placementScope) {
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo03, width2, height, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, iM19282d, height2, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo02, iM19282d2, height3, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                            i12++;
                                            j11 = j10;
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    i14++;
                                    j11 = j10;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i13++;
                            j11 = j10;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            int i12 = i11;
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicy, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(companion, RangeSliderComponents.STARTTHUMB), null, false, 3, null);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(rangeSliderState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$1$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m29112invokeozmzZPI(((IntSize) obj).m33676unboximpl());
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m29112invokeozmzZPI(long j10) {
                        rangeSliderState.setStartThumbWidth$material3_release(IntSize.m33672getWidthimpl(j10));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierRangeSliderStartThumbSemantics = rangeSliderStartThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(modifierWrapContentWidth$default, (InterfaceC9540l) objRememberedValue2), rangeSliderState, z10);
            boolean zChanged = composerStartRestartGroup.changed(strM29589getString2EP1pXo);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM29589getString2EP1pXo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierFocusable = FocusableKt.focusable(SemanticsModifierKt.semantics(modifierRangeSliderStartThumbSemantics, true, (InterfaceC9540l) objRememberedValue3), z10, mutableInteractionSource);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFocusable);
            InterfaceC9529a constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i13 = (i12 >> 3) & 14;
            interfaceC9545q.invoke(rangeSliderState, composerStartRestartGroup, Integer.valueOf(((i12 >> 12) & 112) | i13));
            composerStartRestartGroup.endNode();
            Modifier modifierWrapContentWidth$default2 = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(companion, RangeSliderComponents.ENDTHUMB), null, false, 3, null);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(rangeSliderState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC9540l() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$4$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m29113invokeozmzZPI(((IntSize) obj).m33676unboximpl());
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m29113invokeozmzZPI(long j10) {
                        rangeSliderState.setEndThumbWidth$material3_release(IntSize.m33672getWidthimpl(j10));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierRangeSliderEndThumbSemantics = rangeSliderEndThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(modifierWrapContentWidth$default2, (InterfaceC9540l) objRememberedValue4), rangeSliderState, z10);
            boolean zChanged2 = composerStartRestartGroup.changed(strM29589getString2EP1pXo2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new InterfaceC9540l() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM29589getString2EP1pXo2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierFocusable2 = FocusableKt.focusable(SemanticsModifierKt.semantics(modifierRangeSliderEndThumbSemantics, true, (InterfaceC9540l) objRememberedValue5), z10, mutableInteractionSource2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFocusable2);
            InterfaceC9529a constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl3 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl3.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM30305constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM30305constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m30312setimpl(composerM30305constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            interfaceC9545q2.invoke(rangeSliderState, composerStartRestartGroup, Integer.valueOf(((i12 >> 15) & 112) | i13));
            composerStartRestartGroup.endNode();
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, RangeSliderComponents.TRACK);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
            InterfaceC9529a constructor4 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl4 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl4.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM30305constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM30305constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m30312setimpl(composerM30305constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            interfaceC9545q3.invoke(rangeSliderState, composerStartRestartGroup, Integer.valueOf(((i12 >> 18) & 112) | i13));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.SliderKt.RangeSliderImpl.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i14) {
                    SliderKt.RangeSliderImpl(modifier, rangeSliderState, z10, mutableInteractionSource, mutableInteractionSource2, interfaceC9545q, interfaceC9545q2, interfaceC9545q3, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r27, final p181hd.InterfaceC9540l r28, androidx.compose.p014ui.Modifier r29, boolean r30, p265nd.InterfaceC10401f r31, @androidx.annotation.IntRange(from = 0) int r32, p181hd.InterfaceC9529a r33, androidx.compose.material3.SliderColors r34, androidx.compose.foundation.interaction.MutableInteractionSource r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, hd.l, androidx.compose.ui.Modifier, boolean, nd.f, int, hd.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SliderImpl(final Modifier modifier, final SliderState sliderState, final boolean z10, final MutableInteractionSource mutableInteractionSource, final InterfaceC9545q interfaceC9545q, final InterfaceC9545q interfaceC9545q2, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1390990089);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(sliderState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9545q) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9545q2) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1390990089, i11, -1, "androidx.compose.material3.SliderImpl (Slider.kt:664)");
            }
            sliderState.setRtl$material3_release(composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierSliderTapModifier = sliderTapModifier(companion, sliderState, mutableInteractionSource, z10);
            int i12 = i11;
            Orientation orientation = Orientation.Horizontal;
            boolean zIsRtl$material3_release = sliderState.isRtl$material3_release();
            boolean zIsDragging$material3_release = sliderState.isDragging$material3_release();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(sliderState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new SliderKt$SliderImpl$drag$1$1(sliderState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierThen = FocusableKt.focusable(sliderSemantics(SizeKt.m27501requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), ThumbWidth, TrackHeight, 0.0f, 0.0f, 12, null), sliderState, z10), z10, mutableInteractionSource).then(modifierSliderTapModifier).then(DraggableKt.draggable$default(companion, sliderState, orientation, z10, mutableInteractionSource, zIsDragging$material3_release, null, (InterfaceC9545q) objRememberedValue, zIsRtl$material3_release, 32, null));
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(sliderState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$1
                    @Override // androidx.compose.p014ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                        int size = list.size();
                        int i13 = 0;
                        for (int i14 = 0; i14 < size; i14++) {
                            Measurable measurable = list.get(i14);
                            if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                                long j11 = j10;
                                final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j11);
                                int size2 = list.size();
                                while (i13 < size2) {
                                    Measurable measurable2 = list.get(i13);
                                    if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                                        final Placeable placeableMo32229measureBRTryo02 = measurable2.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(ConstraintsKt.m33474offsetNN6EwU$default(j11, -placeableMo32229measureBRTryo0.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                                        int width = placeableMo32229measureBRTryo0.getWidth() + placeableMo32229measureBRTryo02.getWidth();
                                        int iMax = Math.max(placeableMo32229measureBRTryo02.getHeight(), placeableMo32229measureBRTryo0.getHeight());
                                        sliderState.updateDimensions$material3_release(placeableMo32229measureBRTryo02.getHeight(), width);
                                        final int width2 = placeableMo32229measureBRTryo0.getWidth() / 2;
                                        final int iM19282d = AbstractC9719c.m19282d(placeableMo32229measureBRTryo02.getWidth() * sliderState.getCoercedValueAsFraction$material3_release());
                                        final int height = (iMax - placeableMo32229measureBRTryo02.getHeight()) / 2;
                                        final int height2 = (iMax - placeableMo32229measureBRTryo0.getHeight()) / 2;
                                        return MeasureScope.layout$default(measureScope, width, iMax, null, new InterfaceC9540l() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // p181hd.InterfaceC9540l
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                invoke((Placeable.PlacementScope) obj);
                                                return C10786q.f26013a;
                                            }

                                            public final void invoke(Placeable.PlacementScope placementScope) {
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo02, width2, height, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, iM19282d, height2, 0.0f, 4, null);
                                            }
                                        }, 4, null);
                                    }
                                    i13++;
                                    j11 = j10;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(companion, SliderComponents.THUMB), null, false, 3, null);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(sliderState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.material3.SliderKt$SliderImpl$1$1$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m29114invokeozmzZPI(((IntSize) obj).m33676unboximpl());
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m29114invokeozmzZPI(long j10) {
                        sliderState.setThumbWidth$material3_release(IntSize.m33672getWidthimpl(j10));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierWrapContentWidth$default, (InterfaceC9540l) objRememberedValue3);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
            InterfaceC9529a constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i13 = (i12 >> 3) & 14;
            interfaceC9545q.invoke(sliderState, composerStartRestartGroup, Integer.valueOf(((i12 >> 9) & 112) | i13));
            composerStartRestartGroup.endNode();
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, SliderComponents.TRACK);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
            InterfaceC9529a constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl3 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM30305constructorimpl3.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM30305constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM30305constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m30312setimpl(composerM30305constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            interfaceC9545q2.invoke(sliderState, composerStartRestartGroup, Integer.valueOf(((i12 >> 12) & 112) | i13));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.SliderKt.SliderImpl.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i14) {
                    SliderKt.SliderImpl(modifier, sliderState, z10, mutableInteractionSource, interfaceC9545q, interfaceC9545q2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Stable
    public static final long SliderRange(float f10, float f11) {
        if ((Float.isNaN(f10) && Float.isNaN(f11)) || f10 <= f11 + SliderRangeTolerance) {
            return SliderRange.m29118constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
        }
        throw new IllegalArgumentException(("start(" + f10 + ") must be <= endInclusive(" + f11 + ')').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m29107awaitSlop8vUncbI(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, vc.InterfaceC11588c<? super kotlin.Pair<androidx.compose.p014ui.input.pointer.PointerInputChange, java.lang.Float>> r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof androidx.compose.material3.SliderKt$awaitSlop$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = (androidx.compose.material3.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = new androidx.compose.material3.SliderKt$awaitSlop$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref$FloatRef) r8
            kotlin.AbstractC9924b.m20071b(r12)
            goto L55
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.AbstractC9924b.m20071b(r12)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>()
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material3.internal.DragGestureDetectorCopyKt.m29507awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            r7 = r12
            r12 = r8
            r8 = r7
        L55:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L64
            float r8 = r8.f23399c
            java.lang.Float r8 = p409xc.AbstractC11826a.m26207b(r8)
            kotlin.Pair r8 = p309qc.AbstractC10776g.m22975a(r12, r8)
            return r8
        L64:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m29107awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f10, float f11, float f12) {
        float f13 = f11 - f10;
        return AbstractC10410o.m21760m(f13 == 0.0f ? 0.0f : (f12 - f10) / f13, 0.0f, 1.0f);
    }

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* renamed from: isSpecified-If1S1O4, reason: not valid java name */
    public static final boolean m29108isSpecifiedIf1S1O4(long j10) {
        return j10 != SliderRange.Companion.m29127getUnspecifiedFYbKRX4();
    }

    @Stable
    /* renamed from: isSpecified-If1S1O4$annotations, reason: not valid java name */
    public static /* synthetic */ void m29109isSpecifiedIf1S1O4$annotations(long j10) {
    }

    private static final Modifier rangeSliderEndThumbSemantics(Modifier modifier, final RangeSliderState rangeSliderState, final boolean z10) {
        final InterfaceC10401f interfaceC10401fM21749b = AbstractC10409n.m21749b(rangeSliderState.getActiveRangeStart(), ((Number) rangeSliderState.getValueRange().getEndInclusive()).floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new InterfaceC9540l() { // from class: androidx.compose.material3.SliderKt.rangeSliderEndThumbSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C10786q.f26013a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z10) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                final InterfaceC10401f interfaceC10401f = interfaceC10401fM21749b;
                final RangeSliderState rangeSliderState2 = rangeSliderState;
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new InterfaceC9540l() { // from class: androidx.compose.material3.SliderKt.rangeSliderEndThumbSemantics.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).floatValue());
                    }

                    public final Boolean invoke(float f10) {
                        int endSteps$material3_release;
                        float fM21760m = AbstractC10410o.m21760m(f10, ((Number) interfaceC10401f.getStart()).floatValue(), ((Number) interfaceC10401f.getEndInclusive()).floatValue());
                        boolean z11 = false;
                        if (rangeSliderState2.getEndSteps$material3_release() > 0 && (endSteps$material3_release = rangeSliderState2.getEndSteps$material3_release() + 1) >= 0) {
                            float fAbs = fM21760m;
                            float f11 = fAbs;
                            int i10 = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(((Number) interfaceC10401f.getStart()).floatValue(), ((Number) interfaceC10401f.getEndInclusive()).floatValue(), i10 / (rangeSliderState2.getEndSteps$material3_release() + 1));
                                float f12 = fLerp - fM21760m;
                                if (Math.abs(f12) <= fAbs) {
                                    fAbs = Math.abs(f12);
                                    f11 = fLerp;
                                }
                                if (i10 == endSteps$material3_release) {
                                    break;
                                }
                                i10++;
                            }
                            fM21760m = f11;
                        }
                        if (fM21760m != rangeSliderState2.getActiveRangeEnd()) {
                            long jSliderRange = SliderKt.SliderRange(rangeSliderState2.getActiveRangeStart(), fM21760m);
                            if (!SliderRange.m29120equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState2.getActiveRangeStart(), rangeSliderState2.getActiveRangeEnd()))) {
                                if (rangeSliderState2.getOnValueChange$material3_release() != null) {
                                    InterfaceC9540l onValueChange$material3_release = rangeSliderState2.getOnValueChange$material3_release();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(SliderRange.m29117boximpl(jSliderRange));
                                    }
                                } else {
                                    rangeSliderState2.setActiveRangeStart(SliderRange.m29122getStartimpl(jSliderRange));
                                    rangeSliderState2.setActiveRangeEnd(SliderRange.m29121getEndInclusiveimpl(jSliderRange));
                                }
                            }
                            InterfaceC9529a onValueChangeFinished = rangeSliderState2.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                    }
                }, 1, null);
            }
        }, 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState.getActiveRangeEnd(), interfaceC10401fM21749b, rangeSliderState.getEndSteps$material3_release());
    }

    @Stable
    private static final Modifier rangeSliderPressDragModifier(Modifier modifier, RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z10) {
        return z10 ? modifier.then(new SuspendPointerInputElement(null, null, new Object[]{mutableInteractionSource, mutableInteractionSource2, rangeSliderState}, new C2890xe3d9cdbd(new C23581(rangeSliderState, mutableInteractionSource, mutableInteractionSource2, null)), 3, null)) : modifier;
    }

    private static final Modifier rangeSliderStartThumbSemantics(Modifier modifier, final RangeSliderState rangeSliderState, final boolean z10) {
        final InterfaceC10401f interfaceC10401fM21749b = AbstractC10409n.m21749b(((Number) rangeSliderState.getValueRange().getStart()).floatValue(), rangeSliderState.getActiveRangeEnd());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new InterfaceC9540l() { // from class: androidx.compose.material3.SliderKt.rangeSliderStartThumbSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C10786q.f26013a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z10) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                final InterfaceC10401f interfaceC10401f = interfaceC10401fM21749b;
                final RangeSliderState rangeSliderState2 = rangeSliderState;
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new InterfaceC9540l() { // from class: androidx.compose.material3.SliderKt.rangeSliderStartThumbSemantics.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).floatValue());
                    }

                    public final Boolean invoke(float f10) {
                        int startSteps$material3_release;
                        float fM21760m = AbstractC10410o.m21760m(f10, ((Number) interfaceC10401f.getStart()).floatValue(), ((Number) interfaceC10401f.getEndInclusive()).floatValue());
                        boolean z11 = false;
                        if (rangeSliderState2.getStartSteps$material3_release() > 0 && (startSteps$material3_release = rangeSliderState2.getStartSteps$material3_release() + 1) >= 0) {
                            float fAbs = fM21760m;
                            float f11 = fAbs;
                            int i10 = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(((Number) interfaceC10401f.getStart()).floatValue(), ((Number) interfaceC10401f.getEndInclusive()).floatValue(), i10 / (rangeSliderState2.getStartSteps$material3_release() + 1));
                                float f12 = fLerp - fM21760m;
                                if (Math.abs(f12) <= fAbs) {
                                    fAbs = Math.abs(f12);
                                    f11 = fLerp;
                                }
                                if (i10 == startSteps$material3_release) {
                                    break;
                                }
                                i10++;
                            }
                            fM21760m = f11;
                        }
                        if (fM21760m != rangeSliderState2.getActiveRangeStart()) {
                            long jSliderRange = SliderKt.SliderRange(fM21760m, rangeSliderState2.getActiveRangeEnd());
                            if (!SliderRange.m29120equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState2.getActiveRangeStart(), rangeSliderState2.getActiveRangeEnd()))) {
                                if (rangeSliderState2.getOnValueChange$material3_release() != null) {
                                    InterfaceC9540l onValueChange$material3_release = rangeSliderState2.getOnValueChange$material3_release();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(SliderRange.m29117boximpl(jSliderRange));
                                    }
                                } else {
                                    rangeSliderState2.setActiveRangeStart(SliderRange.m29122getStartimpl(jSliderRange));
                                    rangeSliderState2.setActiveRangeEnd(SliderRange.m29121getEndInclusiveimpl(jSliderRange));
                                }
                            }
                            InterfaceC9529a onValueChangeFinished = rangeSliderState2.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                    }
                }, 1, null);
            }
        }, 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState.getActiveRangeStart(), interfaceC10401fM21749b, rangeSliderState.getStartSteps$material3_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f10, float f11, float f12, float f13, float f14) {
        return MathHelpersKt.lerp(f13, f14, calcFraction(f10, f11, f12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: scale-ziovWd0, reason: not valid java name */
    public static final long m29110scaleziovWd0(float f10, float f11, long j10, float f12, float f13) {
        return SliderRange(scale(f10, f11, SliderRange.m29122getStartimpl(j10), f12, f13), scale(f10, f11, SliderRange.m29121getEndInclusiveimpl(j10), f12, f13));
    }

    private static final Modifier sliderSemantics(Modifier modifier, final SliderState sliderState, final boolean z10) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new InterfaceC9540l() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C10786q.f26013a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z10) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                final SliderState sliderState2 = sliderState;
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new InterfaceC9540l() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1.1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).floatValue());
                    }

                    public final Boolean invoke(float f10) {
                        int steps;
                        float fM21760m = AbstractC10410o.m21760m(f10, ((Number) sliderState2.getValueRange().getStart()).floatValue(), ((Number) sliderState2.getValueRange().getEndInclusive()).floatValue());
                        boolean z11 = false;
                        if (sliderState2.getSteps() > 0 && (steps = sliderState2.getSteps() + 1) >= 0) {
                            float fAbs = fM21760m;
                            float f11 = fAbs;
                            int i10 = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(((Number) sliderState2.getValueRange().getStart()).floatValue(), ((Number) sliderState2.getValueRange().getEndInclusive()).floatValue(), i10 / (sliderState2.getSteps() + 1));
                                float f12 = fLerp - fM21760m;
                                if (Math.abs(f12) <= fAbs) {
                                    fAbs = Math.abs(f12);
                                    f11 = fLerp;
                                }
                                if (i10 == steps) {
                                    break;
                                }
                                i10++;
                            }
                            fM21760m = f11;
                        }
                        if (fM21760m != sliderState2.getValue()) {
                            if (fM21760m != sliderState2.getValue()) {
                                if (sliderState2.getOnValueChange$material3_release() != null) {
                                    InterfaceC9540l onValueChange$material3_release = sliderState2.getOnValueChange$material3_release();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(Float.valueOf(fM21760m));
                                    }
                                } else {
                                    sliderState2.setValue(fM21760m);
                                }
                            }
                            InterfaceC9529a onValueChangeFinished = sliderState2.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                    }
                }, 1, null);
            }
        }, 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), sliderState.getValue(), AbstractC10409n.m21749b(((Number) sliderState.getValueRange().getStart()).floatValue(), ((Number) sliderState.getValueRange().getEndInclusive()).floatValue()), sliderState.getSteps());
    }

    @Stable
    private static final Modifier sliderTapModifier(Modifier modifier, SliderState sliderState, MutableInteractionSource mutableInteractionSource, boolean z10) {
        return z10 ? modifier.then(new SuspendPointerInputElement(sliderState, mutableInteractionSource, null, new C2890xe3d9cdbd(new C23621(sliderState, null)), 4, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f10, float[] fArr, float f11, float f12) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f13 = fArr[0];
            int iM24112x0 = AbstractC10968r.m24112x0(fArr);
            if (iM24112x0 == 0) {
                fValueOf = Float.valueOf(f13);
            } else {
                float fAbs = Math.abs(MathHelpersKt.lerp(f11, f12, f13) - f10);
                AbstractC10961n0 it = new C10405j(1, iM24112x0).iterator();
                while (it.hasNext()) {
                    float f14 = fArr[it.nextInt()];
                    float fAbs2 = Math.abs(MathHelpersKt.lerp(f11, f12, f14) - f10);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f13 = f14;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f13);
            }
        }
        return fValueOf != null ? MathHelpersKt.lerp(f11, f12, fValueOf.floatValue()) : f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] stepsToTickFractions(int i10) {
        if (i10 == 0) {
            return new float[0];
        }
        int i11 = i10 + 2;
        float[] fArr = new float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i12] = i12 / (i10 + 1);
        }
        return fArr;
    }

    @Stable
    public static final long SliderRange(InterfaceC10401f interfaceC10401f) {
        float fFloatValue = ((Number) interfaceC10401f.getStart()).floatValue();
        float fFloatValue2 = ((Number) interfaceC10401f.getEndInclusive()).floatValue();
        if ((Float.isNaN(fFloatValue) && Float.isNaN(fFloatValue2)) || fFloatValue <= fFloatValue2 + SliderRangeTolerance) {
            return SliderRange.m29118constructorimpl((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(fFloatValue2) & 4294967295L));
        }
        throw new IllegalArgumentException(("ClosedFloatingPointRange<Float>.start(" + fFloatValue + ") must be <= ClosedFloatingPoint.endInclusive(" + fFloatValue2 + ')').toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r27, final p181hd.InterfaceC9540l r28, androidx.compose.p014ui.Modifier r29, boolean r30, p181hd.InterfaceC9529a r31, androidx.compose.material3.SliderColors r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, @androidx.annotation.IntRange(from = 0) int r34, p181hd.InterfaceC9545q r35, p181hd.InterfaceC9545q r36, p265nd.InterfaceC10401f r37, androidx.compose.runtime.Composer r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, hd.l, androidx.compose.ui.Modifier, boolean, hd.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, int, hd.q, hd.q, nd.f, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(final p265nd.InterfaceC10401f r31, final p181hd.InterfaceC9540l r32, androidx.compose.p014ui.Modifier r33, boolean r34, p265nd.InterfaceC10401f r35, p181hd.InterfaceC9529a r36, androidx.compose.material3.SliderColors r37, androidx.compose.foundation.interaction.MutableInteractionSource r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, p181hd.InterfaceC9545q r40, p181hd.InterfaceC9545q r41, p181hd.InterfaceC9545q r42, @androidx.annotation.IntRange(from = 0) int r43, androidx.compose.runtime.Composer r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(nd.f, hd.l, androidx.compose.ui.Modifier, boolean, nd.f, hd.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource, hd.q, hd.q, hd.q, int, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final androidx.compose.material3.SliderState r17, androidx.compose.p014ui.Modifier r18, boolean r19, androidx.compose.material3.SliderColors r20, androidx.compose.foundation.interaction.MutableInteractionSource r21, p181hd.InterfaceC9545q r22, p181hd.InterfaceC9545q r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, hd.q, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(final androidx.compose.material3.RangeSliderState r22, androidx.compose.p014ui.Modifier r23, boolean r24, androidx.compose.material3.SliderColors r25, androidx.compose.foundation.interaction.MutableInteractionSource r26, androidx.compose.foundation.interaction.MutableInteractionSource r27, p181hd.InterfaceC9545q r28, p181hd.InterfaceC9545q r29, p181hd.InterfaceC9545q r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource, hd.q, hd.q, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }
}
