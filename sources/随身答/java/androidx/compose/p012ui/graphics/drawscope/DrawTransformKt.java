package androidx.compose.p012ui.graphics.drawscope;

import androidx.compose.p012ui.graphics.DegreesKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0003H\u0086\b\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0086\b\u001a)\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m13413d2 = {"inset", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "horizontal", "vertical", "rotateRad", "radians", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotateRad-0AR0LA0", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FJ)V", "scale", "scale-0AR0LA0", "ui-graphics_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,164:1\n37#1:165\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n46#1:165\n*E\n"})
/* loaded from: classes2.dex */
public final class DrawTransformKt {
    public static final void inset(DrawTransform drawTransform, float f10, float f11) {
        drawTransform.inset(f10, f11, f10, f11);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f10, float f11, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i9 & 2) != 0) {
            f11 = 0.0f;
        }
        drawTransform.inset(f10, f11, f10, f11);
    }

    /* renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m22025rotateRad0AR0LA0(DrawTransform drawTransform, float f10, long j9) {
        drawTransform.mo21887rotateUv8p0NA(DegreesKt.degrees(f10), j9);
    }

    /* renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m22026rotateRad0AR0LA0$default(DrawTransform drawTransform, float f10, long j9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j9 = drawTransform.mo21885getCenterF1C5BW0();
        }
        drawTransform.mo21887rotateUv8p0NA(DegreesKt.degrees(f10), j9);
    }

    /* renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m22027scale0AR0LA0(DrawTransform drawTransform, float f10, long j9) {
        drawTransform.mo21888scale0AR0LA0(f10, f10, j9);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m22028scale0AR0LA0$default(DrawTransform drawTransform, float f10, long j9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j9 = drawTransform.mo21885getCenterF1C5BW0();
        }
        drawTransform.mo21888scale0AR0LA0(f10, f10, j9);
    }

    public static final void inset(DrawTransform drawTransform, float f10) {
        drawTransform.inset(f10, f10, f10, f10);
    }
}
