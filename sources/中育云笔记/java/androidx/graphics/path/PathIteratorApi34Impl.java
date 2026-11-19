package androidx.graphics.path;

import android.graphics.Path;
import androidx.annotation.RequiresApi;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(34)
/* loaded from: classes2.dex */
public final class PathIteratorApi34Impl extends PathIteratorImpl {
    private final ConicConverter conicConverter;
    private final android.graphics.PathIterator platformIterator;

    public /* synthetic */ PathIteratorApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10, int i10, AbstractC9972n abstractC9972n) {
        this(path, (i10 & 2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i10 & 4) != 0 ? 0.25f : f10);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public int calculateSize(boolean z10) {
        boolean z11 = z10 && getConicEvaluation() == PathIterator.ConicEvaluation.AsQuadratics;
        android.graphics.PathIterator pathIterator = getPath().getPathIterator();
        AbstractC9979u.m20293f(pathIterator, "path.pathIterator");
        float[] fArr = new float[8];
        int quadraticCount = 0;
        while (pathIterator.hasNext()) {
            if (pathIterator.next(fArr, 0) == 3 && z11) {
                ConicConverter conicConverter = this.conicConverter;
                ConicConverter.convert$default(conicConverter, fArr, fArr[6], getTolerance(), 0, 8, null);
                quadraticCount += conicConverter.getQuadraticCount();
            } else {
                quadraticCount++;
            }
        }
        return quadraticCount;
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public boolean hasNext() {
        return this.platformIterator.hasNext();
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public PathSegment.Type next(float[] points, int i10) {
        AbstractC9979u.m20294g(points, "points");
        if (this.conicConverter.getCurrentQuadratic() < this.conicConverter.getQuadraticCount()) {
            this.conicConverter.nextQuadratic(points, i10);
            return PathSegment.Type.Quadratic;
        }
        PathSegment.Type typePlatformToAndroidXSegmentType = PathIteratorImplKt.platformToAndroidXSegmentType(this.platformIterator.next(points, i10));
        if (typePlatformToAndroidXSegmentType != PathSegment.Type.Conic || getConicEvaluation() != PathIterator.ConicEvaluation.AsQuadratics) {
            return typePlatformToAndroidXSegmentType;
        }
        ConicConverter conicConverter = this.conicConverter;
        conicConverter.convert(points, points[i10 + 6], getTolerance(), i10);
        if (conicConverter.getQuadraticCount() > 0) {
            conicConverter.nextQuadratic(points, i10);
        }
        return PathSegment.Type.Quadratic;
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public PathSegment.Type peek() {
        return PathIteratorImplKt.platformToAndroidXSegmentType(this.platformIterator.peek());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10) {
        super(path, conicEvaluation, f10);
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(conicEvaluation, "conicEvaluation");
        android.graphics.PathIterator pathIterator = path.getPathIterator();
        AbstractC9979u.m20293f(pathIterator, "path.pathIterator");
        this.platformIterator = pathIterator;
        this.conicConverter = new ConicConverter();
    }
}
