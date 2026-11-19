package com.xuexiang.xui.widget.dialog.materialdialog.simplelist;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.R$layout;
import p096k2.ViewOnClickListenerC5753a;

/* loaded from: classes3.dex */
public class MaterialSimpleListAdapter extends RecyclerView.Adapter<ViewOnClickListenerC5753a> {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC5753a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.md_layout_simplelist_item, viewGroup, false), this);
    }
}
