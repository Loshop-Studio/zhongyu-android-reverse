package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerId;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.PointerType;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.InputDeviceCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0014\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0017\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0082\u0001\u0010\u001e\u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b\u001e\u0010\u001f\u001aâ\u0001\u0010\u001e\u001a\u00020\n*\u00020\u00182K\u0010\u0019\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\n0 2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n0\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a2\b\u0010&\u001a\u0004\u0018\u00010%26\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0080@¢\u0006\u0004\b\u001e\u0010'\u001a\u0082\u0001\u0010(\u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b(\u0010\u001f\u001aY\u0010+\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110)¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010\r\u001aa\u00100\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010-\u001a\u00020,26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110)¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a3\u00102\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0013\u001a!\u00104\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0016\u001a\u0082\u0001\u00106\u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u00105\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110)¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\b6\u0010\u001f\u001aY\u00108\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110)¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b7\u0010\r\u001aa\u0010;\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010-\u001a\u00020,26\u00109\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110)¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b:\u0010/\u001a3\u0010=\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b<\u0010\u0013\u001a!\u0010?\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b>\u0010\u0016\u001a\u0082\u0001\u0010A\u001a\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110)¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\n0\u0003H\u0086@¢\u0006\u0004\bA\u0010\u001f\u001aS\u0010\u0014\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000f2\b\u0010B\u001a\u0004\u0018\u00010%2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u000fH\u0080Hø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a5\u0010H\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u000fH\u0082Hø\u0001\u0000¢\u0006\u0004\bG\u0010\u0013\u001aW\u0010L\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010-\u001a\u00020,2\b\u0010B\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010I\u001a\u00020\b2\u0018\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0003H\u0080Hø\u0001\u0000¢\u0006\u0004\bJ\u0010K\u001a&\u0010O\u001a\u00020\u0011*\u00020\u00002\u0006\u0010I\u001a\u00020\u00042\b\b\u0002\u0010N\u001a\u00020MH\u0080@¢\u0006\u0004\bO\u0010P\u001a!\u0010R\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0016\u001a\u001e\u0010V\u001a\u00020\u0011*\u00020S2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\bT\u0010U\u001a\u001e\u0010Z\u001a\u00020)*\u00020W2\u0006\u0010-\u001a\u00020,H\u0000ø\u0001\u0000¢\u0006\u0004\bX\u0010Y\"\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]\"\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010]\"\u0014\u0010_\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010]\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006`"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "change", "Landroidx/compose/ui/geometry/Offset;", "overSlop", "Ld6/s;", "onTouchSlopReached", "awaitTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLr6/e;Lh6/c;)Ljava/lang/Object;", "awaitTouchSlopOrCancellation", "Lkotlin/Function1;", "onDrag", "", "drag-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLr6/c;Lh6/c;)Ljava/lang/Object;", "drag", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLh6/c;)Ljava/lang/Object;", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "dragAmount", "detectDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lr6/c;Lr6/a;Lr6/a;Lr6/e;Lh6/c;)Ljava/lang/Object;", "Lkotlin/Function3;", "down", "slopTriggerChange", "overSlopOffset", "shouldAwaitTouchSlop", "Landroidx/compose/foundation/gestures/Orientation;", "orientationLock", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lr6/f;Lr6/c;Lr6/a;Lr6/a;Landroidx/compose/foundation/gestures/Orientation;Lr6/e;Lh6/c;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "", "awaitVerticalTouchSlopOrCancellation-jO51t88", "awaitVerticalTouchSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILr6/e;Lh6/c;)Ljava/lang/Object;", "awaitVerticalPointerSlopOrCancellation", "verticalDrag-jO51t88", "verticalDrag", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalDragOrCancellation", "onVerticalDrag", "detectVerticalDragGestures", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "awaitHorizontalTouchSlopOrCancellation", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "awaitHorizontalPointerSlopOrCancellation", "horizontalDrag-jO51t88", "horizontalDrag", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalDragOrCancellation", "onHorizontalDrag", "detectHorizontalDragGestures", "orientation", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLr6/c;Landroidx/compose/foundation/gestures/Orientation;Lr6/c;Lh6/c;)Ljava/lang/Object;", "hasDragged", "awaitDragOrUp-jO51t88", "awaitDragOrUp", "initialPositionChange", "awaitPointerSlopOrCancellation-6ksA65w", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/Orientation;JLr6/e;Lh6/c;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "awaitAllPointersUpWithSlopDetection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;)Ljava/lang/Object;", "awaitLongPressOrCancellation-rnUCldI", "awaitLongPressOrCancellation", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "isPointerUp", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "Landroidx/compose/ui/unit/Dp;", "mouseSlop", "F", "defaultTouchSlop", "mouseToTouchSlopRatio", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1045:1\n787#1,17:1046\n804#1,4:1072\n808#1,9:1083\n817#1,11:1093\n746#1,4:1104\n750#1,2:1117\n752#1,8:1126\n787#1,17:1134\n804#1,4:1160\n808#1,9:1171\n817#1:1181\n818#1,10:1185\n787#1,17:1195\n804#1,4:1221\n808#1,9:1232\n817#1:1242\n818#1,10:1246\n702#1,7:1256\n746#1,4:1263\n750#1,2:1276\n752#1,7:1285\n709#1,6:1292\n715#1:1301\n710#1,8:1304\n759#1:1312\n718#1:1313\n707#1:1314\n720#1,10:1315\n746#1,4:1325\n750#1,2:1338\n752#1,7:1347\n759#1:1357\n787#1,17:1358\n804#1,4:1384\n808#1,9:1395\n817#1:1405\n818#1,10:1409\n787#1,17:1419\n804#1,4:1445\n808#1,9:1456\n817#1:1466\n818#1,10:1470\n702#1,7:1480\n746#1,4:1487\n750#1,2:1500\n752#1,7:1509\n709#1,6:1516\n715#1:1525\n710#1,8:1528\n759#1:1536\n718#1:1537\n707#1:1538\n720#1,10:1539\n746#1,4:1549\n750#1,2:1562\n752#1,7:1571\n759#1:1581\n746#1,4:1582\n750#1,2:1595\n752#1,7:1604\n759#1:1617\n746#1,4:1618\n750#1,2:1631\n752#1,7:1640\n759#1:1653\n117#2,2:1063\n34#2,6:1065\n119#2:1071\n34#2,6:1076\n119#2:1082\n117#2,2:1108\n34#2,6:1110\n119#2:1116\n34#2,6:1119\n119#2:1125\n117#2,2:1151\n34#2,6:1153\n119#2:1159\n34#2,6:1164\n119#2:1170\n117#2,2:1212\n34#2,6:1214\n119#2:1220\n34#2,6:1225\n119#2:1231\n117#2,2:1267\n34#2,6:1269\n119#2:1275\n34#2,6:1278\n119#2:1284\n117#2,2:1329\n34#2,6:1331\n119#2:1337\n34#2,6:1340\n119#2:1346\n117#2,2:1375\n34#2,6:1377\n119#2:1383\n34#2,6:1388\n119#2:1394\n117#2,2:1436\n34#2,6:1438\n119#2:1444\n34#2,6:1449\n119#2:1455\n117#2,2:1491\n34#2,6:1493\n119#2:1499\n34#2,6:1502\n119#2:1508\n117#2,2:1553\n34#2,6:1555\n119#2:1561\n34#2,6:1564\n119#2:1570\n117#2,2:1586\n34#2,6:1588\n119#2:1594\n34#2,6:1597\n119#2:1603\n117#2,2:1622\n34#2,6:1624\n119#2:1630\n34#2,6:1633\n119#2:1639\n117#2,2:1654\n34#2,6:1656\n119#2:1662\n117#2,2:1663\n34#2,6:1665\n119#2:1671\n117#2,2:1672\n34#2,6:1674\n119#2:1680\n117#2,2:1681\n34#2,6:1683\n119#2:1689\n117#2,2:1691\n34#2,6:1693\n119#2:1699\n117#2,2:1700\n34#2,6:1702\n119#2:1708\n117#2,2:1709\n34#2,6:1711\n119#2:1717\n117#2,2:1718\n34#2,6:1720\n119#2:1726\n117#2,2:1727\n34#2,6:1729\n119#2:1735\n117#2,2:1736\n34#2,6:1738\n119#2:1744\n102#2,2:1746\n34#2,6:1748\n104#2:1754\n117#2,2:1755\n34#2,6:1757\n119#2:1763\n117#2,2:1764\n34#2,6:1766\n119#2:1772\n273#3:1092\n273#3:1180\n273#3:1241\n273#3:1404\n273#3:1465\n273#3:1690\n273#3:1745\n69#4:1182\n69#4:1243\n69#4:1298\n65#4:1302\n69#4:1354\n65#4:1406\n65#4:1467\n69#4:1522\n65#4:1526\n65#4:1578\n69#4:1611\n65#4:1614\n69#4:1647\n65#4:1650\n70#5:1183\n70#5:1244\n70#5:1299\n60#5:1303\n70#5:1355\n60#5:1407\n60#5:1468\n70#5:1523\n60#5:1527\n60#5:1579\n70#5:1612\n60#5:1615\n70#5:1648\n60#5:1651\n22#6:1184\n22#6:1245\n22#6:1300\n22#6:1356\n22#6:1408\n22#6:1469\n22#6:1524\n22#6:1580\n22#6:1613\n22#6:1616\n22#6:1649\n22#6:1652\n118#7:1773\n113#7:1774\n63#8:1775\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n*L\n81#1:1046,17\n81#1:1072,4\n81#1:1083,9\n81#1:1093,11\n144#1:1104,4\n144#1:1117,2\n144#1:1126,8\n406#1:1134,17\n406#1:1160,4\n406#1:1171,9\n406#1:1181\n406#1:1185,10\n418#1:1195,17\n418#1:1221,4\n418#1:1232,9\n418#1:1242\n418#1:1246,10\n445#1:1256,7\n445#1:1263,4\n445#1:1276,2\n445#1:1285,7\n445#1:1292,6\n445#1:1301\n445#1:1304,8\n445#1:1312\n445#1:1313\n445#1:1314\n445#1:1315,10\n474#1:1325,4\n474#1:1338,2\n474#1:1347,7\n474#1:1357\n560#1:1358,17\n560#1:1384,4\n560#1:1395,9\n560#1:1405\n560#1:1409,10\n572#1:1419,17\n572#1:1445,4\n572#1:1456,9\n572#1:1466\n572#1:1470,10\n596#1:1480,7\n596#1:1487,4\n596#1:1500,2\n596#1:1509,7\n596#1:1516,6\n596#1:1525\n596#1:1528,8\n596#1:1536\n596#1:1537\n596#1:1538\n596#1:1539,10\n625#1:1549,4\n625#1:1562,2\n625#1:1571,7\n625#1:1581\n708#1:1582,4\n708#1:1595,2\n708#1:1604,7\n708#1:1617\n708#1:1618,4\n708#1:1631,2\n708#1:1640,7\n708#1:1653\n81#1:1063,2\n81#1:1065,6\n81#1:1071\n81#1:1076,6\n81#1:1082\n144#1:1108,2\n144#1:1110,6\n144#1:1116\n144#1:1119,6\n144#1:1125\n406#1:1151,2\n406#1:1153,6\n406#1:1159\n406#1:1164,6\n406#1:1170\n418#1:1212,2\n418#1:1214,6\n418#1:1220\n418#1:1225,6\n418#1:1231\n445#1:1267,2\n445#1:1269,6\n445#1:1275\n445#1:1278,6\n445#1:1284\n474#1:1329,2\n474#1:1331,6\n474#1:1337\n474#1:1340,6\n474#1:1346\n560#1:1375,2\n560#1:1377,6\n560#1:1383\n560#1:1388,6\n560#1:1394\n572#1:1436,2\n572#1:1438,6\n572#1:1444\n572#1:1449,6\n572#1:1455\n596#1:1491,2\n596#1:1493,6\n596#1:1499\n596#1:1502,6\n596#1:1508\n625#1:1553,2\n625#1:1555,6\n625#1:1561\n625#1:1564,6\n625#1:1570\n708#1:1586,2\n708#1:1588,6\n708#1:1594\n708#1:1597,6\n708#1:1603\n708#1:1622,2\n708#1:1624,6\n708#1:1630\n708#1:1633,6\n708#1:1639\n749#1:1654,2\n749#1:1656,6\n749#1:1662\n751#1:1663,2\n751#1:1665,6\n751#1:1671\n803#1:1672,2\n803#1:1674,6\n803#1:1680\n807#1:1681,2\n807#1:1683,6\n807#1:1689\n803#1:1691,2\n803#1:1693,6\n803#1:1699\n807#1:1700,2\n807#1:1702,6\n807#1:1708\n803#1:1709,2\n803#1:1711,6\n803#1:1717\n807#1:1718,2\n807#1:1720,6\n807#1:1726\n852#1:1727,2\n852#1:1729,6\n852#1:1735\n854#1:1736,2\n854#1:1738,6\n854#1:1744\n867#1:1746,2\n867#1:1748,6\n867#1:1754\n960#1:1755,2\n960#1:1757,6\n960#1:1763\n1025#1:1764,2\n1025#1:1766,6\n1025#1:1772\n81#1:1092\n406#1:1180\n418#1:1241\n560#1:1404\n572#1:1465\n816#1:1690\n863#1:1745\n409#1:1182\n421#1:1243\n445#1:1298\n445#1:1302\n474#1:1354\n563#1:1406\n575#1:1467\n596#1:1522\n596#1:1526\n625#1:1578\n714#1:1611\n715#1:1614\n714#1:1647\n715#1:1650\n409#1:1183\n421#1:1244\n445#1:1299\n445#1:1303\n474#1:1355\n563#1:1407\n575#1:1468\n596#1:1523\n596#1:1527\n625#1:1579\n714#1:1612\n715#1:1615\n714#1:1648\n715#1:1651\n409#1:1184\n421#1:1245\n445#1:1300\n474#1:1356\n563#1:1408\n575#1:1469\n596#1:1524\n625#1:1580\n714#1:1613\n715#1:1616\n714#1:1649\n715#1:1652\n1031#1:1773\n1032#1:1774\n1033#1:1775\n*E\n"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m5303f = "DragGestureDetector.kt", m5304i = {0, 0, 0, 0, 0, 0}, m5305l = {851}, m5306m = "awaitAllPointersUpWithSlopDetection", m5307n = {"$this$awaitAllPointersUpWithSlopDetection", "pass", "pointer", "touchSlopDetector", "pointerSlopReached", "touchSlop"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "I$0", "F$0"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 */
    public static final class C08421 extends ContinuationImpl {
        float F$0;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C08421(InterfaceC5631c<? super C08421> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(null, null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", m5303f = "DragGestureDetector.kt", m5304i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7}, m5305l = {245, 251, 1061, 1101, 278, 1148, 1190, 1202}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "initialDown", "awaitTouchSlop", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "drag", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, m5308s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$2", "L$3", "L$4"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1045:1\n787#2,17:1046\n804#2,4:1072\n808#2,9:1083\n817#2,11:1093\n794#2,10:1140\n804#2,4:1159\n808#2,9:1172\n817#2,11:1182\n702#2,7:1193\n746#2,4:1200\n750#2,2:1213\n752#2,7:1222\n709#2,6:1229\n715#2:1238\n710#2,8:1241\n759#2:1249\n718#2:1250\n707#2:1251\n720#2,10:1252\n117#3,2:1063\n34#3,6:1065\n119#3:1071\n34#3,6:1076\n119#3:1082\n102#3,2:1104\n34#3,6:1106\n104#3:1112\n102#3,2:1113\n34#3,6:1115\n104#3:1121\n102#3,2:1122\n34#3,6:1124\n104#3:1130\n102#3,2:1131\n34#3,6:1133\n104#3:1139\n117#3,2:1150\n34#3,6:1152\n119#3:1158\n117#3,2:1163\n34#3,6:1165\n119#3:1171\n117#3,2:1204\n34#3,6:1206\n119#3:1212\n34#3,6:1215\n119#3:1221\n273#4:1092\n273#4:1181\n69#5:1235\n65#5:1239\n70#6:1236\n60#6:1240\n22#7:1237\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9\n*L\n257#1:1046,17\n257#1:1072,4\n257#1:1083,9\n257#1:1093,11\n291#1:1140,10\n291#1:1159,4\n291#1:1172,9\n291#1:1182,11\n308#1:1193,7\n308#1:1200,4\n308#1:1213,2\n308#1:1222,7\n308#1:1229,6\n308#1:1238\n308#1:1241,8\n308#1:1249\n308#1:1250\n308#1:1251\n308#1:1252,10\n257#1:1063,2\n257#1:1065,6\n257#1:1071\n257#1:1076,6\n257#1:1082\n272#1:1104,2\n272#1:1106,6\n272#1:1112\n280#1:1113,2\n280#1:1115,6\n280#1:1121\n280#1:1122,2\n280#1:1124,6\n280#1:1130\n284#1:1131,2\n284#1:1133,6\n284#1:1139\n291#1:1150,2\n291#1:1152,6\n291#1:1158\n291#1:1163,2\n291#1:1165,6\n291#1:1171\n308#1:1204,2\n308#1:1206,6\n308#1:1212\n308#1:1215,6\n308#1:1221\n257#1:1092\n291#1:1181\n308#1:1235\n308#1:1239\n308#1:1236\n308#1:1240\n308#1:1237\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9 */
    public static final class C08499 extends RestrictedSuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $onDrag;
        final /* synthetic */ InterfaceC6469a $onDragCancel;
        final /* synthetic */ InterfaceC6471c $onDragEnd;
        final /* synthetic */ InterfaceC6474f $onDragStart;
        final /* synthetic */ Orientation $orientationLock;
        final /* synthetic */ Ref$LongRef $overSlop;
        final /* synthetic */ InterfaceC6469a $shouldAwaitTouchSlop;
        float F$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08499(InterfaceC6469a interfaceC6469a, Ref$LongRef ref$LongRef, Orientation orientation, InterfaceC6474f interfaceC6474f, InterfaceC6473e interfaceC6473e, InterfaceC6469a interfaceC6469a2, InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super C08499> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$shouldAwaitTouchSlop = interfaceC6469a;
            this.$overSlop = ref$LongRef;
            this.$orientationLock = orientation;
            this.$onDragStart = interfaceC6474f;
            this.$onDrag = interfaceC6473e;
            this.$onDragCancel = interfaceC6469a2;
            this.$onDragEnd = interfaceC6471c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08499 c08499 = new C08499(this.$shouldAwaitTouchSlop, this.$overSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, interfaceC5631c);
            c08499.L$0 = obj;
            return c08499;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08499) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:164:0x049e, code lost:
        
            if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m6962isPointerUpDmW0f2w(r2.getCurrentEvent(), r0) != false) goto L165;
         */
        /* JADX WARN: Code restructure failed: missing block: B:168:0x04c6, code lost:
        
            if (r9 != r6) goto L170;
         */
        /* JADX WARN: Code restructure failed: missing block: B:205:0x054d, code lost:
        
            if (r8 == false) goto L206;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x02f0, code lost:
        
            if (r4 == r6) goto L169;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:182:0x04fd, B:193:0x0526], limit reached: 221 */
        /* JADX WARN: Removed duplicated region for block: B:118:0x03ac A[PHI: r0 r1 r2 r4 r7 r9 r10 r11 r16 r18
          0x03ac: PHI (r0v21 float) = (r0v19 float), (r0v22 float) binds: [B:8:0x0063, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
          0x03ac: PHI (r1v36 androidx.compose.ui.input.pointer.PointerInputChange) = 
          (r1v34 androidx.compose.ui.input.pointer.PointerInputChange)
          (r1v38 androidx.compose.ui.input.pointer.PointerInputChange)
         binds: [B:8:0x0063, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
          0x03ac: PHI (r2v26 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r2v24 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r2v29 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:8:0x0063, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
          0x03ac: PHI (r4v19 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r4v17 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r4v20 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:8:0x0063, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
          0x03ac: PHI (r7v30 androidx.compose.foundation.gestures.TouchSlopDetector) = 
          (r7v28 androidx.compose.foundation.gestures.TouchSlopDetector)
          (r7v32 androidx.compose.foundation.gestures.TouchSlopDetector)
         binds: [B:8:0x0063, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
          0x03ac: PHI (r9v13 java.lang.Object) = (r9v12 java.lang.Object), (r9v21 java.lang.Object) binds: [B:8:0x0063, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
          0x03ac: PHI (r10v7 kotlin.jvm.internal.Ref$LongRef) = (r10v5 kotlin.jvm.internal.Ref$LongRef), (r10v8 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0063, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
          0x03ac: PHI (r11v20 kotlin.jvm.internal.Ref$LongRef) = (r11v18 kotlin.jvm.internal.Ref$LongRef), (r11v21 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0063, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
          0x03ac: PHI (r16v16 long) = (r16v14 long), (r16v17 long) binds: [B:8:0x0063, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
          0x03ac: PHI (r18v12 long) = (r18v10 long), (r18v13 long) binds: [B:8:0x0063, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:120:0x03b9  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x03ef  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x0419  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0461  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0465  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x0474  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x03d9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:237:0x0210 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x01b0  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x01e4 A[PHI: r0 r1 r2 r4 r5 r7 r8 r9 r11 r16 r18
          0x01e4: PHI (r0v10 float) = (r0v9 float), (r0v11 float) binds: [B:11:0x00e5, B:31:0x01e0] A[DONT_GENERATE, DONT_INLINE]
          0x01e4: PHI (r1v18 androidx.compose.ui.input.pointer.PointerInputChange) = 
          (r1v17 androidx.compose.ui.input.pointer.PointerInputChange)
          (r1v20 androidx.compose.ui.input.pointer.PointerInputChange)
         binds: [B:11:0x00e5, B:31:0x01e0] A[DONT_GENERATE, DONT_INLINE]
          0x01e4: PHI (r2v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r2v7 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r2v11 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:11:0x00e5, B:31:0x01e0] A[DONT_GENERATE, DONT_INLINE]
          0x01e4: PHI (r4v5 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r4v4 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r4v6 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:11:0x00e5, B:31:0x01e0] A[DONT_GENERATE, DONT_INLINE]
          0x01e4: PHI (r5v5 androidx.compose.foundation.gestures.TouchSlopDetector) = 
          (r5v4 androidx.compose.foundation.gestures.TouchSlopDetector)
          (r5v6 androidx.compose.foundation.gestures.TouchSlopDetector)
         binds: [B:11:0x00e5, B:31:0x01e0] A[DONT_GENERATE, DONT_INLINE]
          0x01e4: PHI (r7v7 java.lang.Object) = (r7v6 java.lang.Object), (r7v17 java.lang.Object) binds: [B:11:0x00e5, B:31:0x01e0] A[DONT_GENERATE, DONT_INLINE]
          0x01e4: PHI (r8v4 kotlin.jvm.internal.Ref$LongRef) = (r8v3 kotlin.jvm.internal.Ref$LongRef), (r8v6 kotlin.jvm.internal.Ref$LongRef) binds: [B:11:0x00e5, B:31:0x01e0] A[DONT_GENERATE, DONT_INLINE]
          0x01e4: PHI (r9v2 kotlin.jvm.internal.Ref$LongRef) = (r9v1 kotlin.jvm.internal.Ref$LongRef), (r9v3 kotlin.jvm.internal.Ref$LongRef) binds: [B:11:0x00e5, B:31:0x01e0] A[DONT_GENERATE, DONT_INLINE]
          0x01e4: PHI (r11v1 int) = (r11v0 int), (r11v14 int) binds: [B:11:0x00e5, B:31:0x01e0] A[DONT_GENERATE, DONT_INLINE]
          0x01e4: PHI (r16v6 long) = (r16v5 long), (r16v7 long) binds: [B:11:0x00e5, B:31:0x01e0] A[DONT_GENERATE, DONT_INLINE]
          0x01e4: PHI (r18v2 long) = (r18v1 long), (r18v3 long) binds: [B:11:0x00e5, B:31:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0298  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x029e  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x02aa  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02b1  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02ba A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x02cb  */
        /* JADX WARN: Type inference failed for: r13v10, types: [kotlin.jvm.internal.e] */
        /* JADX WARN: Type inference failed for: r13v11 */
        /* JADX WARN: Type inference failed for: r13v12 */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0375 -> B:113:0x0377). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x03e0 -> B:113:0x0377). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x0432 -> B:81:0x02b6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0439 -> B:115:0x0390). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x0459 -> B:155:0x045b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x046b -> B:81:0x02b6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x04c6 -> B:170:0x04c9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x01b0 -> B:74:0x029c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0218 -> B:43:0x0219). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0267 -> B:74:0x029c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x028f -> B:71:0x0292). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0322 -> B:89:0x02d8). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 1442
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C08499.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", m5303f = "DragGestureDetector.kt", m5304i = {0, 1, 2}, m5305l = {354, 355, 360}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "$this$awaitEachGesture"}, m5308s = {"L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1045:1\n34#2,6:1046\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n*L\n366#1:1046,6\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 */
    public static final class C08535 extends RestrictedSuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $onDrag;
        final /* synthetic */ InterfaceC6469a $onDragCancel;
        final /* synthetic */ InterfaceC6469a $onDragEnd;
        final /* synthetic */ InterfaceC6471c $onDragStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08535(InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super C08535> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$onDragStart = interfaceC6471c;
            this.$onDragEnd = interfaceC6469a;
            this.$onDragCancel = interfaceC6469a2;
            this.$onDrag = interfaceC6473e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08535 c08535 = new C08535(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, interfaceC5631c);
            c08535.L$0 = obj;
            return c08535;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08535) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0062 A[Catch: CancellationException -> 0x00b1, PHI: r1 r8 r12
          0x0062: PHI (r1v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r1v4 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r1v9 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:16:0x002d, B:28:0x005f] A[DONT_GENERATE, DONT_INLINE]
          0x0062: PHI (r8v6 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) = 
          (r8v2 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5)
          (r8v7 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5)
         binds: [B:16:0x002d, B:28:0x005f] A[DONT_GENERATE, DONT_INLINE]
          0x0062: PHI (r12v12 java.lang.Object) = (r12v0 java.lang.Object), (r12v18 java.lang.Object) binds: [B:16:0x002d, B:28:0x005f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {CancellationException -> 0x00b1, blocks: (B:36:0x008a, B:38:0x0092, B:40:0x00a1, B:42:0x00ad, B:45:0x00b4, B:46:0x00b7, B:47:0x00bd, B:30:0x0062, B:32:0x0066, B:27:0x0051, B:23:0x0049), top: B:54:0x0049 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0066 A[Catch: CancellationException -> 0x00b1, TryCatch #0 {CancellationException -> 0x00b1, blocks: (B:36:0x008a, B:38:0x0092, B:40:0x00a1, B:42:0x00ad, B:45:0x00b4, B:46:0x00b7, B:47:0x00bd, B:30:0x0062, B:32:0x0066, B:27:0x0051, B:23:0x0049), top: B:54:0x0049 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[Catch: CancellationException -> 0x00b1, TryCatch #0 {CancellationException -> 0x00b1, blocks: (B:36:0x008a, B:38:0x0092, B:40:0x00a1, B:42:0x00ad, B:45:0x00b4, B:46:0x00b7, B:47:0x00bd, B:30:0x0062, B:32:0x0066, B:27:0x0051, B:23:0x0049), top: B:54:0x0049 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00bd A[Catch: CancellationException -> 0x00b1, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00b1, blocks: (B:36:0x008a, B:38:0x0092, B:40:0x00a1, B:42:0x00ad, B:45:0x00b4, B:46:0x00b7, B:47:0x00bd, B:30:0x0062, B:32:0x0066, B:27:0x0051, B:23:0x0049), top: B:54:0x0049 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C08535.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", m5303f = "DragGestureDetector.kt", m5304i = {0, 1, 1}, m5305l = {661, 664, 672}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, m5308s = {"L$0", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5 */
    public static final class C08575 extends RestrictedSuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6469a $onDragCancel;
        final /* synthetic */ InterfaceC6469a $onDragEnd;
        final /* synthetic */ InterfaceC6471c $onDragStart;
        final /* synthetic */ InterfaceC6473e $onHorizontalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08575(InterfaceC6471c interfaceC6471c, InterfaceC6473e interfaceC6473e, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC5631c<? super C08575> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$onDragStart = interfaceC6471c;
            this.$onHorizontalDrag = interfaceC6473e;
            this.$onDragEnd = interfaceC6469a;
            this.$onDragCancel = interfaceC6469a2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08575 c08575 = new C08575(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, interfaceC5631c);
            c08575.L$0 = obj;
            return c08575;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08575) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
        
            if (r13 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.AbstractC5774b.m5119b(r13)
                r8 = r12
                goto La7
            L15:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                java.lang.Object r1 = r12.L$1
                kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref$FloatRef) r1
                java.lang.Object r3 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.AbstractC5774b.m5119b(r13)
                r8 = r12
                goto L71
            L2a:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC5774b.m5119b(r13)
                r8 = r12
                r6 = r1
                goto L4d
            L34:
                kotlin.AbstractC5774b.m5119b(r13)
                java.lang.Object r13 = r12.L$0
                r5 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r5
                r12.L$0 = r5
                r12.label = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r8 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r13 != r0) goto L4c
                goto La6
            L4c:
                r6 = r5
            L4d:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r13
                kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
                r1.<init>()
                r11 = r8
                long r7 = r13.getId()
                int r9 = r13.getType()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1 r10 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1
                r10.<init>()
                r11.L$0 = r6
                r11.L$1 = r1
                r11.label = r3
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m6948awaitHorizontalPointerSlopOrCancellationgDDlDlE(r6, r7, r9, r10, r11)
                r8 = r11
                if (r13 != r0) goto L70
                goto La6
            L70:
                r3 = r6
            L71:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r13
                if (r13 == 0) goto Lba
                r6.c r4 = r8.$onDragStart
                long r5 = r13.getPosition()
                androidx.compose.ui.geometry.Offset r5 = androidx.compose.p011ui.geometry.Offset.m10430boximpl(r5)
                r4.invoke(r5)
                r6.e r4 = r8.$onHorizontalDrag
                float r1 = r1.element
                java.lang.Float r5 = new java.lang.Float
                r5.<init>(r1)
                r4.invoke(r13, r5)
                long r4 = r13.getId()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1
                r6.e r1 = r8.$onHorizontalDrag
                r13.<init>()
                r1 = 0
                r8.L$0 = r1
                r8.L$1 = r1
                r8.label = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m6961horizontalDragjO51t88(r3, r4, r13, r12)
                if (r13 != r0) goto La7
            La6:
                return r0
            La7:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb5
                r6.a r13 = r8.$onDragEnd
                r13.invoke()
                goto Lba
            Lb5:
                r6.a r13 = r8.$onDragCancel
                r13.invoke()
            Lba:
                d6.s r13 = p045d6.C5443s.f8405a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C08575.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", m5303f = "DragGestureDetector.kt", m5304i = {0, 1, 1}, m5305l = {TypedValues.PositionType.TYPE_POSITION_TYPE, InputDeviceCompat.SOURCE_DPAD, 521}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, m5308s = {"L$0", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5 */
    public static final class C08615 extends RestrictedSuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6469a $onDragCancel;
        final /* synthetic */ InterfaceC6469a $onDragEnd;
        final /* synthetic */ InterfaceC6471c $onDragStart;
        final /* synthetic */ InterfaceC6473e $onVerticalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08615(InterfaceC6471c interfaceC6471c, InterfaceC6473e interfaceC6473e, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC5631c<? super C08615> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$onDragStart = interfaceC6471c;
            this.$onVerticalDrag = interfaceC6473e;
            this.$onDragEnd = interfaceC6469a;
            this.$onDragCancel = interfaceC6469a2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08615 c08615 = new C08615(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, interfaceC5631c);
            c08615.L$0 = obj;
            return c08615;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08615) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
        
            if (r13 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.AbstractC5774b.m5119b(r13)
                r8 = r12
                goto La7
            L15:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                java.lang.Object r1 = r12.L$1
                kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref$FloatRef) r1
                java.lang.Object r3 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.AbstractC5774b.m5119b(r13)
                r8 = r12
                goto L71
            L2a:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC5774b.m5119b(r13)
                r8 = r12
                r6 = r1
                goto L4d
            L34:
                kotlin.AbstractC5774b.m5119b(r13)
                java.lang.Object r13 = r12.L$0
                r5 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r5
                r12.L$0 = r5
                r12.label = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r8 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r13 != r0) goto L4c
                goto La6
            L4c:
                r6 = r5
            L4d:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r13
                kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
                r1.<init>()
                r11 = r8
                long r7 = r13.getId()
                int r9 = r13.getType()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1 r10 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1
                r10.<init>()
                r11.L$0 = r6
                r11.L$1 = r1
                r11.label = r3
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m6956awaitVerticalPointerSlopOrCancellationgDDlDlE(r6, r7, r9, r10, r11)
                r8 = r11
                if (r13 != r0) goto L70
                goto La6
            L70:
                r3 = r6
            L71:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r13
                if (r13 == 0) goto Lba
                r6.c r4 = r8.$onDragStart
                long r5 = r13.getPosition()
                androidx.compose.ui.geometry.Offset r5 = androidx.compose.p011ui.geometry.Offset.m10430boximpl(r5)
                r4.invoke(r5)
                r6.e r4 = r8.$onVerticalDrag
                float r1 = r1.element
                java.lang.Float r5 = new java.lang.Float
                r5.<init>(r1)
                r4.invoke(r13, r5)
                long r4 = r13.getId()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1
                r6.e r1 = r8.$onVerticalDrag
                r13.<init>()
                r1 = 0
                r8.L$0 = r1
                r8.L$1 = r1
                r8.label = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m6964verticalDragjO51t88(r3, r4, r13, r12)
                if (r13 != r0) goto La7
            La6:
                return r0
            La7:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb5
                r6.a r13 = r8.$onDragEnd
                r13.invoke()
                goto Lba
            Lb5:
                r6.a r13 = r8.$onDragCancel
                r13.invoke()
            Lba:
                d6.s r13 = p045d6.C5443s.f8405a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C08615.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl((float) 0.125d);
        mouseSlop = fM13305constructorimpl;
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(18);
        defaultTouchSlop = fM13305constructorimpl2;
        mouseToTouchSlopRatio = fM13305constructorimpl / fM13305constructorimpl2;
    }

    /* JADX WARN: Path cross not found for [B:32:0x00cd, B:38:0x00e9], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0099 -> B:23:0x009e). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitAllPointersUpWithSlopDetection(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r18, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.PointerInputChange r19, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.PointerEventPass r20, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.input.pointer.PointerEventPass, h6.c):java.lang.Object");
    }

    public static /* synthetic */ Object awaitAllPointersUpWithSlopDetection$default(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, PointerEventPass pointerEventPass, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitAllPointersUpWithSlopDetection(awaitPointerEventScope, pointerInputChange, pointerEventPass, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        if (androidx.compose.p011ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:22:0x006a). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6945awaitDragOrCancellationrnUCldI(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m6945awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h6.c):java.lang.Object");
    }

    /* renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    private static final Object m6946awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j7, InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super PointerInputChange> interfaceC5631c) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = j7;
        while (true) {
            PointerInputChange pointerInputChange3 = null;
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, interfaceC5631c, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i8);
                if (Boolean.valueOf(PointerId.m11890equalsimpl0(pointerInputChange.getId(), ref$LongRef.element)).booleanValue()) {
                    break;
                }
                i8++;
            }
            pointerInputChange2 = pointerInputChange;
            if (pointerInputChange2 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange3 = pointerInputChange4;
                        break;
                    }
                    i++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange3;
                if (pointerInputChange5 == null) {
                    break;
                }
                ref$LongRef.element = pointerInputChange5.getId();
            } else if (((Boolean) interfaceC6471c.invoke(pointerInputChange2)).booleanValue()) {
                break;
            }
        }
        return pointerInputChange2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.p011ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) >> 32)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:22:0x006a). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6947awaitHorizontalDragOrCancellationrnUCldI(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m6947awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0177 -> B:61:0x017d). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6948awaitHorizontalPointerSlopOrCancellationgDDlDlE(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r25, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r26) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m6948awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, r6.e, h6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x017d -> B:61:0x0183). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6949awaitHorizontalTouchSlopOrCancellationjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r21, long r22, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r24, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m6949awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, r6.e, h6.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6950awaitLongPressOrCancellationrnUCldI(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r9, long r10, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.L$2
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref$BooleanRef) r9
            java.lang.Object r10 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r11
            kotlin.AbstractC5774b.m5119b(r12)     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> Lb0
            goto La3
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            kotlin.AbstractC5774b.m5119b(r12)
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            boolean r12 = m6962isPointerUpDmW0f2w(r12, r10)
            if (r12 == 0) goto L4a
            return r4
        L4a:
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            java.util.List r12 = r12.getChanges()
            int r2 = r12.size()
            r5 = 0
        L57:
            if (r5 >= r2) goto L6e
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r7
            long r7 = r7.getId()
            boolean r7 = androidx.compose.p011ui.input.pointer.PointerId.m11890equalsimpl0(r7, r10)
            if (r7 == 0) goto L6b
            goto L6f
        L6b:
            int r5 = r5 + 1
            goto L57
        L6e:
            r6 = r4
        L6f:
            r11 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L75
            return r4
        L75:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            r12.element = r11
            androidx.compose.ui.platform.ViewConfiguration r2 = r9.getViewConfiguration()
            long r5 = r2.getLongPressTimeoutMillis()
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> Lb0
            r2.<init>()     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> Lb0
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r7 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> Lb0
            r7.<init>(r2, r12, r10, r4)     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> Lb0
            r0.L$0 = r11     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> Lb0
            r0.L$1 = r10     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> Lb0
            r0.L$2 = r2     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> Lb0
            r0.label = r3     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> Lb0
            java.lang.Object r9 = r9.withTimeout(r5, r7, r0)     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> Lb0
            if (r9 != r1) goto La2
            return r1
        La2:
            r9 = r2
        La3:
            boolean r9 = r9.element     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> Lb0
            if (r9 == 0) goto Laf
            T r9 = r10.element     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> Lb0
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r9     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> Lb0
            if (r9 != 0) goto Lae
            return r11
        Lae:
            return r9
        Laf:
            return r4
        Lb0:
            T r9 = r10.element
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r9
            if (r9 != 0) goto Lb7
            goto Lb8
        Lb7:
            r11 = r9
        Lb8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m6950awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0175 -> B:62:0x017b). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6951awaitPointerSlopOrCancellation6ksA65w(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.Orientation r23, long r24, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r26, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r27) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m6951awaitPointerSlopOrCancellation6ksA65w(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.Orientation, long, r6.e, h6.c):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$$forInline, reason: not valid java name */
    private static final Object m6952awaitPointerSlopOrCancellation6ksA65w$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j7, int i, Orientation orientation, long j8, InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super PointerInputChange> interfaceC5631c) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (m6962isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j7)) {
            return null;
        }
        float fM6963pointerSlopE8SPZFQ = m6963pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = j7;
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, j8, null);
        while (true) {
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, interfaceC5631c, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i9);
                if (Boolean.valueOf(PointerId.m11890equalsimpl0(pointerInputChange.getId(), ref$LongRef.element)).booleanValue()) {
                    break;
                }
                i9++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i8 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i8);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i8++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                ref$LongRef.element = pointerInputChange4.getId();
            } else {
                long jM7058addPointerInputChangedBAh8RU = touchSlopDetector.m7058addPointerInputChangedBAh8RU(pointerInputChange3, fM6963pointerSlopE8SPZFQ);
                if ((9223372034707292159L & jM7058addPointerInputChangedBAh8RU) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    interfaceC6473e.invoke(pointerInputChange3, Offset.m10430boximpl(jM7058addPointerInputChangedBAh8RU));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    touchSlopDetector.reset();
                } else {
                    awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, interfaceC5631c);
                    if (pointerInputChange3.isConsumed()) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$default, reason: not valid java name */
    public static /* synthetic */ Object m6953awaitPointerSlopOrCancellation6ksA65w$default(AwaitPointerEventScope awaitPointerEventScope, long j7, int i, Orientation orientation, long j8, InterfaceC6473e interfaceC6473e, InterfaceC5631c interfaceC5631c, int i8, Object obj) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if ((i8 & 8) != 0) {
            j8 = Offset.INSTANCE.m10457getZeroF1C5BW0();
        }
        if (m6962isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j7)) {
            return null;
        }
        float fM6963pointerSlopE8SPZFQ = m6963pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, j8, null);
        while (true) {
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, interfaceC5631c, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i10);
                if (PointerId.m11890equalsimpl0(pointerInputChange.getId(), j7)) {
                    break;
                }
                i10++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i9 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i9);
                    if (pointerInputChange2.getPressed()) {
                        break;
                    }
                    i9++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                j7 = pointerInputChange4.getId();
            } else {
                long jM7058addPointerInputChangedBAh8RU = touchSlopDetector.m7058addPointerInputChangedBAh8RU(pointerInputChange3, fM6963pointerSlopE8SPZFQ);
                if ((9223372034707292159L & jM7058addPointerInputChangedBAh8RU) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    interfaceC6473e.invoke(pointerInputChange3, Offset.m10430boximpl(jM7058addPointerInputChangedBAh8RU));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    touchSlopDetector.reset();
                } else {
                    awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, interfaceC5631c);
                    if (pointerInputChange3.isConsumed()) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0178 -> B:62:0x017e). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6954awaitTouchSlopOrCancellationjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r19, long r20, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r22, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r23) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m6954awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, r6.e, h6.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.p011ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) & 4294967295L)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:22:0x006a). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6955awaitVerticalDragOrCancellationrnUCldI(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m6955awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x017a -> B:61:0x0180). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6956awaitVerticalPointerSlopOrCancellationgDDlDlE(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r25, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r26) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m6956awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, r6.e, h6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0180 -> B:61:0x0186). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6957awaitVerticalTouchSlopOrCancellationjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r21, long r22, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r24, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m6957awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, r6.e, h6.c):java.lang.Object");
    }

    @Nullable
    public static final Object detectDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull final InterfaceC6471c interfaceC6471c, @NotNull final InterfaceC6469a interfaceC6469a, @NotNull InterfaceC6469a interfaceC6469a2, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objDetectDragGestures = detectDragGestures(pointerInputScope, new InterfaceC6474f() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m6968invoke0AR0LA0((PointerInputChange) obj, (PointerInputChange) obj2, ((Offset) obj3).m10451unboximpl());
                return C5443s.f8405a;
            }

            /* renamed from: invoke-0AR0LA0, reason: not valid java name */
            public final void m6968invoke0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j7) {
                interfaceC6471c.invoke(Offset.m10430boximpl(pointerInputChange2.getPosition()));
            }
        }, new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.6
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PointerInputChange) obj);
                return C5443s.f8405a;
            }

            public final void invoke(PointerInputChange pointerInputChange) {
                interfaceC6469a.invoke();
            }
        }, interfaceC6469a2, new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.7
            @Override // p152r6.InterfaceC6469a
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        }, null, interfaceC6473e, interfaceC5631c);
        return objDetectDragGestures == CoroutineSingletons.COROUTINE_SUSPENDED ? objDetectDragGestures : C5443s.f8405a;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6473e interfaceC6473e, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.2
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m6965invokek4lQ0M(((Offset) obj2).m10451unboximpl());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m6965invokek4lQ0M(long j7) {
                }
            };
        }
        if ((i & 2) != 0) {
            interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.3
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m6966invoke() {
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m6966invoke();
                    return C5443s.f8405a;
                }
            };
        }
        if ((i & 4) != 0) {
            interfaceC6469a2 = new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.4
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m6967invoke() {
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m6967invoke();
                    return C5443s.f8405a;
                }
            };
        }
        InterfaceC6469a interfaceC6469a3 = interfaceC6469a2;
        return detectDragGestures(pointerInputScope, interfaceC6471c, interfaceC6469a, interfaceC6469a3, interfaceC6473e, interfaceC5631c);
    }

    @Nullable
    public static final Object detectDragGesturesAfterLongPress(@NotNull PointerInputScope pointerInputScope, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC6469a interfaceC6469a2, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C08535(interfaceC6471c, interfaceC6469a, interfaceC6469a2, interfaceC6473e, null), interfaceC5631c);
        return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : C5443s.f8405a;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6473e interfaceC6473e, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.2
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m6969invokek4lQ0M(((Offset) obj2).m10451unboximpl());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m6969invokek4lQ0M(long j7) {
                }
            };
        }
        if ((i & 2) != 0) {
            interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.3
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m6970invoke() {
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m6970invoke();
                    return C5443s.f8405a;
                }
            };
        }
        if ((i & 4) != 0) {
            interfaceC6469a2 = new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.4
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m6971invoke() {
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m6971invoke();
                    return C5443s.f8405a;
                }
            };
        }
        InterfaceC6469a interfaceC6469a3 = interfaceC6469a2;
        return detectDragGesturesAfterLongPress(pointerInputScope, interfaceC6471c, interfaceC6469a, interfaceC6469a3, interfaceC6473e, interfaceC5631c);
    }

    @Nullable
    public static final Object detectHorizontalDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC6469a interfaceC6469a2, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C08575(interfaceC6471c, interfaceC6473e, interfaceC6469a, interfaceC6469a2, null), interfaceC5631c);
        return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : C5443s.f8405a;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6473e interfaceC6473e, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.2
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m6972invokek4lQ0M(((Offset) obj2).m10451unboximpl());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m6972invokek4lQ0M(long j7) {
                }
            };
        }
        if ((i & 2) != 0) {
            interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.3
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m6973invoke() {
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m6973invoke();
                    return C5443s.f8405a;
                }
            };
        }
        if ((i & 4) != 0) {
            interfaceC6469a2 = new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.4
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m6974invoke() {
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m6974invoke();
                    return C5443s.f8405a;
                }
            };
        }
        InterfaceC6469a interfaceC6469a3 = interfaceC6469a2;
        return detectHorizontalDragGestures(pointerInputScope, interfaceC6471c, interfaceC6469a, interfaceC6469a3, interfaceC6473e, interfaceC5631c);
    }

    @Nullable
    public static final Object detectVerticalDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC6469a interfaceC6469a2, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C08615(interfaceC6471c, interfaceC6473e, interfaceC6469a, interfaceC6469a2, null), interfaceC5631c);
        return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : C5443s.f8405a;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6473e interfaceC6473e, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.2
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m6975invokek4lQ0M(((Offset) obj2).m10451unboximpl());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m6975invokek4lQ0M(long j7) {
                }
            };
        }
        if ((i & 2) != 0) {
            interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.3
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m6976invoke() {
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m6976invoke();
                    return C5443s.f8405a;
                }
            };
        }
        if ((i & 4) != 0) {
            interfaceC6469a2 = new InterfaceC6469a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.4
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m6977invoke() {
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m6977invoke();
                    return C5443s.f8405a;
                }
            };
        }
        InterfaceC6469a interfaceC6469a3 = interfaceC6469a2;
        return detectVerticalDragGestures(pointerInputScope, interfaceC6471c, interfaceC6469a, interfaceC6469a3, interfaceC6473e, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0123, code lost:
    
        if (((r3 != null ? r3 == androidx.compose.foundation.gestures.Orientation.Vertical ? java.lang.Float.intBitsToFloat((int) (r4 & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (r4 >> 32)) : androidx.compose.p011ui.geometry.Offset.m10439getDistanceimpl(r4)) == 0.0f) == false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00ce, B:46:0x00f8], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r15v2, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [r6.c] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v3, types: [r6.c] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008b -> B:23:0x0091). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6958dragVnAYq1g(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r19, long r20, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r22, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.Orientation r23, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r24, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m6958dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, r6.c, androidx.compose.foundation.gestures.Orientation, r6.c, h6.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final Object m6959dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j7, InterfaceC6471c interfaceC6471c, Orientation orientation, InterfaceC6471c interfaceC6471c2, InterfaceC5631c<? super PointerInputChange> interfaceC5631c) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long id = j7;
        if (m6962isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), id)) {
            return null;
        }
        while (true) {
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = id;
            while (true) {
                PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, interfaceC5631c, 1, null);
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i);
                    if (Boolean.valueOf(PointerId.m11890equalsimpl0(pointerInputChange.getId(), ref$LongRef.element)).booleanValue()) {
                        break;
                    }
                    i++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == null) {
                    pointerInputChange2 = null;
                    break;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(i);
                        if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                            break;
                        }
                        i++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        break;
                    }
                    ref$LongRef.element = pointerInputChange4.getId();
                } else {
                    long jPositionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange2);
                    if (Boolean.valueOf(1 ^ ((orientation == null ? Offset.m10439getDistanceimpl(jPositionChangeIgnoreConsumed) : orientation == Orientation.Vertical ? Float.intBitsToFloat((int) (jPositionChangeIgnoreConsumed & 4294967295L)) : Float.intBitsToFloat((int) (jPositionChangeIgnoreConsumed >> 32))) == 0.0f ? 1 : 0)).booleanValue()) {
                        break;
                    }
                }
            }
            if (pointerInputChange2 == null || ((Boolean) interfaceC6471c2.invoke(pointerInputChange2)).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            interfaceC6471c.invoke(pointerInputChange2);
            id = pointerInputChange2.getId();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0046 -> B:18:0x0049). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6960dragjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r4, long r5, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r7, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            r6.c r4 = (p152r6.InterfaceC6471c) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.AbstractC5774b.m5119b(r8)
            r7 = r4
            r4 = r5
            goto L49
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.AbstractC5774b.m5119b(r8)
        L3c:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = m6945awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L50
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L50:
            boolean r5 = androidx.compose.p011ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L59
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L59:
            r7.invoke(r8)
            long r5 = r8.getId()
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m6960dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, r6.c, h6.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0110, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00c0, B:46:0x00e9], limit reached: 73 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0081 -> B:23:0x0087). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6961horizontalDragjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r20, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m6961horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, r6.c, h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m6962isPointerUpDmW0f2w(PointerEvent pointerEvent, long j7) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z8 = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m11890equalsimpl0(pointerInputChange.getId(), j7)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z8 = true;
        }
        return true ^ z8;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m6963pointerSlopE8SPZFQ(@NotNull ViewConfiguration viewConfiguration, int i) {
        return PointerType.m11979equalsimpl0(i, PointerType.INSTANCE.m11984getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0110, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00c0, B:46:0x00e9], limit reached: 73 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0081 -> B:23:0x0087). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6964verticalDragjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r20, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m6964verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, r6.c, h6.c):java.lang.Object");
    }

    @Nullable
    public static final Object detectDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull InterfaceC6474f interfaceC6474f, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC6469a interfaceC6469a2, @Nullable Orientation orientation, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C08499(interfaceC6469a2, new Ref$LongRef(), orientation, interfaceC6474f, interfaceC6473e, interfaceC6469a, interfaceC6471c, null), interfaceC5631c);
        return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : C5443s.f8405a;
    }
}
