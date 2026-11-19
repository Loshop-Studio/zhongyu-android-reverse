package com.friday.paint.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.friday.paint.model.PaintEntity;
import com.friday.paint.view.TheSketchFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class NoteFragmentStateAdapter extends FragmentStateAdapter {

    /* renamed from: a */
    public final List f9759a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragmentStateAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        AbstractC9979u.m20294g(fragmentManager, "fragmentManager");
        AbstractC9979u.m20294g(lifecycle, "lifecycle");
        this.f9759a = new ArrayList();
    }

    /* renamed from: a */
    public final void m7297a(int i10, PaintEntity data) {
        AbstractC9979u.m20294g(data, "data");
        this.f9759a.add(i10, data);
    }

    /* renamed from: b */
    public final void m7298b(List dataList) {
        AbstractC9979u.m20294g(dataList, "dataList");
        this.f9759a.addAll(dataList);
        notifyDataSetChanged();
    }

    /* renamed from: c */
    public final void m7299c(int i10) {
        this.f9759a.remove(i10);
        notifyItemRemoved(i10);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public boolean containsItem(long j10) {
        List list = this.f9759a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((PaintEntity) it.next()).getPath().hashCode() == j10) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int i10) {
        return TheSketchFragment.f10018n.m7525a(((PaintEntity) getData().get(i10)).getPath());
    }

    /* renamed from: d */
    public final void m7300d(int i10, int i11) {
        if (i10 != i11) {
            PaintEntity paintEntity = (PaintEntity) this.f9759a.get(i10);
            this.f9759a.remove(paintEntity);
            this.f9759a.add(i11, paintEntity);
        }
    }

    public final List getData() {
        return this.f9759a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f9759a.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return ((PaintEntity) this.f9759a.get(i10)).getPath().hashCode();
    }
}
