package androidx.graphics.path;

import android.graphics.Path;
import androidx.graphics.path.PathIterator;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class PathUtilities {
    public static final PathIterator iterator(Path path) {
        AbstractC9133u.m16133g(path, "<this>");
        return new PathIterator(path, null, 0.0f, 6, null);
    }

    public static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.25f;
        }
        return iterator(path, conicEvaluation, f10);
    }

    public static final PathIterator iterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10) {
        AbstractC9133u.m16133g(path, "<this>");
        AbstractC9133u.m16133g(conicEvaluation, "conicEvaluation");
        return new PathIterator(path, conicEvaluation, f10);
    }
}
