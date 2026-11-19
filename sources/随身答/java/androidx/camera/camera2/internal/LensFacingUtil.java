package androidx.camera.camera2.internal;

import androidx.annotation.OptIn;
import androidx.camera.core.ExperimentalLensFacing;

/* loaded from: classes.dex */
public class LensFacingUtil {
    private LensFacingUtil() {
    }

    @OptIn(markerClass = {ExperimentalLensFacing.class})
    public static int getCameraSelectorLensFacing(int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (i9 == 1) {
            return 1;
        }
        if (i9 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("The given lens facing integer: " + i9 + " can not be recognized.");
    }

    @OptIn(markerClass = {ExperimentalLensFacing.class})
    public static int getLensFacingInt(int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (i9 == 1) {
            return 1;
        }
        if (i9 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("The given lens facing: " + i9 + " can not be recognized.");
    }
}
