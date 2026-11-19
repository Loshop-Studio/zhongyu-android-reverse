package androidx.camera.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class FlashModeConverter {
    private FlashModeConverter() {
    }

    @NonNull
    public static String nameOf(int i10) {
        if (i10 == 0) {
            return "AUTO";
        }
        if (i10 == 1) {
            return "ON";
        }
        if (i10 == 2) {
            return "OFF";
        }
        throw new IllegalArgumentException("Unknown flash mode " + i10);
    }

    public static int valueOf(@Nullable String str) {
        if (str == null) {
            throw new NullPointerException("name cannot be null");
        }
        switch (str) {
            case "ON":
                return 1;
            case "OFF":
                return 2;
            case "AUTO":
                return 0;
            default:
                throw new IllegalArgumentException("Unknown flash mode name " + str);
        }
    }
}
