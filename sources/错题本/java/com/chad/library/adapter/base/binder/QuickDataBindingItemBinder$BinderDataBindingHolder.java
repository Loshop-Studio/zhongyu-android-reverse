package com.chad.library.adapter.base.binder;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"com/chad/library/adapter/base/binder/QuickDataBindingItemBinder$BinderDataBindingHolder", "Landroidx/databinding/ViewDataBinding;", "DB", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "dataBinding", "<init>", "(Landroidx/databinding/ViewDataBinding;)V", "com.github.CymChad.brvah"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QuickDataBindingItemBinder$BinderDataBindingHolder<DB extends ViewDataBinding> extends BaseViewHolder {
    /* JADX WARN: Illegal instructions before constructor call */
    public QuickDataBindingItemBinder$BinderDataBindingHolder(@NotNull DB dataBinding) {
        AbstractC5830k.m5330g(dataBinding, "dataBinding");
        View root = dataBinding.getRoot();
        AbstractC5830k.m5329f(root, "dataBinding.root");
        super(root);
    }
}
