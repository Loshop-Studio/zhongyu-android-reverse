package androidx.compose.p013ui.platform;

import android.content.ClipDescription;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ClipMetadata {
    public static final int $stable = 8;
    private final ClipDescription clipDescription;

    public ClipMetadata(ClipDescription clipDescription) {
        this.clipDescription = clipDescription;
    }

    public final ClipDescription getClipDescription() {
        return this.clipDescription;
    }
}
