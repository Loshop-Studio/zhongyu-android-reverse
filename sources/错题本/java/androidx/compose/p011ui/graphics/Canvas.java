package androidx.compose.p011ui.graphics;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u0017\u0010\u0010J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH&ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010%\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J<\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b*\u0010+J$\u00100\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010\"\u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b.\u0010/J*\u00106\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u0010\u000bJ7\u00107\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b7\u00108JG\u0010;\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010\u000bJ7\u0010=\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b=\u00108J*\u0010B\u001a\u00020\u00022\u0006\u0010>\u001a\u0002012\u0006\u0010?\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ7\u0010G\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010C\u001a\u00020\f2\u0006\u0010D\u001a\u00020\f2\u0006\u0010F\u001a\u00020E2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\bG\u0010HJO\u0010G\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f2\u0006\u0010D\u001a\u00020\f2\u0006\u0010F\u001a\u00020E2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\bG\u0010IJ7\u0010L\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010J\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f2\u0006\u0010F\u001a\u00020E2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\bL\u0010HJ\u001f\u0010M\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\bM\u0010NJ*\u0010T\u001a\u00020\u00022\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u0002012\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bR\u0010SJJ\u0010]\u001a\u00020\u00022\u0006\u0010P\u001a\u00020O2\b\b\u0002\u0010V\u001a\u00020U2\b\b\u0002\u0010X\u001a\u00020W2\b\b\u0002\u0010Y\u001a\u00020U2\b\b\u0002\u0010Z\u001a\u00020W2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J0\u0010d\u001a\u00020\u00022\u0006\u0010_\u001a\u00020^2\f\u0010a\u001a\b\u0012\u0004\u0012\u0002010`2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bb\u0010cJ*\u0010h\u001a\u00020\u00022\u0006\u0010_\u001a\u00020^2\u0006\u0010a\u001a\u00020e2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bf\u0010gJ*\u0010o\u001a\u00020\u00022\u0006\u0010j\u001a\u00020i2\u0006\u0010l\u001a\u00020k2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bm\u0010nJ\u000f\u0010p\u001a\u00020\u0002H&¢\u0006\u0004\bp\u0010\u0004J\u000f\u0010q\u001a\u00020\u0002H&¢\u0006\u0004\bq\u0010\u0004ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006rÀ\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/graphics/Canvas;", "", "Ld6/s;", "save", "()V", RequestParameters.X_OSS_RESTORE, "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/graphics/Paint;", "paint", "saveLayer", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;)V", "", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "skew", "sxRad", "syRad", "skewRad", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", "rect", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-mtrdD-E", "(Landroidx/compose/ui/geometry/Rect;I)V", "clipRect", "left", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroidx/compose/ui/geometry/Offset;", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "(FFFFLandroidx/compose/ui/graphics/Paint;)V", "radiusX", "radiusY", "drawRoundRect", "(FFFFFFLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "center", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", "(Landroidx/compose/ui/geometry/Rect;FFZLandroidx/compose/ui/graphics/Paint;)V", "(FFFFFFZLandroidx/compose/ui/graphics/Paint;)V", "startAngleRad", "sweepAngleRad", "drawArcRad", "drawPath", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "", "points", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawPoints", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "enableZ", "disableZ", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCanvas.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Canvas.kt\nandroidx/compose/ui/graphics/Canvas\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,540:1\n30#2:541\n80#3:542\n*S KotlinDebug\n*F\n+ 1 Canvas.kt\nandroidx/compose/ui/graphics/Canvas\n*L\n494#1:541\n494#1:542\n*E\n"})
/* loaded from: classes.dex */
public interface Canvas {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
        public static void m10660clipRectmtrdDE(@NotNull Canvas canvas, @NotNull Rect rect, int i) {
            Canvas.super.m10657clipRectmtrdDE(rect, i);
        }

        @Deprecated
        public static void drawArc(@NotNull Canvas canvas, @NotNull Rect rect, float f, float f7, boolean z8, @NotNull Paint paint) {
            Canvas.super.drawArc(rect, f, f7, z8, paint);
        }

        @Deprecated
        public static void drawArcRad(@NotNull Canvas canvas, @NotNull Rect rect, float f, float f7, boolean z8, @NotNull Paint paint) {
            Canvas.super.drawArcRad(rect, f, f7, z8, paint);
        }

        @Deprecated
        public static void drawOval(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull Paint paint) {
            Canvas.super.drawOval(rect, paint);
        }

        @Deprecated
        public static void drawRect(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull Paint paint) {
            Canvas.super.drawRect(rect, paint);
        }

