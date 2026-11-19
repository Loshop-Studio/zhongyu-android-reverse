package androidx.compose.p014ui.input.pointer;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9545q;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
public final class PointerInputTestUtilKt {
    public static final PointerInputChange down(long j10, long j11, float f10, float f11, List<HistoricalChange> list) {
        PointerInputChange pointerInputChange = new PointerInputChange(PointerId.m32084constructorimpl(j10), j11, Offset.m30629constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), true, 1.0f, j11, Offset.m30629constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), false, false, 0, 0L, 1536, (AbstractC9972n) null);
        List<HistoricalChange> list2 = list;
        return (list2 == null || list2.isEmpty()) ? pointerInputChange : PointerInputChange.m32093copyOHpmEuE$default(pointerInputChange, 0L, 0L, 0L, false, 0L, 0L, false, 0, list, 0L, 767, null);
    }

    public static /* synthetic */ PointerInputChange down$default(long j10, long j11, float f10, float f11, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        long j12 = j11;
        float f12 = (i10 & 4) != 0 ? 0.0f : f10;
        float f13 = (i10 & 8) != 0 ? 0.0f : f11;
        if ((i10 & 16) != 0) {
            list = null;
        }
        return down(j10, j12, f12, f13, list);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m32154invokeOverAllPassesH0pRuoY(InterfaceC9545q interfaceC9545q, PointerEvent pointerEvent, long j10) {
        m32158invokeOverPasseshUlJWOE(interfaceC9545q, pointerEvent, (List<? extends PointerEventPass>) AbstractC10978w.m24139q(PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final), j10);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m32155invokeOverAllPassesH0pRuoY$default(InterfaceC9545q interfaceC9545q, PointerEvent pointerEvent, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = IntSize.m33667constructorimpl((j11 & 4294967295L) | (j11 << 32));
        }
        m32154invokeOverAllPassesH0pRuoY(interfaceC9545q, pointerEvent, j10);
    }

    /* renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m32156invokeOverPasshUlJWOE(InterfaceC9545q interfaceC9545q, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        m32158invokeOverPasseshUlJWOE(interfaceC9545q, pointerEvent, (List<? extends PointerEventPass>) AbstractC10976v.m24126e(pointerEventPass), j10);
    }

    /* renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m32157invokeOverPasshUlJWOE$default(InterfaceC9545q interfaceC9545q, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = IntSize.m33667constructorimpl((j11 & 4294967295L) | (j11 << 32));
        }
        m32156invokeOverPasshUlJWOE(interfaceC9545q, pointerEvent, pointerEventPass, j10);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m32159invokeOverPasseshUlJWOE(InterfaceC9545q interfaceC9545q, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j10) {
        m32158invokeOverPasseshUlJWOE(interfaceC9545q, pointerEvent, (List<? extends PointerEventPass>) AbstractC10968r.m24097p1(pointerEventPassArr), j10);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m32161invokeOverPasseshUlJWOE$default(InterfaceC9545q interfaceC9545q, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = IntSize.m33667constructorimpl((j11 & 4294967295L) | (j11 << 32));
        }
        m32159invokeOverPasseshUlJWOE(interfaceC9545q, pointerEvent, pointerEventPassArr, j10);
    }

    public static final PointerInputChange moveBy(PointerInputChange pointerInputChange, long j10, float f10, float f11) {
        long jM32102getIdJ3iCeTQ = pointerInputChange.m32102getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        long jM32104getPositionF1C5BW0 = pointerInputChange.m32104getPositionF1C5BW0();
        long uptimeMillis2 = pointerInputChange.getUptimeMillis() + j10;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerInputChange.m32104getPositionF1C5BW0() >> 32)) + f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerInputChange.m32104getPositionF1C5BW0() & 4294967295L)) + f11;
        return new PointerInputChange(jM32102getIdJ3iCeTQ, uptimeMillis2, Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), true, 1.0f, uptimeMillis, jM32104getPositionF1C5BW0, pressed, false, 0, 0L, 1536, (AbstractC9972n) null);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange pointerInputChange, long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return moveBy(pointerInputChange, j10, f10, f11);
    }

    public static final PointerInputChange moveTo(PointerInputChange pointerInputChange, long j10, float f10, float f11) {
        return new PointerInputChange(pointerInputChange.m32102getIdJ3iCeTQ(), j10, Offset.m30629constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), true, 1.0f, pointerInputChange.getUptimeMillis(), pointerInputChange.m32104getPositionF1C5BW0(), pointerInputChange.getPressed(), false, 0, 0L, 1536, (AbstractC9972n) null);
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange pointerInputChange, long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return moveTo(pointerInputChange, j10, f10, f11);
    }

    /* renamed from: up */
    public static final PointerInputChange m1262up(PointerInputChange pointerInputChange, long j10) {
        long jM32102getIdJ3iCeTQ = pointerInputChange.m32102getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(jM32102getIdJ3iCeTQ, j10, pointerInputChange.m32104getPositionF1C5BW0(), false, 1.0f, uptimeMillis, pointerInputChange.m32104getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (AbstractC9972n) null);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m32158invokeOverPasseshUlJWOE(InterfaceC9545q interfaceC9545q, PointerEvent pointerEvent, List<? extends PointerEventPass> list, long j10) {
        if (pointerEvent.getChanges().isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no changes");
        }
        List<? extends PointerEventPass> list2 = list;
        if (list2.isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no passes");
        }
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC9545q.invoke(pointerEvent, list.get(i10), IntSize.m33664boximpl(j10));
        }
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m32160invokeOverPasseshUlJWOE$default(InterfaceC9545q interfaceC9545q, PointerEvent pointerEvent, List list, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = IntSize.m33667constructorimpl((j11 & 4294967295L) | (j11 << 32));
        }
        m32158invokeOverPasseshUlJWOE(interfaceC9545q, pointerEvent, (List<? extends PointerEventPass>) list, j10);
    }
}
