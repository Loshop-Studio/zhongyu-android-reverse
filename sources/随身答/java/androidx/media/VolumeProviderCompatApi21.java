package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes3.dex */
class VolumeProviderCompatApi21 {

    public interface Delegate {
        void onAdjustVolume(int i9);

        void onSetVolumeTo(int i9);
    }

    private VolumeProviderCompatApi21() {
    }

    public static Object createVolumeProvider(int i9, int i10, int i11, final Delegate delegate) {
        return new VolumeProvider(i9, i10, i11) { // from class: androidx.media.VolumeProviderCompatApi21.1
            @Override // android.media.VolumeProvider
            public void onAdjustVolume(int i12) {
                delegate.onAdjustVolume(i12);
            }

            @Override // android.media.VolumeProvider
            public void onSetVolumeTo(int i12) {
                delegate.onSetVolumeTo(i12);
            }
        };
    }

    public static void setCurrentVolume(Object obj, int i9) {
        ((VolumeProvider) obj).setCurrentVolume(i9);
    }
}
