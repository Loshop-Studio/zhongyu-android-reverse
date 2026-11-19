package androidx.compose.p011ui.input.pointer;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\u001aG\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\f\u001a\u00020\t*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0010\u001a\u00020\t*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\t*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aD\u0010\u001d\u001a\u00020\u0017*\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0013j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0016H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aL\u0010!\u001a\u00020\u0017*\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0013j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u0016H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aX\u0010&\u001a\u00020\u0017*\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0013j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u00142\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\"\"\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u0016H\u0000ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001aR\u0010&\u001a\u00020\u0017*\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0013j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0016H\u0000ø\u0001\u0000¢\u0006\u0004\b$\u0010'*<\b\u0000\u0010(\"\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00132\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, m5110d2 = {"", "id", "durationMillis", "", "x", "y", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historicalData", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "down", "(JJFFLjava/util/List;)Landroidx/compose/ui/input/pointer/PointerInputChange;", "moveTo", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JFF)Landroidx/compose/ui/input/pointer/PointerInputChange;", "dx", "dy", "moveBy", "up", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/Function3;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Landroidx/compose/ui/unit/IntSize;", "Ld6/s;", "Landroidx/compose/ui/input/pointer/PointerInputHandler;", "pointerEvent", "size", "invokeOverAllPasses-H0pRuoY", "(Lr6/f;Landroidx/compose/ui/input/pointer/PointerEvent;J)V", "invokeOverAllPasses", "pointerEventPass", "invokeOverPass-hUlJWOE", "(Lr6/f;Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPass", "", "pointerEventPasses", "invokeOverPasses-hUlJWOE", "(Lr6/f;Landroidx/compose/ui/input/pointer/PointerEvent;[Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPasses", "(Lr6/f;Landroidx/compose/ui/input/pointer/PointerEvent;Ljava/util/List;J)V", "PointerInputHandler", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPointerInputTestUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,147:1\n30#2:148\n30#2:152\n30#2:156\n30#2:165\n53#3,3:149\n53#3,3:153\n53#3,3:157\n60#3:161\n70#3:164\n53#3,3:166\n80#3:170\n80#3:172\n80#3:174\n80#3:183\n65#4:160\n69#4:163\n22#5:162\n30#6:169\n30#6:171\n30#6:173\n30#6:182\n1#7:175\n34#8,6:176\n*S KotlinDebug\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n*L\n38#1:148\n42#1:152\n63#1:156\n76#1:165\n38#1:149,3\n42#1:153,3\n63#1:157,3\n76#1:161\n76#1:164\n76#1:166,3\n102#1:170\n119#1:172\n130#1:174\n141#1:183\n76#1:160\n76#1:163\n76#1:162\n102#1:169\n119#1:171\n130#1:173\n141#1:182\n145#1:176,6\n*E\n"})
/* loaded from: classes2.dex */
public final class PointerInputTestUtilKt {
    @NotNull
    public static final PointerInputChange down(long j7, long j8, float f, float f7, @Nullable List<HistoricalChange> list) {
        PointerInputChange pointerInputChange = new PointerInputChange(PointerId.m11888constructorimpl(j7), j8, Offset.m10433constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L)), true, 1.0f, j8, Offset.m10433constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L)), false, false, 0, 0L, 1536, (AbstractC5824e) null);
        return (list == null || list.isEmpty()) ? pointerInputChange : PointerInputChange.m11897copyOHpmEuE$default(pointerInputChange, 0L, 0L, 0L, false, 0L, 0L, false, 0, list, 0L, 767, null);
    }

    public static /* synthetic */ PointerInputChange down$default(long j7, long j8, float f, float f7, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            j8 = 0;
        }
        long j9 = j8;
        float f8 = (i & 4) != 0 ? 0.0f : f;
        float f9 = (i & 8) != 0 ? 0.0f : f7;
        if ((i & 16) != 0) {
            list = null;
        }
        return down(j7, j9, f8, f9, list);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m11958invokeOverAllPassesH0pRuoY(@NotNull InterfaceC6474f interfaceC6474f, @NotNull PointerEvent pointerEvent, long j7) {
        m11962invokeOverPasseshUlJWOE(interfaceC6474f, pointerEvent, (List<? extends PointerEventPass>) AbstractC5806u.m5287z(PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final), j7);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m11959invokeOverAllPassesH0pRuoY$default(InterfaceC6474f interfaceC6474f, PointerEvent pointerEvent, long j7, int i, Object obj) {
        if ((i & 2) != 0) {
            long j8 = Integer.MAX_VALUE;
            j7 = IntSize.m13471constructorimpl((j8 & 4294967295L) | (j8 << 32));
        }
        m11958invokeOverAllPassesH0pRuoY(interfaceC6474f, pointerEvent, j7);
    }

    /* renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m11960invokeOverPasshUlJWOE(@NotNull InterfaceC6474f interfaceC6474f, @NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pointerEventPass, long j7) {
        m11962invokeOverPasseshUlJWOE(interfaceC6474f, pointerEvent, (List<? extends PointerEventPass>) AbstractC5806u.m5286y(pointerEventPass), j7);
    }

    /* renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m11961invokeOverPasshUlJWOE$default(InterfaceC6474f interfaceC6474f, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j7, int i, Object obj) {
        if ((i & 4) != 0) {
            long j8 = Integer.MAX_VALUE;
            j7 = IntSize.m13471constructorimpl((j8 & 4294967295L) | (j8 << 32));
        }
        m11960invokeOverPasshUlJWOE(interfaceC6474f, pointerEvent, pointerEventPass, j7);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m11963invokeOverPasseshUlJWOE(@NotNull InterfaceC6474f interfaceC6474f, @NotNull PointerEvent pointerEvent, @NotNull PointerEventPass[] pointerEventPassArr, long j7) {
        m11962invokeOverPasseshUlJWOE(interfaceC6474f, pointerEvent, (List<? extends PointerEventPass>) AbstractC5802q.m5204e0(pointerEventPassArr), j7);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m11965invokeOverPasseshUlJWOE$default(InterfaceC6474f interfaceC6474f, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j7, int i, Object obj) {
        if ((i & 4) != 0) {
            long j8 = Integer.MAX_VALUE;
            j7 = IntSize.m13471constructorimpl((j8 & 4294967295L) | (j8 << 32));
        }
        m11963invokeOverPasseshUlJWOE(interfaceC6474f, pointerEvent, pointerEventPassArr, j7);
    }

    @NotNull
    public static final PointerInputChange moveBy(@NotNull PointerInputChange pointerInputChange, long j7, float f, float f7) {
        long id = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        long position = pointerInputChange.getPosition();
        long uptimeMillis2 = pointerInputChange.getUptimeMillis() + j7;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerInputChange.getPosition() >> 32)) + f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerInputChange.getPosition() & 4294967295L)) + f7;
        return new PointerInputChange(id, uptimeMillis2, Offset.m10433constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), true, 1.0f, uptimeMillis, position, pressed, false, 0, 0L, 1536, (AbstractC5824e) null);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange pointerInputChange, long j7, float f, float f7, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f7 = 0.0f;
        }
        return moveBy(pointerInputChange, j7, f, f7);
    }

    @NotNull
    public static final PointerInputChange moveTo(@NotNull PointerInputChange pointerInputChange, long j7, float f, float f7) {
        return new PointerInputChange(pointerInputChange.getId(), j7, Offset.m10433constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L)), true, 1.0f, pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), false, 0, 0L, 1536, (AbstractC5824e) null);
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange pointerInputChange, long j7, float f, float f7, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f7 = 0.0f;
        }
        return moveTo(pointerInputChange, j7, f, f7);
    }

    @NotNull
    /* renamed from: up */
    public static final PointerInputChange m1349up(@NotNull PointerInputChange pointerInputChange, long j7) {
        long id = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(id, j7, pointerInputChange.getPosition(), false, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 1536, (AbstractC5824e) null);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m11962invokeOverPasseshUlJWOE(@NotNull InterfaceC6474f interfaceC6474f, @NotNull PointerEvent pointerEvent, @NotNull List<? extends PointerEventPass> list, long j7) {
        if (pointerEvent.getChanges().isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no changes");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no passes");
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            interfaceC6474f.invoke(pointerEvent, list.get(i), IntSize.m13468boximpl(j7));
        }
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m11964invokeOverPasseshUlJWOE$default(InterfaceC6474f interfaceC6474f, PointerEvent pointerEvent, List list, long j7, int i, Object obj) {
        if ((i & 4) != 0) {
            long j8 = Integer.MAX_VALUE;
            j7 = IntSize.m13471constructorimpl((j8 & 4294967295L) | (j8 << 32));
        }
        m11962invokeOverPasseshUlJWOE(interfaceC6474f, pointerEvent, (List<? extends PointerEventPass>) list, j7);
    }
}
