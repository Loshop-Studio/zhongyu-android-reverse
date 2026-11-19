package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class TransformGestureDetectorKt {

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", m26211f = "TransformGestureDetector.kt", m26212l = {60, 62}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2 */
    public static final class C13572 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9546r $onGesture;
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
        public C13572(boolean z10, InterfaceC9546r interfaceC9546r, InterfaceC11588c<? super C13572> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$panZoomLock = z10;
            this.$onGesture = interfaceC9546r;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13572 c13572 = new C13572(this.$panZoomLock, this.$onGesture, interfaceC11588c);
            c13572.L$0 = obj;
            return c13572;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13572) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
        
            if (r15 == r6) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0093 -> B:17:0x0096). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 436
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt.C13572.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m27258anglek4lQ0M(long j10) {
        if (Float.intBitsToFloat((int) (j10 >> 32)) == 0.0f && Float.intBitsToFloat((int) (j10 & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j10 & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z10) {
        long jM30653getZeroF1C5BW0 = Offset.Companion.m30653getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = changes.get(i11);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jM30653getZeroF1C5BW0 = Offset.m30642plusMKHz9U(jM30653getZeroF1C5BW0, z10 ? pointerInputChange.m32104getPositionF1C5BW0() : pointerInputChange.m32105getPreviousPositionF1C5BW0());
                i10++;
            }
        }
        return i10 == 0 ? Offset.Companion.m30652getUnspecifiedF1C5BW0() : Offset.m30632divtuRUvjQ(jM30653getZeroF1C5BW0, i10);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return calculateCentroid(pointerEvent, z10);
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z10) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, z10);
        float fM30635getDistanceimpl = 0.0f;
        if (Offset.m30634equalsimpl0(jCalculateCentroid, Offset.Companion.m30652getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = changes.get(i11);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                fM30635getDistanceimpl += Offset.m30635getDistanceimpl(Offset.m30641minusMKHz9U(z10 ? pointerInputChange.m32104getPositionF1C5BW0() : pointerInputChange.m32105getPreviousPositionF1C5BW0(), jCalculateCentroid));
                i10++;
            }
        }
        return fM30635getDistanceimpl / i10;
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return calculateCentroidSize(pointerEvent, z10);
    }

    public static final long calculatePan(PointerEvent pointerEvent) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.Companion;
        return Offset.m30634equalsimpl0(jCalculateCentroid, companion.m30652getUnspecifiedF1C5BW0()) ? companion.m30653getZeroF1C5BW0() : Offset.m30641minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i10 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i10);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i12 = 0;
            }
            i11 += i12;
            i10++;
        }
        if (i11 < 2) {
            return 0.0f;
        }
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        long jCalculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i13 = 0; i13 < size2; i13++) {
            PointerInputChange pointerInputChange2 = changes2.get(i13);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long jM32104getPositionF1C5BW0 = pointerInputChange2.m32104getPositionF1C5BW0();
                long jM30641minusMKHz9U = Offset.m30641minusMKHz9U(pointerInputChange2.m32105getPreviousPositionF1C5BW0(), jCalculateCentroid2);
                long jM30641minusMKHz9U2 = Offset.m30641minusMKHz9U(jM32104getPositionF1C5BW0, jCalculateCentroid);
                float fM27258anglek4lQ0M = m27258anglek4lQ0M(jM30641minusMKHz9U2) - m27258anglek4lQ0M(jM30641minusMKHz9U);
                float fM30635getDistanceimpl = Offset.m30635getDistanceimpl(Offset.m30642plusMKHz9U(jM30641minusMKHz9U2, jM30641minusMKHz9U)) / 2.0f;
                if (fM27258anglek4lQ0M > 180.0f) {
                    fM27258anglek4lQ0M -= 360.0f;
                } else if (fM27258anglek4lQ0M < -180.0f) {
                    fM27258anglek4lQ0M += 360.0f;
                }
                f11 += fM27258anglek4lQ0M * fM30635getDistanceimpl;
                f10 += fM30635getDistanceimpl;
            }
        }
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return f11 / f10;
    }

    public static final float calculateZoom(PointerEvent pointerEvent) {
        float fCalculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float fCalculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (fCalculateCentroidSize == 0.0f || fCalculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return fCalculateCentroidSize / fCalculateCentroidSize2;
    }

    public static final Object detectTransformGestures(PointerInputScope pointerInputScope, boolean z10, InterfaceC9546r interfaceC9546r, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C13572(z10, interfaceC9546r, null), interfaceC11588c);
        return objAwaitEachGesture == AbstractC11725a.m25952f() ? objAwaitEachGesture : C10786q.f26013a;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z10, InterfaceC9546r interfaceC9546r, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return detectTransformGestures(pointerInputScope, z10, interfaceC9546r, interfaceC11588c);
    }
}
