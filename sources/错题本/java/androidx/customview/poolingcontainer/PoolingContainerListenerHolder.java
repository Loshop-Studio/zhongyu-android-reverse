package androidx.customview.poolingcontainer;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003R$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m5110d2 = {"Landroidx/customview/poolingcontainer/PoolingContainerListenerHolder;", "", "<init>", "()V", "Landroidx/customview/poolingcontainer/PoolingContainerListener;", "listener", "Ld6/s;", "addListener", "(Landroidx/customview/poolingcontainer/PoolingContainerListener;)V", "removeListener", "onRelease", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listeners", "Ljava/util/ArrayList;", "customview-poolingcontainer_release"}, m5111k = 1, m5112mv = {1, 6, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final class PoolingContainerListenerHolder {

    @NotNull
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(@NotNull PoolingContainerListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.listeners.add(listener);
    }

    public final void onRelease() {
        for (int iM5282u = AbstractC5806u.m5282u(this.listeners); -1 < iM5282u; iM5282u--) {
            this.listeners.get(iM5282u).onRelease();
        }
    }

    public final void removeListener(@NotNull PoolingContainerListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.listeners.remove(listener);
    }
}
