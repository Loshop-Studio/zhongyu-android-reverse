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
import p217q.AbstractC9343a;
import p221q3.InterfaceC9357a;

/* loaded from: classes4.dex */
public class MaterialSimpleListAdapter extends RecyclerView.Adapter<ViewOnClickListenerC6840b> implements InterfaceC9357a {

    /* renamed from: a */
    public MaterialDialog f7497a;

    /* renamed from: b */
    public List f7498b;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.simplelist.MaterialSimpleListAdapter$a */
    public interface InterfaceC6839a {
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.simplelist.MaterialSimpleListAdapter$b */
    public static class ViewOnClickListenerC6840b extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public final ImageView f7499a;

        /* renamed from: b */
        public final TextView f7500b;

        /* renamed from: c */
        public final MaterialSimpleListAdapter f7501c;

        public ViewOnClickListenerC6840b(View view, MaterialSimpleListAdapter materialSimpleListAdapter) {
            super(view);
            this.f7499a = (ImageView) view.findViewById(R.id.icon);
            this.f7500b = (TextView) view.findViewById(R.id.title);
            this.f7501c = materialSimpleListAdapter;
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialSimpleListAdapter materialSimpleListAdapter = this.f7501c;
            if (materialSimpleListAdapter != null) {
                MaterialSimpleListAdapter.m6744b(materialSimpleListAdapter);
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC6839a m6744b(MaterialSimpleListAdapter materialSimpleListAdapter) {
        materialSimpleListAdapter.getClass();
        return null;
    }

    @Override // p221q3.InterfaceC9357a
    /* renamed from: a */
    public void mo6745a(MaterialDialog materialDialog) {
        this.f7497a = materialDialog;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewOnClickListenerC6840b viewOnClickListenerC6840b, int i9) {
        if (this.f7497a == null) {
            return;
        }
        AbstractC9343a.m15285a(this.f7498b.get(i9));
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ViewOnClickListenerC6840b onCreateViewHolder(ViewGroup viewGroup, int i9) {
        return new ViewOnClickListenerC6840b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.xmd_layout_simplelist_item, viewGroup, false), this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f7498b.size();
    }
}
