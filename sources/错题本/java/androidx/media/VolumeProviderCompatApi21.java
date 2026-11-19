package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes2.dex */
class VolumeProviderCompatApi21 {

    public interface Delegate {
        void onAdjustVolume(int i);

        void onSetVolumeTo(int i);
    }

    private VolumeProviderCompatApi21() {
    }

    public static Object createVolumeProvider(int i, int i8, int i9, final Delegate delegate) {
        return new VolumeProvider(i, i8, i9) { // from class: androidx.media.VolumeProviderCompatApi21.1
            @Override // android.media.VolumeProvider
            public void onAdjustVolume(int i10) {
                delegate.onAdjustVolume(i10);
            }

            @Override // android.media.VolumeProvider
            public void onSetVolumeTo(int i10) {
                delegate.onSetVolumeTo(i10);
            }
        };
    }

    public static void setCurrentVolume(Object obj, int i) {
        ((VolumeProvider) obj).setCurrentVolume(i);
    }
}
