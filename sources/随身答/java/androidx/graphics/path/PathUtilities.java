package androidx.graphics.path;

import android.graphics.Path;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.graphics.path.PathIterator;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m13413d2 = {"iterator", "Landroidx/graphics/path/PathIterator;", "Landroid/graphics/Path;", "conicEvaluation", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "tolerance", "", "graphics-path_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "PathUtilities")
/* loaded from: classes3.dex */
public final class PathUtilities {
    public static final PathIterator iterator(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return new PathIterator(path, null, 0.0f, 6, null);
    }

    public static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            f10 = 0.25f;
        }
        return iterator(path, conicEvaluation, f10);
    }

    public static final PathIterator iterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        return new PathIterator(path, conicEvaluation, f10);
    }
}
