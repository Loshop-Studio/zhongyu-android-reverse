package androidx.compose.p014ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class WeakCache<T> {
    public static final int $stable = 8;
    private final MutableVector<Reference<T>> values = new MutableVector<>(new Reference[16], 0);
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    private final void clearWeakReferences() {
        Reference<? extends T> referencePoll;
        do {
            referencePoll = this.referenceQueue.poll();
            if (referencePoll != null) {
                this.values.remove(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final int getSize() {
        clearWeakReferences();
        return this.values.getSize();
    }

    public final T pop() {
        clearWeakReferences();
        while (this.values.getSize() != 0) {
            T t10 = this.values.removeAt(r0.getSize() - 1).get();
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public final void push(T t10) {
        clearWeakReferences();
        this.values.add(new WeakReference(t10, this.referenceQueue));
    }
}
