package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p006ui.AbstractC1268c;
import androidx.compose.p006ui.ComposedModifierKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.MotionDurationScale;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.input.nestedscroll.AbstractC1378a;
import androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p006ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p006ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p006ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p006ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p006ui.input.pointer.PointerInputChange;
import androidx.compose.p006ui.input.pointer.PointerInputScope;
import androidx.compose.p006ui.input.pointer.PointerType;
import androidx.compose.p006ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p006ui.modifier.ModifierLocalKt;
import androidx.compose.p006ui.modifier.ProvidableModifierLocal;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
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
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m5174d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0002\u001a\u0015\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\"\u0010\u0017\u001a\u00020\u0018*\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001aO\u0010\u001c\u001a\u00020\u0018*\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0012\u001a\u00020\bH\u0003¢\u0006\u0002\u0010(\u001aR\u0010)\u001a\u00020\u0018*\u00020\u00182\u0006\u0010*\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007\u001aF\u0010)\u001a\u00020\u0018*\u00020\u00182\u0006\u0010*\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, m5175d2 = {"DefaultScrollMotionDurationScale", "Landroidx/compose/ui/MotionDurationScale;", "getDefaultScrollMotionDurationScale", "()Landroidx/compose/ui/MotionDurationScale;", "DefaultScrollMotionDurationScaleFactor", "", "ModifierLocalScrollableContainer", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "", "getModifierLocalScrollableContainer", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "NoOpScrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollableNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "scrollLogic", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "enabled", "awaitScrollEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseWheelScroll", "Landroidx/compose/ui/Modifier;", "scrollingLogicState", "mouseWheelScrollConfig", "Landroidx/compose/foundation/gestures/ScrollConfig;", "pointerScrollable", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseDirection", "controller", "Landroidx/compose/foundation/gestures/ScrollableState;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "scrollable", "state", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,579:1\n135#2:580\n25#3:581\n36#3:588\n25#3:595\n36#3:602\n50#3:609\n49#3:610\n1114#4,6:582\n1114#4,6:589\n1114#4,6:596\n1114#4,6:603\n1114#4,6:611\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n*L\n146#1:580\n252#1:581\n263#1:588\n266#1:595\n275#1:602\n276#1:609\n276#1:610\n252#1:582,6\n263#1:589,6\n266#1:596,6\n275#1:603,6\n276#1:611,6\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollableKt {
    private static final float DefaultScrollMotionDurationScaleFactor = 1.0f;
    private static final ScrollScope NoOpScrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollableKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float pixels) {
            return pixels;
        }
    };
    private static final ProvidableModifierLocal<Boolean> ModifierLocalScrollableContainer = ModifierLocalKt.modifierLocalOf(new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$ModifierLocalScrollableContainer$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });
    private static final MotionDurationScale DefaultScrollMotionDurationScale = new MotionDurationScale() { // from class: androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1
        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <R> R fold(R r3, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) MotionDurationScale.DefaultImpls.fold(this, r3, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
            return (E) MotionDurationScale.DefaultImpls.get(this, key);
        }

        @Override // androidx.compose.p006ui.MotionDurationScale, kotlin.coroutines.CoroutineContext.Element
        public /* synthetic */ CoroutineContext.Key getKey() {
            return AbstractC1268c.m318a(this);
        }

        @Override // androidx.compose.p006ui.MotionDurationScale
        public float getScaleFactor() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
            return MotionDurationScale.DefaultImpls.minusKey(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public CoroutineContext plus(CoroutineContext coroutineContext) {
            return MotionDurationScale.DefaultImpls.plus(this, coroutineContext);
        }
    };

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.ScrollableKt", m5192f = "Scrollable.kt", m5193i = {0}, m5194l = {313}, m5195m = "awaitScrollEvent", m5196n = {"$this$awaitScrollEvent"}, m5197s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 */
    public static final class C04791 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C04791(Continuation<? super C04791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScrollableKt.awaitScrollEvent(null, this);
        }
    }

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", m5192f = "Scrollable.kt", m5193i = {}, m5194l = {291}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1 */
    public static final class C04801 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ScrollConfig $mouseWheelScrollConfig;
        final /* synthetic */ State<ScrollingLogic> $scrollingLogicState;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
        @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", m5192f = "Scrollable.kt", m5193i = {0}, m5194l = {293}, m5195m = "invokeSuspend", m5196n = {"$this$awaitPointerEventScope"}, m5197s = {"L$0"})
        @SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$mouseWheelScroll$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,579:1\n86#2,2:580\n33#2,6:582\n88#2:588\n33#2,6:589\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$mouseWheelScroll$1$1\n*L\n294#1:580,2\n294#1:582,6\n294#1:588\n301#1:589,6\n*E\n"})
        /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ScrollConfig $mouseWheelScrollConfig;
            final /* synthetic */ State<ScrollingLogic> $scrollingLogicState;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ScrollConfig scrollConfig, State<ScrollingLogic> state, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$mouseWheelScrollConfig = scrollConfig;
                this.$scrollingLogicState = state;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseWheelScrollConfig, this.$scrollingLogicState, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:13:0x0037). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r10.label
                    r2 = 1
                    if (r1 == 0) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r1 = r10.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r1
                    kotlin.ResultKt.throwOnFailure(r11)
                    r3 = r1
                    r1 = r0
                    r0 = r10
                    goto L37
                L16:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1e:
                    kotlin.ResultKt.throwOnFailure(r11)
                    java.lang.Object r11 = r10.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r11
                    r1 = r11
                    r11 = r10
                L27:
                    r11.L$0 = r1
                    r11.label = r2
                    java.lang.Object r3 = androidx.compose.foundation.gestures.ScrollableKt.access$awaitScrollEvent(r1, r11)
                    if (r3 != r0) goto L32
                    return r0
                L32:
                    r9 = r0
                    r0 = r11
                    r11 = r3
                    r3 = r1
                    r1 = r9
                L37:
                    androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.p006ui.input.pointer.PointerEvent) r11
                    java.util.List r4 = r11.getChanges()
                    int r5 = r4.size()
                    r6 = 0
                    r7 = r6
                L43:
                    if (r7 >= r5) goto L57
                    java.lang.Object r8 = r4.get(r7)
                    androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p006ui.input.pointer.PointerInputChange) r8
                    boolean r8 = r8.isConsumed()
                    r8 = r8 ^ r2
                    if (r8 != 0) goto L54
                    r4 = r6
                    goto L58
                L54:
                    int r7 = r7 + 1
                    goto L43
                L57:
                    r4 = r2
                L58:
                    if (r4 == 0) goto L9c
                    androidx.compose.foundation.gestures.ScrollConfig r4 = r0.$mouseWheelScrollConfig
                    androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r5 = r0.$scrollingLogicState
                    long r7 = r3.mo10396getSizeYbymL2g()
                    long r7 = r4.mo7134calculateMouseWheelScroll8xgXZGE(r3, r11, r7)
                    java.lang.Object r4 = r5.getValue()
                    androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
                    float r5 = r4.m7224toFloatk4lQ0M(r7)
                    float r5 = r4.reverseIfNeeded(r5)
                    androidx.compose.foundation.gestures.ScrollableState r4 = r4.getScrollableState()
                    float r4 = r4.dispatchRawDelta(r5)
                    r5 = 0
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 != 0) goto L83
                    r4 = r2
                    goto L84
                L83:
                    r4 = r6
                L84:
                    if (r4 != 0) goto L9c
                    java.util.List r11 = r11.getChanges()
                    int r4 = r11.size()
                L8e:
                    if (r6 >= r4) goto L9c
                    java.lang.Object r5 = r11.get(r6)
                    androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.p006ui.input.pointer.PointerInputChange) r5
                    r5.consume()
                    int r6 = r6 + 1
                    goto L8e
                L9c:
                    r11 = r0
                    r0 = r1
                    r1 = r3
                    goto L27
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.C04801.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04801(ScrollConfig scrollConfig, State<ScrollingLogic> state, Continuation<? super C04801> continuation) {
            super(2, continuation);
            this.$mouseWheelScrollConfig = scrollConfig;
            this.$scrollingLogicState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04801 c04801 = new C04801(this.$mouseWheelScrollConfig, this.$scrollingLogicState, continuation);
            c04801.L$0 = obj;
            return c04801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C04801) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseWheelScrollConfig, this.$scrollingLogicState, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == coroutine_suspended) {
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
    }

    @Metadata(m5174d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, m5175d2 = {"androidx/compose/foundation/gestures/ScrollableKt$scrollableNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1 */
    public static final class C04841 implements NestedScrollConnection {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ State<ScrollingLogic> $scrollLogic;

        public C04841(State<ScrollingLogic> state, boolean z3) {
            this.$scrollLogic = state;
            this.$enabled = z3;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo7212onPostFlingRZ2iAVY(long r3, long r5, kotlin.coroutines.Continuation<? super androidx.compose.p006ui.unit.Velocity> r7) {
            /*
                r2 = this;
                boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
                if (r3 == 0) goto L13
                r3 = r7
                androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) r3
                int r4 = r3.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.label = r4
                goto L18
            L13:
                androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
                r3.<init>(r2, r7)
            L18:
                java.lang.Object r4 = r3.result
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r3.label
                r1 = 1
                if (r0 == 0) goto L37
                if (r0 != r1) goto L2f
                long r5 = r3.J$0
                java.lang.Object r3 = r3.L$0
                androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt.C04841) r3
                kotlin.ResultKt.throwOnFailure(r4)
                goto L54
            L2f:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L37:
                kotlin.ResultKt.throwOnFailure(r4)
                boolean r4 = r2.$enabled
                if (r4 == 0) goto L5f
                androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r4 = r2.$scrollLogic
                java.lang.Object r4 = r4.getValue()
                androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
                r3.L$0 = r2
                r3.J$0 = r5
                r3.label = r1
                java.lang.Object r4 = r4.m7217doFlingAnimationQWom1Mo(r5, r3)
                if (r4 != r7) goto L53
                return r7
            L53:
                r3 = r2
            L54:
                androidx.compose.ui.unit.Velocity r4 = (androidx.compose.p006ui.unit.Velocity) r4
                long r0 = r4.getPackedValue()
                long r4 = androidx.compose.p006ui.unit.Velocity.m11753minusAH228Gc(r5, r0)
                goto L66
            L5f:
                androidx.compose.ui.unit.Velocity$Companion r3 = androidx.compose.p006ui.unit.Velocity.INSTANCE
                long r4 = r3.m11761getZero9UxMQ8M()
                r3 = r2
            L66:
                androidx.compose.ui.unit.Velocity r4 = androidx.compose.p006ui.unit.Velocity.m11741boximpl(r4)
                androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r3 = r3.$scrollLogic
                r4.getPackedValue()
                java.lang.Object r3 = r3.getValue()
                androidx.compose.foundation.gestures.ScrollingLogic r3 = (androidx.compose.foundation.gestures.ScrollingLogic) r3
                r5 = 0
                r3.registerNestedFling(r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.C04841.mo7212onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public long mo7213onPostScrollDzOQY0M(long consumed, long available, int source) {
            return this.$enabled ? this.$scrollLogic.getValue().m7219performRawScrollMKHz9U(available) : Offset.INSTANCE.m8961getZeroF1C5BW0();
        }

        @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public /* synthetic */ Object mo7214onPreFlingQWom1Mo(long j4, Continuation continuation) {
            return AbstractC1378a.m561c(this, j4, continuation);
        }

        @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public long mo7215onPreScrollOzD1aCk(long available, int source) {
            if (NestedScrollSource.m10387equalsimpl0(source, NestedScrollSource.INSTANCE.m10393getFlingWNlRxjI())) {
                this.$scrollLogic.getValue().registerNestedFling(true);
            }
            return Offset.INSTANCE.m8961getZeroF1C5BW0();
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitScrollEvent(androidx.compose.p006ui.input.pointer.AwaitPointerEventScope r5, kotlin.coroutines.Continuation<? super androidx.compose.p006ui.input.pointer.PointerEvent> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.ScrollableKt.C04791
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt.C04791) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
        L38:
            r0.L$0 = r5
            r0.label = r3
            r6 = 0
            java.lang.Object r6 = androidx.compose.p006ui.input.pointer.AbstractC1394b.m590t(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r6 = (androidx.compose.p006ui.input.pointer.PointerEvent) r6
            int r2 = r6.getType()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.p006ui.input.pointer.PointerEventType.INSTANCE
            int r4 = r4.m10441getScroll7fucELk()
            boolean r2 = androidx.compose.p006ui.input.pointer.PointerEventType.m10432equalsimpl0(r2, r4)
            if (r2 == 0) goto L38
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.awaitScrollEvent(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final MotionDurationScale getDefaultScrollMotionDurationScale() {
        return DefaultScrollMotionDurationScale;
    }

    public static final ProvidableModifierLocal<Boolean> getModifierLocalScrollableContainer() {
        return ModifierLocalScrollableContainer;
    }

    private static final Modifier mouseWheelScroll(Modifier modifier, State<ScrollingLogic> state, ScrollConfig scrollConfig) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, state, scrollConfig, new C04801(scrollConfig, state, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final Modifier pointerScrollable(Modifier modifier, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z3, ScrollableState scrollableState, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect, boolean z4, Composer composer, int i4) {
        composer.startReplaceableGroup(-2012025036);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012025036, i4, -1, "androidx.compose.foundation.gestures.pointerScrollable (Scrollable.kt:241)");
        }
        composer.startReplaceableGroup(-1730186281);
        FlingBehavior flingBehavior2 = flingBehavior == null ? ScrollableDefaults.INSTANCE.flingBehavior(composer, 6) : flingBehavior;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new NestedScrollDispatcher(), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new ScrollingLogic(orientation, z3, mutableState, scrollableState, flingBehavior2, overscrollEffect), composer, 0);
        Object objValueOf = Boolean.valueOf(z4);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(objValueOf);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = scrollableNestedScrollConnection(stateRememberUpdatedState, z4);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) objRememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new ScrollDraggableState(stateRememberUpdatedState);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        ScrollDraggableState scrollDraggableState = (ScrollDraggableState) objRememberedValue3;
        ScrollConfig scrollConfigPlatformScrollConfig = AndroidScrollable_androidKt.platformScrollConfig(composer, 0);
        C04811 c04811 = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(PointerInputChange down) {
                Intrinsics.checkNotNullParameter(down, "down");
                return Boolean.valueOf(!PointerType.m10538equalsimpl0(down.getType(), PointerType.INSTANCE.m10543getMouseT8wyACA()));
            }
        };
        composer.startReplaceableGroup(1157296644);
        boolean zChanged2 = composer.changed(stateRememberUpdatedState);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(stateRememberUpdatedState.getValue().shouldScrollImmediately());
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        Function0 function0 = (Function0) objRememberedValue4;
        composer.startReplaceableGroup(511388516);
        boolean zChanged3 = composer.changed(mutableState) | composer.changed(stateRememberUpdatedState);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new ScrollableKt$pointerScrollable$3$1(mutableState, stateRememberUpdatedState, null);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceableGroup();
        Modifier modifierNestedScroll = NestedScrollModifierKt.nestedScroll(mouseWheelScroll(DraggableKt.draggable(modifier, scrollDraggableState, c04811, orientation, (64 & 8) != 0 ? true : z4, (64 & 16) != 0 ? null : mutableInteractionSource, function0, (64 & 64) != 0 ? new DraggableKt.C04636(null) : null, (64 & 128) != 0 ? new DraggableKt.C04647(null) : (Function3) objRememberedValue5, (64 & 256) != 0 ? false : false), stateRememberUpdatedState, scrollConfigPlatformScrollConfig), nestedScrollConnection, (NestedScrollDispatcher) mutableState.getValue());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierNestedScroll;
    }

    public static final Modifier scrollable(Modifier modifier, ScrollableState state, Orientation orientation, boolean z3, boolean z4, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return scrollable(modifier, state, orientation, null, z3, z4, flingBehavior, mutableInteractionSource);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z3, boolean z4, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = true;
        }
        boolean z5 = z3;
        if ((i4 & 8) != 0) {
            z4 = false;
        }
        return scrollable(modifier, scrollableState, orientation, z5, z4, (i4 & 16) != 0 ? null : flingBehavior, (i4 & 32) != 0 ? null : mutableInteractionSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection scrollableNestedScrollConnection(State<ScrollingLogic> state, boolean z3) {
        return new C04841(state, z3);
    }

    @ExperimentalFoundationApi
    public static final Modifier scrollable(Modifier modifier, final ScrollableState state, final Orientation orientation, final OverscrollEffect overscrollEffect, final boolean z3, final boolean z4, final FlingBehavior flingBehavior, final MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("scrollable");
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set("state", state);
                inspectorInfo.getProperties().set("overscrollEffect", overscrollEffect);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z4));
                inspectorInfo.getProperties().set("flingBehavior", flingBehavior);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.ScrollableKt.scrollable.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier composed, Composer composer, int i4) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-629830927);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-629830927, i4, -1, "androidx.compose.foundation.gestures.scrollable.<anonymous> (Scrollable.kt:155)");
                }
                composer.startReplaceableGroup(773894976);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                composer.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composer.endReplaceableGroup();
                Object[] objArr = {coroutineScope, orientation, state, Boolean.valueOf(z4)};
                Orientation orientation2 = orientation;
                ScrollableState scrollableState = state;
                boolean z5 = z4;
                composer.startReplaceableGroup(-568225417);
                boolean zChanged = false;
                for (int i5 = 0; i5 < 4; i5++) {
                    zChanged |= composer.changed(objArr[i5]);
                }
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ContentInViewModifier(coroutineScope, orientation2, scrollableState, z5);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifier2 = Modifier.INSTANCE;
                Modifier modifierPointerScrollable = ScrollableKt.pointerScrollable(FocusableKt.focusGroup(modifier2).then(((ContentInViewModifier) objRememberedValue2).getModifier()), mutableInteractionSource, orientation, z4, state, flingBehavior, overscrollEffect, z3, composer, 0);
                if (z3) {
                    modifier2 = ModifierLocalScrollableContainerProvider.INSTANCE;
                }
                Modifier modifierThen = modifierPointerScrollable.then(modifier2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        });
    }
}
