package androidx.graphics.path;

import android.graphics.Path;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import dalvik.annotation.optimization.FastNative;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class PathIteratorPreApi34Impl extends PathIteratorImpl {
    private final long internalPathIterator;

    public /* synthetic */ PathIteratorPreApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10, int i10, AbstractC9126n abstractC9126n) {
        this(path, (i10 & 2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i10 & 4) != 0 ? 0.25f : f10);
    }

    private final native long createInternalPathIterator(Path path, int i10, float f10);

    private final native void destroyInternalPathIterator(long j10);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j10);

    @FastNative
    private final native int internalPathIteratorNext(long j10, float[] fArr, int i10);

    @FastNative
    private final native int internalPathIteratorPeek(long j10);

    @FastNative
    private final native int internalPathIteratorRawSize(long j10);

    @FastNative
    private final native int internalPathIteratorSize(long j10);

    @Override // androidx.graphics.path.PathIteratorImpl
    public int calculateSize(boolean z10) {
        return (!z10 || getConicEvaluation() == PathIterator.ConicEvaluation.AsConic) ? internalPathIteratorRawSize(this.internalPathIterator) : internalPathIteratorSize(this.internalPathIterator);
    }

    public final void finalize() {
        destroyInternalPathIterator(this.internalPathIterator);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public boolean hasNext() {
        return internalPathIteratorHasNext(this.internalPathIterator);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public PathSegment.Type next(float[] points, int i10) {
        AbstractC9133u.m16133g(points, "points");
        return PathIteratorImplKt.PathSegmentTypes[internalPathIteratorNext(this.internalPathIterator, points, i10)];
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public PathSegment.Type peek() {
        return PathIteratorImplKt.PathSegmentTypes[internalPathIteratorPeek(this.internalPathIterator)];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorPreApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10) {
        super(path, conicEvaluation, f10);
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(conicEvaluation, "conicEvaluation");
        this.internalPathIterator = createInternalPathIterator(path, conicEvaluation.ordinal(), f10);
    }
}
