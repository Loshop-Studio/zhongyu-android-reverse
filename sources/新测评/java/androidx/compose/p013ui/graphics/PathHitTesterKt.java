package androidx.compose.p013ui.graphics;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m13558d2 = {"EmptyPath", "Landroidx/compose/ui/graphics/Path;", "PathHitTester", "Landroidx/compose/ui/graphics/PathHitTester;", "path", "tolerance", "", "ui-graphics_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nPathHitTester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTesterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
/* loaded from: classes2.dex */
public final class PathHitTesterKt {
    private static final Path EmptyPath = AndroidPath_androidKt.Path();

    public static final PathHitTester PathHitTester(Path path, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f10) {
        PathHitTester pathHitTester = new PathHitTester();
        pathHitTester.updatePath(path, f10);
        return pathHitTester;
    }

    public static /* synthetic */ PathHitTester PathHitTester$default(Path path, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.5f;
        }
        return PathHitTester(path, f10);
    }
}
