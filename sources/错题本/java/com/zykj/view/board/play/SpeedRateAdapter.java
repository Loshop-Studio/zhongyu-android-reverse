package com.zykj.view.board.play;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.view.C5280R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p006a5.ViewOnClickListenerC0015f;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, m5110d2 = {"Lcom/zykj/view/board/play/SpeedRateAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/zykj/view/board/play/SpeedRate;", "Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;", "Lkotlin/Function1;", "Ld6/s;", "itemClickListener", "<init>", "(Lr6/c;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;", "holder", RequestParameters.POSITION, "onBindViewHolder", "(Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;I)V", "Lr6/c;", "SpeedRateViewHolder", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SpeedRateAdapter extends ListAdapter<SpeedRate, SpeedRateViewHolder> {

    @NotNull
    private final InterfaceC6471c itemClickListener;

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "label", "Landroid/widget/TextView;", "<init>", "(Landroid/widget/TextView;)V", "getLabel", "()Landroid/widget/TextView;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SpeedRateViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        private final TextView label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpeedRateViewHolder(@NotNull TextView label) {
            super(label);
            AbstractC5830k.m5330g(label, "label");
            this.label = label;
        }

        @NotNull
        public final TextView getLabel() {
            return this.label;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeedRateAdapter(@NotNull InterfaceC6471c itemClickListener) {
        super(new DiffUtil.ItemCallback<SpeedRate>() { // from class: com.zykj.view.board.play.SpeedRateAdapter.1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areContentsTheSame(SpeedRate oldItem, SpeedRate newItem) {
                AbstractC5830k.m5330g(oldItem, "oldItem");
                AbstractC5830k.m5330g(newItem, "newItem");
                return oldItem.equals(newItem);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areItemsTheSame(SpeedRate oldItem, SpeedRate newItem) {
                AbstractC5830k.m5330g(oldItem, "oldItem");
                AbstractC5830k.m5330g(newItem, "newItem");
                return oldItem.getSelected() == newItem.getSelected() && oldItem.getTextColor() == newItem.getTextColor();
            }
        });
        AbstractC5830k.m5330g(itemClickListener, "itemClickListener");
        this.itemClickListener = itemClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(SpeedRateAdapter speedRateAdapter, SpeedRate speedRate, View view) {
        InterfaceC6471c interfaceC6471c = speedRateAdapter.itemClickListener;
        AbstractC5830k.m5327d(speedRate);
        interfaceC6471c.invoke(speedRate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SpeedRateViewHolder holder, int position) {
        AbstractC5830k.m5330g(holder, "holder");
        SpeedRate item = getItem(position);
        holder.getLabel().setText(item.getLabel());
        holder.getLabel().setSelected(item.getSelected());
        holder.getLabel().setTextColor(ContextCompat.getColorStateList(holder.itemView.getContext(), item.getTextColor()));
        holder.itemView.setOnClickListener(new ViewOnClickListenerC0015f(8, this, item));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SpeedRateViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        AbstractC5830k.m5330g(parent, "parent");
        TextView textView = new TextView(parent.getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, textView.getContext().getResources().getDimensionPixelSize(C5280R.dimen.view_18)));
        textView.setTextSize(0, textView.getResources().getDimension(C5280R.dimen.text_8));
        textView.setGravity(17);
        return new SpeedRateViewHolder(textView);
    }
}
