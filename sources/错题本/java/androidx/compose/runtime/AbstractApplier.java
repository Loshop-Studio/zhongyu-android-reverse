package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0007H$¢\u0006\u0004\b\f\u0010\nJ)\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m5110d2 = {"Landroidx/compose/runtime/AbstractApplier;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/Applier;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "Ld6/s;", "down", "up", "()V", "clear", "onClear", "", "", "index", "count", "remove", "(Ljava/util/List;II)V", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "move", "(Ljava/util/List;III)V", "Ljava/lang/Object;", "getRoot", "()Ljava/lang/Object;", "Landroidx/compose/runtime/Stack;", "stack", "Ljava/util/ArrayList;", "<set-?>", "current", "getCurrent", "setCurrent", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class AbstractApplier<T> implements Applier<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;

    @NotNull
    private final ArrayList<T> stack = Stack.m10094constructorimpl$default(null, 1, null);

    public AbstractApplier(T t8) {
        this.root = t8;
        this.current = t8;
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        Stack.m10092clearimpl(this.stack);
        setCurrent(this.root);
        onClear();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T node) {
        Stack.m10104pushimpl(this.stack, getCurrent());
        setCurrent(node);
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    public final void move(@NotNull List<T> list, int i, int i8, int i9) {
        int i10 = i > i8 ? i8 : i8 - i9;
        if (i9 != 1) {
            List<T> listSubList = list.subList(i, i9 + i);
            ArrayList arrayListM5218E0 = AbstractC5805t.m5218E0(listSubList);
            listSubList.clear();
            list.addAll(i10, arrayListM5218E0);
            return;
        }
        if (i == i8 + 1 || i == i8 - 1) {
            list.set(i, list.set(i8, list.get(i)));
        } else {
            list.add(i10, list.remove(i));
        }
    }

    public abstract void onClear();

    public final void remove(@NotNull List<T> list, int i, int i8) {
        if (i8 == 1) {
            list.remove(i);
        } else {
            list.subList(i, i8 + i).clear();
        }
    }

    public void setCurrent(T t8) {
        this.current = t8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.Applier
    /* renamed from: up */
    public void mo1095up() {
        setCurrent(Stack.m10103popimpl(this.stack));
    }
}
