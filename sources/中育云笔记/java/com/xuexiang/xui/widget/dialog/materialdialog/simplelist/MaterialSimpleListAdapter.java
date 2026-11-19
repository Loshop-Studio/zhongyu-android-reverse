package com.xuexiang.xui.widget.dialog.materialdialog.simplelist;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.R$layout;
import java.util.List;

/* loaded from: classes5.dex */
public class MaterialSimpleListAdapter extends RecyclerView.Adapter<ViewOnClickListenerC8103b> {

    /* renamed from: a */
    public List f15875a;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.simplelist.MaterialSimpleListAdapter$a */
    public interface InterfaceC8102a {
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.simplelist.MaterialSimpleListAdapter$b */
    public static class ViewOnClickListenerC8103b extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: c */
        public final ImageView f15876c;

        /* renamed from: d */
        public final TextView f15877d;

        /* renamed from: e */
        public final MaterialSimpleListAdapter f15878e;

        public ViewOnClickListenerC8103b(View view, MaterialSimpleListAdapter materialSimpleListAdapter) {
            super(view);
            this.f15876c = (ImageView) view.findViewById(R.id.icon);
            this.f15877d = (TextView) view.findViewById(R.id.title);
            this.f15878e = materialSimpleListAdapter;
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialSimpleListAdapter materialSimpleListAdapter = this.f15878e;
            if (materialSimpleListAdapter != null) {
                MaterialSimpleListAdapter.m12560a(materialSimpleListAdapter);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8102a m12560a(MaterialSimpleListAdapter materialSimpleListAdapter) {
        materialSimpleListAdapter.getClass();
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewOnClickListenerC8103b viewOnClickListenerC8103b, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ViewOnClickListenerC8103b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new ViewOnClickListenerC8103b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.md_layout_simplelist_item, viewGroup, false), this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f15875a.size();
    }
}