        @Deprecated
        public static void skewRad(@NotNull Canvas canvas, float f, float f7) {
            Canvas.super.skewRad(f, f7);
        }
    }

    /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m10653clipPathmtrdDE$default(Canvas canvas, Path path, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i8 & 2) != 0) {
            i = ClipOp.INSTANCE.m10671getIntersectrtfAjoo();
        }
        canvas.mo10535clipPathmtrdDE(path, i);
    }

    /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m10654clipRectN_I0leg$default(Canvas canvas, float f, float f7, float f8, float f9, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i8 & 16) != 0) {
            i = ClipOp.INSTANCE.m10671getIntersectrtfAjoo();
        }
        canvas.mo10536clipRectN_I0leg(f, f7, f8, f9, i);
    }

    /* renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m10655clipRectmtrdDE$default(Canvas canvas, Rect rect, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i8 & 2) != 0) {
            i = ClipOp.INSTANCE.m10671getIntersectrtfAjoo();
        }
        canvas.m10657clipRectmtrdDE(rect, i);
    }

    /* renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
    static /* synthetic */ void m10656drawImageRectHPBpro0$default(Canvas canvas, ImageBitmap imageBitmap, long j7, long j8, long j9, long j10, Paint paint, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        long jM13444getZeronOccac = (i & 2) != 0 ? IntOffset.INSTANCE.m13444getZeronOccac() : j7;
        long jM13471constructorimpl = (i & 4) != 0 ? IntSize.m13471constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j8;
        canvas.mo10540drawImageRectHPBpro0(imageBitmap, jM13444getZeronOccac, jM13471constructorimpl, (i & 8) != 0 ? IntOffset.INSTANCE.m13444getZeronOccac() : j9, (i & 16) != 0 ? jM13471constructorimpl : j10, paint);
    }

    static /* synthetic */ void scale$default(Canvas canvas, float f, float f7, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i & 2) != 0) {
            f7 = f;
        }
        canvas.scale(f, f7);
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo10535clipPathmtrdDE(@NotNull Path path, int clipOp);

    /* renamed from: clipRect-N_I0leg */
    void mo10536clipRectN_I0leg(float left, float top2, float right, float bottom, int clipOp);

    /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
    default void m10657clipRectmtrdDE(@NotNull Rect rect, int clipOp) {
        mo10536clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), clipOp);
    }

    /* renamed from: concat-58bKbWc */
    void mo10537concat58bKbWc(@NotNull float[] matrix);

    void disableZ();

    void drawArc(float left, float top2, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint);

    default void drawArc(@NotNull Rect rect, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint) {
        drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), startAngle, sweepAngle, useCenter, paint);
    }

    default void drawArcRad(@NotNull Rect rect, float startAngleRad, float sweepAngleRad, boolean useCenter, @NotNull Paint paint) {
        drawArc(rect, DegreesKt.degrees(startAngleRad), DegreesKt.degrees(sweepAngleRad), useCenter, paint);
    }

    /* renamed from: drawCircle-9KIMszo */
    void mo10538drawCircle9KIMszo(long center, float radius, @NotNull Paint paint);

    /* renamed from: drawImage-d-4ec7I */
    void mo10539drawImaged4ec7I(@NotNull ImageBitmap image, long topLeftOffset, @NotNull Paint paint);

    /* renamed from: drawImageRect-HPBpro0 */
    void mo10540drawImageRectHPBpro0(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @NotNull Paint paint);

    /* renamed from: drawLine-Wko1d7g */
    void mo10541drawLineWko1d7g(long p1, long p22, @NotNull Paint paint);

    void drawOval(float left, float top2, float right, float bottom, @NotNull Paint paint);

    default void drawOval(@NotNull Rect rect, @NotNull Paint paint) {
        drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawPath(@NotNull Path path, @NotNull Paint paint);

    /* renamed from: drawPoints-O7TthRY */
    void mo10542drawPointsO7TthRY(int pointMode, @NotNull List<Offset> points, @NotNull Paint paint);

    /* renamed from: drawRawPoints-O7TthRY */
    void mo10543drawRawPointsO7TthRY(int pointMode, @NotNull float[] points, @NotNull Paint paint);

    void drawRect(float left, float top2, float right, float bottom, @NotNull Paint paint);

    default void drawRect(@NotNull Rect rect, @NotNull Paint paint) {
        drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawRoundRect(float left, float top2, float right, float bottom, float radiusX, float radiusY, @NotNull Paint paint);

    /* renamed from: drawVertices-TPEHhCM */
    void mo10544drawVerticesTPEHhCM(@NotNull Vertices vertices, int blendMode, @NotNull Paint paint);

    void enableZ();

    void restore();

    void rotate(float degrees);

    void save();

    void saveLayer(@NotNull Rect bounds, @NotNull Paint paint);

    void scale(float sx, float sy);

    void skew(float sx, float sy);

    default void skewRad(float sxRad, float syRad) {
        skew(DegreesKt.degrees(sxRad), DegreesKt.degrees(syRad));
    }

    void translate(float dx, float dy);
}
