package androidx.camera.video.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class DynamicRangeMatchedEncoderProfilesProvider implements EncoderProfilesProvider {
    private final DynamicRange mDynamicRange;
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache = new HashMap();
    private final EncoderProfilesProvider mEncoderProfilesProvider;

    public DynamicRangeMatchedEncoderProfilesProvider(@NonNull EncoderProfilesProvider encoderProfilesProvider, @NonNull DynamicRange dynamicRange) {
        this.mEncoderProfilesProvider = encoderProfilesProvider;
        this.mDynamicRange = dynamicRange;
    }

    @Nullable
    private static EncoderProfilesProxy filterUnmatchedDynamicRange(@Nullable EncoderProfilesProxy encoderProfilesProxy, @NonNull DynamicRange dynamicRange) {
        if (encoderProfilesProxy == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : encoderProfilesProxy.getVideoProfiles()) {
            if (DynamicRangeUtil.isHdrSettingsMatched(videoProfileProxy, dynamicRange)) {
                arrayList.add(videoProfileProxy);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), arrayList);
    }

    @Nullable
    private EncoderProfilesProxy getProfilesInternal(int i10) {
        if (this.mEncoderProfilesCache.containsKey(Integer.valueOf(i10))) {
            return this.mEncoderProfilesCache.get(Integer.valueOf(i10));
        }
        if (!this.mEncoderProfilesProvider.hasProfile(i10)) {
            return null;
        }
        EncoderProfilesProxy encoderProfilesProxyFilterUnmatchedDynamicRange = filterUnmatchedDynamicRange(this.mEncoderProfilesProvider.getAll(i10), this.mDynamicRange);
        this.mEncoderProfilesCache.put(Integer.valueOf(i10), encoderProfilesProxyFilterUnmatchedDynamicRange);
        return encoderProfilesProxyFilterUnmatchedDynamicRange;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i10) {
        return getProfilesInternal(i10);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i10) {
        return this.mEncoderProfilesProvider.hasProfile(i10) && getProfilesInternal(i10) != null;
    }
}
