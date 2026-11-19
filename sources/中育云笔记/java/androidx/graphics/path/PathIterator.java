package androidx.graphics.path;

import android.graphics.Path;
import android.os.Build;
import androidx.graphics.path.PathSegment;
import id.InterfaceC9624a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class PathIterator implements Iterator<PathSegment>, InterfaceC9624a {
    private final ConicEvaluation conicEvaluation;
    private final PathIteratorImpl implementation;
    private final Path path;
    private final float tolerance;

    public enum ConicEvaluation {
        AsConic,
        AsQuadratics
    }

    public PathIterator(Path path, ConicEvaluation conicEvaluation, float f10) {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(conicEvaluation, "conicEvaluation");
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f10;
        this.implementation = Build.VERSION.SDK_INT >= 34 ? new PathIteratorApi34Impl(path, conicEvaluation, f10) : new PathIteratorPreApi34Impl(path, conicEvaluation, f10);
    }

    public static /* synthetic */ int calculateSize$default(PathIterator pathIterator, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return pathIterator.calculateSize(z10);
    }

    public static /* synthetic */ PathSegment.Type next$default(PathIterator pathIterator, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return pathIterator.next(fArr, i10);
    }

    public final int calculateSize(boolean z10) {
        return this.implementation.calculateSize(z10);
    }

    public final ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    public final Path getPath() {
        return this.path;
    }

    public final float getTolerance() {
        return this.tolerance;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.implementation.hasNext();
    }

    public final PathSegment.Type next(float[] points) {
        AbstractC9979u.m20294g(points, "points");
        return next$default(this, points, 0, 2, null);
    }

    public final PathSegment.Type peek() {
        return this.implementation.peek();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final PathSegment.Type next(float[] points, int i10) {
        AbstractC9979u.m20294g(points, "points");
        return this.implementation.next(points, i10);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public PathSegment next() {
        return this.implementation.next();
    }

    public /* synthetic */ PathIterator(Path path, ConicEvaluation conicEvaluation, float f10, int i10, AbstractC9972n abstractC9972n) {
        this(path, (i10 & 2) != 0 ? ConicEvaluation.AsQuadratics : conicEvaluation, (i10 & 4) != 0 ? 0.25f : f10);
    }
}
