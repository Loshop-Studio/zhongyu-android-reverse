package com.zykj.study.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.zykj.study.bean.teach.ChoiceChartData;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ChoiceChartDataDiffCallback extends DiffUtil.ItemCallback<ChoiceChartData> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(ChoiceChartData oldItem, ChoiceChartData newItem) {
        AbstractC9133u.m16133g(oldItem, "oldItem");
        AbstractC9133u.m16133g(newItem, "newItem");
        return AbstractC9133u.m16128b(oldItem.getName(), newItem.getName()) && AbstractC9133u.m16128b(oldItem.getShowName(), newItem.getShowName()) && oldItem.isSelected() == newItem.isSelected() && oldItem.getProgress() == newItem.getProgress() && oldItem.isRight() == newItem.isRight() && AbstractC9133u.m16128b(oldItem.getStudentList(), newItem.getStudentList());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(ChoiceChartData oldItem, ChoiceChartData newItem) {
        AbstractC9133u.m16133g(oldItem, "oldItem");
        AbstractC9133u.m16133g(newItem, "newItem");
        return AbstractC9133u.m16128b(oldItem.getName(), newItem.getName());
    }
}
