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

/* loaded from: classes2.dex */
public class MaterialSimpleListAdapter extends RecyclerView.Adapter<ViewOnClickListenerC3560b> {

    /* renamed from: a */
    public List f3444a;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.simplelist.MaterialSimpleListAdapter$a */
    public interface InterfaceC3559a {
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.simplelist.MaterialSimpleListAdapter$b */
    public static class ViewOnClickListenerC3560b extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public final ImageView f3445a;

        /* renamed from: b */
        public final TextView f3446b;

        /* renamed from: c */
        public final MaterialSimpleListAdapter f3447c;

        public ViewOnClickListenerC3560b(View view, MaterialSimpleListAdapter materialSimpleListAdapter) {
            super(view);
            this.f3445a = (ImageView) view.findViewById(R.id.icon);
            this.f3446b = (TextView) view.findViewById(R.id.title);
            this.f3447c = materialSimpleListAdapter;
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialSimpleListAdapter materialSimpleListAdapter = this.f3447c;
            if (materialSimpleListAdapter != null) {
                MaterialSimpleListAdapter.m4281a(materialSimpleListAdapter);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC3559a m4281a(MaterialSimpleListAdapter materialSimpleListAdapter) {
        materialSimpleListAdapter.getClass();
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewOnClickListenerC3560b viewOnClickListenerC3560b, int i4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ViewOnClickListenerC3560b onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return new ViewOnClickListenerC3560b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.xmd_layout_simplelist_item, viewGroup, false), this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3444a.size();
    }
}
