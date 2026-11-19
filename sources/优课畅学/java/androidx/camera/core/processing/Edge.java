package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public class Edge<T> implements Consumer<T> {
    private Consumer<T> mListener;

    @Override // androidx.core.util.Consumer
    public void accept(@NonNull T t10) {
        AbstractC9133u.m16131e(this.mListener, "Listener is not set.");
        this.mListener.accept(t10);
    }

    public void setListener(@NonNull Consumer<T> consumer) {
        this.mListener = consumer;
    }
}
