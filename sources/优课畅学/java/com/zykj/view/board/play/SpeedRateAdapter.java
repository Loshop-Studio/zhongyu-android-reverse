package com.zykj.view.board.play;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.view.R$dimen;
import com.zykj.view.board.play.SpeedRateAdapter;
import kotlin.jvm.internal.AbstractC9133u;
import p243s5.C10019c0;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public final class SpeedRateAdapter extends ListAdapter<C10019c0, SpeedRateViewHolder> {

    /* renamed from: a */
    public final InterfaceC10570l f15206a;

    public static final class SpeedRateViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f15207a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpeedRateViewHolder(TextView label) {
            super(label);
            AbstractC9133u.m16133g(label, "label");
            this.f15207a = label;
        }

        /* renamed from: a */
        public final TextView m13174a() {
            return this.f15207a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeedRateAdapter(InterfaceC10570l itemClickListener) {
        super(new DiffUtil.ItemCallback<C10019c0>() { // from class: com.zykj.view.board.play.SpeedRateAdapter.1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean areContentsTheSame(C10019c0 oldItem, C10019c0 newItem) {
                AbstractC9133u.m16133g(oldItem, "oldItem");
                AbstractC9133u.m16133g(newItem, "newItem");
                return AbstractC9133u.m16128b(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean areItemsTheSame(C10019c0 oldItem, C10019c0 newItem) {
                AbstractC9133u.m16133g(oldItem, "oldItem");
                AbstractC9133u.m16133g(newItem, "newItem");
                return oldItem.m18723d() == newItem.m18723d() && oldItem.m18725f() == newItem.m18725f();
            }
        });
        AbstractC9133u.m16133g(itemClickListener, "itemClickListener");
        this.f15206a = itemClickListener;
    }

    /* renamed from: e */
    public static final void m13169e(SpeedRateAdapter speedRateAdapter, C10019c0 c10019c0, View view) {
        InterfaceC10570l interfaceC10570l = speedRateAdapter.f15206a;
        AbstractC9133u.m16130d(c10019c0);
        interfaceC10570l.invoke(c10019c0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SpeedRateViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        final C10019c0 item = getItem(i10);
        holder.m13174a().setText(item.m18722c());
        holder.m13174a().setSelected(item.m18723d());
        holder.m13174a().setTextColor(ContextCompat.getColorStateList(holder.itemView.getContext(), item.m18725f()));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: s5.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeedRateAdapter.m13169e(this.f20050a, item, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public SpeedRateViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        TextView textView = new TextView(parent.getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, textView.getContext().getResources().getDimensionPixelSize(R$dimen.view_18)));
        textView.setTextSize(0, textView.getResources().getDimension(R$dimen.text_8));
        textView.setGravity(17);
        return new SpeedRateViewHolder(textView);
    }
}
