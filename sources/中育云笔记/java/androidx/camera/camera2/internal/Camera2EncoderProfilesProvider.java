package androidx.camera.camera2.internal;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.compat.EncoderProfilesProxyCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Camera2EncoderProfilesProvider implements EncoderProfilesProvider {
    private static final String TAG = "Camera2EncoderProfilesProvider";
    private final String mCameraId;
    private final Quirks mCameraQuirks;
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache = new HashMap();
    private final boolean mHasValidCameraId;
    private final int mIntCameraId;

    @RequiresApi(31)
    public static class Api31Impl {
        private Api31Impl() {
        }

        public static EncoderProfiles getAll(String str, int i10) {
            return CamcorderProfile.getAll(str, i10);
        }
    }

    public Camera2EncoderProfilesProvider(@NonNull String str, @NonNull Quirks quirks) throws NumberFormatException {
        boolean z10;
        int i10;
        this.mCameraId = str;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            Logger.m579w(TAG, "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z10 = false;
            i10 = -1;
        }
        this.mHasValidCameraId = z10;
        this.mIntCameraId = i10;
        this.mCameraQuirks = quirks;
    }

    @Nullable
    private EncoderProfilesProxy createProfilesFromCamcorderProfile(int i10) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.mIntCameraId, i10);
        } catch (RuntimeException e10) {
            Logger.m580w(TAG, "Unable to get CamcorderProfile by quality: " + i10, e10);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return EncoderProfilesProxyCompat.from(camcorderProfile);
        }
        return null;
    }

    @Nullable
    private EncoderProfilesProxy findHighestQualityProfiles() {
        Iterator<Integer> it = EncoderProfilesProvider.QUALITY_HIGH_TO_LOW.iterator();
        while (it.hasNext()) {
            EncoderProfilesProxy all = getAll(it.next().intValue());
            if (all != null) {
                return all;
            }
        }
        return null;
    }

    @Nullable
    private EncoderProfilesProxy findLowestQualityProfiles() {
        for (int size = EncoderProfilesProvider.QUALITY_HIGH_TO_LOW.size() - 1; size >= 0; size--) {
            EncoderProfilesProxy all = getAll(size);
            if (all != null) {
                return all;
            }
        }
        return null;
    }

    @Nullable
    private EncoderProfilesProxy getProfilesInternal(int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles all = Api31Impl.getAll(this.mCameraId, i10);
            if (all == null) {
                return null;
            }
            if (DeviceQuirks.get(InvalidVideoProfilesQuirk.class) != null) {
                Logger.m573d(TAG, "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return EncoderProfilesProxyCompat.from(all);
                } catch (NullPointerException e10) {
                    Logger.m580w(TAG, "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e10);
                }
            }
        }
        return createProfilesFromCamcorderProfile(i10);
    }

    private boolean isEncoderProfilesResolutionValidInQuirk(@NonNull EncoderProfilesProxy encoderProfilesProxy) {
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.mCameraQuirks.get(CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles = encoderProfilesProxy.getVideoProfiles();
        if (videoProfiles.isEmpty()) {
            return true;
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = videoProfiles.get(0);
        return camcorderProfileResolutionQuirk.getSupportedResolutions().contains(new Size(videoProfileProxy.getWidth(), videoProfileProxy.getHeight()));
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i10) {
        EncoderProfilesProxy encoderProfilesProxyFindLowestQualityProfiles = null;
        if (!this.mHasValidCameraId || !CamcorderProfile.hasProfile(this.mIntCameraId, i10)) {
            return null;
        }
        if (this.mEncoderProfilesCache.containsKey(Integer.valueOf(i10))) {
            return this.mEncoderProfilesCache.get(Integer.valueOf(i10));
        }
        EncoderProfilesProxy profilesInternal = getProfilesInternal(i10);
        if (profilesInternal == null || isEncoderProfilesResolutionValidInQuirk(profilesInternal)) {
            encoderProfilesProxyFindLowestQualityProfiles = profilesInternal;
        } else if (i10 == 1) {
            encoderProfilesProxyFindLowestQualityProfiles = findHighestQualityProfiles();
        } else if (i10 == 0) {
            encoderProfilesProxyFindLowestQualityProfiles = findLowestQualityProfiles();
        }
        this.mEncoderProfilesCache.put(Integer.valueOf(i10), encoderProfilesProxyFindLowestQualityProfiles);
        return encoderProfilesProxyFindLowestQualityProfiles;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i10) {
        return this.mHasValidCameraId && getAll(i10) != null;
    }
}
