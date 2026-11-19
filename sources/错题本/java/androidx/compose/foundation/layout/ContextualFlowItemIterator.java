package androidx.compose.foundation.layout;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6473e;
import p160s6.InterfaceC6560a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012<\u0010\f\u001a8\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017RJ\u0010\f\u001a8\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m5110d2 = {"Landroidx/compose/foundation/layout/ContextualFlowItemIterator;", "", "Landroidx/compose/ui/layout/Measurable;", "", "itemCount", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "", "getMeasurables", "<init>", "(ILr6/e;)V", "", "hasNext", "()Z", "next", "()Landroidx/compose/ui/layout/Measurable;", "getNext$foundation_layout_release", "(Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;", "getNext", "I", "Lr6/e;", "", "_list", "Ljava/util/List;", "itemIndex", "listIndex", "getList", "()Ljava/util/List;", "list", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ContextualFlowItemIterator implements Iterator<Measurable>, InterfaceC6560a {
    public static final int $stable = 8;

    @NotNull
    private final List<Measurable> _list = new ArrayList();

    @NotNull
    private final InterfaceC6473e getMeasurables;
    private final int itemCount;
    private int itemIndex;
    private int listIndex;

    public ContextualFlowItemIterator(int i, @NotNull InterfaceC6473e interfaceC6473e) {
        this.itemCount = i;
        this.getMeasurables = interfaceC6473e;
    }

    public static /* synthetic */ Measurable getNext$foundation_layout_release$default(ContextualFlowItemIterator contextualFlowItemIterator, FlowLineInfo flowLineInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            flowLineInfo = new FlowLineInfo(0, 0, 0.0f, 0.0f, 15, null);
        }
        return contextualFlowItemIterator.getNext$foundation_layout_release(flowLineInfo);
    }

    @NotNull
    public final List<Measurable> getList() {
        return this._list;
    }

    @NotNull
    public final Measurable getNext$foundation_layout_release(@NotNull FlowLineInfo info) {
        if (this.listIndex < getList().size()) {
            Measurable measurable = getList().get(this.listIndex);
            this.listIndex++;
            return measurable;
        }
        int i = this.itemIndex;
        if (i >= this.itemCount) {
            throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.itemIndex);
        }
        List list = (List) this.getMeasurables.invoke(Integer.valueOf(i), info);
        this.itemIndex++;
        if (list.isEmpty()) {
            return next();
        }
        Measurable measurable2 = (Measurable) AbstractC5805t.m5228h0(list);
        this._list.addAll(list);
        this.listIndex++;
        return measurable2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.listIndex < getList().size() || this.itemIndex < this.itemCount;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public Measurable next() {
        return getNext$foundation_layout_release$default(this, null, 1, null);
    }
}
