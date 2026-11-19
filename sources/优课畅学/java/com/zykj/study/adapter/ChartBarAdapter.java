package com.zykj.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5363g;
import com.zykj.study.adapter.ChartBarAdapter;
import com.zykj.study.bean.teach.ChoiceChartData;
import com.zykj.study.databinding.ItemChoiceByOptionsBinding;
import com.zykj.view.R$dimen;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8354c;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ChartBarAdapter extends ListAdapter<ChoiceChartData, ViewHolder> {

    /* renamed from: a */
    public final InterfaceC10570l f10875a;

    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemChoiceByOptionsBinding f10876a;

        /* renamed from: b */
        public final /* synthetic */ ChartBarAdapter f10877b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(final ChartBarAdapter chartBarAdapter, ItemChoiceByOptionsBinding binding) {
            super(binding.getRoot());
            AbstractC9133u.m16133g(binding, "binding");
            this.f10877b = chartBarAdapter;
            this.f10876a = binding;
            View root = binding.getRoot();
            AbstractC9133u.m16132f(root, "getRoot(...)");
            AbstractC8354c.m13615r(root, new InterfaceC10570l() { // from class: n4.r
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return ChartBarAdapter.ViewHolder.m9965c(this.f18573a, chartBarAdapter, (View) obj);
                }
            });
        }

        /* renamed from: c */
        public static final C8736p m9965c(ViewHolder viewHolder, ChartBarAdapter chartBarAdapter, View it) {
            AbstractC9133u.m16133g(it, "it");
            int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
            if (bindingAdapterPosition != -1) {
                InterfaceC10570l interfaceC10570l = chartBarAdapter.f10875a;
                ChoiceChartData choiceChartDataM9959c = ChartBarAdapter.m9959c(chartBarAdapter, bindingAdapterPosition);
                AbstractC9133u.m16132f(choiceChartDataM9959c, "access$getItem(...)");
                interfaceC10570l.invoke(choiceChartDataM9959c);
            }
            return C8736p.f16368a;
        }

        /* renamed from: e */
        public static final void m9966e(ViewHolder viewHolder, ChoiceChartData choiceChartData) {
            int height = viewHolder.f10876a.viewBackground.getHeight();
            if (height > 0) {
                int iM2467c = AbstractC5363g.m2467c(1.0f);
                int progress = iM2467c + (((height - iM2467c) * choiceChartData.getProgress()) / 100);
                ViewGroup.LayoutParams layoutParams = viewHolder.f10876a.viewContent.getLayoutParams();
                if (layoutParams.height != progress) {
                    layoutParams.height = progress;
                    viewHolder.f10876a.viewContent.setLayoutParams(layoutParams);
                }
            }
        }

        /* renamed from: d */
        public final void m9967d(final ChoiceChartData data) {
            AbstractC9133u.m16133g(data, "data");
            this.f10876a.setData(data);
            this.f10876a.setIsSelected(Boolean.valueOf(data.isSelected()));
            this.f10876a.tvName.setText(data.getShowName());
            this.f10876a.getRoot().getLayoutParams().width = this.f10876a.getRoot().getResources().getDimensionPixelOffset(R$dimen.view_41);
            this.f10876a.viewBackground.post(new Runnable() { // from class: n4.q
                @Override // java.lang.Runnable
                public final void run() {
                    ChartBarAdapter.ViewHolder.m9966e(this.f18569a, data);
                }
            });
            this.f10876a.executePendingBindings();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartBarAdapter(InterfaceC10570l onClick) {
        super(new ChoiceChartDataDiffCallback());
        AbstractC9133u.m16133g(onClick, "onClick");
        this.f10875a = onClick;
    }

    /* renamed from: c */
    public static final /* synthetic */ ChoiceChartData m9959c(ChartBarAdapter chartBarAdapter, int i10) {
        return chartBarAdapter.getItem(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        ChoiceChartData item = getItem(i10);
        AbstractC9133u.m16132f(item, "getItem(...)");
        holder.m9967d(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        ItemChoiceByOptionsBinding itemChoiceByOptionsBindingInflate = ItemChoiceByOptionsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9133u.m16132f(itemChoiceByOptionsBindingInflate, "inflate(...)");
        return new ViewHolder(this, itemChoiceByOptionsBindingInflate);
    }
}
