package androidx.compose.foundation.text.input.internal;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u000b\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u001a\u001e\u0010\r\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, m13558d2 = {"coerceIn", "Landroidx/compose/ui/geometry/Offset;", "rect", "Landroidx/compose/ui/geometry/Rect;", "coerceIn-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)J", "fromDecorationToTextLayout", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", TypedValues.CycleType.S_WAVE_OFFSET, "fromDecorationToTextLayout-Uv8p0NA", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;J)J", "fromTextLayoutToCore", "fromTextLayoutToCore-Uv8p0NA", "fromWindowToDecoration", "fromWindowToDecoration-Uv8p0NA", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutStateKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n65#2:251\n65#2:254\n65#2:257\n69#2:260\n69#2:263\n69#2:266\n60#3:252\n60#3:255\n60#3:258\n70#3:261\n70#3:264\n70#3:267\n53#3,3:270\n22#4:253\n22#4:256\n22#4:259\n22#4:262\n22#4:265\n22#4:268\n30#5:269\n1#6:273\n*S KotlinDebug\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutStateKt\n*L\n200#1:251\n201#1:254\n202#1:257\n206#1:260\n207#1:263\n208#1:266\n200#1:252\n201#1:255\n202#1:258\n206#1:261\n207#1:264\n208#1:267\n210#1:270,3\n200#1:253\n201#1:256\n202#1:259\n206#1:262\n207#1:265\n208#1:268\n210#1:269\n*E\n"})
/* loaded from: classes.dex */
public final class TextLayoutStateKt {
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m18259coerceIn3MmeM6k(long j10, Rect rect) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return Offset.m20727constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i10) < rect.getLeft() ? rect.getLeft() : Float.intBitsToFloat(i10) > rect.getRight() ? rect.getRight() : Float.intBitsToFloat(i10)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i11) < rect.getTop() ? rect.getTop() : Float.intBitsToFloat(i11) > rect.getBottom() ? rect.getBottom() : Float.intBitsToFloat(i11)) & 4294967295L));
    }

    /* renamed from: fromDecorationToTextLayout-Uv8p0NA, reason: not valid java name */
    public static final long m18260fromDecorationToTextLayoutUv8p0NA(TextLayoutState textLayoutState, long j10) {
        Offset offsetM20724boximpl;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
            if (decoratorNodeCoordinates != null) {
                offsetM20724boximpl = Offset.m20724boximpl((textLayoutNodeCoordinates.isAttached() && decoratorNodeCoordinates.isAttached()) ? textLayoutNodeCoordinates.mo22333localPositionOfR5De75A(decoratorNodeCoordinates, j10) : j10);
            } else {
                offsetM20724boximpl = null;
            }
            if (offsetM20724boximpl != null) {
                return offsetM20724boximpl.m20745unboximpl();
            }
        }
        return j10;
    }

    /* renamed from: fromTextLayoutToCore-Uv8p0NA, reason: not valid java name */
    public static final long m18261fromTextLayoutToCoreUv8p0NA(TextLayoutState textLayoutState, long j10) {
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            Offset offsetM20724boximpl = null;
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                LayoutCoordinates coreNodeCoordinates = textLayoutState.getCoreNodeCoordinates();
                if (coreNodeCoordinates != null) {
                    if (!coreNodeCoordinates.isAttached()) {
                        coreNodeCoordinates = null;
                    }
                    if (coreNodeCoordinates != null) {
                        offsetM20724boximpl = Offset.m20724boximpl(coreNodeCoordinates.mo22333localPositionOfR5De75A(textLayoutNodeCoordinates, j10));
                    }
                }
                if (offsetM20724boximpl != null) {
                    return offsetM20724boximpl.m20745unboximpl();
                }
            }
        }
        return j10;
    }

    /* renamed from: fromWindowToDecoration-Uv8p0NA, reason: not valid java name */
    public static final long m18262fromWindowToDecorationUv8p0NA(TextLayoutState textLayoutState, long j10) {
        LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        return (decoratorNodeCoordinates == null || !decoratorNodeCoordinates.isAttached()) ? j10 : decoratorNodeCoordinates.mo22341windowToLocalMKHz9U(j10);
    }
}
