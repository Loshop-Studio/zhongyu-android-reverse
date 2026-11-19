package androidx.compose.material3.internal;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventKt;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.input.pointer.PointerId;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.input.pointer.PointerType;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.unit.C3156Dp;
import java.util.List;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$LongRef;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    static {
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl((float) 0.125d);
        mouseSlop = fM26899constructorimpl;
        float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(18);
        defaultTouchSlop = fM26899constructorimpl2;
        mouseToTouchSlopRatio = fM26899constructorimpl / fM26899constructorimpl2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0123 -> B:47:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0163 -> B:54:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0180 -> B:47:0x012b). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m22905awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, p300x7.InterfaceC10574p r24, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.DragGestureDetectorCopyKt.m22905awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, x7.p, m7.c):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m22906awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j10, int i10, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super PointerInputChange> interfaceC9324c) {
        float f10;
        int i11;
        int i12;
        PointerInputChange pointerInputChange;
        float f11;
        PointerInputChange pointerInputChange2;
        if (m22907isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j10)) {
            return null;
        }
        float fM22908pointerSlopE8SPZFQ = m22908pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i10);
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.f17472a = j10;
        float f12 = 0.0f;
        while (true) {
            int i13 = 0;
            AbstractC9131s.m16126c(0);
            int i14 = 1;
            Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, interfaceC9324c, 1, null);
            AbstractC9131s.m16126c(1);
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    f10 = f12;
                    i11 = i13;
                    i12 = i14;
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i15);
                f10 = f12;
                i11 = i13;
                i12 = i14;
                if (Boolean.valueOf(PointerId.m25484equalsimpl0(pointerInputChange.m25500getIdJ3iCeTQ(), ref$LongRef.f17472a)).booleanValue()) {
                    break;
                }
                i15++;
                f12 = f10;
                i13 = i11;
                i14 = i12;
            }
            AbstractC9133u.m16130d(pointerInputChange);
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i16 = i11;
                while (true) {
                    if (i16 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i16);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i16++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                ref$LongRef.f17472a = pointerInputChange4.m25500getIdJ3iCeTQ();
                f11 = f10;
            } else {
                float fFloatValue = f10 + (((Number) interfaceC10570l.invoke(Offset.m24024boximpl(pointerInputChange3.m25502getPositionF1C5BW0()))).floatValue() - ((Number) interfaceC10570l.invoke(Offset.m24024boximpl(pointerInputChange3.m25503getPreviousPositionF1C5BW0()))).floatValue());
                if (Math.abs(fFloatValue) < fM22908pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    AbstractC9131s.m16126c(i11);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, interfaceC9324c);
                    AbstractC9131s.m16126c(i12);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f11 = fFloatValue;
                } else {
                    interfaceC10574p.invoke(pointerInputChange3, Float.valueOf(fFloatValue - (Math.signum(fFloatValue) * fM22908pointerSlopE8SPZFQ)));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    f11 = 0.0f;
                    f12 = f11;
                }
            }
            f12 = f11;
        }
    }

    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m22907isPointerUpDmW0f2w(PointerEvent pointerEvent, long j10) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i10);
            if (PointerId.m25484equalsimpl0(pointerInputChange.m25500getIdJ3iCeTQ(), j10)) {
                break;
            }
            i10++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z10 = true;
        }
        return true ^ z10;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m22908pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i10) {
        return PointerType.m25573equalsimpl0(i10, PointerType.Companion.m25578getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }
}
