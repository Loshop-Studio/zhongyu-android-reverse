package androidx.camera.view.video;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;

/* loaded from: classes.dex */
public class AudioConfig {

    @NonNull
    public static final AudioConfig AUDIO_DISABLED = new AudioConfig(false);
    private final boolean mIsAudioEnabled;

    public AudioConfig(boolean z10) {
        this.mIsAudioEnabled = z10;
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    public static AudioConfig create(boolean z10) {
        return new AudioConfig(z10);
    }

    public boolean getAudioEnabled() {
        return this.mIsAudioEnabled;
    }
}
