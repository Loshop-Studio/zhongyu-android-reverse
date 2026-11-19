package com.xuexiang.xui.widget.dialog.materialdialog.simplelist;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5379p;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import java.util.List;
import p316z1.InterfaceC10701a;

/* loaded from: classes4.dex */
public class MaterialSimpleListAdapter extends RecyclerView.Adapter<ViewOnClickListenerC6923b> implements InterfaceC10701a {

    /* renamed from: a */
    public MaterialDialog f7626a;

    /* renamed from: b */
    public List f7627b;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.simplelist.MaterialSimpleListAdapter$a */
    public interface InterfaceC6922a {
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.simplelist.MaterialSimpleListAdapter$b */
    public static class ViewOnClickListenerC6923b extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public final ImageView f7628a;

        /* renamed from: b */
        public final TextView f7629b;

        /* renamed from: c */
        public final MaterialSimpleListAdapter f7630c;

        public ViewOnClickListenerC6923b(View view, MaterialSimpleListAdapter materialSimpleListAdapter) {
            super(view);
            this.f7628a = (ImageView) view.findViewById(R.id.icon);
            this.f7629b = (TextView) view.findViewById(R.id.title);
            this.f7630c = materialSimpleListAdapter;
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialSimpleListAdapter materialSimpleListAdapter = this.f7630c;
            if (materialSimpleListAdapter != null) {
                MaterialSimpleListAdapter.m6802c(materialSimpleListAdapter);
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC6922a m6802c(MaterialSimpleListAdapter materialSimpleListAdapter) {
        materialSimpleListAdapter.getClass();
        return null;
    }

    @Override // p316z1.InterfaceC10701a
    /* renamed from: b */
    public void mo6803b(MaterialDialog materialDialog) {
        this.f7626a = materialDialog;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewOnClickListenerC6923b viewOnClickListenerC6923b, int i10) {
        if (this.f7626a == null) {
            return;
        }
        AbstractC5379p.m2596a(this.f7627b.get(i10));
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ViewOnClickListenerC6923b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new ViewOnClickListenerC6923b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.xmd_layout_simplelist_item, viewGroup, false), this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f7627b.size();
    }
}
