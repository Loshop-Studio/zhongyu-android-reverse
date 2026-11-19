package androidx.graphics.path;

import androidx.graphics.path.PathSegment;

/* loaded from: classes2.dex */
public final class PathIteratorImplKt {
    private static final PathSegment.Type[] PathSegmentTypes = PathSegment.Type.values();

    /* JADX INFO: Access modifiers changed from: private */
    public static final PathSegment.Type platformToAndroidXSegmentType(int i10) {
        switch (i10) {
            case 0:
                return PathSegment.Type.Move;
            case 1:
                return PathSegment.Type.Line;
            case 2:
                return PathSegment.Type.Quadratic;
            case 3:
                return PathSegment.Type.Conic;
            case 4:
                return PathSegment.Type.Cubic;
            case 5:
                return PathSegment.Type.Close;
            case 6:
                return PathSegment.Type.Done;
            default:
                throw new IllegalArgumentException("Unknown path segment type " + i10);
        }
    }
}
