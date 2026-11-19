package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0010H$J\b\u0010\u0014\u001a\u00020\u0010H\u0016J*\u0010\u0015\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0004J\"\u0010\u001b\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0004R&\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000@TX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, m13413d2 = {"Landroidx/compose/runtime/AbstractApplier;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/Applier;", "root", "(Ljava/lang/Object;)V", "<set-?>", "current", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "Ljava/lang/Object;", "getRoot", "stack", "Landroidx/compose/runtime/Stack;", "Ljava/util/ArrayList;", "clear", "", "down", "node", "onClear", "up", "move", "", TypedValues.TransitionType.S_FROM, "", TypedValues.TransitionType.S_TO, "count", "remove", "index", "runtime_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public abstract class AbstractApplier<T> implements Applier<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;
    private final ArrayList<T> stack = Stack.m20836constructorimpl$default(null, 1, null);

    public AbstractApplier(T t9) {
        this.root = t9;
        this.current = t9;
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        Stack.m20834clearimpl(this.stack);
        setCurrent(this.root);
        onClear();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T node) {
        Stack.m20846pushimpl(this.stack, getCurrent());
        setCurrent(node);
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    public final void move(List<T> list, int i9, int i10, int i11) {
        int i12 = i9 > i10 ? i10 : i10 - i11;
        if (i11 != 1) {
            List<T> listSubList = list.subList(i9, i11 + i9);
            List mutableList = CollectionsKt.toMutableList((Collection) listSubList);
            listSubList.clear();
            list.addAll(i12, mutableList);
            return;
        }
        if (i9 == i10 + 1 || i9 == i10 - 1) {
            list.set(i9, list.set(i10, list.get(i9)));
        } else {
            list.add(i12, list.remove(i9));
        }
    }

    public abstract void onClear();

    public final void remove(List<T> list, int i9, int i10) {
        if (i10 == 1) {
            list.remove(i9);
        } else {
            list.subList(i9, i10 + i9).clear();
        }
    }

    public void setCurrent(T t9) {
        this.current = t9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.Applier
    /* renamed from: up */
    public void mo977up() {
        setCurrent(Stack.m20845popimpl(this.stack));
    }
}
