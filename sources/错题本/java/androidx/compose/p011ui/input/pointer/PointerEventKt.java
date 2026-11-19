package androidx.compose.p011ui.input.pointer;

import androidx.compose.p011ui.geometry.Offset;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0003\u001a\u0013\u0010\u0011\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0003\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u00020\u0012*\u00020\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0012*\u00020\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001e\u0010\u001b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a$\u0010\u001b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010!\u001a\u00020 *\u00020\u0001H\u0082\b¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "changedToDown", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z", "changedToDownIgnoreConsumed", "changedToUp", "changedToUpIgnoreConsumed", "positionChanged", "positionChangedIgnoreConsumed", "Landroidx/compose/ui/geometry/Offset;", "positionChange", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J", "positionChangeIgnoreConsumed", "ignoreConsumed", "positionChangeInternal", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J", "positionChangeConsumed", "anyChangeConsumed", "Ld6/s;", "consumeDownChange", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "consumePositionChange", "consumeAllChanges", "Landroidx/compose/ui/unit/IntSize;", "size", "isOutOfBounds-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z", "isOutOfBounds", "Landroidx/compose/ui/geometry/Size;", "extendedTouchPadding", "isOutOfBounds-jwHxaWs", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z", "", "toInt", "(Z)I", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPointerEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.kt\nandroidx/compose/ui/input/pointer/PointerEventKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1054:1\n1053#1:1065\n65#2:1055\n69#2:1058\n65#2:1066\n69#2:1069\n60#3:1056\n70#3:1059\n85#3:1062\n90#3:1064\n60#3:1067\n70#3:1070\n60#3:1073\n85#3:1076\n70#3:1078\n90#3:1081\n22#4:1057\n22#4:1060\n22#4:1068\n22#4:1071\n22#4:1074\n22#4:1079\n54#5:1061\n59#5:1063\n54#5:1075\n59#5:1080\n57#6:1072\n61#6:1077\n*S KotlinDebug\n*F\n+ 1 PointerEvent.kt\nandroidx/compose/ui/input/pointer/PointerEventKt\n*L\n1035#1:1065\n1017#1:1055\n1018#1:1058\n1038#1:1066\n1039#1:1069\n1017#1:1056\n1018#1:1059\n1019#1:1062\n1020#1:1064\n1038#1:1067\n1039#1:1070\n1042#1:1073\n1043#1:1076\n1046#1:1078\n1047#1:1081\n1017#1:1057\n1018#1:1060\n1038#1:1068\n1039#1:1071\n1042#1:1074\n1046#1:1079\n1019#1:1061\n1020#1:1063\n1043#1:1075\n1047#1:1080\n1042#1:1072\n1046#1:1077\n*E\n"})
/* loaded from: classes2.dex */
public final class PointerEventKt {
    @Deprecated(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @ReplaceWith(expression = "isConsumed", imports = {}))
    public static final boolean anyChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final boolean changedToDown(@NotNull PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(@NotNull PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    @Deprecated(message = "Use consume() instead", replaceWith = @ReplaceWith(expression = "consume()", imports = {}))
    public static final void consumeAllChanges(@NotNull PointerInputChange pointerInputChange) {
        pointerInputChange.consume();
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @ReplaceWith(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void consumeDownChange(@NotNull PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @ReplaceWith(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void consumePositionChange(@NotNull PointerInputChange pointerInputChange) {
        if (Offset.m10438equalsimpl0(positionChange(pointerInputChange), Offset.INSTANCE.m10457getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.consume();
    }

    @Deprecated(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @ReplaceWith(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    /* renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m11852isOutOfBoundsO0kMr_c(@NotNull PointerInputChange pointerInputChange, long j7) {
        long jM11908getPositionF1C5BW0 = pointerInputChange.getPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM11908getPositionF1C5BW0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM11908getPositionF1C5BW0 & 4294967295L));
        int i = (int) (j7 >> 32);
        int i8 = (int) (j7 & 4294967295L);
        return (fIntBitsToFloat > ((float) i)) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) i8));
    }

    /* renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m11853isOutOfBoundsjwHxaWs(@NotNull PointerInputChange pointerInputChange, long j7, long j8) {
        boolean zM11979equalsimpl0 = PointerType.m11979equalsimpl0(pointerInputChange.getType(), PointerType.INSTANCE.m11986getTouchT8wyACA());
        long jM11908getPositionF1C5BW0 = pointerInputChange.getPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM11908getPositionF1C5BW0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM11908getPositionF1C5BW0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j8 >> 32));
        float f = zM11979equalsimpl0 ? 1.0f : 0.0f;
        float f7 = fIntBitsToFloat3 * f;
        float f8 = ((int) (j7 >> 32)) + f7;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j8 & 4294967295L)) * f;
        return (fIntBitsToFloat > f8) | (fIntBitsToFloat < (-f7)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j7 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long positionChange(@NotNull PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, false);
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @ReplaceWith(expression = "isConsumed", imports = {}))
    public static final boolean positionChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z8) {
        return (z8 || !pointerInputChange.isConsumed()) ? Offset.m10445minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition()) : Offset.INSTANCE.m10457getZeroF1C5BW0();
    }

    public static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = false;
        }
        return positionChangeInternal(pointerInputChange, z8);
    }

    public static final boolean positionChanged(@NotNull PointerInputChange pointerInputChange) {
        return !Offset.m10438equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.INSTANCE.m10457getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        return !Offset.m10438equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.INSTANCE.m10457getZeroF1C5BW0());
    }

    private static final int toInt(boolean z8) {
        return z8 ? 1 : 0;
    }
}
