package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.p009ui.geometry.Offset;
import androidx.compose.p009ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p009ui.input.pointer.PointerEvent;
import androidx.compose.p009ui.input.pointer.PointerInputChange;
import androidx.compose.p009ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.motion.widget.Key;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0002*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u000f\u0010\u000b\u001a\u00020\u0002*\u00020\u0006¢\u0006\u0002\u0010\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0006\u001a~\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\b2`\u0010\u0013\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00100\u0014H\u0086@¢\u0006\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m7880d2 = {"angle", "", "Landroidx/compose/ui/geometry/Offset;", "angle-k-4lQ0M", "(J)F", "calculateCentroid", "Landroidx/compose/ui/input/pointer/PointerEvent;", "useCurrent", "", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "calculateCentroidSize", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "calculateRotation", "calculateZoom", "detectTransformGestures", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "panZoomLock", "onGesture", "Lkotlin/Function4;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "centroid", "pan", "zoom", Key.ROTATION, "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,255:1\n133#2,3:256\n34#2,6:259\n136#2:265\n34#2,6:266\n34#2,6:277\n34#2,6:283\n65#3:272\n69#3:275\n60#4:273\n70#4:276\n22#5:274\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,3\n116#1:259,6\n116#1:265\n131#1:266,6\n217#1:277,6\n242#1:283,6\n162#1:272\n162#1:275\n162#1:273\n162#1:276\n162#1:274\n*E\n"})
/* loaded from: classes.dex */
public final class TransformGestureDetectorKt {

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7880d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7881k = 3, m7882mv = {1, 9, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", m7918f = "TransformGestureDetector.kt", m7919i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m7920l = {60, 62}, m7921m = "invokeSuspend", m7922n = {"$this$awaitEachGesture", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, m7923s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
    @SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n102#2,2:256\n34#2,6:258\n104#2:264\n34#2,6:265\n102#2,2:271\n34#2,6:273\n104#2:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n*L\n63#1:256,2\n63#1:258,6\n63#1:264\n95#1:265,6\n102#1:271,2\n102#1:273,6\n102#1:279\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2 */
    public static final class C06232 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
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
        public C06232(boolean z6, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super C06232> continuation) {
            super(2, continuation);
            this.$panZoomLock = z6;
            this.$onGesture = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C06232 c06232 = new C06232(this.$panZoomLock, this.$onGesture, continuation);
            c06232.L$0 = obj;
            return c06232;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C06232) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0094, code lost:
        
            if (r15 == r6) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0160  */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0094 -> B:17:0x0097). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 427
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt.C06232.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m10404anglek4lQ0M(long j6) {
        if (Float.intBitsToFloat((int) (j6 >> 32)) == 0.0f && Float.intBitsToFloat((int) (j6 & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j6 & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z6) {
        long jM13674getZeroF1C5BW0 = Offset.INSTANCE.m13674getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            PointerInputChange pointerInputChange = changes.get(i7);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jM13674getZeroF1C5BW0 = Offset.m13663plusMKHz9U(jM13674getZeroF1C5BW0, z6 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i6++;
            }
        }
        return i6 == 0 ? Offset.INSTANCE.m13673getUnspecifiedF1C5BW0() : Offset.m13653divtuRUvjQ(jM13674getZeroF1C5BW0, i6);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        return calculateCentroid(pointerEvent, z6);
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z6) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, z6);
        float fM13656getDistanceimpl = 0.0f;
        if (Offset.m13655equalsimpl0(jCalculateCentroid, Offset.INSTANCE.m13673getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            PointerInputChange pointerInputChange = changes.get(i7);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                fM13656getDistanceimpl += Offset.m13656getDistanceimpl(Offset.m13662minusMKHz9U(z6 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), jCalculateCentroid));
                i6++;
            }
        }
        return fM13656getDistanceimpl / i6;
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        return calculateCentroidSize(pointerEvent, z6);
    }

    public static final long calculatePan(PointerEvent pointerEvent) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.INSTANCE;
        return Offset.m13655equalsimpl0(jCalculateCentroid, companion.m13673getUnspecifiedF1C5BW0()) ? companion.m13674getZeroF1C5BW0() : Offset.m13662minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = 1;
            if (i6 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i6);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i8 = 0;
            }
            i7 += i8;
            i6++;
        }
        if (i7 < 2) {
            return 0.0f;
        }
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        long jCalculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i9 = 0; i9 < size2; i9++) {
            PointerInputChange pointerInputChange2 = changes2.get(i9);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long jM13662minusMKHz9U = Offset.m13662minusMKHz9U(pointerInputChange2.getPreviousPosition(), jCalculateCentroid2);
                long jM13662minusMKHz9U2 = Offset.m13662minusMKHz9U(position, jCalculateCentroid);
                float fM10404anglek4lQ0M = m10404anglek4lQ0M(jM13662minusMKHz9U2) - m10404anglek4lQ0M(jM13662minusMKHz9U);
                float fM13656getDistanceimpl = Offset.m13656getDistanceimpl(Offset.m13663plusMKHz9U(jM13662minusMKHz9U2, jM13662minusMKHz9U)) / 2.0f;
                if (fM10404anglek4lQ0M > 180.0f) {
                    fM10404anglek4lQ0M -= 360.0f;
                } else if (fM10404anglek4lQ0M < -180.0f) {
                    fM10404anglek4lQ0M += 360.0f;
                }
                f7 += fM10404anglek4lQ0M * fM13656getDistanceimpl;
                f6 += fM13656getDistanceimpl;
            }
        }
        if (f6 == 0.0f) {
            return 0.0f;
        }
        return f7 / f6;
    }

    public static final float calculateZoom(PointerEvent pointerEvent) {
        float fCalculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float fCalculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (fCalculateCentroidSize == 0.0f || fCalculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return fCalculateCentroidSize / fCalculateCentroidSize2;
    }

    public static final Object detectTransformGestures(PointerInputScope pointerInputScope, boolean z6, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C06232(z6, function4, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z6, Function4 function4, Continuation continuation, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        return detectTransformGestures(pointerInputScope, z6, function4, continuation);
    }
}
