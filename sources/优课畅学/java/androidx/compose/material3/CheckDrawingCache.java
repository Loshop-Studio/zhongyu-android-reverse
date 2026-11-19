package androidx.compose.material3;

import androidx.compose.p013ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.PathMeasure;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
final class CheckDrawingCache {
    private final Path checkPath;
    private final PathMeasure pathMeasure;
    private final Path pathToDraw;

    public CheckDrawingCache() {
        this(null, null, null, 7, null);
    }

    public final Path getCheckPath() {
        return this.checkPath;
    }

    public final PathMeasure getPathMeasure() {
        return this.pathMeasure;
    }

    public final Path getPathToDraw() {
        return this.pathToDraw;
    }

    public CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2) {
        this.checkPath = path;
        this.pathMeasure = pathMeasure;
        this.pathToDraw = path2;
    }

    public /* synthetic */ CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? AndroidPath_androidKt.Path() : path, (i10 & 2) != 0 ? AndroidPathMeasure_androidKt.PathMeasure() : pathMeasure, (i10 & 4) != 0 ? AndroidPath_androidKt.Path() : path2);
    }
}
