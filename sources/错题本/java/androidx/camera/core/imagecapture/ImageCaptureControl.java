package androidx.camera.core.imagecapture;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.CaptureConfig;
import java.util.List;
import p049e1.InterfaceFutureC5453a;

/* loaded from: classes.dex */
public interface ImageCaptureControl {
    @MainThread
    void lockFlashMode();

    @NonNull
    @MainThread
    InterfaceFutureC5453a submitStillCaptureRequests(@NonNull List<CaptureConfig> list);

    @MainThread
    void unlockFlashMode();
}
