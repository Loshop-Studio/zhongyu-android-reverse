package androidx.camera.video.internal.encoder;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import p049e1.InterfaceFutureC5453a;

/* loaded from: classes.dex */
public interface InputBuffer {
    boolean cancel();

    @NonNull
    ByteBuffer getByteBuffer();

    @NonNull
    InterfaceFutureC5453a getTerminationFuture();

    void setEndOfStream(boolean z8);

    void setPresentationTimeUs(long j7);

    boolean submit();
}
