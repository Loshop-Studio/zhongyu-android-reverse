package androidx.camera.video.internal;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Observable;
import p049e1.InterfaceFutureC5453a;

/* loaded from: classes.dex */
public interface BufferProvider<T> extends Observable<State> {

    public enum State {
        ACTIVE,
        INACTIVE
    }

    @NonNull
    InterfaceFutureC5453a acquireBuffer();
}
