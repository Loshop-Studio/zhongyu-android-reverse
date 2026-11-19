package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\n\u001a@\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0000\u001aD\u0010\u000b\u001a\u00020\f*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\rj\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aL\u0010\u0016\u001a\u00020\f*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\rj\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aX\u0010\u001a\u001a\u00020\f*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\rj\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u001c\"\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aR\u0010\u001a\u001a\u00020\f*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\rj\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001f\u001a(\u0010 \u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u0006H\u0000\u001a(\u0010#\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0014\u0010$\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000*<\b\u0000\u0010%\"\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\r2\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, m13558d2 = {"down", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "id", "", "durationMillis", "x", "", "y", "historicalData", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "invokeOverAllPasses", "", "Lkotlin/Function3;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/input/pointer/PointerInputHandler;", "pointerEvent", "size", "invokeOverAllPasses-H0pRuoY", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;J)V", "invokeOverPass", "pointerEventPass", "invokeOverPass-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPasses", "pointerEventPasses", "", "invokeOverPasses-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;[Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Ljava/util/List;J)V", "moveBy", "dx", "dy", "moveTo", "up", "PointerInputHandler", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nPointerInputTestUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,147:1\n30#2:148\n30#2:152\n30#2:156\n30#2:165\n53#3,3:149\n53#3,3:153\n53#3,3:157\n60#3:161\n70#3:164\n53#3,3:166\n80#3:170\n80#3:172\n80#3:174\n80#3:183\n65#4:160\n69#4:163\n22#5:162\n30#6:169\n30#6:171\n30#6:173\n30#6:182\n1#7:175\n34#8,6:176\n*S KotlinDebug\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n*L\n38#1:148\n42#1:152\n63#1:156\n76#1:165\n38#1:149,3\n42#1:153,3\n63#1:157,3\n76#1:161\n76#1:164\n76#1:166,3\n102#1:170\n119#1:172\n130#1:174\n141#1:183\n76#1:160\n76#1:163\n76#1:162\n102#1:169\n119#1:171\n130#1:173\n141#1:182\n145#1:176,6\n*E\n"})
/* loaded from: classes2.dex */
public final class PointerInputTestUtilKt {
    public static final PointerInputChange down(long j10, long j11, float f10, float f11, List<HistoricalChange> list) {
        PointerInputChange pointerInputChange = new PointerInputChange(PointerId.m22179constructorimpl(j10), j11, Offset.m20727constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), true, 1.0f, j11, Offset.m20727constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), false, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
        return (list == null || list.isEmpty()) ? pointerInputChange : PointerInputChange.m22188copyOHpmEuE$default(pointerInputChange, 0L, 0L, 0L, false, 0L, 0L, false, 0, list, 0L, 767, null);
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
    public static final void m22249invokeOverAllPassesH0pRuoY(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> function3, PointerEvent pointerEvent, long j10) {
        m22253invokeOverPasseshUlJWOE(function3, pointerEvent, (List<? extends PointerEventPass>) CollectionsKt.listOf((Object[]) new PointerEventPass[]{PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final}), j10);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m22250invokeOverAllPassesH0pRuoY$default(Function3 function3, PointerEvent pointerEvent, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = IntSize.m23727constructorimpl((j11 & 4294967295L) | (j11 << 32));
        }
        m22249invokeOverAllPassesH0pRuoY(function3, pointerEvent, j10);
    }

    /* renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m22251invokeOverPasshUlJWOE(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> function3, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        m22253invokeOverPasseshUlJWOE(function3, pointerEvent, (List<? extends PointerEventPass>) CollectionsKt.listOf(pointerEventPass), j10);
    }

    /* renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m22252invokeOverPasshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = IntSize.m23727constructorimpl((j11 & 4294967295L) | (j11 << 32));
        }
        m22251invokeOverPasshUlJWOE(function3, pointerEvent, pointerEventPass, j10);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m22254invokeOverPasseshUlJWOE(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> function3, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j10) {
        m22253invokeOverPasseshUlJWOE(function3, pointerEvent, (List<? extends PointerEventPass>) ArraysKt.toList(pointerEventPassArr), j10);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m22256invokeOverPasseshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = IntSize.m23727constructorimpl((j11 & 4294967295L) | (j11 << 32));
        }
        m22254invokeOverPasseshUlJWOE((Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit>) function3, pointerEvent, pointerEventPassArr, j10);
    }

    public static final PointerInputChange moveBy(PointerInputChange pointerInputChange, long j10, float f10, float f11) {
        long id = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        long position = pointerInputChange.getPosition();
        long uptimeMillis2 = pointerInputChange.getUptimeMillis() + j10;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerInputChange.getPosition() >> 32)) + f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerInputChange.getPosition() & 4294967295L)) + f11;
        return new PointerInputChange(id, uptimeMillis2, Offset.m20727constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), true, 1.0f, uptimeMillis, position, pressed, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
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
        return new PointerInputChange(pointerInputChange.getId(), j10, Offset.m20727constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), true, 1.0f, pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), false, 0, 0L, 1536, (DefaultConstructorMarker) null);
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
    public static final PointerInputChange m1412up(PointerInputChange pointerInputChange, long j10) {
        long id = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(id, j10, pointerInputChange.getPosition(), false, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m22253invokeOverPasseshUlJWOE(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> function3, PointerEvent pointerEvent, List<? extends PointerEventPass> list, long j10) {
        if (pointerEvent.getChanges().isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no changes");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no passes");
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            function3.invoke(pointerEvent, list.get(i10), IntSize.m23724boximpl(j10));
        }
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m22255invokeOverPasseshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, List list, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            long j11 = Integer.MAX_VALUE;
            j10 = IntSize.m23727constructorimpl((j11 & 4294967295L) | (j11 << 32));
        }
        m22253invokeOverPasseshUlJWOE((Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit>) function3, pointerEvent, (List<? extends PointerEventPass>) list, j10);
    }
}
