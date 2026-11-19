package androidx.camera.view.video;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;

/* loaded from: classes.dex */
public class AudioConfig {

    @NonNull
    public static final AudioConfig AUDIO_DISABLED = new AudioConfig(false);
    private final boolean mIsAudioEnabled;

    public AudioConfig(boolean z8) {
        this.mIsAudioEnabled = z8;
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    public static AudioConfig create(boolean z8) {
        return new AudioConfig(z8);
    }

    public boolean getAudioEnabled() {
        return this.mIsAudioEnabled;
    }
}
