package androidx.camera.extensions.internal.sessionprocessor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public interface ImageProcessor {
    void onNextImageAvailable(int i10, long j10, @NonNull ImageReference imageReference, @Nullable String str);
}
