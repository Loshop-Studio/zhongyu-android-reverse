package androidx.compose.p006ui.input.pointer;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.unit.IntSize;
import androidx.compose.p006ui.unit.IntSizeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000\u001aG\u0010\b\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0013\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a[\u0010\u0017\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0019\"\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001aU\u0010\u0017\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001d\u001a(\u0010\u001e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u0006H\u0000\u001a(\u0010!\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\"\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000*<\b\u0000\u0010#\"\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\n2\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, m5175d2 = {"down", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "id", "", "durationMillis", "x", "", "y", "invokeOverAllPasses", "", "Lkotlin/Function3;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/input/pointer/PointerInputHandler;", "pointerEvent", "size", "invokeOverAllPasses-H0pRuoY", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;J)V", "invokeOverPass", "pointerEventPass", "invokeOverPass-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPasses", "pointerEventPasses", "", "invokeOverPasses-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;[Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Ljava/util/List;J)V", "moveBy", "dx", "dy", "moveTo", "up", "PointerInputHandler", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPointerInputTestUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,148:1\n33#2,6:149\n*S KotlinDebug\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n*L\n144#1:149,6\n*E\n"})
/* loaded from: classes.dex */
public final class PointerInputTestUtilKt {
    public static final PointerInputChange down(long j4, long j5, float f4, float f5) {
        return new PointerInputChange(PointerId.m10463constructorimpl(j4), j5, OffsetKt.Offset(f4, f5), true, 1.0f, j5, OffsetKt.Offset(f4, f5), false, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PointerInputChange down$default(long j4, long j5, float f4, float f5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j5 = 0;
        }
        return down(j4, j5, (i4 & 4) != 0 ? 0.0f : f4, (i4 & 8) != 0 ? 0.0f : f5);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m10517invokeOverAllPassesH0pRuoY(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> invokeOverAllPasses, PointerEvent pointerEvent, long j4) {
        Intrinsics.checkNotNullParameter(invokeOverAllPasses, "$this$invokeOverAllPasses");
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        m10521invokeOverPasseshUlJWOE(invokeOverAllPasses, pointerEvent, (List<? extends PointerEventPass>) CollectionsKt__CollectionsKt.listOf((Object[]) new PointerEventPass[]{PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final}), j4);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m10518invokeOverAllPassesH0pRuoY$default(Function3 function3, PointerEvent pointerEvent, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m10517invokeOverAllPassesH0pRuoY(function3, pointerEvent, j4);
    }

    /* renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m10519invokeOverPasshUlJWOE(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> invokeOverPass, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j4) {
        Intrinsics.checkNotNullParameter(invokeOverPass, "$this$invokeOverPass");
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPass, "pointerEventPass");
        m10521invokeOverPasseshUlJWOE(invokeOverPass, pointerEvent, (List<? extends PointerEventPass>) CollectionsKt__CollectionsJVMKt.listOf(pointerEventPass), j4);
    }

    /* renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m10520invokeOverPasshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j4 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m10519invokeOverPasshUlJWOE(function3, pointerEvent, pointerEventPass, j4);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m10522invokeOverPasseshUlJWOE(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> invokeOverPasses, PointerEvent pointerEvent, PointerEventPass[] pointerEventPasses, long j4) {
        Intrinsics.checkNotNullParameter(invokeOverPasses, "$this$invokeOverPasses");
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPasses, "pointerEventPasses");
        m10521invokeOverPasseshUlJWOE(invokeOverPasses, pointerEvent, (List<? extends PointerEventPass>) ArraysKt___ArraysKt.toList(pointerEventPasses), j4);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m10524invokeOverPasseshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j4 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m10522invokeOverPasseshUlJWOE((Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit>) function3, pointerEvent, pointerEventPassArr, j4);
    }

    public static final PointerInputChange moveBy(PointerInputChange pointerInputChange, long j4, float f4, float f5) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        long id = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(id, pointerInputChange.getUptimeMillis() + j4, OffsetKt.Offset(Offset.m8945getXimpl(pointerInputChange.getPosition()) + f4, Offset.m8946getYimpl(pointerInputChange.getPosition()) + f5), true, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange pointerInputChange, long j4, float f4, float f5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            f5 = 0.0f;
        }
        return moveBy(pointerInputChange, j4, f4, f5);
    }

    public static final PointerInputChange moveTo(PointerInputChange pointerInputChange, long j4, float f4, float f5) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        long id = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(id, j4, OffsetKt.Offset(f4, f5), true, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange pointerInputChange, long j4, float f4, float f5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            f5 = 0.0f;
        }
        return moveTo(pointerInputChange, j4, f4, f5);
    }

    /* renamed from: up */
    public static final PointerInputChange m569up(PointerInputChange pointerInputChange, long j4) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        long id = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(id, j4, pointerInputChange.getPosition(), false, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m10521invokeOverPasseshUlJWOE(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> invokeOverPasses, PointerEvent pointerEvent, List<? extends PointerEventPass> pointerEventPasses, long j4) {
        Intrinsics.checkNotNullParameter(invokeOverPasses, "$this$invokeOverPasses");
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPasses, "pointerEventPasses");
        if (!(!pointerEvent.getChanges().isEmpty())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!pointerEventPasses.isEmpty())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int size = pointerEventPasses.size();
        for (int i4 = 0; i4 < size; i4++) {
            invokeOverPasses.invoke(pointerEvent, pointerEventPasses.get(i4), IntSize.m11677boximpl(j4));
        }
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m10523invokeOverPasseshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, List list, long j4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j4 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m10521invokeOverPasseshUlJWOE((Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit>) function3, pointerEvent, (List<? extends PointerEventPass>) list, j4);
    }
}
