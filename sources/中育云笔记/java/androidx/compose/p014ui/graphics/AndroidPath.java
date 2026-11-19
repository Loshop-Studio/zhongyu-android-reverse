package androidx.compose.p014ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RoundRect;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.PathOperation;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class AndroidPath implements Path {
    private final Path internalPath;
    private Matrix mMatrix;
    private float[] radii;
    private RectF rectF;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidPath() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void isConvex$annotations() {
    }

    private final void validateRectangle(Rect rect) {
        if (Float.isNaN(rect.getLeft()) || Float.isNaN(rect.getTop()) || Float.isNaN(rect.getRight()) || Float.isNaN(rect.getBottom())) {
            AndroidPath_androidKt.throwIllegalStateException("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void addArc(Rect rect, float f10, float f11) {
        validateRectangle(rect);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        AbstractC9979u.m20291d(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        AbstractC9979u.m20291d(rectF2);
        path.addArc(rectF2, f10, f11);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void addArcRad(Rect rect, float f10, float f11) {
        addArc(rect, DegreesKt.degrees(f10), DegreesKt.degrees(f11));
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void addOval(Rect rect) {
        addOval(rect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    /* renamed from: addPath-Uv8p0NA, reason: not valid java name */
    public void mo30768addPathUv8p0NA(Path path, long j10) {
        android.graphics.Path path2 = this.internalPath;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.addPath(((AndroidPath) path).getInternalPath(), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void addRect(Rect rect) {
        addRect(rect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void addRoundRect(RoundRect roundRect) {
        addRoundRect(roundRect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void arcTo(Rect rect, float f10, float f11, boolean z10) {
        float left = rect.getLeft();
        float top2 = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        AbstractC9979u.m20291d(rectF);
        rectF.set(left, top2, right, bottom);
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        AbstractC9979u.m20291d(rectF2);
        path.arcTo(rectF2, f10, f11, z10);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.internalPath.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public Rect getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        AbstractC9979u.m20291d(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    /* renamed from: getFillType-Rg-k1Os, reason: not valid java name */
    public int mo30769getFillTypeRgk1Os() {
        return this.internalPath.getFillType() == Path.FillType.EVEN_ODD ? PathFillType.Companion.m31160getEvenOddRgk1Os() : PathFillType.Companion.m31161getNonZeroRgk1Os();
    }

    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void lineTo(float f10, float f11) {
        this.internalPath.lineTo(f10, f11);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void moveTo(float f10, float f11) {
        this.internalPath.moveTo(f10, f11);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    /* renamed from: op-N5in7k0, reason: not valid java name */
    public boolean mo30770opN5in7k0(Path path, Path path2, int i10) {
        PathOperation.Companion companion = PathOperation.Companion;
        Path.Op op = PathOperation.m31166equalsimpl0(i10, companion.m31170getDifferenceb3I0S0c()) ? Path.Op.DIFFERENCE : PathOperation.m31166equalsimpl0(i10, companion.m31171getIntersectb3I0S0c()) ? Path.Op.INTERSECT : PathOperation.m31166equalsimpl0(i10, companion.m31172getReverseDifferenceb3I0S0c()) ? Path.Op.REVERSE_DIFFERENCE : PathOperation.m31166equalsimpl0(i10, companion.m31173getUnionb3I0S0c()) ? Path.Op.UNION : Path.Op.XOR;
        android.graphics.Path path3 = this.internalPath;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path internalPath = ((AndroidPath) path).getInternalPath();
        if (path2 instanceof AndroidPath) {
            return path3.op(internalPath, ((AndroidPath) path2).getInternalPath(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void quadraticBezierTo(float f10, float f11, float f12, float f13) {
        this.internalPath.quadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void quadraticTo(float f10, float f11, float f12, float f13) {
        this.internalPath.quadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void relativeCubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.internalPath.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void relativeLineTo(float f10, float f11) {
        this.internalPath.rLineTo(f10, f11);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void relativeMoveTo(float f10, float f11) {
        this.internalPath.rMoveTo(f10, f11);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void relativeQuadraticBezierTo(float f10, float f11, float f12, float f13) {
        this.internalPath.rQuadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void relativeQuadraticTo(float f10, float f11, float f12, float f13) {
        this.internalPath.rQuadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.p014ui.graphics.Path
    /* renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public void mo30771setFillTypeoQ8Xj4U(int i10) {
        this.internalPath.setFillType(PathFillType.m31156equalsimpl0(i10, PathFillType.Companion.m31160getEvenOddRgk1Os()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    /* renamed from: transform-58bKbWc, reason: not valid java name */
    public void mo30772transform58bKbWc(float[] fArr) {
        if (this.mMatrix == null) {
            this.mMatrix = new Matrix();
        }
        Matrix matrix = this.mMatrix;
        AbstractC9979u.m20291d(matrix);
        AndroidMatrixConversions_androidKt.m30748setFromEL8BTi8(matrix, fArr);
        android.graphics.Path path = this.internalPath;
        Matrix matrix2 = this.mMatrix;
        AbstractC9979u.m20291d(matrix2);
        path.transform(matrix2);
    }

    @Override // androidx.compose.p014ui.graphics.Path
    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public void mo30773translatek4lQ0M(long j10) {
        Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new Matrix();
        } else {
            AbstractC9979u.m20291d(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.mMatrix;
        AbstractC9979u.m20291d(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        android.graphics.Path path = this.internalPath;
        Matrix matrix3 = this.mMatrix;
        AbstractC9979u.m20291d(matrix3);
        path.transform(matrix3);
    }

    public AndroidPath(android.graphics.Path path) {
        this.internalPath = path;
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void addOval(Rect rect, Path.Direction direction) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        AbstractC9979u.m20291d(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        AbstractC9979u.m20291d(rectF2);
        path.addOval(rectF2, AndroidPath_androidKt.toPlatformPathDirection(direction));
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void addRect(Rect rect, Path.Direction direction) {
        validateRectangle(rect);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        AbstractC9979u.m20291d(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        AbstractC9979u.m20291d(rectF2);
        path.addRect(rectF2, AndroidPath_androidKt.toPlatformPathDirection(direction));
    }

    @Override // androidx.compose.p014ui.graphics.Path
    public void addRoundRect(RoundRect roundRect, Path.Direction direction) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        AbstractC9979u.m20291d(rectF);
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        AbstractC9979u.m20291d(fArr);
        fArr[0] = Float.intBitsToFloat((int) (roundRect.m30687getTopLeftCornerRadiuskKHJgLs() >> 32));
        fArr[1] = Float.intBitsToFloat((int) (roundRect.m30687getTopLeftCornerRadiuskKHJgLs() & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (roundRect.m30688getTopRightCornerRadiuskKHJgLs() >> 32));
        fArr[3] = Float.intBitsToFloat((int) (roundRect.m30688getTopRightCornerRadiuskKHJgLs() & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (roundRect.m30686getBottomRightCornerRadiuskKHJgLs() >> 32));
        fArr[5] = Float.intBitsToFloat((int) (roundRect.m30686getBottomRightCornerRadiuskKHJgLs() & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (roundRect.m30685getBottomLeftCornerRadiuskKHJgLs() >> 32));
        fArr[7] = Float.intBitsToFloat((int) (roundRect.m30685getBottomLeftCornerRadiuskKHJgLs() & 4294967295L));
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        AbstractC9979u.m20291d(rectF2);
        float[] fArr2 = this.radii;
        AbstractC9979u.m20291d(fArr2);
        path.addRoundRect(rectF2, fArr2, AndroidPath_androidKt.toPlatformPathDirection(direction));
    }

    public /* synthetic */ AndroidPath(android.graphics.Path path, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? new android.graphics.Path() : path);
    }
}
