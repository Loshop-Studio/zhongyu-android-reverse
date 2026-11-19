package androidx.paging;

import android.view.ViewGroup;
import androidx.paging.LoadState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public abstract class LoadStateAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private LoadState loadState = new LoadState.NotLoading(false);

    public boolean displayLoadStateAsItem(LoadState loadState) {
        AbstractC9979u.m20294g(loadState, "loadState");
        return (loadState instanceof LoadState.Loading) || (loadState instanceof LoadState.Error);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return displayLoadStateAsItem(this.loadState) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        return getStateViewType(this.loadState);
    }

    public final LoadState getLoadState() {
        return this.loadState;
    }

    public int getStateViewType(LoadState loadState) {
        AbstractC9979u.m20294g(loadState, "loadState");
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(VH holder, int i10) {
        AbstractC9979u.m20294g(holder, "holder");
        onBindViewHolder((LoadStateAdapter<VH>) holder, this.loadState);
    }

    public abstract void onBindViewHolder(VH vh, LoadState loadState);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final VH onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        return (VH) onCreateViewHolder(parent, this.loadState);
    }

    public abstract VH onCreateViewHolder(ViewGroup viewGroup, LoadState loadState);

    public final void setLoadState(LoadState loadState) {
        AbstractC9979u.m20294g(loadState, "loadState");
        if (AbstractC9979u.m20289b(this.loadState, loadState)) {
            return;
        }
        boolean zDisplayLoadStateAsItem = displayLoadStateAsItem(this.loadState);
        boolean zDisplayLoadStateAsItem2 = displayLoadStateAsItem(loadState);
        if (zDisplayLoadStateAsItem && !zDisplayLoadStateAsItem2) {
            notifyItemRemoved(0);
        } else if (zDisplayLoadStateAsItem2 && !zDisplayLoadStateAsItem) {
            notifyItemInserted(0);
        } else if (zDisplayLoadStateAsItem && zDisplayLoadStateAsItem2) {
            notifyItemChanged(0);
        }
        this.loadState = loadState;
    }
}
