package com.zykj.student.dialogue.p076ui.collect;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import com.zykj.student.dialogue.bean.resp.CollectSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/collect/CollectDifferCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/zykj/student/dialogue/bean/resp/CollectSession;", "<init>", "()V", "oldItem", "newItem", "", "b", "(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Lcom/zykj/student/dialogue/bean/resp/CollectSession;)Z", "a", "", "c", "(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Lcom/zykj/student/dialogue/bean/resp/CollectSession;)Ljava/lang/Object;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class CollectDifferCallback extends DiffUtil.ItemCallback<CollectSession> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(CollectSession oldItem, CollectSession newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(CollectSession oldItem, CollectSession newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.getId(), newItem.getId());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object getChangePayload(CollectSession oldItem, CollectSession newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.isCollect() != newItem.isCollect() ? CollectPayloadKey.f10780a : super.getChangePayload(oldItem, newItem);
    }
}
