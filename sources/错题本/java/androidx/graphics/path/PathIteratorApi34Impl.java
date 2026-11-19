package androidx.graphics.path;

import android.graphics.Path;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@RequiresApi(34)
@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m5110d2 = {"Landroidx/graphics/path/PathIteratorApi34Impl;", "Landroidx/graphics/path/PathIteratorImpl;", "path", "Landroid/graphics/Path;", "conicEvaluation", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "tolerance", "", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "conicConverter", "Landroidx/graphics/path/ConicConverter;", "platformIterator", "Landroid/graphics/PathIterator;", "calculateSize", "", "includeConvertedConics", "", "hasNext", "next", "Landroidx/graphics/path/PathSegment$Type;", "points", "", TypedValues.CycleType.S_WAVE_OFFSET, "peek", "graphics-path_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class PathIteratorApi34Impl extends PathIteratorImpl {

    @NotNull
    private final ConicConverter conicConverter;

    @NotNull
    private final android.graphics.PathIterator platformIterator;

    public /* synthetic */ PathIteratorApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f, int i, AbstractC5824e abstractC5824e) {
        this(path, (i & 2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i & 4) != 0 ? 0.25f : f);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public int calculateSize(boolean includeConvertedConics) {
        boolean z8 = includeConvertedConics && getConicEvaluation() == PathIterator.ConicEvaluation.AsQuadratics;
        android.graphics.PathIterator pathIterator = getPath().getPathIterator();
        AbstractC5830k.m5329f(pathIterator, "path.pathIterator");
        float[] fArr = new float[8];
        int quadraticCount = 0;
        while (pathIterator.hasNext()) {
            if (pathIterator.next(fArr, 0) == 3 && z8) {
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
    @NotNull
    public PathSegment.Type next(@NotNull float[] points, int offset) {
        AbstractC5830k.m5330g(points, "points");
        if (this.conicConverter.getCurrentQuadratic() < this.conicConverter.getQuadraticCount()) {
            this.conicConverter.nextQuadratic(points, offset);
            return PathSegment.Type.Quadratic;
        }
        PathSegment.Type typePlatformToAndroidXSegmentType = PathIteratorImplKt.platformToAndroidXSegmentType(this.platformIterator.next(points, offset));
        if (typePlatformToAndroidXSegmentType != PathSegment.Type.Conic || getConicEvaluation() != PathIterator.ConicEvaluation.AsQuadratics) {
            return typePlatformToAndroidXSegmentType;
        }
        ConicConverter conicConverter = this.conicConverter;
        conicConverter.convert(points, points[offset + 6], getTolerance(), offset);
        if (conicConverter.getQuadraticCount() > 0) {
            conicConverter.nextQuadratic(points, offset);
        }
        return PathSegment.Type.Quadratic;
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    @NotNull
    public PathSegment.Type peek() {
        return PathIteratorImplKt.platformToAndroidXSegmentType(this.platformIterator.peek());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorApi34Impl(@NotNull Path path, @NotNull PathIterator.ConicEvaluation conicEvaluation, float f) {
        super(path, conicEvaluation, f);
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(conicEvaluation, "conicEvaluation");
        android.graphics.PathIterator pathIterator = path.getPathIterator();
        AbstractC5830k.m5329f(pathIterator, "path.pathIterator");
        this.platformIterator = pathIterator;
        this.conicConverter = new ConicConverter();
    }
}
