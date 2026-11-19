package com.zykj.student.dialogue.p076ui.home.category;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.DiffUtil;
import com.blankj.utilcode.util.ClickUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.module.BaseDraggableModule;
import com.chad.library.adapter.base.module.DraggableModule;
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder;
import com.zykj.base.R$dimen;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.CatalogResp;
import com.zykj.student.dialogue.databinding.DialogueItemEditBinding;
import com.zykj.student.dialogue.p076ui.home.category.AbstractC7620b;
import com.zykj.student.dialogue.p076ui.home.category.CategoryEditAdapter;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p138i6.AbstractC8136b;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;", "Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;", "Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;", "Lcom/chad/library/adapter/base/module/DraggableModule;", "Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;", "viewModel", "<init>", "(Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;)V", "holder", "item", "", "h", "(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V", "a", "Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCategoryEditAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryEditAdapter.kt\ncom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,74:1\n257#2,2:75\n278#2,2:77\n*S KotlinDebug\n*F\n+ 1 CategoryEditAdapter.kt\ncom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter\n*L\n45#1:75,2\n46#1:77,2\n*E\n"})
/* loaded from: classes5.dex */
public final class CategoryEditAdapter extends BaseQuickAdapter<CatalogResp, BaseDataBindingHolder<DialogueItemEditBinding>> implements DraggableModule {

    /* renamed from: a, reason: from kotlin metadata */
    public final EditCategoryViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryEditAdapter(EditCategoryViewModel viewModel) {
        super(R.layout.dialogue_item_edit, null, 2, null);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
        setDiffCallback(new DiffUtil.ItemCallback<CatalogResp>() { // from class: com.zykj.student.dialogue.ui.home.category.CategoryEditAdapter.1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean areContentsTheSame(CatalogResp oldItem, CatalogResp newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Objects.equals(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean areItemsTheSame(CatalogResp oldItem, CatalogResp newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId() && Intrinsics.areEqual(oldItem.getName(), newItem.getName());
            }
        });
    }

    /* renamed from: i */
    public static final Unit m10916i(BaseDataBindingHolder baseDataBindingHolder, CategoryEditAdapter categoryEditAdapter, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int bindingAdapterPosition = baseDataBindingHolder.getBindingAdapterPosition() - 1;
        if (bindingAdapterPosition >= 0 && bindingAdapterPosition < categoryEditAdapter.getData().size()) {
            categoryEditAdapter.viewModel.m10941B(new AbstractC7620b.c(categoryEditAdapter.getItem(bindingAdapterPosition)));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m10917j(BaseDataBindingHolder baseDataBindingHolder, CategoryEditAdapter categoryEditAdapter, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int bindingAdapterPosition = baseDataBindingHolder.getBindingAdapterPosition() - 1;
        if (bindingAdapterPosition >= 0 && bindingAdapterPosition < categoryEditAdapter.getData().size()) {
            CatalogResp item = categoryEditAdapter.getItem(bindingAdapterPosition);
            if (item.getSessionCount() > 0) {
                ToastUtils.showShort(baseDataBindingHolder.itemView.getContext().getString(R.string.dialogue_category_cannot_delete), new Object[0]);
            } else {
                categoryEditAdapter.viewModel.m10941B(new AbstractC7620b.b(item));
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.chad.library.adapter.base.module.DraggableModule
    public BaseDraggableModule addDraggableModule(BaseQuickAdapter baseQuickAdapter) {
        return super.addDraggableModule(baseQuickAdapter);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseDataBindingHolder holder, CatalogResp item) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        DialogueItemEditBinding dialogueItemEditBinding = (DialogueItemEditBinding) holder.getDataBinding();
        if (dialogueItemEditBinding != null) {
            boolean z9 = true;
            CatalogResp item2 = getItem(holder.getBindingAdapterPosition() - 1);
            dialogueItemEditBinding.f10499e.setText(item2.getName());
            if (!item2.isArchived() && !item2.inDiscussing()) {
                z9 = false;
            }
            Group groupOperation = dialogueItemEditBinding.f10496b;
            Intrinsics.checkNotNullExpressionValue(groupOperation, "groupOperation");
            groupOperation.setVisibility(!z9 ? 0 : 8);
            CardView cvSystemType = dialogueItemEditBinding.f10495a;
            Intrinsics.checkNotNullExpressionValue(cvSystemType, "cvSystemType");
            cvSystemType.setVisibility(z9 ? 0 : 4);
            int dimensionPixelSize = holder.itemView.getContext().getResources().getDimensionPixelSize(R$dimen.view_4);
            ClickUtils.expandClickArea(dialogueItemEditBinding.f10498d, dimensionPixelSize);
            ClickUtils.expandClickArea(dialogueItemEditBinding.f10497c, dimensionPixelSize);
            ImageView ivEdit = dialogueItemEditBinding.f10498d;
            Intrinsics.checkNotNullExpressionValue(ivEdit, "ivEdit");
            AbstractC8136b.m13040h(ivEdit, new Function1() { // from class: t6.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CategoryEditAdapter.m10916i(holder, this, (View) obj);
                }
            });
            ImageView ivDelete = dialogueItemEditBinding.f10497c;
            Intrinsics.checkNotNullExpressionValue(ivDelete, "ivDelete");
            AbstractC8136b.m13040h(ivDelete, new Function1() { // from class: t6.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CategoryEditAdapter.m10917j(holder, this, (View) obj);
                }
            });
        }
    }
}
