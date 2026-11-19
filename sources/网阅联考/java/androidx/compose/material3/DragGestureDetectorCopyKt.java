package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.p006ui.input.pointer.PointerEvent;
import androidx.compose.p006ui.input.pointer.PointerId;
import androidx.compose.p006ui.input.pointer.PointerInputChange;
import androidx.compose.p006ui.input.pointer.PointerType;
import androidx.compose.p006ui.platform.ViewConfiguration;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ag\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f26\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0080@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0018H\u0082Hø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010!\u001a\u00020\u0005*\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006%"}, m5175d2 = {"defaultTouchSlop", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "mouseToTouchSlopRatio", "", "awaitHorizontalPointerSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "change", "overSlop", "", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "getDragDirectionValue", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPointerUp", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "material3_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    static {
        float fM11525constructorimpl = C1700Dp.m11525constructorimpl((float) 0.125d);
        mouseSlop = fM11525constructorimpl;
        float fM11525constructorimpl2 = C1700Dp.m11525constructorimpl(18);
        defaultTouchSlop = fM11525constructorimpl2;
        mouseToTouchSlopRatio = fM11525constructorimpl / fM11525constructorimpl2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x011b -> B:57:0x0167). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x015a -> B:53:0x015d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0181 -> B:57:0x0167). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m7952awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.p006ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, kotlin.jvm.functions.Function2<? super androidx.compose.p006ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r23, kotlin.coroutines.Continuation<? super androidx.compose.p006ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DragGestureDetectorCopyKt.m7952awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        r21.invoke(r15, java.lang.Float.valueOf(r8 - (java.lang.Math.signum(r8) * r3)));
     */
    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.Object m7953awaitPointerSlopOrCancellationpn7EDYM(androidx.compose.p006ui.input.pointer.AwaitPointerEventScope r17, long r18, int r20, kotlin.jvm.functions.Function2<? super androidx.compose.p006ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r21, kotlin.jvm.functions.Function1<? super androidx.compose.p006ui.geometry.Offset, java.lang.Float> r22, kotlin.coroutines.Continuation<? super androidx.compose.p006ui.input.pointer.PointerInputChange> r23) {
        /*
            r0 = r17
            r1 = r22
            r2 = r23
            androidx.compose.ui.input.pointer.PointerEvent r3 = r17.getCurrentEvent()
            r4 = r18
            boolean r3 = m7954isPointerUpDmW0f2w(r3, r4)
            r6 = 0
            if (r3 == 0) goto L14
            return r6
        L14:
            androidx.compose.ui.platform.ViewConfiguration r3 = r17.getViewConfiguration()
            r7 = r20
            float r3 = m7955pointerSlopE8SPZFQ(r3, r7)
            r7 = 0
        L1f:
            r8 = r7
        L20:
            r9 = 0
            kotlin.jvm.internal.InlineMarker.mark(r9)
            r10 = 1
            java.lang.Object r11 = androidx.compose.p006ui.input.pointer.AbstractC1394b.m590t(r0, r6, r2, r10, r6)
            kotlin.jvm.internal.InlineMarker.mark(r10)
            androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.p006ui.input.pointer.PointerEvent) r11
            java.util.List r12 = r11.getChanges()
            int r13 = r12.size()
            r14 = r9
        L37:
            if (r14 >= r13) goto L51
            java.lang.Object r15 = r12.get(r14)
            r16 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r16 = (androidx.compose.p006ui.input.pointer.PointerInputChange) r16
            long r9 = r16.getId()
            boolean r9 = androidx.compose.p006ui.input.pointer.PointerId.m10465equalsimpl0(r9, r4)
            if (r9 == 0) goto L4c
            goto L52
        L4c:
            int r14 = r14 + 1
            r9 = 0
            r10 = 1
            goto L37
        L51:
            r15 = r6
        L52:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.p006ui.input.pointer.PointerInputChange) r15
            boolean r9 = r15.isConsumed()
            if (r9 == 0) goto L5e
            return r6
        L5e:
            boolean r9 = androidx.compose.p006ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r15)
            if (r9 == 0) goto L8b
            java.util.List r4 = r11.getChanges()
            int r5 = r4.size()
            r9 = 0
        L6d:
            if (r9 >= r5) goto L80
            java.lang.Object r10 = r4.get(r9)
            r11 = r10
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p006ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.getPressed()
            if (r11 == 0) goto L7d
            goto L81
        L7d:
            int r9 = r9 + 1
            goto L6d
        L80:
            r10 = r6
        L81:
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p006ui.input.pointer.PointerInputChange) r10
            if (r10 != 0) goto L86
            return r6
        L86:
            long r4 = r10.getId()
            goto L20
        L8b:
            long r9 = r15.getPosition()
            long r11 = r15.getPreviousPosition()
            androidx.compose.ui.geometry.Offset r9 = androidx.compose.p006ui.geometry.Offset.m8934boximpl(r9)
            java.lang.Object r9 = r1.invoke(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            androidx.compose.ui.geometry.Offset r10 = androidx.compose.p006ui.geometry.Offset.m8934boximpl(r11)
            java.lang.Object r10 = r1.invoke(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            float r9 = r9 - r10
            float r8 = r8 + r9
            float r9 = java.lang.Math.abs(r8)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 >= 0) goto Lcd
            androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.p006ui.input.pointer.PointerEventPass.Final
            r10 = 0
            kotlin.jvm.internal.InlineMarker.mark(r10)
            r0.awaitPointerEvent(r9, r2)
            r9 = 1
            kotlin.jvm.internal.InlineMarker.mark(r9)
            boolean r9 = r15.isConsumed()
            if (r9 == 0) goto L20
            return r6
        Lcd:
            float r9 = java.lang.Math.signum(r8)
            float r9 = r9 * r3
            float r8 = r8 - r9
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r9 = r21
            r9.invoke(r15, r8)
            boolean r8 = r15.isConsumed()
            if (r8 == 0) goto L1f
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DragGestureDetectorCopyKt.m7953awaitPointerSlopOrCancellationpn7EDYM(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m7954isPointerUpDmW0f2w(PointerEvent pointerEvent, long j4) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i4);
            if (PointerId.m10465equalsimpl0(pointerInputChange.getId(), j4)) {
                break;
            }
            i4++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z3 = true;
        }
        return true ^ z3;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m7955pointerSlopE8SPZFQ(ViewConfiguration pointerSlop, int i4) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        return PointerType.m10538equalsimpl0(i4, PointerType.INSTANCE.m10543getMouseT8wyACA()) ? pointerSlop.getTouchSlop() * mouseToTouchSlopRatio : pointerSlop.getTouchSlop();
    }
}
