package androidx.camera.video.internal.compat;

import android.media.AudioFormat;
import android.media.AudioRecord;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;

@RequiresApi(23)
/* loaded from: classes.dex */
public final class Api23Impl {
    private Api23Impl() {
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    public static AudioRecord build(@NonNull AudioRecord.Builder builder) {
        return builder.build();
    }

    @NonNull
    public static AudioRecord.Builder createAudioRecordBuilder() {
        return new AudioRecord.Builder();
    }

    public static void setAudioFormat(@NonNull AudioRecord.Builder builder, @NonNull AudioFormat audioFormat) throws IllegalArgumentException {
        builder.setAudioFormat(audioFormat);
    }

    public static void setAudioSource(@NonNull AudioRecord.Builder builder, int i9) throws IllegalArgumentException {
        builder.setAudioSource(i9);
    }

    public static void setBufferSizeInBytes(@NonNull AudioRecord.Builder builder, int i9) throws IllegalArgumentException {
        builder.setBufferSizeInBytes(i9);
    }
}
