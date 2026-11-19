package androidx.compose.p013ui.platform;

import android.content.ClipData;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ClipEntry {
    public static final int $stable = 8;
    private final ClipData clipData;

    public ClipEntry(ClipData clipData) {
        this.clipData = clipData;
    }

    public final ClipData getClipData() {
        return this.clipData;
    }

    public final ClipMetadata getClipMetadata() {
        return AndroidClipboardManager_androidKt.toClipMetadata(this.clipData.getDescription());
    }
}
