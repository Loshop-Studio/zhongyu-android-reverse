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
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p264nb.C10363c0;

/* loaded from: classes6.dex */
public final class SpeedRateAdapter extends ListAdapter<C10363c0, SpeedRateViewHolder> {

    /* renamed from: a */
    public final InterfaceC9540l f20417a;

    public static final class SpeedRateViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: c */
        public final TextView f20418c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpeedRateViewHolder(TextView label) {
            super(label);
            AbstractC9979u.m20294g(label, "label");
            this.f20418c = label;
        }

        /* renamed from: a */
        public final TextView m17248a() {
            return this.f20418c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeedRateAdapter(InterfaceC9540l itemClickListener) {
        super(new DiffUtil.ItemCallback<C10363c0>() { // from class: com.zykj.view.board.play.SpeedRateAdapter.1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean areContentsTheSame(C10363c0 oldItem, C10363c0 newItem) {
                AbstractC9979u.m20294g(oldItem, "oldItem");
                AbstractC9979u.m20294g(newItem, "newItem");
                return AbstractC9979u.m20289b(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean areItemsTheSame(C10363c0 oldItem, C10363c0 newItem) {
                AbstractC9979u.m20294g(oldItem, "oldItem");
                AbstractC9979u.m20294g(newItem, "newItem");
                return oldItem.m21697d() == newItem.m21697d() && oldItem.m21699f() == newItem.m21699f();
            }
        });
        AbstractC9979u.m20294g(itemClickListener, "itemClickListener");
        this.f20417a = itemClickListener;
    }

    /* renamed from: c */
    public static final void m17243c(SpeedRateAdapter speedRateAdapter, C10363c0 c10363c0, View view) {
        InterfaceC9540l interfaceC9540l = speedRateAdapter.f20417a;
        AbstractC9979u.m20291d(c10363c0);
        interfaceC9540l.invoke(c10363c0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SpeedRateViewHolder holder, int i10) {
        AbstractC9979u.m20294g(holder, "holder");
        final C10363c0 item = getItem(i10);
        holder.m17248a().setText(item.m21696c());
        holder.m17248a().setSelected(item.m21697d());
        holder.m17248a().setTextColor(ContextCompat.getColorStateList(holder.itemView.getContext(), item.m21699f()));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: nb.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeedRateAdapter.m17243c(this.f24688c, item, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SpeedRateViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        TextView textView = new TextView(parent.getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, textView.getContext().getResources().getDimensionPixelSize(R$dimen.view_18)));
        textView.setTextSize(0, textView.getResources().getDimension(R$dimen.text_8));
        textView.setGravity(17);
        return new SpeedRateViewHolder(textView);
    }
}
