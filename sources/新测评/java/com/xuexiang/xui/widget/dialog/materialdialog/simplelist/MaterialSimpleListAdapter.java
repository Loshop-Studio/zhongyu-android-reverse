package com.xuexiang.xui.widget.dialog.materialdialog.simplelist;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import java.util.List;
import p005a3.InterfaceC0018a;
import p137k.AbstractC7846r;

/* loaded from: classes4.dex */
public class MaterialSimpleListAdapter extends RecyclerView.Adapter<ViewOnClickListenerC6520b> implements InterfaceC0018a {

    /* renamed from: a */
    public MaterialDialog f6239a;

    /* renamed from: b */
    public List f6240b;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.simplelist.MaterialSimpleListAdapter$a */
    public interface InterfaceC6519a {
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.simplelist.MaterialSimpleListAdapter$b */
    public static class ViewOnClickListenerC6520b extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public final ImageView f6241a;

        /* renamed from: b */
        public final TextView f6242b;

        /* renamed from: c */
        public final MaterialSimpleListAdapter f6243c;

        public ViewOnClickListenerC6520b(View view, MaterialSimpleListAdapter materialSimpleListAdapter) {
            super(view);
            this.f6241a = (ImageView) view.findViewById(R.id.icon);
            this.f6242b = (TextView) view.findViewById(R.id.title);
            this.f6243c = materialSimpleListAdapter;
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialSimpleListAdapter materialSimpleListAdapter = this.f6243c;
            if (materialSimpleListAdapter != null) {
                MaterialSimpleListAdapter.m5639b(materialSimpleListAdapter);
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC6519a m5639b(MaterialSimpleListAdapter materialSimpleListAdapter) {
        materialSimpleListAdapter.getClass();
        return null;
    }

    @Override // p005a3.InterfaceC0018a
    /* renamed from: a */
    public void mo52a(MaterialDialog materialDialog) {
        this.f6239a = materialDialog;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewOnClickListenerC6520b viewOnClickListenerC6520b, int i10) {
        if (this.f6239a == null) {
            return;
        }
        AbstractC7846r.m13306a(this.f6240b.get(i10));
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ViewOnClickListenerC6520b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new ViewOnClickListenerC6520b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.xmd_layout_simplelist_item, viewGroup, false), this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f6240b.size();
    }
}
