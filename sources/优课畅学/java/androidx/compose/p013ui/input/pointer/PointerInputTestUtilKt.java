package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
public final class PointerInputTestUtilKt {
    public static final PointerInputChange down(long j10, long j11, float f10, float f11, List<HistoricalChange> list) {
        PointerInputChange pointerInputChange = new PointerInputChange(PointerId.m25482constructorimpl(j10), j11, Offset.m24027constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), true, 1.0f, j11, Offset.m24027constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), false, false, 0, 0L, 1536, (AbstractC9126n) null);
        return (list == null || list.isEmpty()) ? pointerInputChange : PointerInputChange.m25491copyOHpmEuE$default(pointerInputChange, 0L, 0L, 0L, false, 0L, 0L, false, 0, list, 0L, 767, null);
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
    public static final void m25552invokeOverAllPassesH0pRuoY(InterfaceC10575q interfaceC10575q, PointerEvent pointerEvent, long j10) {
        m25556invokeOverPasseshUlJWOE(interfaceC10575q, pointerEvent, (List<? extends PointerEventPass>) AbstractC8809v.m14774q(PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final), j10);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m25553invokeOverAllPassesH0pRuoY$default(InterfaceC10575q interfaceC10575q, PointerEvent pointerEvent, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = IntSize.m27065constructorimpl((j11 & 4294967295L) | (j11 << 32));
        }
        m25552invokeOverAllPassesH0pRuoY(interfaceC10575q, pointerEvent, j10);
    }

    /* renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m25554invokeOverPasshUlJWOE(InterfaceC10575q interfaceC10575q, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        m25556invokeOverPasseshUlJWOE(interfaceC10575q, pointerEvent, (List<? extends PointerEventPass>) AbstractC8807u.m14755e(pointerEventPass), j10);
    }

    /* renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m25555invokeOverPasshUlJWOE$default(InterfaceC10575q interfaceC10575q, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = IntSize.m27065constructorimpl((j11 & 4294967295L) | (j11 << 32));
        }
        m25554invokeOverPasshUlJWOE(interfaceC10575q, pointerEvent, pointerEventPass, j10);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m25557invokeOverPasseshUlJWOE(InterfaceC10575q interfaceC10575q, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j10) {
        m25556invokeOverPasseshUlJWOE(interfaceC10575q, pointerEvent, (List<? extends PointerEventPass>) AbstractC8801r.m14736u1(pointerEventPassArr), j10);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m25559invokeOverPasseshUlJWOE$default(InterfaceC10575q interfaceC10575q, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = IntSize.m27065constructorimpl((j11 & 4294967295L) | (j11 << 32));
        }
        m25557invokeOverPasseshUlJWOE(interfaceC10575q, pointerEvent, pointerEventPassArr, j10);
    }

    public static final PointerInputChange moveBy(PointerInputChange pointerInputChange, long j10, float f10, float f11) {
        long jM25500getIdJ3iCeTQ = pointerInputChange.m25500getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        long jM25502getPositionF1C5BW0 = pointerInputChange.m25502getPositionF1C5BW0();
        long uptimeMillis2 = pointerInputChange.getUptimeMillis() + j10;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerInputChange.m25502getPositionF1C5BW0() >> 32)) + f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerInputChange.m25502getPositionF1C5BW0() & 4294967295L)) + f11;
        return new PointerInputChange(jM25500getIdJ3iCeTQ, uptimeMillis2, Offset.m24027constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), true, 1.0f, uptimeMillis, jM25502getPositionF1C5BW0, pressed, false, 0, 0L, 1536, (AbstractC9126n) null);
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
        return new PointerInputChange(pointerInputChange.m25500getIdJ3iCeTQ(), j10, Offset.m24027constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), true, 1.0f, pointerInputChange.getUptimeMillis(), pointerInputChange.m25502getPositionF1C5BW0(), pointerInputChange.getPressed(), false, 0, 0L, 1536, (AbstractC9126n) null);
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
    public static final PointerInputChange m1185up(PointerInputChange pointerInputChange, long j10) {
        long jM25500getIdJ3iCeTQ = pointerInputChange.m25500getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(jM25500getIdJ3iCeTQ, j10, pointerInputChange.m25502getPositionF1C5BW0(), false, 1.0f, uptimeMillis, pointerInputChange.m25502getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (AbstractC9126n) null);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m25556invokeOverPasseshUlJWOE(InterfaceC10575q interfaceC10575q, PointerEvent pointerEvent, List<? extends PointerEventPass> list, long j10) {
        if (pointerEvent.getChanges().isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no changes");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no passes");
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC10575q.invoke(pointerEvent, list.get(i10), IntSize.m27062boximpl(j10));
        }
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m25558invokeOverPasseshUlJWOE$default(InterfaceC10575q interfaceC10575q, PointerEvent pointerEvent, List list, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = IntSize.m27065constructorimpl((j11 & 4294967295L) | (j11 << 32));
        }
        m25556invokeOverPasseshUlJWOE(interfaceC10575q, pointerEvent, (List<? extends PointerEventPass>) list, j10);
    }
}
