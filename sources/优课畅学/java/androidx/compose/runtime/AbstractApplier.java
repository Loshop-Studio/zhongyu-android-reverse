package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import p134i7.AbstractC8778f0;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class AbstractApplier<T> implements Applier<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;
    private final ArrayList<T> stack = Stack.m23688constructorimpl$default(null, 1, null);

    public AbstractApplier(T t10) {
        this.root = t10;
        this.current = t10;
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        Stack.m23686clearimpl(this.stack);
        setCurrent(this.root);
        onClear();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T t10) {
        Stack.m23698pushimpl(this.stack, getCurrent());
        setCurrent(t10);
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    public final void move(List<T> list, int i10, int i11, int i12) {
        int i13 = i10 > i11 ? i11 : i11 - i12;
        if (i12 != 1) {
            List<T> listSubList = list.subList(i10, i12 + i10);
            List listM14547X0 = AbstractC8778f0.m14547X0(listSubList);
            listSubList.clear();
            list.addAll(i13, listM14547X0);
            return;
        }
        if (i10 == i11 + 1 || i10 == i11 - 1) {
            list.set(i10, list.set(i11, list.get(i10)));
        } else {
            list.add(i13, list.remove(i10));
        }
    }

    public abstract void onClear();

    public final void remove(List<T> list, int i10, int i11) {
        if (i11 == 1) {
            list.remove(i10);
        } else {
            list.subList(i10, i11 + i10).clear();
        }
    }

    public void setCurrent(T t10) {
        this.current = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.Applier
    /* renamed from: up */
    public void mo972up() {
        setCurrent(Stack.m23697popimpl(this.stack));
    }
}
