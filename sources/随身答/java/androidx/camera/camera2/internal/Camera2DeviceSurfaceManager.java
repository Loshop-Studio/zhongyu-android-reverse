package androidx.camera.camera2.internal;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class Camera2DeviceSurfaceManager implements CameraDeviceSurfaceManager {
    private static final String TAG = "Camera2DeviceSurfaceManager";
    private final CamcorderProfileHelper mCamcorderProfileHelper;
    private final Map<String, SupportedSurfaceCombination> mCameraSupportedSurfaceCombinationMap;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Camera2DeviceSurfaceManager(@NonNull Context context, @Nullable Object obj, @NonNull Set<String> set) throws CameraUnavailableException {
        this(context, new CamcorderProfileHelper() { // from class: androidx.camera.camera2.internal.Camera2DeviceSurfaceManager.1
            @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
            public CamcorderProfile get(int i9, int i10) {
                return CamcorderProfile.get(i9, i10);
            }

            @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
            public boolean hasProfile(int i9, int i10) {
                return CamcorderProfile.hasProfile(i9, i10);
            }
        }, obj, set);
    }

    private void init(@NonNull Context context, @NonNull CameraManagerCompat cameraManagerCompat, @NonNull Set<String> set) throws CameraUnavailableException {
        Preconditions.checkNotNull(context);
        for (String str : set) {
            this.mCameraSupportedSurfaceCombinationMap.put(str, new SupportedSurfaceCombination(context, str, cameraManagerCompat, this.mCamcorderProfileHelper));
        }
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    @NonNull
    public Pair<Map<UseCaseConfig<?>, StreamSpec>, Map<AttachedSurfaceInfo, StreamSpec>> getSuggestedStreamSpecs(int i9, @NonNull String str, @NonNull List<AttachedSurfaceInfo> list, @NonNull Map<UseCaseConfig<?>, List<Size>> map, boolean z9, boolean z10) {
        Preconditions.checkArgument(!map.isEmpty(), "No new use cases to be bound.");
        SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(str);
        if (supportedSurfaceCombination != null) {
            return supportedSurfaceCombination.getSuggestedStreamSpecifications(i9, list, map, z9, z10);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    @Nullable
    public SurfaceConfig transformSurfaceConfig(int i9, @NonNull String str, int i10, @NonNull Size size) {
        SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(str);
        if (supportedSurfaceCombination != null) {
            return supportedSurfaceCombination.transformSurfaceConfig(i9, i10, size);
        }
        return null;
    }

    public Camera2DeviceSurfaceManager(@NonNull Context context, @NonNull CamcorderProfileHelper camcorderProfileHelper, @Nullable Object obj, @NonNull Set<String> set) throws CameraUnavailableException {
        this.mCameraSupportedSurfaceCombinationMap = new HashMap();
        Preconditions.checkNotNull(camcorderProfileHelper);
        this.mCamcorderProfileHelper = camcorderProfileHelper;
        init(context, obj instanceof CameraManagerCompat ? (CameraManagerCompat) obj : CameraManagerCompat.from(context), set);
    }
}
