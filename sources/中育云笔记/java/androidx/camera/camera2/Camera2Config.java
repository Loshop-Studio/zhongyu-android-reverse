package androidx.camera.camera2;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.camera2.internal.Camera2CameraFactory;
import androidx.camera.camera2.internal.Camera2DeviceSurfaceManager;
import androidx.camera.camera2.internal.Camera2UseCaseConfigFactory;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraThreadConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.Set;

/* loaded from: classes.dex */
public final class Camera2Config {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final class DefaultProvider implements CameraXConfig.Provider {
        @Override // androidx.camera.core.CameraXConfig.Provider
        @NonNull
        public CameraXConfig getCameraXConfig() {
            return Camera2Config.defaultConfig();
        }
    }

    private Camera2Config() {
    }

    /* renamed from: a */
    public static /* synthetic */ UseCaseConfigFactory m375a(Context context) {
        return new Camera2UseCaseConfigFactory(context);
    }

    /* renamed from: b */
    public static /* synthetic */ CameraDeviceSurfaceManager m376b(Context context, Object obj, Set set) throws InitializationException {
        try {
            return new Camera2DeviceSurfaceManager(context, obj, set);
        } catch (CameraUnavailableException e10) {
            throw new InitializationException(e10);
        }
    }

    @NonNull
    public static CameraXConfig defaultConfig() {
        CameraFactory.Provider provider = new CameraFactory.Provider() { // from class: c.a
            @Override // androidx.camera.core.impl.CameraFactory.Provider
            public final CameraFactory newInstance(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector, long j10) {
                return new Camera2CameraFactory(context, cameraThreadConfig, cameraSelector, j10);
            }
        };
        CameraDeviceSurfaceManager.Provider provider2 = new CameraDeviceSurfaceManager.Provider() { // from class: c.b
            @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider
            public final CameraDeviceSurfaceManager newInstance(Context context, Object obj, Set set) {
                return Camera2Config.m376b(context, obj, set);
            }
        };
        return new CameraXConfig.Builder().setCameraFactoryProvider(provider).setDeviceSurfaceManagerProvider(provider2).setUseCaseConfigFactoryProvider(new UseCaseConfigFactory.Provider() { // from class: c.c
            @Override // androidx.camera.core.impl.UseCaseConfigFactory.Provider
            public final UseCaseConfigFactory newInstance(Context context) {
                return Camera2Config.m375a(context);
            }
        }).build();
    }
}
