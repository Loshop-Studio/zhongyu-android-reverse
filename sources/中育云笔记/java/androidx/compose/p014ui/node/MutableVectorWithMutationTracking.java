package androidx.compose.p014ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class MutableVectorWithMutationTracking<T> {
    public static final int $stable = MutableVector.$stable;
    private final InterfaceC9529a onVectorMutated;
    private final MutableVector<T> vector;

    public MutableVectorWithMutationTracking(MutableVector<T> mutableVector, InterfaceC9529a interfaceC9529a) {
        this.vector = mutableVector;
        this.onVectorMutated = interfaceC9529a;
    }

    public final void add(int i10, T t10) {
        this.vector.add(i10, t10);
        this.onVectorMutated.invoke();
    }

    public final List<T> asList() {
        return getVector().asMutableList();
    }

    public final void clear() {
        this.vector.clear();
        this.onVectorMutated.invoke();
    }

    public final void forEach(InterfaceC9540l interfaceC9540l) {
        MutableVector<T> vector = getVector();
        T[] tArr = vector.content;
        int size = vector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC9540l.invoke(tArr[i10]);
        }
    }

    public final T get(int i10) {
        return getVector().content[i10];
    }

    public final InterfaceC9529a getOnVectorMutated() {
        return this.onVectorMutated;
    }

    public final int getSize() {
        return getVector().getSize();
    }

    public final MutableVector<T> getVector() {
        return this.vector;
    }

    public final T removeAt(int i10) {
        T tRemoveAt = this.vector.removeAt(i10);
        this.onVectorMutated.invoke();
        return tRemoveAt;
    }
}
