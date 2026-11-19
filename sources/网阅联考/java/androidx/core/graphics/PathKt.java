package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Path;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.analytics.pro.C3380c;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f¨\u0006\f"}, m5175d2 = {"and", "Landroid/graphics/Path;", C3335ai.f1707av, "flatten", "", "Landroidx/core/graphics/PathSegment;", C3380c.f1962O, "", "minus", "or", "plus", "xor", "core-ktx_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class PathKt {
    @RequiresApi(19)
    public static final Path and(Path path, Path p3) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p3, "p");
        Path path2 = new Path();
        path2.op(path, p3, Path.Op.INTERSECT);
        return path2;
    }

    @RequiresApi(26)
    public static final Iterable<PathSegment> flatten(Path path, float f4) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Collection<PathSegment> collectionFlatten = PathUtils.flatten(path, f4);
        Intrinsics.checkNotNullExpressionValue(collectionFlatten, "flatten(this, error)");
        return collectionFlatten;
    }

    public static /* synthetic */ Iterable flatten$default(Path path, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.5f;
        }
        return flatten(path, f4);
    }

    @RequiresApi(19)
    public static final Path minus(Path path, Path p3) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p3, "p");
        Path path2 = new Path(path);
        path2.op(p3, Path.Op.DIFFERENCE);
        return path2;
    }

    @RequiresApi(19)
    /* renamed from: or */
    public static final Path m1140or(Path path, Path p3) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p3, "p");
        Path path2 = new Path(path);
        path2.op(p3, Path.Op.UNION);
        return path2;
    }

    @RequiresApi(19)
    public static final Path plus(Path path, Path p3) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p3, "p");
        Path path2 = new Path(path);
        path2.op(p3, Path.Op.UNION);
        return path2;
    }

    @RequiresApi(19)
    public static final Path xor(Path path, Path p3) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p3, "p");
        Path path2 = new Path(path);
        path2.op(p3, Path.Op.XOR);
        return path2;
    }
}
