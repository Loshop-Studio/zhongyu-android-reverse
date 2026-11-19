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
import p017b2.InterfaceC4410a;
import p087k.AbstractC6619r;

/* loaded from: classes3.dex */
public class MaterialSimpleListAdapter extends RecyclerView.Adapter<ViewOnClickListenerC5899b> implements InterfaceC4410a {

    /* renamed from: a */
    public MaterialDialog f4964a;

    /* renamed from: b */
    public List f4965b;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.simplelist.MaterialSimpleListAdapter$a */
    public interface InterfaceC5898a {
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.simplelist.MaterialSimpleListAdapter$b */
    public static class ViewOnClickListenerC5899b extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public final ImageView f4966a;

        /* renamed from: b */
        public final TextView f4967b;

        /* renamed from: c */
        public final MaterialSimpleListAdapter f4968c;

        public ViewOnClickListenerC5899b(View view, MaterialSimpleListAdapter materialSimpleListAdapter) {
            super(view);
            this.f4966a = (ImageView) view.findViewById(R.id.icon);
            this.f4967b = (TextView) view.findViewById(R.id.title);
            this.f4968c = materialSimpleListAdapter;
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialSimpleListAdapter materialSimpleListAdapter = this.f4968c;
            if (materialSimpleListAdapter != null) {
                MaterialSimpleListAdapter.m4658b(materialSimpleListAdapter);
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC5898a m4658b(MaterialSimpleListAdapter materialSimpleListAdapter) {
        materialSimpleListAdapter.getClass();
        return null;
    }

    @Override // p017b2.InterfaceC4410a
    /* renamed from: a */
    public void mo1463a(MaterialDialog materialDialog) {
        this.f4964a = materialDialog;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewOnClickListenerC5899b viewOnClickListenerC5899b, int i6) {
        if (this.f4964a == null) {
            return;
        }
        AbstractC6619r.m7572a(this.f4965b.get(i6));
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ViewOnClickListenerC5899b onCreateViewHolder(ViewGroup viewGroup, int i6) {
        return new ViewOnClickListenerC5899b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.xmd_layout_simplelist_item, viewGroup, false), this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f4965b.size();
    }
}
