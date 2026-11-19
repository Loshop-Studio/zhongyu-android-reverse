package p203y0;

import androidx.recyclerview.widget.DiffUtil;
import com.chad.library.adapter.base.BaseBinderAdapter;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: y0.a */
/* loaded from: classes2.dex */
public final class C6767a extends DiffUtil.ItemCallback {

    /* renamed from: a */
    public final /* synthetic */ BaseBinderAdapter f11436a;

    public C6767a(BaseBinderAdapter baseBinderAdapter) {
        this.f11436a = baseBinderAdapter;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areContentsTheSame(Object oldItem, Object newItem) {
        DiffUtil.ItemCallback itemCallback;
        AbstractC5830k.m5330g(oldItem, "oldItem");
        AbstractC5830k.m5330g(newItem, "newItem");
        if (!oldItem.getClass().equals(newItem.getClass()) || (itemCallback = (DiffUtil.ItemCallback) this.f11436a.f2638e.get(oldItem.getClass())) == null) {
            return true;
        }
        return itemCallback.areContentsTheSame(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areItemsTheSame(Object oldItem, Object newItem) {
        DiffUtil.ItemCallback itemCallback;
        AbstractC5830k.m5330g(oldItem, "oldItem");
        AbstractC5830k.m5330g(newItem, "newItem");
        return (!oldItem.getClass().equals(newItem.getClass()) || (itemCallback = (DiffUtil.ItemCallback) this.f11436a.f2638e.get(oldItem.getClass())) == null) ? oldItem.equals(newItem) : itemCallback.areItemsTheSame(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final Object getChangePayload(Object oldItem, Object newItem) {
        DiffUtil.ItemCallback itemCallback;
        AbstractC5830k.m5330g(oldItem, "oldItem");
        AbstractC5830k.m5330g(newItem, "newItem");
        if (!oldItem.getClass().equals(newItem.getClass()) || (itemCallback = (DiffUtil.ItemCallback) this.f11436a.f2638e.get(oldItem.getClass())) == null) {
            return null;
        }
        return itemCallback.getChangePayload(oldItem, newItem);
    }
}
