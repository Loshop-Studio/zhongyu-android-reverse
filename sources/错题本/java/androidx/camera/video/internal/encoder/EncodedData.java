package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import p049e1.InterfaceFutureC5453a;

/* loaded from: classes.dex */
public interface EncodedData extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    @NonNull
    MediaCodec.BufferInfo getBufferInfo();

    @NonNull
    ByteBuffer getByteBuffer();

    @NonNull
    InterfaceFutureC5453a getClosedFuture();

    long getPresentationTimeUs();

    boolean isKeyFrame();

    long size();
}
