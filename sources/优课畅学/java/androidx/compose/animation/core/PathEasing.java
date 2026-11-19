package androidx.compose.animation.core;

import androidx.compose.p013ui.graphics.BezierKt;
import androidx.compose.p013ui.graphics.IntervalTree;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.PathIterator;
import androidx.compose.p013ui.graphics.PathSegment;
import androidx.compose.runtime.Immutable;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
/* loaded from: classes.dex */
public final class PathEasing implements Easing {
    public static final int $stable = 0;
    private IntervalTree<PathSegment> intervals;
    private final Path path;

    public PathEasing(Path path) {
        this.path = path;
    }

    private final void initializeEasing() {
        float[] fArr = new float[5];
        IntervalTree<PathSegment> intervalTree = new IntervalTree<>();
        PathIterator it = this.path.iterator(PathIterator.ConicEvaluation.AsQuadratics, 2.0E-4f);
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PathSegment next = it.next();
            if (!(next.getType() != PathSegment.Type.Close)) {
                PreconditionsKt.throwIllegalArgumentException("The path cannot contain a close() command.");
            }
            if (next.getType() != PathSegment.Type.Move && next.getType() != PathSegment.Type.Done) {
                long jComputeHorizontalBounds$default = BezierKt.computeHorizontalBounds$default(next, fArr, 0, 4, null);
                intervalTree.addInterval(Float.intBitsToFloat((int) (jComputeHorizontalBounds$default >> 32)), Float.intBitsToFloat((int) (jComputeHorizontalBounds$default & 4294967295L)), next);
            }
        }
        if (!(intervalTree.contains(0.0f) && intervalTree.contains(1.0f))) {
            PreconditionsKt.throwIllegalArgumentException("The easing path must start at 0.0f and end at 1.0f.");
        }
        this.intervals = intervalTree;
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (this.intervals == null) {
            initializeEasing();
        }
        IntervalTree<PathSegment> intervalTree = this.intervals;
        if (intervalTree == null) {
            AbstractC9133u.m16151y("intervals");
            intervalTree = null;
        }
        Object data = IntervalTree.findFirstOverlap$default(intervalTree, f10, 0.0f, 2, null).getData();
        if (data == null) {
            PreconditionsKt.throwIllegalStateExceptionForNullCheck("The easing path is invalid. Make sure it is continuous on the x axis.");
            throw new KotlinNothingValueException();
        }
        PathSegment pathSegment = (PathSegment) data;
        float fFindFirstRoot = BezierKt.findFirstRoot(pathSegment, f10);
        if (Float.isNaN(fFindFirstRoot)) {
            PreconditionsKt.throwIllegalStateException("The easing path is invalid. Make sure it does not contain NaN/Infinity values.");
        }
        return BezierKt.evaluateY(pathSegment, fFindFirstRoot);
    }
}
