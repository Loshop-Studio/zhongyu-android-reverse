package com.zykj.mistake.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.ViewOnClickListenerC2870k;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.mistake.R;
import com.zykj.mistake.activity.SketchActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p066g4.C5603b;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/mistake/adapter/SketchMaterialAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/zykj/mistake/adapter/SketchMaterialAdapter$SketchMaterialHolder;", "SketchMaterialHolder", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SketchMaterialAdapter extends RecyclerView.Adapter<SketchMaterialHolder> {

    /* renamed from: a */
    public final SketchActivity f5983a;

    /* renamed from: b */
    public final ArrayList f5984b;

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m5110d2 = {"Lcom/zykj/mistake/adapter/SketchMaterialAdapter$SketchMaterialHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SketchMaterialHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ImageView f5985a;

        /* renamed from: b */
        public final TextView f5986b;

        public SketchMaterialHolder(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.iv_icon);
            AbstractC5830k.m5329f(viewFindViewById, "findViewById(...)");
            this.f5985a = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tv_content);
            AbstractC5830k.m5329f(viewFindViewById2, "findViewById(...)");
            this.f5986b = (TextView) viewFindViewById2;
        }
    }

    public SketchMaterialAdapter(SketchActivity sketchActivity, ArrayList arrayList) {
        this.f5983a = sketchActivity;
        this.f5984b = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f5984b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SketchMaterialHolder holder = (SketchMaterialHolder) viewHolder;
        AbstractC5830k.m5330g(holder, "holder");
        ImageView imageView = holder.f5985a;
        ArrayList arrayList = this.f5984b;
        imageView.setImageDrawable(this.f5983a.getDrawable(((C5603b) arrayList.get(i)).f8703a));
        holder.f5986b.setText(((C5603b) arrayList.get(i)).f8704b);
        holder.itemView.setOnClickListener(new ViewOnClickListenerC2870k(this, i, 4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        AbstractC5830k.m5330g(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f5983a).inflate(R.layout.item_sketch_material, parent, false);
        AbstractC5830k.m5327d(viewInflate);
        return new SketchMaterialHolder(viewInflate);
    }
}
