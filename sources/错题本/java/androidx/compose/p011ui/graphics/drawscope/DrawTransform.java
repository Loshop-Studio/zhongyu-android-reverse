package androidx.compose.p011ui.graphics.drawscope;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Path;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@DrawScopeMarker
@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJD\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH&ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\nH&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0017H&ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010 \u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0017H&ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010%\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u001a\u0010)\u001a\u00020&8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010+\u001a\u00020\u00178VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b*\u0010(ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006,À\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "", "left", "top", "right", "bottom", "Ld6/s;", "inset", "(FFFF)V", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "translate", "(FF)V", "degrees", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotate-Uv8p0NA", "(FJ)V", "rotate", "scaleX", "scaleY", "scale-0AR0LA0", "(FFJ)V", "scale", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "size", "getCenter-F1C5BW0", "center", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransform\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,164:1\n57#2:165\n61#2:168\n57#2:174\n61#2:177\n60#3:166\n70#3:169\n53#3,3:171\n60#3:175\n70#3:178\n22#4:167\n22#4:176\n22#4:179\n30#5:170\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransform\n*L\n80#1:165\n80#1:168\n111#1:174\n112#1:177\n80#1:166\n80#1:169\n80#1:171,3\n111#1:175\n112#1:178\n80#1:167\n111#1:176\n112#1:179\n80#1:170\n*E\n"})
/* loaded from: classes.dex */
public interface DrawTransform {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m11295getCenterF1C5BW0(@NotNull DrawTransform drawTransform) {
            return DrawTransform.super.mo11158getCenterF1C5BW0();
        }
    }

    /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m11289clipPathmtrdDE$default(DrawTransform drawTransform, Path path, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i8 & 2) != 0) {
            i = ClipOp.INSTANCE.m10671getIntersectrtfAjoo();
        }
        drawTransform.mo11156clipPathmtrdDE(path, i);
    }

    /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m11290clipRectN_I0leg$default(DrawTransform drawTransform, float f, float f7, float f8, float f9, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i8 & 1) != 0) {
            f = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f7 = 0.0f;
        }
        if ((i8 & 4) != 0) {
            f8 = Float.intBitsToFloat((int) (drawTransform.mo11159getSizeNHjbRc() >> 32));
        }
        if ((i8 & 8) != 0) {
            f9 = Float.intBitsToFloat((int) (drawTransform.mo11159getSizeNHjbRc() & 4294967295L));
        }
        if ((i8 & 16) != 0) {
            i = ClipOp.INSTANCE.m10671getIntersectrtfAjoo();
        }
        drawTransform.mo11157clipRectN_I0leg(f, f7, f8, f9, i);
    }

    /* renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m11291rotateUv8p0NA$default(DrawTransform drawTransform, float f, long j7, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j7 = drawTransform.mo11158getCenterF1C5BW0();
        }
        drawTransform.mo11160rotateUv8p0NA(f, j7);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    static /* synthetic */ void m11292scale0AR0LA0$default(DrawTransform drawTransform, float f, float f7, long j7, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i & 4) != 0) {
            j7 = drawTransform.mo11158getCenterF1C5BW0();
        }
        drawTransform.mo11161scale0AR0LA0(f, f7, j7);
    }

    static /* synthetic */ void translate$default(DrawTransform drawTransform, float f, float f7, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f7 = 0.0f;
        }
        drawTransform.translate(f, f7);
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo11156clipPathmtrdDE(@NotNull Path path, int clipOp);

    /* renamed from: clipRect-N_I0leg */
    void mo11157clipRectN_I0leg(float left, float top2, float right, float bottom, int clipOp);

    /* renamed from: getCenter-F1C5BW0 */
    default long mo11158getCenterF1C5BW0() {
        float f = 2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (mo11159getSizeNHjbRc() >> 32)) / f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (mo11159getSizeNHjbRc() & 4294967295L)) / f;
        return Offset.m10433constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: getSize-NH-jbRc */
    long mo11159getSizeNHjbRc();

    void inset(float left, float top2, float right, float bottom);

    /* renamed from: rotate-Uv8p0NA */
    void mo11160rotateUv8p0NA(float degrees, long pivot);

    /* renamed from: scale-0AR0LA0 */
    void mo11161scale0AR0LA0(float scaleX, float scaleY, long pivot);

    /* renamed from: transform-58bKbWc */
    void mo11162transform58bKbWc(@NotNull float[] matrix);

    void translate(float left, float top2);
}
