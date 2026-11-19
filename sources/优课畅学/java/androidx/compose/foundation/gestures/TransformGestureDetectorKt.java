package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.databinding.library.baseAdapters.C3721BR;
import java.util.List;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10576r;

/* loaded from: classes.dex */
public final class TransformGestureDetectorKt {

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", m17801f = "TransformGestureDetector.kt", m17802l = {C3721BR.webViewControlViewModel, 62}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2 */
    public static final class C13272 extends RestrictedSuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10576r $onGesture;
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
        public C13272(boolean z10, InterfaceC10576r interfaceC10576r, InterfaceC9324c<? super C13272> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$panZoomLock = z10;
            this.$onGesture = interfaceC10576r;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13272 c13272 = new C13272(this.$panZoomLock, this.$onGesture, interfaceC9324c);
            c13272.L$0 = obj;
            return c13272;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13272) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
        
            if (r15 == r6) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
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
                Method dump skipped, instructions count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt.C13272.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m20656anglek4lQ0M(long j10) {
        if (Float.intBitsToFloat((int) (j10 >> 32)) == 0.0f && Float.intBitsToFloat((int) (j10 & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j10 & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z10) {
        long jM24051getZeroF1C5BW0 = Offset.Companion.m24051getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = changes.get(i11);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jM24051getZeroF1C5BW0 = Offset.m24040plusMKHz9U(jM24051getZeroF1C5BW0, z10 ? pointerInputChange.m25502getPositionF1C5BW0() : pointerInputChange.m25503getPreviousPositionF1C5BW0());
                i10++;
            }
        }
        return i10 == 0 ? Offset.Companion.m24050getUnspecifiedF1C5BW0() : Offset.m24030divtuRUvjQ(jM24051getZeroF1C5BW0, i10);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return calculateCentroid(pointerEvent, z10);
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z10) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, z10);
        float fM24033getDistanceimpl = 0.0f;
        if (Offset.m24032equalsimpl0(jCalculateCentroid, Offset.Companion.m24050getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = changes.get(i11);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                fM24033getDistanceimpl += Offset.m24033getDistanceimpl(Offset.m24039minusMKHz9U(z10 ? pointerInputChange.m25502getPositionF1C5BW0() : pointerInputChange.m25503getPreviousPositionF1C5BW0(), jCalculateCentroid));
                i10++;
            }
        }
        return fM24033getDistanceimpl / i10;
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
        return Offset.m24032equalsimpl0(jCalculateCentroid, companion.m24050getUnspecifiedF1C5BW0()) ? companion.m24051getZeroF1C5BW0() : Offset.m24039minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
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
                long jM25502getPositionF1C5BW0 = pointerInputChange2.m25502getPositionF1C5BW0();
                long jM24039minusMKHz9U = Offset.m24039minusMKHz9U(pointerInputChange2.m25503getPreviousPositionF1C5BW0(), jCalculateCentroid2);
                long jM24039minusMKHz9U2 = Offset.m24039minusMKHz9U(jM25502getPositionF1C5BW0, jCalculateCentroid);
                float fM20656anglek4lQ0M = m20656anglek4lQ0M(jM24039minusMKHz9U2) - m20656anglek4lQ0M(jM24039minusMKHz9U);
                float fM24033getDistanceimpl = Offset.m24033getDistanceimpl(Offset.m24040plusMKHz9U(jM24039minusMKHz9U2, jM24039minusMKHz9U)) / 2.0f;
                if (fM20656anglek4lQ0M > 180.0f) {
                    fM20656anglek4lQ0M -= 360.0f;
                } else if (fM20656anglek4lQ0M < -180.0f) {
                    fM20656anglek4lQ0M += 360.0f;
                }
                f11 += fM20656anglek4lQ0M * fM24033getDistanceimpl;
                f10 += fM24033getDistanceimpl;
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

    public static final Object detectTransformGestures(PointerInputScope pointerInputScope, boolean z10, InterfaceC10576r interfaceC10576r, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C13272(z10, interfaceC10576r, null), interfaceC9324c);
        return objAwaitEachGesture == AbstractC9434a.m17291f() ? objAwaitEachGesture : C8736p.f16368a;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z10, InterfaceC10576r interfaceC10576r, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return detectTransformGestures(pointerInputScope, z10, interfaceC10576r, interfaceC9324c);
    }
}
