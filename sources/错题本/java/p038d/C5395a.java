package p038d;

import android.content.Context;
import androidx.camera.camera2.internal.Camera2CameraFactory;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraThreadConfig;

/* renamed from: d.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C5395a implements CameraFactory.Provider {
    @Override // androidx.camera.core.impl.CameraFactory.Provider
    public final CameraFactory newInstance(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector, long j7) {
        return new Camera2CameraFactory(context, cameraThreadConfig, cameraSelector, j7);
    }
}
