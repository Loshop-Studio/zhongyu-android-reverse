package androidx.compose.p013ui.graphics.drawscope;

import androidx.compose.p013ui.graphics.DegreesKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0003H\u0086\b\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0086\b\u001a)\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m13558d2 = {"inset", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "horizontal", "vertical", "rotateRad", "radians", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotateRad-0AR0LA0", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FJ)V", "scale", "scale-0AR0LA0", "ui-graphics_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,164:1\n37#1:165\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n46#1:165\n*E\n"})
/* loaded from: classes2.dex */
public final class DrawTransformKt {
    public static final void inset(DrawTransform drawTransform, float f10, float f11) {
        drawTransform.inset(f10, f11, f10, f11);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        drawTransform.inset(f10, f11, f10, f11);
    }

    /* renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m21592rotateRad0AR0LA0(DrawTransform drawTransform, float f10, long j10) {
        drawTransform.mo21454rotateUv8p0NA(DegreesKt.degrees(f10), j10);
    }

    /* renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m21593rotateRad0AR0LA0$default(DrawTransform drawTransform, float f10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawTransform.mo21452getCenterF1C5BW0();
        }
        drawTransform.mo21454rotateUv8p0NA(DegreesKt.degrees(f10), j10);
    }

    /* renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m21594scale0AR0LA0(DrawTransform drawTransform, float f10, long j10) {
        drawTransform.mo21455scale0AR0LA0(f10, f10, j10);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m21595scale0AR0LA0$default(DrawTransform drawTransform, float f10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawTransform.mo21452getCenterF1C5BW0();
        }
        drawTransform.mo21455scale0AR0LA0(f10, f10, j10);
    }

    public static final void inset(DrawTransform drawTransform, float f10) {
        drawTransform.inset(f10, f10, f10, f10);
    }
}
