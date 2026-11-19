package androidx.core.graphics;

import android.graphics.Path;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class PathKt {
    public static final Path and(Path path, Path path2) {
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @RequiresApi(26)
    public static final Iterable<PathSegment> flatten(Path path, float f10) {
        return PathUtils.flatten(path, f10);
    }

    public static /* synthetic */ Iterable flatten$default(Path path, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.5f;
        }
        return flatten(path, f10);
    }

    public static final Path minus(Path path, Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    /* renamed from: or */
    public static final Path m1514or(Path path, Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    public static final Path plus(Path path, Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    public static final Path xor(Path path, Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
