package androidx.compose.p014ui.graphics;

import android.graphics.Path;
import androidx.compose.p014ui.graphics.PathIterator;
import androidx.compose.p014ui.graphics.PathSegment;
import androidx.graphics.path.PathIterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
final class AndroidPathIterator implements PathIterator {
    private final PathIterator.ConicEvaluation conicEvaluation;
    private final androidx.graphics.path.PathIterator implementation;
    private final Path path;
    private final float[] segmentPoints = new float[8];
    private final float tolerance;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PathIterator.ConicEvaluation.values().length];
            try {
                iArr[PathIterator.ConicEvaluation.AsConic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathIterator.ConicEvaluation.AsQuadratics.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PathSegment.Type.values().length];
            try {
                iArr2[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidPathIterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10) {
        PathIterator.ConicEvaluation conicEvaluation2;
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f10;
        Path path2 = getPath();
        if (!(path2 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path internalPath = ((AndroidPath) path2).getInternalPath();
        int i10 = WhenMappings.$EnumSwitchMapping$0[getConicEvaluation().ordinal()];
        if (i10 == 1) {
            conicEvaluation2 = PathIterator.ConicEvaluation.AsConic;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            conicEvaluation2 = PathIterator.ConicEvaluation.AsQuadratics;
        }
        this.implementation = new androidx.graphics.path.PathIterator(internalPath, conicEvaluation2, getTolerance());
    }

    @Override // androidx.compose.p014ui.graphics.PathIterator
    public int calculateSize(boolean z10) {
        return this.implementation.calculateSize(z10);
    }

    @Override // androidx.compose.p014ui.graphics.PathIterator
    public PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    @Override // androidx.compose.p014ui.graphics.PathIterator
    public Path getPath() {
        return this.path;
    }

    @Override // androidx.compose.p014ui.graphics.PathIterator
    public float getTolerance() {
        return this.tolerance;
    }

    @Override // androidx.compose.p014ui.graphics.PathIterator, java.util.Iterator
    public boolean hasNext() {
        return this.implementation.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // androidx.compose.p014ui.graphics.PathIterator
    public PathSegment.Type next(float[] fArr, int i10) {
        return AndroidPathIterator_androidKt.toPathSegmentType(this.implementation.next(fArr, i10));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public PathSegment next() {
        PathSegment.Type pathSegmentType;
        float[] fArr;
        float[] fArr2 = this.segmentPoints;
        if (fArr2.length >= 8 && (pathSegmentType = AndroidPathIterator_androidKt.toPathSegmentType(this.implementation.next(fArr2, 0))) != PathSegment.Type.Done) {
            if (pathSegmentType == PathSegment.Type.Close) {
                return PathSegmentKt.getCloseSegment();
            }
            int i10 = WhenMappings.$EnumSwitchMapping$1[pathSegmentType.ordinal()];
            if (i10 == 1) {
                fArr = new float[]{fArr2[0], fArr2[1]};
            } else if (i10 == 2) {
                fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3]};
            } else if (i10 == 3 || i10 == 4) {
                fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5]};
            } else if (i10 != 5) {
                fArr = new float[0];
            } else {
                fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5], fArr2[6], fArr2[7]};
            }
            return new PathSegment(pathSegmentType, fArr, pathSegmentType == PathSegment.Type.Conic ? fArr2[6] : 0.0f);
        }
        return PathSegmentKt.getDoneSegment();
    }
}
