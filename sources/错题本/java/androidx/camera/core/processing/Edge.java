package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import kotlin.jvm.internal.AbstractC5830k;

/* loaded from: classes.dex */
public class Edge<T> implements Consumer<T> {
    private Consumer<T> mListener;

    @Override // androidx.core.util.Consumer
    public void accept(@NonNull T t8) {
        AbstractC5830k.m5328e(this.mListener, "Listener is not set.");
        this.mListener.accept(t8);
    }

    public void setListener(@NonNull Consumer<T> consumer) {
        this.mListener = consumer;
    }
}
