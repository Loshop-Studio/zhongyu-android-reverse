package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes3.dex */
class VolumeProviderCompatApi21 {

    public interface Delegate {
        void onAdjustVolume(int i6);

        void onSetVolumeTo(int i6);
    }

    private VolumeProviderCompatApi21() {
    }

    public static Object createVolumeProvider(int i6, int i7, int i8, final Delegate delegate) {
        return new VolumeProvider(i6, i7, i8) { // from class: androidx.media.VolumeProviderCompatApi21.1
            @Override // android.media.VolumeProvider
            public void onAdjustVolume(int i9) {
                delegate.onAdjustVolume(i9);
            }

            @Override // android.media.VolumeProvider
            public void onSetVolumeTo(int i9) {
                delegate.onSetVolumeTo(i9);
            }
        };
    }

    public static void setCurrentVolume(Object obj, int i6) {
        ((VolumeProvider) obj).setCurrentVolume(i6);
    }
}
