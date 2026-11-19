package com.zykj.view.board.play;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.view.R$dimen;
import com.zykj.view.board.play.SpeedRateAdapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p246t7.C9469c0;

@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m13558d2 = {"Lcom/zykj/view/board/play/SpeedRateAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lt7/c0;", "Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;", "Lkotlin/Function1;", "", "itemClickListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "e", "(Landroid/view/ViewGroup;I)Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;", "holder", RequestParameters.POSITION, "c", "(Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;I)V", "a", "Lkotlin/jvm/functions/Function1;", "SpeedRateViewHolder", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class SpeedRateAdapter extends ListAdapter<C9469c0, SpeedRateViewHolder> {

    /* renamed from: a, reason: from kotlin metadata */
    public final Function1 itemClickListener;

    @Metadata(m13557d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m13558d2 = {"Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "label", "<init>", "(Landroid/widget/TextView;)V", "a", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class SpeedRateViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: from kotlin metadata */
        public final TextView label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpeedRateViewHolder(TextView label) {
            super(label);
            Intrinsics.checkNotNullParameter(label, "label");
            this.label = label;
        }

        /* renamed from: a, reason: from getter */
        public final TextView getLabel() {
            return this.label;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeedRateAdapter(Function1 itemClickListener) {
        super(new DiffUtil.ItemCallback<C9469c0>() { // from class: com.zykj.view.board.play.SpeedRateAdapter.1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean areContentsTheSame(C9469c0 oldItem, C9469c0 newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean areItemsTheSame(C9469c0 oldItem, C9469c0 newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.m15845d() == newItem.m15845d() && oldItem.m15847f() == newItem.m15847f();
            }
        });
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        this.itemClickListener = itemClickListener;
    }

    /* renamed from: d */
    public static final void m11297d(SpeedRateAdapter speedRateAdapter, C9469c0 c9469c0, View view) {
        Function1 function1 = speedRateAdapter.itemClickListener;
        Intrinsics.checkNotNull(c9469c0);
        function1.invoke(c9469c0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SpeedRateViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final C9469c0 item = getItem(position);
        holder.getLabel().setText(item.m15844c());
        holder.getLabel().setSelected(item.m15845d());
        holder.getLabel().setTextColor(ContextCompat.getColorStateList(holder.itemView.getContext(), item.m15847f()));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: t7.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpeedRateAdapter.m11297d(this.f16549a, item, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public SpeedRateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TextView textView = new TextView(parent.getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, textView.getContext().getResources().getDimensionPixelSize(R$dimen.view_18)));
        textView.setTextSize(0, textView.getResources().getDimension(R$dimen.text_8));
        textView.setGravity(17);
        return new SpeedRateViewHolder(textView);
    }
}
