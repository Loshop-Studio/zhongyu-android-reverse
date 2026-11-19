package androidx.compose.p013ui.graphics;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;

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
