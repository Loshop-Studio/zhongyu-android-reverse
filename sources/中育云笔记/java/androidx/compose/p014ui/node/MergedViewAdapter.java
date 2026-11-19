package androidx.compose.p014ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class MergedViewAdapter implements ViewAdapter {
    public static final int $stable = 8;
    private final List<ViewAdapter> adapters = new ArrayList();

    /* renamed from: id */
    private final int f1262id;

    @Override // androidx.compose.p014ui.node.ViewAdapter
    public void didInsert(View view, ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).didInsert(view, viewGroup);
        }
    }

    @Override // androidx.compose.p014ui.node.ViewAdapter
    public void didUpdate(View view, ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).didUpdate(view, viewGroup);
        }
    }

    public final <T extends ViewAdapter> T get(int i10, InterfaceC9529a interfaceC9529a) {
        ViewAdapter viewAdapter;
        List<ViewAdapter> adapters = getAdapters();
        int size = adapters.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                viewAdapter = null;
                break;
            }
            viewAdapter = adapters.get(i11);
            if (viewAdapter.getId() == i10) {
                break;
            }
            i11++;
        }
        T t10 = viewAdapter instanceof ViewAdapter ? (T) viewAdapter : null;
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) interfaceC9529a.invoke();
        getAdapters().add(t11);
        return t11;
    }

    public final List<ViewAdapter> getAdapters() {
        return this.adapters;
    }

    @Override // androidx.compose.p014ui.node.ViewAdapter
    public int getId() {
        return this.f1262id;
    }

    @Override // androidx.compose.p014ui.node.ViewAdapter
    public void willInsert(View view, ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).willInsert(view, viewGroup);
        }
    }
}
