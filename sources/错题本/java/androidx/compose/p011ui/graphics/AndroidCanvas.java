package androidx.compose.p011ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.PointMode;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010&\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\"\u0010+\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0014\u0010/\u001a\u00020,*\u00020\"ø\u0001\u0000¢\u0006\u0004\b-\u0010.J*\u00105\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J7\u00106\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u00107JG\u0010:\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b:\u0010;J7\u0010<\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u00107J*\u0010A\u001a\u00020\u00042\u0006\u0010=\u001a\u0002002\u0006\u0010>\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b?\u0010@JO\u0010F\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020\r2\u0006\u0010E\u001a\u00020D2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010H\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bH\u0010IJ*\u0010O\u001a\u00020\u00042\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u0002002\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bM\u0010NJB\u0010X\u001a\u00020\u00042\u0006\u0010K\u001a\u00020J2\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020P2\u0006\u0010U\u001a\u00020R2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ0\u0010_\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020Y2\f\u0010\\\u001a\b\u0012\u0004\u0012\u0002000[2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b]\u0010^J\u000f\u0010`\u001a\u00020\u0004H\u0016¢\u0006\u0004\b`\u0010\u0003J\u000f\u0010a\u001a\u00020\u0004H\u0016¢\u0006\u0004\ba\u0010\u0003J*\u0010e\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020b2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bc\u0010dJ*\u0010l\u001a\u00020\u00042\u0006\u0010g\u001a\u00020f2\u0006\u0010i\u001a\u00020h2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bj\u0010kJ%\u0010_\u001a\u00020\u00042\f\u0010\\\u001a\b\u0012\u0004\u0012\u0002000[2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b_\u0010mJ-\u0010p\u001a\u00020\u00042\f\u0010\\\u001a\b\u0012\u0004\u0012\u0002000[2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bp\u0010qJ'\u0010e\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\be\u0010rJ'\u0010s\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bs\u0010rR,\u0010v\u001a\u00060tj\u0002`u8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bv\u0010w\u0012\u0004\b|\u0010\u0003\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001a\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0081\u0001"}, m5110d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "<init>", "()V", "Ld6/s;", "save", RequestParameters.X_OSS_RESTORE, "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/graphics/Paint;", "paint", "saveLayer", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;)V", "", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "skew", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", "left", "top", "right", "bottom", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "toRegionOp", "Landroidx/compose/ui/geometry/Offset;", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "(FFFFLandroidx/compose/ui/graphics/Paint;)V", "radiusX", "radiusY", "drawRoundRect", "(FFFFFFLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "center", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", "(FFFFFFZLandroidx/compose/ui/graphics/Paint;)V", "drawPath", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "", "points", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawPoints", "enableZ", "disableZ", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "(Ljava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "", "stepBy", "drawLines", "(Ljava/util/List;Landroidx/compose/ui/graphics/Paint;I)V", "([FLandroidx/compose/ui/graphics/Paint;I)V", "drawRawLines", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "internalCanvas", "Landroid/graphics/Canvas;", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "Landroid/graphics/Rect;", "srcRect", "Landroid/graphics/Rect;", "dstRect", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@PublishedApi
@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,372:1\n36#2,5:373\n36#2,5:388\n65#3:378\n69#3:381\n65#3:383\n69#3:386\n65#3:393\n69#3:396\n65#3:411\n69#3:414\n65#3:417\n69#3:420\n60#4:379\n70#4:382\n60#4:384\n70#4:387\n60#4:394\n70#4:397\n85#4:400\n90#4:402\n85#4:404\n90#4:406\n60#4:412\n70#4:415\n60#4:418\n70#4:421\n22#5:380\n22#5:385\n22#5:395\n22#5:398\n22#5:413\n22#5:419\n54#6:399\n59#6:401\n54#6:403\n59#6:405\n34#7,4:407\n39#7:416\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n128#1:373,5\n199#1:388,5\n139#1:378\n139#1:381\n172#1:383\n172#1:386\n206#1:393\n207#1:396\n271#1:411\n271#1:414\n293#1:417\n293#1:420\n139#1:379\n139#1:382\n172#1:384\n172#1:387\n206#1:394\n207#1:397\n233#1:400\n234#1:402\n239#1:404\n240#1:406\n271#1:412\n271#1:415\n293#1:418\n293#1:421\n139#1:380\n172#1:385\n206#1:395\n207#1:398\n271#1:413\n293#1:419\n233#1:399\n234#1:401\n239#1:403\n240#1:405\n270#1:407,4\n270#1:416\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidCanvas implements Canvas {

    @Nullable
    private Rect dstRect;

    @NotNull
    private Canvas internalCanvas = AndroidCanvas_androidKt.EmptyCanvas;

    @Nullable
    private Rect srcRect;

    private final void drawLines(List<Offset> points, Paint paint, int stepBy) {
        if (points.size() >= 2) {
            Paint paintAsFrameworkPaint = paint.asFrameworkPaint();
            int i = 0;
            while (i < points.size() - 1) {
                long jM10451unboximpl = points.get(i).m10451unboximpl();
                long jM10451unboximpl2 = points.get(i + 1).m10451unboximpl();
                this.internalCanvas.drawLine(Float.intBitsToFloat((int) (jM10451unboximpl >> 32)), Float.intBitsToFloat((int) (jM10451unboximpl & 4294967295L)), Float.intBitsToFloat((int) (jM10451unboximpl2 >> 32)), Float.intBitsToFloat((int) (jM10451unboximpl2 & 4294967295L)), paintAsFrameworkPaint);
                i += stepBy;
            }
        }
    }

    private final void drawPoints(List<Offset> points, Paint paint) {
        int size = points.size();
        for (int i = 0; i < size; i++) {
            long jM10451unboximpl = points.get(i).m10451unboximpl();
            this.internalCanvas.drawPoint(Float.intBitsToFloat((int) (jM10451unboximpl >> 32)), Float.intBitsToFloat((int) (jM10451unboximpl & 4294967295L)), paint.asFrameworkPaint());
        }
    }

    private final void drawRawLines(float[] points, Paint paint, int stepBy) {
        if (points.length < 4 || points.length % 2 != 0) {
            return;
        }
        Paint paintAsFrameworkPaint = paint.asFrameworkPaint();
        int i = 0;
        while (i < points.length - 3) {
            this.internalCanvas.drawLine(points[i], points[i + 1], points[i + 2], points[i + 3], paintAsFrameworkPaint);
            i += stepBy * 2;
        }
    }

    private final void drawRawPoints(float[] points, Paint paint, int stepBy) {
        if (points.length % 2 == 0) {
            Paint paintAsFrameworkPaint = paint.asFrameworkPaint();
            int i = 0;
            while (i < points.length - 1) {
                this.internalCanvas.drawPoint(points[i], points[i + 1], paintAsFrameworkPaint);
                i += stepBy;
            }
        }
    }

    @PublishedApi
    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo10535clipPathmtrdDE(@NotNull Path path, int clipOp) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).getInternalPath(), m10545toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo10536clipRectN_I0leg(float left, float top2, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top2, right, bottom, m10545toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo10537concat58bKbWc(@NotNull float[] matrix) {
        if (MatrixKt.m10937isIdentity58bKbWc(matrix)) {
            return;
        }
        Matrix matrix2 = new Matrix();
        AndroidMatrixConversions_androidKt.m10552setFromEL8BTi8(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void drawArc(float left, float top2, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint) {
        this.internalCanvas.drawArc(left, top2, right, bottom, startAngle, sweepAngle, useCenter, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo10538drawCircle9KIMszo(long center, float radius, @NotNull Paint paint) {
        this.internalCanvas.drawCircle(Float.intBitsToFloat((int) (center >> 32)), Float.intBitsToFloat((int) (center & 4294967295L)), radius, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo10539drawImaged4ec7I(@NotNull ImageBitmap image, long topLeftOffset, @NotNull Paint paint) {
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(image), Float.intBitsToFloat((int) (topLeftOffset >> 32)), Float.intBitsToFloat((int) (topLeftOffset & 4294967295L)), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo10540drawImageRectHPBpro0(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @NotNull Paint paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        Canvas canvas = this.internalCanvas;
        Bitmap bitmapAsAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(image);
        Rect rect = this.srcRect;
        AbstractC5830k.m5327d(rect);
        rect.left = IntOffset.m13433getXimpl(srcOffset);
        rect.top = IntOffset.m13434getYimpl(srcOffset);
        rect.right = IntOffset.m13433getXimpl(srcOffset) + ((int) (srcSize >> 32));
        rect.bottom = IntOffset.m13434getYimpl(srcOffset) + ((int) (srcSize & 4294967295L));
        Rect rect2 = this.dstRect;
        AbstractC5830k.m5327d(rect2);
        rect2.left = IntOffset.m13433getXimpl(dstOffset);
        rect2.top = IntOffset.m13434getYimpl(dstOffset);
        rect2.right = IntOffset.m13433getXimpl(dstOffset) + ((int) (dstSize >> 32));
        rect2.bottom = IntOffset.m13434getYimpl(dstOffset) + ((int) (dstSize & 4294967295L));
        canvas.drawBitmap(bitmapAsAndroidBitmap, rect, rect2, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo10541drawLineWko1d7g(long p1, long p22, @NotNull Paint paint) {
        this.internalCanvas.drawLine(Float.intBitsToFloat((int) (p1 >> 32)), Float.intBitsToFloat((int) (p1 & 4294967295L)), Float.intBitsToFloat((int) (p22 >> 32)), Float.intBitsToFloat((int) (p22 & 4294967295L)), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void drawOval(float left, float top2, float right, float bottom, @NotNull Paint paint) {
        this.internalCanvas.drawOval(left, top2, right, bottom, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo10542drawPointsO7TthRY(int pointMode, @NotNull List<Offset> points, @NotNull Paint paint) {
        PointMode.Companion companion = PointMode.INSTANCE;
        if (PointMode.m10983equalsimpl0(pointMode, companion.m10987getLinesr_lszbg())) {
            drawLines(points, paint, 2);
        } else if (PointMode.m10983equalsimpl0(pointMode, companion.m10989getPolygonr_lszbg())) {
            drawLines(points, paint, 1);
        } else if (PointMode.m10983equalsimpl0(pointMode, companion.m10988getPointsr_lszbg())) {
            drawPoints(points, paint);
        }
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo10543drawRawPointsO7TthRY(int pointMode, @NotNull float[] points, @NotNull Paint paint) {
        if (points.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        PointMode.Companion companion = PointMode.INSTANCE;
        if (PointMode.m10983equalsimpl0(pointMode, companion.m10987getLinesr_lszbg())) {
            drawRawLines(points, paint, 2);
        } else if (PointMode.m10983equalsimpl0(pointMode, companion.m10989getPolygonr_lszbg())) {
            drawRawLines(points, paint, 1);
        } else if (PointMode.m10983equalsimpl0(pointMode, companion.m10988getPointsr_lszbg())) {
            drawRawPoints(points, paint, 2);
        }
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void drawRect(float left, float top2, float right, float bottom, @NotNull Paint paint) {
        this.internalCanvas.drawRect(left, top2, right, bottom, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void drawRoundRect(float left, float top2, float right, float bottom, float radiusX, float radiusY, @NotNull Paint paint) {
        this.internalCanvas.drawRoundRect(left, top2, right, bottom, radiusX, radiusY, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo10544drawVerticesTPEHhCM(@NotNull Vertices vertices, int blendMode, @NotNull Paint paint) {
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m10588toAndroidVertexModeJOOmi9M(vertices.getVertexMode()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @NotNull
    public final Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void rotate(float degrees) {
        this.internalCanvas.rotate(degrees);
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void saveLayer(@NotNull androidx.compose.p011ui.geometry.Rect bounds, @NotNull Paint paint) {
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), paint.asFrameworkPaint(), 31);
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void scale(float sx, float sy) {
        this.internalCanvas.scale(sx, sy);
    }

    public final void setInternalCanvas(@NotNull Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void skew(float sx, float sy) {
        this.internalCanvas.skew(sx, sy);
    }

    @NotNull
    /* renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m10545toRegionOp7u2Bmg(int i) {
        return ClipOp.m10666equalsimpl0(i, ClipOp.INSTANCE.m10670getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void translate(float dx, float dy) {
        this.internalCanvas.translate(dx, dy);
    }
}
