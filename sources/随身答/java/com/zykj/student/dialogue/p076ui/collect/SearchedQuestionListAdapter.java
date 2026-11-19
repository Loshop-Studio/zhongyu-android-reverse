package com.zykj.student.dialogue.p076ui.collect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import coil3.C5338l;
import coil3.InterfaceC5328e;
import coil3.decode.InterfaceC5319a;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.material.imageview.ShapeableImageView;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.CollectSession;
import com.zykj.student.dialogue.databinding.ItemCollectHistoryBinding;
import com.zykj.student.dialogue.p076ui.collect.SearchedQuestionListAdapter;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p001a0.C0007d;
import p138i6.AbstractC8136b;
import p207p.C9303p;
import p297y.AbstractC9928i;
import p297y.C9924e;
import p297y.C9932m;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB7\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0012\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001d"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/zykj/student/dialogue/bean/resp/CollectSession;", "Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter$MyViewHolder;", "Lkotlin/Function1;", "", "itemClickAction", "onItemCollectState", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "holder", "", RequestParameters.POSITION, "e", "(Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter$MyViewHolder;I)V", "", "", "payloads", "f", "(Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter$MyViewHolder;ILjava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "h", "(Landroid/view/ViewGroup;I)Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter$MyViewHolder;", "a", "Lkotlin/jvm/functions/Function1;", "b", "MyViewHolder", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSearchedQuestionListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchedQuestionListAdapter.kt\ncom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter\n+ 2 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 3 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt$load$1\n*L\n1#1,139:1\n35#2,3:140\n17#2:143\n40#2,6:144\n35#2,3:150\n17#2:153\n38#2,6:154\n44#2,2:161\n38#3:160\n*S KotlinDebug\n*F\n+ 1 SearchedQuestionListAdapter.kt\ncom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter\n*L\n27#1:140,3\n27#1:143\n27#1:144,6\n36#1:150,3\n36#1:153\n36#1:154,6\n36#1:161,2\n36#1:160\n*E\n"})
/* loaded from: classes5.dex */
public final class SearchedQuestionListAdapter extends ListAdapter<CollectSession, MyViewHolder> {

    /* renamed from: a, reason: from kotlin metadata */
    public final Function1 itemClickAction;

    /* renamed from: b, reason: from kotlin metadata */
    public final Function1 onItemCollectState;

