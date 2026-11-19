package androidx.graphics.path;

import android.graphics.Path;
import androidx.graphics.path.PathIterator;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class PathUtilities {
    public static final PathIterator iterator(Path path) {
        AbstractC9979u.m20294g(path, "<this>");
        return new PathIterator(path, null, 0.0f, 6, null);
    }

    public static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.25f;
        }
        return iterator(path, conicEvaluation, f10);
    }

    public static final PathIterator iterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10) {
        AbstractC9979u.m20294g(path, "<this>");
        AbstractC9979u.m20294g(conicEvaluation, "conicEvaluation");
        return new PathIterator(path, conicEvaluation, f10);
    }
}
