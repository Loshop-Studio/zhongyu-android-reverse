package com.zykj.student.dialogue.p076ui.detail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.ClickUtils;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.MessageResponse;
import com.zykj.student.dialogue.databinding.DialogueItemAnswerTabBinding;
import com.zykj.student.dialogue.p076ui.detail.DetailTabAdapter;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AbstractC7538a;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AnswerViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p214p6.C9336k;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/zykj/student/dialogue/bean/resp/MessageResponse;", "Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;", "Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;", "viewModel", "<init>", "(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "e", "(Landroid/view/ViewGroup;I)Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;", "holder", RequestParameters.POSITION, "", "", "payloads", "", "d", "(Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;ILjava/util/List;)V", "g", "()V", "index", "c", "(Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;I)V", "a", "Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;", "TheViewHolder", "PayloadsKey", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDetailTabAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailTabAdapter.kt\ncom/zykj/student/dialogue/ui/detail/DetailTabAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,97:1\n1869#2,2:98\n1878#2,3:100\n257#3,2:103\n*S KotlinDebug\n*F\n+ 1 DetailTabAdapter.kt\ncom/zykj/student/dialogue/ui/detail/DetailTabAdapter\n*L\n63#1:98,2\n78#1:100,3\n89#1:103,2\n*E\n"})
/* loaded from: classes5.dex */
public final class DetailTabAdapter extends ListAdapter<MessageResponse, TheViewHolder> {

    /* renamed from: a, reason: from kotlin metadata */
    public final AnswerViewModel viewModel;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$PayloadsKey;", "", "<init>", "(Ljava/lang/String;I)V", "a", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class PayloadsKey {

        /* renamed from: a */
        public static final PayloadsKey f10971a = new PayloadsKey("BACKGROUND", 0);

        /* renamed from: b */
        public static final /* synthetic */ PayloadsKey[] f10972b;

        /* renamed from: c */
        public static final /* synthetic */ EnumEntries f10973c;

        static {
            PayloadsKey[] payloadsKeyArrM10311a = m10311a();
            f10972b = payloadsKeyArrM10311a;
            f10973c = EnumEntriesKt.enumEntries(payloadsKeyArrM10311a);
        }

        public PayloadsKey(String str, int i9) {
        }

        /* renamed from: a */
        public static final /* synthetic */ PayloadsKey[] m10311a() {
            return new PayloadsKey[]{f10971a};
        }

        public static PayloadsKey valueOf(String str) {
            return (PayloadsKey) Enum.valueOf(PayloadsKey.class, str);
        }

        public static PayloadsKey[] values() {
            return (PayloadsKey[]) f10972b.clone();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m13412d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter$TheViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;", "binding", "<init>", "(Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;)V", "a", "Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;", "()Lcom/zykj/student/dialogue/databinding/DialogueItemAnswerTabBinding;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class TheViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: from kotlin metadata */
        public final DialogueItemAnswerTabBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TheViewHolder(DialogueItemAnswerTabBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        /* renamed from: a, reason: from getter */
        public final DialogueItemAnswerTabBinding getBinding() {
            return this.binding;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailTabAdapter(AnswerViewModel viewModel) {
        super(new DiffUtil.ItemCallback<MessageResponse>() { // from class: com.zykj.student.dialogue.ui.detail.DetailTabAdapter.1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean areContentsTheSame(MessageResponse oldItem, MessageResponse newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(newItem, oldItem);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean areItemsTheSame(MessageResponse oldItem, MessageResponse newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(oldItem.getId(), newItem.getId()) && oldItem.isPrimary() == newItem.isPrimary();
            }
        });
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    /* renamed from: f */
    public static final void m10304f(DetailTabAdapter detailTabAdapter, TheViewHolder theViewHolder, View view) {
        if (((C9336k) detailTabAdapter.viewModel.getViewState().getValue()).m15241p() == theViewHolder.getBindingAdapterPosition()) {
            return;
        }
        detailTabAdapter.viewModel.m10481w(new AbstractC7538a.c(theViewHolder.getBindingAdapterPosition()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(TheViewHolder holder, int index) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MessageResponse item = getItem(holder.getBindingAdapterPosition());
        DialogueItemAnswerTabBinding binding = holder.getBinding();
        binding.f10490d.setText(item.getUserName());
        TextView textView = binding.f10487a;
        textView.setText(textView.getContext().getString(item.isPrimary() ? R.string.dialogue_tag_public : R.string.dialogue_tag_un_public));
        TextView chipQuestion = binding.f10488b;
        Intrinsics.checkNotNullExpressionValue(chipQuestion, "chipQuestion");
        chipQuestion.setVisibility(holder.getBindingAdapterPosition() == 0 ? 0 : 8);
        binding.f10491e.setText(item.getSendTime());
        binding.f10489c.setSelected(holder.getBindingAdapterPosition() == ((C9336k) this.viewModel.getViewState().getValue()).m15241p());
        binding.f10487a.setSelected(item.isPrimary());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(TheViewHolder holder, int position, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, position, payloads);
            return;
        }
        MessageResponse item = getItem(holder.getBindingAdapterPosition());
        Iterator it = payloads.iterator();
        while (it.hasNext()) {
            if (it.next() == PayloadsKey.f10971a) {
                holder.getBinding().f10489c.setSelected(position == ((C9336k) this.viewModel.getViewState().getValue()).m15241p());
                holder.getBinding().f10487a.setSelected(item.isPrimary());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public TheViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DialogueItemAnswerTabBinding dialogueItemAnswerTabBindingM9950a = DialogueItemAnswerTabBinding.m9950a(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(dialogueItemAnswerTabBindingM9950a, "inflate(...)");
        final TheViewHolder theViewHolder = new TheViewHolder(dialogueItemAnswerTabBindingM9950a);
        ClickUtils.applyGlobalDebouncing(theViewHolder.itemView, 500L, new View.OnClickListener() { // from class: o6.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailTabAdapter.m10304f(this.f15619a, theViewHolder, view);
            }
        });
        return theViewHolder;
    }

    /* renamed from: g */
    public final void m10308g() {
        List<MessageResponse> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        int i9 = 0;
        for (Object obj : currentList) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            notifyItemChanged(i9, PayloadsKey.f10971a);
            i9 = i10;
        }
    }
}
