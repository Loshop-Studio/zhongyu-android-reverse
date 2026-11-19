package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p006ui.input.pointer.PointerEvent;
import androidx.compose.p006ui.input.pointer.PointerInputChange;
import androidx.compose.p006ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@Metadata(m5174d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0002*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bø\u0001\u0001¢\u0006\u0002\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\u0002*\u00020\u0006ø\u0001\u0001¢\u0006\u0002\u0010\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0006\u001a\u0084\u0001\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\b2`\u0010\u0013\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00100\u0014H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0002\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, m5175d2 = {"angle", "", "Landroidx/compose/ui/geometry/Offset;", "angle-k-4lQ0M", "(J)F", "calculateCentroid", "Landroidx/compose/ui/input/pointer/PointerEvent;", "useCurrent", "", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "calculateCentroidSize", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "calculateRotation", "calculateZoom", "detectTransformGestures", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "panZoomLock", "onGesture", "Lkotlin/Function4;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "centroid", "pan", "zoom", "rotation", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n132#2,3:256\n33#2,4:259\n135#2,2:263\n38#2:265\n137#2:266\n33#2,6:267\n33#2,6:273\n33#2,6:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,3\n116#1:259,4\n116#1:263,2\n116#1:265\n116#1:266\n131#1:267,6\n216#1:273,6\n242#1:279,6\n*E\n"})
/* loaded from: classes.dex */
public final class TransformGestureDetectorKt {

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", m5192f = "TransformGestureDetector.kt", m5193i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m5194l = {59, LockFreeTaskQueueCore.CLOSED_SHIFT}, m5195m = "invokeSuspend", m5196n = {"$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, m5197s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
    @SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n101#2,2:256\n33#2,6:258\n103#2:264\n33#2,6:265\n101#2,2:271\n33#2,6:273\n103#2:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n*L\n62#1:256,2\n62#1:258,6\n62#1:264\n96#1:265,6\n103#1:271,2\n103#1:273,6\n103#1:279\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2 */
    public static final class C04912 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function4<Offset, Offset, Float, Float, Unit> $onGesture;
        final /* synthetic */ boolean $panZoomLock;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04912(boolean z3, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super C04912> continuation) {
            super(2, continuation);
            this.$panZoomLock = z3;
            this.$onGesture = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04912 c04912 = new C04912(this.$panZoomLock, this.$onGesture, continuation);
            c04912.L$0 = obj;
            return c04912;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C04912) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00a1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00c0 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009f -> B:18:0x00a2). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 470
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt.C04912.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m7232anglek4lQ0M(long j4) {
        if (Offset.m8945getXimpl(j4) == 0.0f) {
            if (Offset.m8946getYimpl(j4) == 0.0f) {
                return 0.0f;
            }
        }
        return ((-((float) Math.atan2(Offset.m8945getXimpl(j4), Offset.m8946getYimpl(j4)))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z3) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long jM8961getZeroF1C5BW0 = Offset.INSTANCE.m8961getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            PointerInputChange pointerInputChange = changes.get(i5);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jM8961getZeroF1C5BW0 = Offset.m8950plusMKHz9U(jM8961getZeroF1C5BW0, z3 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i4++;
            }
        }
        return i4 == 0 ? Offset.INSTANCE.m8960getUnspecifiedF1C5BW0() : Offset.m8940divtuRUvjQ(jM8961getZeroF1C5BW0, i4);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        return calculateCentroid(pointerEvent, z3);
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z3) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long jCalculateCentroid = calculateCentroid(pointerEvent, z3);
        float fM8943getDistanceimpl = 0.0f;
        if (Offset.m8942equalsimpl0(jCalculateCentroid, Offset.INSTANCE.m8960getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            PointerInputChange pointerInputChange = changes.get(i5);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                fM8943getDistanceimpl += Offset.m8943getDistanceimpl(Offset.m8949minusMKHz9U(z3 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), jCalculateCentroid));
                i4++;
            }
        }
        return fM8943getDistanceimpl / i4;
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        return calculateCentroidSize(pointerEvent, z3);
    }

    public static final long calculatePan(PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.INSTANCE;
        return Offset.m8942equalsimpl0(jCalculateCentroid, companion.m8960getUnspecifiedF1C5BW0()) ? companion.m8961getZeroF1C5BW0() : Offset.m8949minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = 1;
            if (i4 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i4);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i6 = 0;
            }
            i5 += i6;
            i4++;
        }
        float f4 = 0.0f;
        if (i5 < 2) {
            return 0.0f;
        }
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        long jCalculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i7 = 0;
        while (i7 < size2) {
            PointerInputChange pointerInputChange2 = changes2.get(i7);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long jM8949minusMKHz9U = Offset.m8949minusMKHz9U(pointerInputChange2.getPreviousPosition(), jCalculateCentroid2);
                long jM8949minusMKHz9U2 = Offset.m8949minusMKHz9U(position, jCalculateCentroid);
                float fM7232anglek4lQ0M = m7232anglek4lQ0M(jM8949minusMKHz9U2) - m7232anglek4lQ0M(jM8949minusMKHz9U);
                float fM8943getDistanceimpl = Offset.m8943getDistanceimpl(Offset.m8950plusMKHz9U(jM8949minusMKHz9U2, jM8949minusMKHz9U)) / 2.0f;
                if (fM7232anglek4lQ0M > 180.0f) {
                    fM7232anglek4lQ0M -= 360.0f;
                } else if (fM7232anglek4lQ0M < -180.0f) {
                    fM7232anglek4lQ0M += 360.0f;
                }
                f6 += fM7232anglek4lQ0M * fM8943getDistanceimpl;
                f5 += fM8943getDistanceimpl;
            }
            i7++;
            f4 = 0.0f;
        }
        return (f5 > f4 ? 1 : (f5 == f4 ? 0 : -1)) == 0 ? f4 : f6 / f5;
    }

    public static final float calculateZoom(PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        float fCalculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float fCalculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (fCalculateCentroidSize == 0.0f) {
            return 1.0f;
        }
        if (fCalculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return fCalculateCentroidSize / fCalculateCentroidSize2;
    }

    public static final Object detectTransformGestures(PointerInputScope pointerInputScope, boolean z3, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C04912(z3, function4, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z3, Function4 function4, Continuation continuation, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        return detectTransformGestures(pointerInputScope, z3, function4, continuation);
    }
}
