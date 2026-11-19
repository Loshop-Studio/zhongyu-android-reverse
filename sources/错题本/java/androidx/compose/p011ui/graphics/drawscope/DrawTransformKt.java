package androidx.compose.p011ui.graphics.drawscope;

import androidx.compose.p011ui.graphics.DegreesKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a(\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0007\u001a)\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, m5110d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "horizontal", "vertical", "Ld6/s;", "inset", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FF)V", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;F)V", "radians", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotateRad-0AR0LA0", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FJ)V", "rotateRad", "scale", "scale-0AR0LA0", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,164:1\n37#1:165\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n46#1:165\n*E\n"})
/* loaded from: classes.dex */
public final class DrawTransformKt {
    public static final void inset(@NotNull DrawTransform drawTransform, float f, float f7) {
        drawTransform.inset(f, f7, f, f7);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f7 = 0.0f;
        }
        drawTransform.inset(f, f7, f, f7);
    }

    /* renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m11298rotateRad0AR0LA0(@NotNull DrawTransform drawTransform, float f, long j7) {
        drawTransform.mo11160rotateUv8p0NA(DegreesKt.degrees(f), j7);
    }

    /* renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m11299rotateRad0AR0LA0$default(DrawTransform drawTransform, float f, long j7, int i, Object obj) {
        if ((i & 2) != 0) {
            j7 = drawTransform.mo11158getCenterF1C5BW0();
        }
        drawTransform.mo11160rotateUv8p0NA(DegreesKt.degrees(f), j7);
    }

    /* renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m11300scale0AR0LA0(@NotNull DrawTransform drawTransform, float f, long j7) {
        drawTransform.mo11161scale0AR0LA0(f, f, j7);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m11301scale0AR0LA0$default(DrawTransform drawTransform, float f, long j7, int i, Object obj) {
        if ((i & 2) != 0) {
            j7 = drawTransform.mo11158getCenterF1C5BW0();
        }
        drawTransform.mo11161scale0AR0LA0(f, f, j7);
    }

    public static final void inset(@NotNull DrawTransform drawTransform, float f) {
        drawTransform.inset(f, f, f, f);
    }
}