    @StabilityInferred(parameters = 0)
    @Metadata(m13412d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/zykj/student/dialogue/databinding/ItemCollectHistoryBinding;", "binding", "<init>", "(Lcom/zykj/student/dialogue/databinding/ItemCollectHistoryBinding;)V", "a", "Lcom/zykj/student/dialogue/databinding/ItemCollectHistoryBinding;", "()Lcom/zykj/student/dialogue/databinding/ItemCollectHistoryBinding;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class MyViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: from kotlin metadata */
        public final ItemCollectHistoryBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyViewHolder(ItemCollectHistoryBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        /* renamed from: a, reason: from getter */
        public final ItemCollectHistoryBinding getBinding() {
            return this.binding;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchedQuestionListAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final InterfaceC5319a m10178g(C9303p result, C9932m options, InterfaceC5328e interfaceC5328e) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(interfaceC5328e, "<unused var>");
        return new C0007d(result.m15152c(), options, false, false, false, 28, null);
    }

    /* renamed from: i */
    public static final Unit m10179i(SearchedQuestionListAdapter searchedQuestionListAdapter, MyViewHolder myViewHolder, View it) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(it, "it");
        CollectSession item = searchedQuestionListAdapter.getItem(myViewHolder.getBindingAdapterPosition());
        if (item != null && (function1 = searchedQuestionListAdapter.itemClickAction) != null) {
            function1.invoke(item);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m10180j(SearchedQuestionListAdapter searchedQuestionListAdapter, MyViewHolder myViewHolder, View it) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(it, "it");
        CollectSession item = searchedQuestionListAdapter.getItem(myViewHolder.getBindingAdapterPosition());
        if (item != null && (function1 = searchedQuestionListAdapter.onItemCollectState) != null) {
            function1.invoke(item);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CollectSession item = getItem(holder.getAbsoluteAdapterPosition());
        if (item != null) {
            ShapeableImageView ivHeadPortrait = holder.getBinding().f10547c;
            Intrinsics.checkNotNullExpressionValue(ivHeadPortrait, "ivHeadPortrait");
            String askUserPhoto = item.getAskUserPhoto();
            InterfaceC5328e interfaceC5328eM2823a = C5338l.m2823a(ivHeadPortrait.getContext());
            C9924e.a aVarM17105r = AbstractC9928i.m17105r(new C9924e.a(ivHeadPortrait.getContext()).m17045c(askUserPhoto), ivHeadPortrait);
            String askUserPhoto2 = item.getAskUserPhoto();
            if (askUserPhoto2 != null && StringsKt.endsWith(askUserPhoto2, ".svg", true)) {
                aVarM17105r.m17046d(new InterfaceC5319a.a() { // from class: n6.z
                    @Override // coil3.decode.InterfaceC5319a.a
                    /* renamed from: a */
                    public final InterfaceC5319a mo10a(C9303p c9303p, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
                        return SearchedQuestionListAdapter.m10178g(c9303p, c9932m, interfaceC5328e);
                    }
                });
            }
            AbstractC9928i.m17103p(aVarM17105r, R.drawable.dialogue_ic_head_portrait);
            AbstractC9928i.m17090c(aVarM17105r, R.drawable.dialogue_ic_head_portrait);
            interfaceC5328eM2823a.mo2548d(aVarM17105r.m17043a());
            AppCompatImageView ivThumbnail = holder.getBinding().f10548d;
            Intrinsics.checkNotNullExpressionValue(ivThumbnail, "ivThumbnail");
            C5338l.m2823a(ivThumbnail.getContext()).mo2548d(AbstractC9928i.m17105r(new C9924e.a(ivThumbnail.getContext()).m17045c(item.getSnapshot()), ivThumbnail).m17043a());
            String summary = item.getSummary();
            if (summary == null || summary.length() == 0) {
                holder.getBinding().f10551g.setText("无问题描述");
                holder.getBinding().f10551g.setTextColor(ContextCompat.getColor(holder.getBinding().f10551g.getContext(), R.color.dialogue_search_hint_text));
            } else {
                holder.getBinding().f10551g.setText(item.getFormatSummary());
                holder.getBinding().f10551g.setTextColor(ContextCompat.getColor(holder.getBinding().f10551g.getContext(), R.color.dialogue_session_describe_text));
            }
            holder.getBinding().f10549e.setText(item.getClassName());
            holder.getBinding().f10552h.setText(item.getTopicName());
            holder.getBinding().f10550f.setText(item.getAskUserName());
            holder.getBinding().f10546b.setSelected(item.isCollect());
            holder.getBinding().f10553i.setText("更新于" + item.parseUpdateTime());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(MyViewHolder holder, int position, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, position, payloads);
            return;
        }
        CollectSession item = getItem(holder.getAbsoluteAdapterPosition());
        if (item != null) {
            Iterator it = payloads.iterator();
            while (it.hasNext()) {
                if (it.next() == SearchedQuestionPayloadKey.f10824a) {
                    holder.getBinding().f10546b.setSelected(item.isCollect());
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemCollectHistoryBinding itemCollectHistoryBindingM9972c = ItemCollectHistoryBinding.m9972c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemCollectHistoryBindingM9972c, "inflate(...)");
        final MyViewHolder myViewHolder = new MyViewHolder(itemCollectHistoryBindingM9972c);
        View itemView = myViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        AbstractC8136b.m13040h(itemView, new Function1() { // from class: n6.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchedQuestionListAdapter.m10179i(this.f15356a, myViewHolder, (View) obj);
            }
        });
        AppCompatImageView ivCollected = myViewHolder.getBinding().f10546b;
        Intrinsics.checkNotNullExpressionValue(ivCollected, "ivCollected");
        AbstractC8136b.m13040h(ivCollected, new Function1() { // from class: n6.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchedQuestionListAdapter.m10180j(this.f15358a, myViewHolder, (View) obj);
            }
        });
        return myViewHolder;
    }

    public /* synthetic */ SearchedQuestionListAdapter(Function1 function1, Function1 function12, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : function1, (i9 & 2) != 0 ? null : function12);
    }

    public SearchedQuestionListAdapter(Function1 function1, Function1 function12) {
        super(new SearchedQuestionDifferCallback());
        this.itemClickAction = function1;
        this.onItemCollectState = function12;
    }
}
