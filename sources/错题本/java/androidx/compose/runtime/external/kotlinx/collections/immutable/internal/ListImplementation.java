package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0016\u001a\u00020\u00042\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\u00182\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00122\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m5110d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ListImplementation;", "", "<init>", "()V", "", "index", "size", "Ld6/s;", "checkElementIndex$runtime_release", "(II)V", "checkElementIndex", "checkPositionIndex$runtime_release", "checkPositionIndex", "fromIndex", "toIndex", "checkRangeIndexes$runtime_release", "(III)V", "checkRangeIndexes", "", "c", "orderedHashCode$runtime_release", "(Ljava/util/Collection;)I", "orderedHashCode", "other", "", "orderedEquals$runtime_release", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "orderedEquals", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ListImplementation {
    public static final int $stable = 0;

    @NotNull
    public static final ListImplementation INSTANCE = new ListImplementation();

    private ListImplementation() {
    }

    @JvmStatic
    public static final void checkElementIndex$runtime_release(int index, int size) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(AbstractC0584a.m912m(index, size, "index: ", ", size: "));
        }
    }

    @JvmStatic
    public static final void checkPositionIndex$runtime_release(int index, int size) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(AbstractC0584a.m912m(index, size, "index: ", ", size: "));
        }
    }

    @JvmStatic
    public static final void checkRangeIndexes$runtime_release(int fromIndex, int toIndex, int size) {
        if (fromIndex < 0 || toIndex > size) {
            StringBuilder sbM99x = AbstractC0037f.m99x("fromIndex: ", ", toIndex: ", fromIndex, ", size: ", toIndex);
            sbM99x.append(size);
            throw new IndexOutOfBoundsException(sbM99x.toString());
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException(AbstractC0584a.m912m(fromIndex, toIndex, "fromIndex: ", " > toIndex: "));
        }
    }

    @JvmStatic
    public static final boolean orderedEquals$runtime_release(@NotNull Collection<?> c, @NotNull Collection<?> other) {
        if (c.size() != other.size()) {
            return false;
        }
        Iterator<?> it = other.iterator();
        Iterator<?> it2 = c.iterator();
        while (it2.hasNext()) {
            if (!AbstractC5830k.m5325b(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    public static final int orderedHashCode$runtime_release(@NotNull Collection<?> c) {
        Iterator<?> it = c.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }
}
