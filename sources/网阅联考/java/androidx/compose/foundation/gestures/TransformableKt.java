package androidx.compose.foundation.gestures;

import androidx.compose.material3.MenuKt;
import androidx.compose.p006ui.ComposedModifierKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.input.pointer.PointerInputScope;
import androidx.compose.p006ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata(m5174d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a&\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m5175d2 = {"detectZoom", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "panZoomLock", "Landroidx/compose/runtime/State;", "", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/TransformEvent;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformable", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/TransformableState;", "lockRotationOnZoomPan", "enabled", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,180:1\n135#2:181\n101#3,2:182\n33#3,6:184\n103#3:190\n33#3,6:191\n101#3,2:197\n33#3,6:199\n103#3:205\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n106#1:181\n137#1:182,2\n137#1:184,6\n137#1:190\n171#1:191,6\n178#1:197,2\n178#1:199,6\n178#1:205\n*E\n"})
/* loaded from: classes.dex */
public final class TransformableKt {

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.TransformableKt", m5192f = "Transformable.kt", m5193i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m5194l = {134, 136}, m5195m = "detectZoom", m5196n = {"$this$detectZoom", "panZoomLock", "channel", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "panZoomLock", "channel", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, m5197s = {"L$0", "L$1", "L$2", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 */
    public static final class C04921 extends ContinuationImpl {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C04921(Continuation<? super C04921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.detectZoom(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:65:0x018f, B:58:0x0176], limit reached: 93 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00d8 -> B:24:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object detectZoom(androidx.compose.p006ui.input.pointer.AwaitPointerEventScope r27, androidx.compose.runtime.State<java.lang.Boolean> r28, kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r29, kotlin.coroutines.Continuation<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.runtime.State, kotlinx.coroutines.channels.Channel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Modifier transformable(Modifier modifier, final TransformableState state, final boolean z3, final boolean z4) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableKt$transformable$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("transformable");
                inspectorInfo.getProperties().set("state", state);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z4));
                inspectorInfo.getProperties().set("lockRotationOnZoomPan", Boolean.valueOf(z3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.TransformableKt.transformable.2

            @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$1", m5192f = "Transformable.kt", m5193i = {0, 0, 1}, m5194l = {72, MenuKt.OutTransitionDuration}, m5195m = "invokeSuspend", m5196n = {"$this$LaunchedEffect", NotificationCompat.CATEGORY_EVENT, "$this$LaunchedEffect"}, m5197s = {"L$0", "L$1", "L$0"})
            /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Channel<TransformEvent> $channel;
                final /* synthetic */ TransformableState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;

                @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1", m5192f = "Transformable.kt", m5193i = {0}, m5194l = {80}, m5195m = "invokeSuspend", m5196n = {"$this$transform"}, m5197s = {"L$0"})
                /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C47281 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Channel<TransformEvent> $channel;
                    final /* synthetic */ Ref.ObjectRef<TransformEvent> $event;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C47281(Ref.ObjectRef<TransformEvent> objectRef, Channel<TransformEvent> channel, Continuation<? super C47281> continuation) {
                        super(2, continuation);
                        this.$event = objectRef;
                        this.$channel = channel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C47281 c47281 = new C47281(this.$event, this.$channel, continuation);
                        c47281.L$0 = obj;
                        return c47281;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
                        return ((C47281) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005e -> B:21:0x0064). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                        /*
                            r8 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r8.label
                            r2 = 1
                            if (r1 == 0) goto L23
                            if (r1 != r2) goto L1b
                            java.lang.Object r1 = r8.L$1
                            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                            java.lang.Object r3 = r8.L$0
                            androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                            kotlin.ResultKt.throwOnFailure(r9)
                            r4 = r3
                            r3 = r1
                            r1 = r0
                            r0 = r8
                            goto L64
                        L1b:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L23:
                            kotlin.ResultKt.throwOnFailure(r9)
                            java.lang.Object r9 = r8.L$0
                            androidx.compose.foundation.gestures.TransformScope r9 = (androidx.compose.foundation.gestures.TransformScope) r9
                            r3 = r9
                            r9 = r8
                        L2c:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r1 = r9.$event
                            T r1 = r1.element
                            boolean r4 = r1 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStopped
                            if (r4 != 0) goto L6a
                            boolean r4 = r1 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformDelta
                            if (r4 == 0) goto L3b
                            androidx.compose.foundation.gestures.TransformEvent$TransformDelta r1 = (androidx.compose.foundation.gestures.TransformEvent.TransformDelta) r1
                            goto L3c
                        L3b:
                            r1 = 0
                        L3c:
                            if (r1 == 0) goto L4d
                            float r4 = r1.getZoomChange()
                            long r5 = r1.getPanChange()
                            float r1 = r1.getRotationChange()
                            r3.mo7142transformByd4ec7I(r4, r5, r1)
                        L4d:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r1 = r9.$event
                            kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r4 = r9.$channel
                            r9.L$0 = r3
                            r9.L$1 = r1
                            r9.label = r2
                            java.lang.Object r4 = r4.receive(r9)
                            if (r4 != r0) goto L5e
                            return r0
                        L5e:
                            r7 = r0
                            r0 = r9
                            r9 = r4
                            r4 = r3
                            r3 = r1
                            r1 = r7
                        L64:
                            r3.element = r9
                            r9 = r0
                            r0 = r1
                            r3 = r4
                            goto L2c
                        L6a:
                            kotlin.Unit r9 = kotlin.Unit.INSTANCE
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.C04932.AnonymousClass1.C47281.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Channel<TransformEvent> channel, TransformableState transformableState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$channel = channel;
                    this.$state = transformableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$channel, this.$state, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:14:0x0039). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                    /*
                        r11 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r11.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L31
                        if (r1 == r3) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r11.L$0
                        kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                        kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.util.concurrent.CancellationException -> L15
                    L15:
                        r12 = r1
                        goto L38
                    L17:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    L1f:
                        java.lang.Object r1 = r11.L$2
                        kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                        java.lang.Object r4 = r11.L$1
                        kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                        java.lang.Object r5 = r11.L$0
                        kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                        kotlin.ResultKt.throwOnFailure(r12)
                        r6 = r4
                        r4 = r11
                        goto L5b
                    L31:
                        kotlin.ResultKt.throwOnFailure(r12)
                        java.lang.Object r12 = r11.L$0
                        kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
                    L38:
                        r1 = r11
                    L39:
                        boolean r4 = kotlinx.coroutines.CoroutineScopeKt.isActive(r12)
                        if (r4 == 0) goto L81
                        kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
                        r4.<init>()
                        kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r5 = r1.$channel
                        r1.L$0 = r12
                        r1.L$1 = r4
                        r1.L$2 = r4
                        r1.label = r3
                        java.lang.Object r5 = r5.receive(r1)
                        if (r5 != r0) goto L55
                        return r0
                    L55:
                        r6 = r4
                        r4 = r1
                        r1 = r6
                        r10 = r5
                        r5 = r12
                        r12 = r10
                    L5b:
                        r1.element = r12
                        T r12 = r6.element
                        boolean r12 = r12 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                        if (r12 == 0) goto L7e
                        androidx.compose.foundation.gestures.TransformableState r12 = r4.$state     // Catch: java.util.concurrent.CancellationException -> L7e
                        androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch: java.util.concurrent.CancellationException -> L7e
                        androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1 r7 = new androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1     // Catch: java.util.concurrent.CancellationException -> L7e
                        kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r8 = r4.$channel     // Catch: java.util.concurrent.CancellationException -> L7e
                        r9 = 0
                        r7.<init>(r6, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L7e
                        r4.L$0 = r5     // Catch: java.util.concurrent.CancellationException -> L7e
                        r4.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L7e
                        r4.L$2 = r9     // Catch: java.util.concurrent.CancellationException -> L7e
                        r4.label = r2     // Catch: java.util.concurrent.CancellationException -> L7e
                        java.lang.Object r12 = r12.transform(r1, r7, r4)     // Catch: java.util.concurrent.CancellationException -> L7e
                        if (r12 != r0) goto L7e
                        return r0
                    L7e:
                        r1 = r4
                        r12 = r5
                        goto L39
                    L81:
                        kotlin.Unit r12 = kotlin.Unit.INSTANCE
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.C04932.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

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
                composer.startReplaceableGroup(1509335853);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1509335853, i4, -1, "androidx.compose.foundation.gestures.transformable.<anonymous> (Transformable.kt:65)");
                }
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z3), composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Channel channel = (Channel) objRememberedValue;
                composer.startReplaceableGroup(-2015617726);
                if (z4) {
                    TransformableState transformableState = state;
                    EffectsKt.LaunchedEffect(transformableState, new AnonymousClass1(channel, transformableState, null), composer, 64);
                }
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new TransformableKt$transformable$2$block$1$1(stateRememberUpdatedState, channel, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifierPointerInput = z4 ? SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, Unit.INSTANCE, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2) : Modifier.INSTANCE;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierPointerInput;
            }
        });
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        return transformable(modifier, transformableState, z3, z4);
    }
}
