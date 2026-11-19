package androidx.compose.p009ui.graphics.drawscope;

import androidx.compose.p009ui.graphics.DegreesKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0003H\u0086\b\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0086\b\u001a)\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m7880d2 = {"inset", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "horizontal", "vertical", "rotateRad", "radians", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotateRad-0AR0LA0", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FJ)V", "scale", "scale-0AR0LA0", "ui-graphics_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,164:1\n37#1:165\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n46#1:165\n*E\n"})
/* loaded from: classes2.dex */
public final class DrawTransformKt {
    public static final void inset(DrawTransform drawTransform, float f6, float f7) {
        drawTransform.inset(f6, f7, f6, f7);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f6, float f7, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i6 & 2) != 0) {
            f7 = 0.0f;
        }
        drawTransform.inset(f6, f7, f6, f7);
    }

    /* renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m14515rotateRad0AR0LA0(DrawTransform drawTransform, float f6, long j6) {
        drawTransform.mo14377rotateUv8p0NA(DegreesKt.degrees(f6), j6);
    }

    /* renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m14516rotateRad0AR0LA0$default(DrawTransform drawTransform, float f6, long j6, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            j6 = drawTransform.mo14375getCenterF1C5BW0();
        }
        drawTransform.mo14377rotateUv8p0NA(DegreesKt.degrees(f6), j6);
    }

    /* renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m14517scale0AR0LA0(DrawTransform drawTransform, float f6, long j6) {
        drawTransform.mo14378scale0AR0LA0(f6, f6, j6);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m14518scale0AR0LA0$default(DrawTransform drawTransform, float f6, long j6, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            j6 = drawTransform.mo14375getCenterF1C5BW0();
        }
        drawTransform.mo14378scale0AR0LA0(f6, f6, j6);
    }

    public static final void inset(DrawTransform drawTransform, float f6) {
        drawTransform.inset(f6, f6, f6, f6);
    }
}
