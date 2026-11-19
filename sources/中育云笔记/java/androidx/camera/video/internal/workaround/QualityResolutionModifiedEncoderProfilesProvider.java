package androidx.camera.video.internal.workaround;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class QualityResolutionModifiedEncoderProfilesProvider implements EncoderProfilesProvider {

    @NonNull
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache = new HashMap();

    @NonNull
    private final EncoderProfilesProvider mProvider;

    @NonNull
    private final Quirks mQuirks;

    public QualityResolutionModifiedEncoderProfilesProvider(@NonNull EncoderProfilesProvider encoderProfilesProvider, @NonNull Quirks quirks) {
        this.mProvider = encoderProfilesProvider;
        this.mQuirks = quirks;
    }

    @Nullable
    private EncoderProfilesProxy createNewEncoderProfiles(@NonNull EncoderProfilesProxy encoderProfilesProxy, @NonNull Size size) {
        ArrayList arrayList = new ArrayList();
        Iterator<EncoderProfilesProxy.VideoProfileProxy> it = encoderProfilesProxy.getVideoProfiles().iterator();
        while (it.hasNext()) {
            arrayList.add(generateVideoProfile(it.next(), size));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), arrayList);
    }

    @NonNull
    private static EncoderProfilesProxy.VideoProfileProxy generateVideoProfile(@NonNull EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, @NonNull Size size) {
        return EncoderProfilesProxy.VideoProfileProxy.create(videoProfileProxy.getCodec(), videoProfileProxy.getMediaType(), videoProfileProxy.getBitrate(), videoProfileProxy.getFrameRate(), size.getWidth(), size.getHeight(), videoProfileProxy.getProfile(), videoProfileProxy.getBitDepth(), videoProfileProxy.getChromaSubsampling(), videoProfileProxy.getHdrFormat());
    }

    @Nullable
    private Size getAlternativeResolution(int i10) {
        for (StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk : this.mQuirks.getAll(StretchedVideoResolutionQuirk.class)) {
            if (stretchedVideoResolutionQuirk != null) {
                return stretchedVideoResolutionQuirk.getAlternativeResolution(i10);
            }
        }
        return null;
    }

    @Nullable
    private EncoderProfilesProxy getProfilesInternal(int i10) {
        EncoderProfilesProxy encoderProfilesProxyCreateNewEncoderProfiles;
        if (this.mEncoderProfilesCache.containsKey(Integer.valueOf(i10))) {
            return this.mEncoderProfilesCache.get(Integer.valueOf(i10));
        }
        if (this.mProvider.hasProfile(i10)) {
            EncoderProfilesProxy all = this.mProvider.getAll(i10);
            Objects.requireNonNull(all);
            encoderProfilesProxyCreateNewEncoderProfiles = all;
            Size alternativeResolution = getAlternativeResolution(i10);
            if (alternativeResolution != null) {
                encoderProfilesProxyCreateNewEncoderProfiles = createNewEncoderProfiles(encoderProfilesProxyCreateNewEncoderProfiles, alternativeResolution);
            }
        } else {
            encoderProfilesProxyCreateNewEncoderProfiles = null;
        }
        this.mEncoderProfilesCache.put(Integer.valueOf(i10), encoderProfilesProxyCreateNewEncoderProfiles);
        return encoderProfilesProxyCreateNewEncoderProfiles;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i10) {
        return getProfilesInternal(i10);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i10) {
        return this.mProvider.hasProfile(i10) && getProfilesInternal(i10) != null;
    }
}
