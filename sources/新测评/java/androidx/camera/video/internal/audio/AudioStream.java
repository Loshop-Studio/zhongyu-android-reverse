package androidx.camera.video.internal.audio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface AudioStream {

    public interface AudioStreamCallback {
        default void onSilenceStateChanged(boolean z9) {
        }
    }

    public static class AudioStreamException extends Exception {
        public AudioStreamException() {
        }

        public AudioStreamException(@NonNull String str) {
            super(str);
        }

        public AudioStreamException(@NonNull String str, @NonNull Throwable th) {
            super(str, th);
        }

        public AudioStreamException(@NonNull Throwable th) {
            super(th);
        }
    }

    @AutoValue
    public static abstract class PacketInfo {
        @NonNull
        /* renamed from: of */
        public static PacketInfo m957of(int i10, long j10) {
            return new AutoValue_AudioStream_PacketInfo(i10, j10);
        }

        public abstract int getSizeInBytes();

        public abstract long getTimestampNs();
    }

    @NonNull
    PacketInfo read(@NonNull ByteBuffer byteBuffer);

    void release();

    void setCallback(@Nullable AudioStreamCallback audioStreamCallback, @Nullable Executor executor);

    void start() throws IllegalStateException, AudioStreamException;

    void stop() throws IllegalStateException;
}
