package com.zykj.huiwei.launcher.p035ui.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder;
import com.zykj.huiwei.launcher.bean.TaskInfo;
import com.zykj.huiwei.launcher.databinding.HwItemHomeworkBinding;
import com.zykj.manage.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/adapter/HomeworkAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/zykj/huiwei/launcher/bean/TaskInfo;", "Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;", "Lcom/zykj/huiwei/launcher/databinding/HwItemHomeworkBinding;", "<init>", "()V", "holder", "item", "", "f", "(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/huiwei/launcher/bean/TaskInfo;)V", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class HomeworkAdapter extends BaseQuickAdapter<TaskInfo, BaseDataBindingHolder<HwItemHomeworkBinding>> {
    @Inject
    public HomeworkAdapter() {
        super(R.layout.hw_item_homework, null, 2, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void convert(BaseDataBindingHolder holder, TaskInfo item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        HwItemHomeworkBinding hwItemHomeworkBinding = (HwItemHomeworkBinding) holder.getDataBinding();
        if (hwItemHomeworkBinding != null) {
            hwItemHomeworkBinding.tvTitle.setText(item.getExamName());
            hwItemHomeworkBinding.tvTime.setText(item.getStartTime());
            hwItemHomeworkBinding.executePendingBindings();
        }
    }
}
