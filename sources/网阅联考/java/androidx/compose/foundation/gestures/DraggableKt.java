package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p006ui.ComposedModifierKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p006ui.input.pointer.PointerEventKt;
import androidx.compose.p006ui.input.pointer.PointerInputChange;
import androidx.compose.p006ui.input.pointer.PointerInputScope;
import androidx.compose.p006ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p006ui.input.pointer.util.VelocityTracker;
import androidx.compose.p006ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.unit.Velocity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.solver.widgets.Optimizer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;

@Metadata(m5174d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u001a!\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001ad\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t*\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u00030\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00110\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001aS\u0010\u0017\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001aé\u0001\u0010 \u001a\u00020!*\u00020!2\u0006\u0010\"\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010#\u001a\u00020\u000f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112>\b\u0002\u0010&\u001a8\b\u0001\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050,\u0012\u0006\u0012\u0004\u0018\u00010-0'¢\u0006\u0002\b.2>\b\u0002\u0010/\u001a8\b\u0001\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u001100¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(1\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050,\u0012\u0006\u0012\u0004\u0018\u00010-0'¢\u0006\u0002\b.2\b\b\u0002\u0010\u001d\u001a\u00020\u000fH\u0000ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u00102\u001aÏ\u0001\u0010 \u001a\u00020!*\u00020!2\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010#\u001a\u00020\u000f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2>\b\u0002\u0010&\u001a8\b\u0001\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050,\u0012\u0006\u0012\u0004\u0018\u00010-0'¢\u0006\u0002\b.2>\b\u0002\u0010/\u001a8\b\u0001\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(1\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050,\u0012\u0006\u0012\u0004\u0018\u00010-0'¢\u0006\u0002\b.2\b\b\u0002\u0010\u001d\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u00103\u001aA\u00104\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00105\u001a\u0002062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003H\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a!\u0010:\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a!\u0010:\u001a\u00020\u0004*\u0002002\u0006\u0010\u0014\u001a\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010<\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006>"}, m5175d2 = {"DraggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "onDelta", "Lkotlin/Function1;", "", "", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "awaitDownAndSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "canDrag", "Landroidx/compose/runtime/State;", "", "startDragImmediately", "Lkotlin/Function0;", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDrag", "startEvent", "initialDelta", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/compose/foundation/gestures/DragEvent;", "reverseDirection", "awaitDrag-Su4bsnU", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/SendChannel;ZLandroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "draggable", "Landroidx/compose/ui/Modifier;", "state", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "Landroidx/compose/ui/unit/Velocity;", "velocity", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "onDragOrUp", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "onDrag", "onDragOrUp-Axegvzg", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toFloat", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "toFloat-sF-c-tU", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 5 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,461:1\n25#2:462\n1114#3,6:463\n135#4:469\n658#5,18:470\n676#5,4:497\n680#5,58:508\n581#5,6:566\n615#5,4:572\n619#5,2:585\n621#5,8:594\n588#5,10:602\n116#6,2:488\n33#6,6:490\n118#6:496\n33#6,6:501\n118#6:507\n116#6,2:576\n33#6,6:578\n118#6:584\n33#6,6:587\n118#6:593\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n141#1:462\n141#1:463,6\n209#1:469\n334#1:470,18\n334#1:497,4\n334#1:508,58\n387#1:566,6\n387#1:572,4\n387#1:585,2\n387#1:594,8\n387#1:602,10\n334#1:488,2\n334#1:490,6\n334#1:496\n334#1:501,6\n334#1:507\n387#1:576,2\n387#1:578,6\n387#1:584\n387#1:587,6\n387#1:593\n*E\n"})
/* loaded from: classes.dex */
public final class DraggableKt {

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DraggableKt", m5192f = "Draggable.kt", m5193i = {0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, m5194l = {316, 325, 478, 528}, m5195m = "awaitDownAndSlop", m5196n = {"$this$awaitDownAndSlop", "canDrag", "startDragImmediately", "velocityTracker", "orientation", "$this$awaitDownAndSlop", "velocityTracker", "orientation", "initialDelta", "postPointerSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "initialDelta", "postPointerSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, m5197s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "F$0", "F$1", "F$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "F$0", "F$1", "F$2"})
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 */
    public static final class C04571 extends ContinuationImpl {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C04571(Continuation<? super C04571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DraggableKt.awaitDownAndSlop(null, null, null, null, null, this);
        }
    }

    @Metadata(m5174d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", m5192f = "Draggable.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$1 */
    public static final class C04581 extends SuspendLambda implements Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> {
        int label;

        public C04581(Continuation<? super C04581> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation<? super Unit> continuation) {
            return m7183invoked4ec7I(coroutineScope, offset.getPackedValue(), continuation);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m7183invoked4ec7I(CoroutineScope coroutineScope, long j4, Continuation<? super Unit> continuation) {
            return new C04581(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m5174d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "it", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", m5192f = "Draggable.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$2 */
    public static final class C04592 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
        int label;

        public C04592(Continuation<? super C04592> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f4, Continuation<? super Unit> continuation) {
            return invoke(coroutineScope, f4.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }

        public final Object invoke(CoroutineScope coroutineScope, float f4, Continuation<? super Unit> continuation) {
            return new C04592(continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m5174d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/unit/Velocity;", "velocity", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", m5192f = "Draggable.kt", m5193i = {}, m5194l = {193}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$5 */
    public static final class C04625 extends SuspendLambda implements Function3<CoroutineScope, Velocity, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> $onDragStopped;
        final /* synthetic */ Orientation $orientation;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04625(Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function3, Orientation orientation, Continuation<? super C04625> continuation) {
            super(3, continuation);
            this.$onDragStopped = function3;
            this.$orientation = orientation;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Velocity velocity, Continuation<? super Unit> continuation) {
            return m7184invokeLuvzFrg(coroutineScope, velocity.getPackedValue(), continuation);
        }

        /* renamed from: invoke-LuvzFrg, reason: not valid java name */
        public final Object m7184invokeLuvzFrg(CoroutineScope coroutineScope, long j4, Continuation<? super Unit> continuation) {
            C04625 c04625 = new C04625(this.$onDragStopped, this.$orientation, continuation);
            c04625.L$0 = coroutineScope;
            c04625.J$0 = j4;
            return c04625.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                long j4 = this.J$0;
                Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> function3 = this.$onDragStopped;
                Float fBoxFloat = Boxing.boxFloat(DraggableKt.m7181toFloatsFctU(j4, this.$orientation));
                this.label = 1;
                if (function3.invoke(coroutineScope, fBoxFloat, this) == coroutine_suspended) {
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

    @Metadata(m5174d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DraggableKt$draggable$6", m5192f = "Draggable.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$6 */
    public static final class C04636 extends SuspendLambda implements Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> {
        int label;

        public C04636(Continuation<? super C04636> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation<? super Unit> continuation) {
            return m7185invoked4ec7I(coroutineScope, offset.getPackedValue(), continuation);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m7185invoked4ec7I(CoroutineScope coroutineScope, long j4, Continuation<? super Unit> continuation) {
            return new C04636(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m5174d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/unit/Velocity;", "it", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DraggableKt$draggable$7", m5192f = "Draggable.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$7 */
    public static final class C04647 extends SuspendLambda implements Function3<CoroutineScope, Velocity, Continuation<? super Unit>, Object> {
        int label;

        public C04647(Continuation<? super C04647> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Velocity velocity, Continuation<? super Unit> continuation) {
            return m7186invokeLuvzFrg(coroutineScope, velocity.getPackedValue(), continuation);
        }

        /* renamed from: invoke-LuvzFrg, reason: not valid java name */
        public final Object m7186invokeLuvzFrg(CoroutineScope coroutineScope, long j4, Continuation<? super Unit> continuation) {
            return new C04647(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public static final DraggableState DraggableState(Function1<? super Float, Unit> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        return new DefaultDraggableState(onDelta);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ed A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0234 -> B:81:0x02a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x029a -> B:77:0x029f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x02ef -> B:81:0x02a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitDownAndSlop(androidx.compose.p006ui.input.pointer.AwaitPointerEventScope r20, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super androidx.compose.p006ui.input.pointer.PointerInputChange, java.lang.Boolean>> r21, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<java.lang.Boolean>> r22, androidx.compose.p006ui.input.pointer.util.VelocityTracker r23, androidx.compose.foundation.gestures.Orientation r24, kotlin.coroutines.Continuation<? super kotlin.Pair<androidx.compose.p006ui.input.pointer.PointerInputChange, androidx.compose.p006ui.geometry.Offset>> r25) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.ui.input.pointer.util.VelocityTracker, androidx.compose.foundation.gestures.Orientation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: awaitDrag-Su4bsnU, reason: not valid java name */
    public static final Object m7178awaitDragSu4bsnU(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, long j4, final VelocityTracker velocityTracker, final SendChannel<? super DragEvent> sendChannel, final boolean z3, Orientation orientation, Continuation<? super Boolean> continuation) {
        sendChannel.mo13306trySendJP2dKIU(new DragEvent.DragStarted(Offset.m8949minusMKHz9U(pointerInputChange.getPosition(), OffsetKt.Offset(Offset.m8945getXimpl(j4) * Math.signum(Offset.m8945getXimpl(pointerInputChange.getPosition())), Offset.m8946getYimpl(j4) * Math.signum(Offset.m8946getYimpl(pointerInputChange.getPosition())))), null));
        sendChannel.mo13306trySendJP2dKIU(new DragEvent.DragDelta(z3 ? Offset.m8952timestuRUvjQ(j4, -1.0f) : j4, null));
        return m7179onDragOrUpAxegvzg(awaitPointerEventScope, orientation, pointerInputChange.getId(), new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                invoke2(pointerInputChange2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PointerInputChange event) {
                Intrinsics.checkNotNullParameter(event, "event");
                VelocityTrackerKt.addPointerInputChange(velocityTracker, event);
                if (PointerEventKt.changedToUpIgnoreConsumed(event)) {
                    return;
                }
                long jPositionChange = PointerEventKt.positionChange(event);
                event.consume();
                SendChannel<DragEvent> sendChannel2 = sendChannel;
                if (z3) {
                    jPositionChange = Offset.m8952timestuRUvjQ(jPositionChange, -1.0f);
                }
                sendChannel2.mo13306trySendJP2dKIU(new DragEvent.DragDelta(jPositionChange, null));
            }
        }, continuation);
    }

    public static final Modifier draggable(Modifier modifier, DraggableState state, Orientation orientation, boolean z3, MutableInteractionSource mutableInteractionSource, final boolean z4, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z5) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return draggable(modifier, state, new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.3
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(PointerInputChange it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        }, orientation, z3, mutableInteractionSource, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(z4);
            }
        }, onDragStarted, new C04625(onDragStopped, orientation, null), z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
    
        if ((!(((java.lang.Number) r9.invoke(r14)).floatValue() == 0.0f)) != false) goto L56;
     */
    /* JADX WARN: Path cross not found for [B:50:0x00ff, B:39:0x00d4], limit reached: 73 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0095 -> B:27:0x009a). Please report as a decompilation issue!!! */
    /* renamed from: onDragOrUp-Axegvzg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m7179onDragOrUpAxegvzg(androidx.compose.p006ui.input.pointer.AwaitPointerEventScope r17, androidx.compose.foundation.gestures.Orientation r18, long r19, kotlin.jvm.functions.Function1<? super androidx.compose.p006ui.input.pointer.PointerInputChange, kotlin.Unit> r21, kotlin.coroutines.Continuation<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m7179onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.Orientation, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Composable
    public static final DraggableState rememberDraggableState(Function1<? super Float, Unit> onDelta, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        composer.startReplaceableGroup(-183245213);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i4, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:138)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onDelta, composer, i4 & 14);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = DraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f4) {
                    invoke(f4.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f4) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f4));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m7180toFloat3MmeM6k(long j4, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m8946getYimpl(j4) : Offset.m8945getXimpl(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m7181toFloatsFctU(long j4, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m11751getYimpl(j4) : Velocity.m11750getXimpl(j4);
    }

    public static final Modifier draggable(Modifier modifier, final DraggableState state, final Function1<? super PointerInputChange, Boolean> canDrag, final Orientation orientation, final boolean z3, final MutableInteractionSource mutableInteractionSource, final Function0<Boolean> startDragImmediately, final Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, final Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, final boolean z4) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(startDragImmediately, "startDragImmediately");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("draggable");
                inspectorInfo.getProperties().set("canDrag", canDrag);
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z4));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("startDragImmediately", startDragImmediately);
                inspectorInfo.getProperties().set("onDragStarted", onDragStarted);
                inspectorInfo.getProperties().set("onDragStopped", onDragStopped);
                inspectorInfo.getProperties().set("state", state);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.9

            @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", m5192f = "Draggable.kt", m5193i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, m5194l = {239, 241, 243, 251, 253, InputDeviceCompat.SOURCE_KEYBOARD}, m5195m = "invokeSuspend", m5196n = {"$this$LaunchedEffect", NotificationCompat.CATEGORY_EVENT, "$this$LaunchedEffect", NotificationCompat.CATEGORY_EVENT, "$this$LaunchedEffect", NotificationCompat.CATEGORY_EVENT, "$this$LaunchedEffect", "$this$LaunchedEffect", "$this$LaunchedEffect"}, m5197s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
            @SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,461:1\n1#2:462\n*E\n"})
            /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Channel<DragEvent> $channel;
                final /* synthetic */ State<DragLogic> $dragLogic$delegate;
                final /* synthetic */ Orientation $orientation;
                final /* synthetic */ DraggableState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;

                @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", m5192f = "Draggable.kt", m5193i = {0}, m5194l = {246}, m5195m = "invokeSuspend", m5196n = {"$this$drag"}, m5197s = {"L$0"})
                @SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,461:1\n1#2:462\n*E\n"})
                /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2, reason: invalid class name and collision with other inner class name */
                public static final class C47232 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Channel<DragEvent> $channel;
                    final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
                    final /* synthetic */ Orientation $orientation;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C47232(Ref.ObjectRef<DragEvent> objectRef, Channel<DragEvent> channel, Orientation orientation, Continuation<? super C47232> continuation) {
                        super(2, continuation);
                        this.$event = objectRef;
                        this.$channel = channel;
                        this.$orientation = orientation;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C47232 c47232 = new C47232(this.$event, this.$channel, this.$orientation, continuation);
                        c47232.L$0 = obj;
                        return c47232;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
                        return ((C47232) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:23:0x0066). Please report as a decompilation issue!!! */
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
                            androidx.compose.foundation.gestures.DragScope r3 = (androidx.compose.foundation.gestures.DragScope) r3
                            kotlin.ResultKt.throwOnFailure(r9)
                            r4 = r3
                            r3 = r1
                            r1 = r0
                            r0 = r8
                            goto L66
                        L1b:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L23:
                            kotlin.ResultKt.throwOnFailure(r9)
                            java.lang.Object r9 = r8.L$0
                            androidx.compose.foundation.gestures.DragScope r9 = (androidx.compose.foundation.gestures.DragScope) r9
                            r3 = r9
                            r9 = r8
                        L2c:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r1 = r9.$event
                            T r1 = r1.element
                            boolean r4 = r1 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                            if (r4 != 0) goto L6c
                            boolean r4 = r1 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                            if (r4 != 0) goto L6c
                            boolean r4 = r1 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                            if (r4 == 0) goto L3f
                            androidx.compose.foundation.gestures.DragEvent$DragDelta r1 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r1
                            goto L40
                        L3f:
                            r1 = 0
                        L40:
                            if (r1 == 0) goto L4f
                            androidx.compose.foundation.gestures.Orientation r4 = r9.$orientation
                            long r5 = r1.getDelta()
                            float r1 = androidx.compose.foundation.gestures.DraggableKt.m7176access$toFloat3MmeM6k(r5, r4)
                            r3.dragBy(r1)
                        L4f:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r1 = r9.$event
                            kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.DragEvent> r4 = r9.$channel
                            r9.L$0 = r3
                            r9.L$1 = r1
                            r9.label = r2
                            java.lang.Object r4 = r4.receive(r9)
                            if (r4 != r0) goto L60
                            return r0
                        L60:
                            r7 = r0
                            r0 = r9
                            r9 = r4
                            r4 = r3
                            r3 = r1
                            r1 = r7
                        L66:
                            r3.element = r9
                            r9 = r0
                            r0 = r1
                            r3 = r4
                            goto L2c
                        L6c:
                            kotlin.Unit r9 = kotlin.Unit.INSTANCE
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.C04659.AnonymousClass2.C47232.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Channel<DragEvent> channel, DraggableState draggableState, State<DragLogic> state, Orientation orientation, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$channel = channel;
                    this.$state = draggableState;
                    this.$dragLogic$delegate = state;
                    this.$orientation = orientation;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$channel, this.$state, this.$dragLogic$delegate, this.$orientation, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00cd A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00dc A[Catch: CancellationException -> 0x010d, TryCatch #3 {CancellationException -> 0x010d, blocks: (B:38:0x00d0, B:40:0x00dc, B:45:0x00f7, B:47:0x00fb), top: B:67:0x00d0 }] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00f7 A[Catch: CancellationException -> 0x010d, TryCatch #3 {CancellationException -> 0x010d, blocks: (B:38:0x00d0, B:40:0x00dc, B:45:0x00f7, B:47:0x00fb), top: B:67:0x00d0 }] */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0124 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
                /* JADX WARN: Type inference failed for: r11v11, types: [T] */
                /* JADX WARN: Type inference failed for: r11v20 */
                /* JADX WARN: Type inference failed for: r11v29 */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v1 */
                /* JADX WARN: Type inference failed for: r1v2 */
                /* JADX WARN: Type inference failed for: r1v31 */
                /* JADX WARN: Type inference failed for: r1v34 */
                /* JADX WARN: Type inference failed for: r1v42 */
                /* JADX WARN: Type inference failed for: r1v43 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0109 -> B:22:0x0068). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0125 -> B:22:0x0068). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0129 -> B:22:0x0068). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        Method dump skipped, instructions count: 322
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.C04659.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", m5192f = "Draggable.kt", m5193i = {}, m5194l = {Optimizer.OPTIMIZATION_STANDARD}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
            /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                final /* synthetic */ Channel<DragEvent> $channel;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ Orientation $orientation;
                final /* synthetic */ boolean $reverseDirection;
                final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                private /* synthetic */ Object L$0;
                int label;

                @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", m5192f = "Draggable.kt", m5193i = {0}, m5194l = {265}, m5195m = "invokeSuspend", m5196n = {"$this$coroutineScope"}, m5197s = {"L$0"})
                /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ PointerInputScope $$this$pointerInput;
                    final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                    final /* synthetic */ Channel<DragEvent> $channel;
                    final /* synthetic */ Orientation $orientation;
                    final /* synthetic */ boolean $reverseDirection;
                    final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                    private /* synthetic */ Object L$0;
                    int label;

                    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                    @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", m5192f = "Draggable.kt", m5193i = {0, 0, 1, 1, 1}, m5194l = {268, 276}, m5195m = "invokeSuspend", m5196n = {"$this$awaitPointerEventScope", "velocityTracker", "$this$awaitPointerEventScope", "velocityTracker", "isDragSuccessful"}, m5197s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
                    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C47241 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ CoroutineScope $$this$coroutineScope;
                        final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                        final /* synthetic */ Channel<DragEvent> $channel;
                        final /* synthetic */ Orientation $orientation;
                        final /* synthetic */ boolean $reverseDirection;
                        final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                        int I$0;
                        private /* synthetic */ Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        boolean Z$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C47241(CoroutineScope coroutineScope, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, Channel<DragEvent> channel, boolean z3, Continuation<? super C47241> continuation) {
                            super(2, continuation);
                            this.$$this$coroutineScope = coroutineScope;
                            this.$canDragState = state;
                            this.$startImmediatelyState = state2;
                            this.$orientation = orientation;
                            this.$channel = channel;
                            this.$reverseDirection = z3;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C47241 c47241 = new C47241(this.$$this$coroutineScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                            c47241.L$0 = obj;
                            return c47241;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                            return ((C47241) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Can't wrap try/catch for region: R(9:25|(1:85)|26|(1:28)(1:29)|30|31|83|32|(1:34)(8:35|79|36|(0)(0)|44|62|17|(2:75|76)(0))) */
                        /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
                        
                            r0 = th;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:51:0x0117, code lost:
                        
                            r0 = e;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
                        
                            r10 = r20;
                            r12 = r22;
                            r13 = r23;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:58:0x0133, code lost:
                        
                            r14 = r2;
                            r2 = r3;
                            r11 = r19;
                            r10 = r20;
                            r12 = r22;
                            r13 = r23;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
                        /* JADX WARN: Removed duplicated region for block: B:61:0x0143  */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x014e A[Catch: all -> 0x014f, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x014f, blocks: (B:59:0x013d, B:63:0x014e), top: B:77:0x013d }] */
                        /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
                        /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
                        /* JADX WARN: Removed duplicated region for block: B:74:0x016d  */
                        /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00da -> B:79:0x00e7). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0143 -> B:62:0x0148). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x016d -> B:17:0x005e). Please report as a decompilation issue!!! */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instructions count: 377
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.C04659.AnonymousClass3.AnonymousClass1.C47241.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(PointerInputScope pointerInputScope, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, Channel<DragEvent> channel, boolean z3, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$$this$pointerInput = pointerInputScope;
                        this.$canDragState = state;
                        this.$startImmediatelyState = state2;
                        this.$orientation = orientation;
                        this.$channel = channel;
                        this.$reverseDirection = z3;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                        /*
                            r13 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r13.label
                            r2 = 1
                            if (r1 == 0) goto L1d
                            if (r1 != r2) goto L15
                            java.lang.Object r0 = r13.L$0
                            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                            kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.util.concurrent.CancellationException -> L13
                            goto L4d
                        L13:
                            r14 = move-exception
                            goto L47
                        L15:
                            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r14.<init>(r0)
                            throw r14
                        L1d:
                            kotlin.ResultKt.throwOnFailure(r14)
                            java.lang.Object r14 = r13.L$0
                            kotlinx.coroutines.CoroutineScope r14 = (kotlinx.coroutines.CoroutineScope) r14
                            androidx.compose.ui.input.pointer.PointerInputScope r1 = r13.$$this$pointerInput     // Catch: java.util.concurrent.CancellationException -> L43
                            androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1 r11 = new androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1     // Catch: java.util.concurrent.CancellationException -> L43
                            androidx.compose.runtime.State<kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean>> r5 = r13.$canDragState     // Catch: java.util.concurrent.CancellationException -> L43
                            androidx.compose.runtime.State<kotlin.jvm.functions.Function0<java.lang.Boolean>> r6 = r13.$startImmediatelyState     // Catch: java.util.concurrent.CancellationException -> L43
                            androidx.compose.foundation.gestures.Orientation r7 = r13.$orientation     // Catch: java.util.concurrent.CancellationException -> L43
                            kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.DragEvent> r8 = r13.$channel     // Catch: java.util.concurrent.CancellationException -> L43
                            boolean r9 = r13.$reverseDirection     // Catch: java.util.concurrent.CancellationException -> L43
                            r10 = 0
                            r3 = r11
                            r4 = r14
                            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L43
                            r13.L$0 = r14     // Catch: java.util.concurrent.CancellationException -> L43
                            r13.label = r2     // Catch: java.util.concurrent.CancellationException -> L43
                            java.lang.Object r14 = r1.awaitPointerEventScope(r11, r13)     // Catch: java.util.concurrent.CancellationException -> L43
                            if (r14 != r0) goto L4d
                            return r0
                        L43:
                            r0 = move-exception
                            r12 = r0
                            r0 = r14
                            r14 = r12
                        L47:
                            boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r0)
                            if (r0 == 0) goto L50
                        L4d:
                            kotlin.Unit r14 = kotlin.Unit.INSTANCE
                            return r14
                        L50:
                            throw r14
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.C04659.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass3(boolean z3, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, Channel<DragEvent> channel, boolean z4, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$enabled = z3;
                    this.$canDragState = state;
                    this.$startImmediatelyState = state2;
                    this.$orientation = orientation;
                    this.$channel = channel;
                    this.$reverseDirection = z4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i4 = this.label;
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        if (!this.$enabled) {
                            return Unit.INSTANCE;
                        }
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, null);
                        this.label = 1;
                        if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final DragLogic invoke$lambda$3(State<DragLogic> state2) {
                return state2.getValue();
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier composed, Composer composer, int i4) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(597193710);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(597193710, i4, -1, "androidx.compose.foundation.gestures.draggable.<anonymous> (Draggable.kt:220)");
                }
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) objRememberedValue;
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(mutableState) | composer.changed(mutableInteractionSource2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            final MutableState<DragInteraction.Start> mutableState2 = mutableState;
                            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    DragInteraction.Start start = (DragInteraction.Start) mutableState2.getValue();
                                    if (start != null) {
                                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                        if (mutableInteractionSource4 != null) {
                                            mutableInteractionSource4.tryEmit(new DragInteraction.Cancel(start));
                                        }
                                        mutableState2.setValue(null);
                                    }
                                }
                            };
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                EffectsKt.DisposableEffect(mutableInteractionSource2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                Channel channel = (Channel) objRememberedValue3;
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(startDragImmediately, composer, 0);
                State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(canDrag, composer, 0);
                State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(new DragLogic(onDragStarted, onDragStopped, mutableState, mutableInteractionSource), composer, 8);
                DraggableState draggableState = state;
                EffectsKt.LaunchedEffect(draggableState, new AnonymousClass2(channel, draggableState, stateRememberUpdatedState3, orientation, null), composer, 64);
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.INSTANCE, new Object[]{orientation, Boolean.valueOf(z3), Boolean.valueOf(z4)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass3(z3, stateRememberUpdatedState2, stateRememberUpdatedState, orientation, channel, z4, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierPointerInput;
            }
        });
    }
}
