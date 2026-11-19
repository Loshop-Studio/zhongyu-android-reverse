package com.zykj.student.dialogue.p076ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import coil3.C5338l;
import coil3.InterfaceC5328e;
import coil3.decode.InterfaceC5319a;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.material.imageview.ShapeableImageView;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.QuestionResp;
import com.zykj.student.dialogue.databinding.DialogueCardSessionBinding;
import com.zykj.student.dialogue.p076ui.home.SessionListAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p001a0.C0007d;
import p138i6.AbstractC8136b;
import p207p.C9303p;
import p244s6.C9526k0;
import p244s6.C9560s2;
import p297y.AbstractC9928i;
import p297y.C9924e;
import p297y.C9932m;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002$%B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006&"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;", "Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;", "Lcom/zykj/student/dialogue/ui/home/HomeViewModel;", "homeViewModel", "Lkotlin/Function1;", "", "itemClickAction", "", "onItemMove", "<init>", "(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "holder", "", RequestParameters.POSITION, "i", "(Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;I)V", "", "", "payloads", "j", "(Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;ILjava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "l", "(Landroid/view/ViewGroup;I)Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;", "h", "()V", "g", "a", "Lcom/zykj/student/dialogue/ui/home/HomeViewModel;", "b", "Lkotlin/jvm/functions/Function1;", "c", "PayloadKey", "ViewHolder", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSessionListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionListAdapter.kt\ncom/zykj/student/dialogue/ui/home/SessionListAdapter\n+ 2 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 3 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt$load$1\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,201:1\n35#2,3:202\n17#2:205\n40#2,6:206\n35#2,3:212\n17#2:215\n38#2,6:216\n44#2,2:223\n38#3:222\n257#4,2:225\n257#4,2:227\n257#4,2:229\n257#4,2:231\n257#4,2:233\n257#4,2:235\n257#4,2:237\n257#4,2:239\n257#4,2:242\n257#4,2:244\n257#4,2:246\n257#4,2:248\n257#4,2:250\n257#4,2:252\n1869#5:241\n1870#5:254\n*S KotlinDebug\n*F\n+ 1 SessionListAdapter.kt\ncom/zykj/student/dialogue/ui/home/SessionListAdapter\n*L\n29#1:202,3\n29#1:205\n29#1:206,6\n38#1:212,3\n38#1:215\n38#1:216,6\n38#1:223,2\n38#1:222\n65#1:225,2\n66#1:227,2\n67#1:229,2\n68#1:231,2\n69#1:233,2\n76#1:235,2\n77#1:237,2\n78#1:239,2\n92#1:242,2\n97#1:244,2\n98#1:246,2\n105#1:248,2\n106#1:250,2\n116#1:252,2\n89#1:241\n89#1:254\n*E\n"})
/* loaded from: classes5.dex */
public final class SessionListAdapter extends PagingDataAdapter<QuestionResp, ViewHolder> {

    /* renamed from: a, reason: from kotlin metadata */
    public final HomeViewModel homeViewModel;

    /* renamed from: b, reason: from kotlin metadata */
    public final Function1 itemClickAction;

    /* renamed from: c, reason: from kotlin metadata */
    public final Function1 onItemMove;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$PayloadKey;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class PayloadKey {

        /* renamed from: a */
        public static final PayloadKey f11721a = new PayloadKey("EDIT", 0);

        /* renamed from: b */
        public static final PayloadKey f11722b = new PayloadKey("SELECT", 1);

        /* renamed from: c */
        public static final PayloadKey f11723c = new PayloadKey("SORT_TYPE", 2);

        /* renamed from: d */
        public static final PayloadKey f11724d = new PayloadKey("FLAG_NEW", 3);

        /* renamed from: e */
        public static final /* synthetic */ PayloadKey[] f11725e;

        /* renamed from: f */
        public static final /* synthetic */ EnumEntries f11726f;

        static {
            PayloadKey[] payloadKeyArrM10902a = m10902a();
            f11725e = payloadKeyArrM10902a;
            f11726f = EnumEntriesKt.enumEntries(payloadKeyArrM10902a);
        }

        public PayloadKey(String str, int i9) {
        }

        /* renamed from: a */
        public static final /* synthetic */ PayloadKey[] m10902a() {
            return new PayloadKey[]{f11721a, f11722b, f11723c, f11724d};
        }

        public static PayloadKey valueOf(String str) {
            return (PayloadKey) Enum.valueOf(PayloadKey.class, str);
        }

        public static PayloadKey[] values() {
            return (PayloadKey[]) f11725e.clone();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m13412d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/zykj/student/dialogue/databinding/DialogueCardSessionBinding;", "binding", "<init>", "(Lcom/zykj/student/dialogue/databinding/DialogueCardSessionBinding;)V", "a", "Lcom/zykj/student/dialogue/databinding/DialogueCardSessionBinding;", "()Lcom/zykj/student/dialogue/databinding/DialogueCardSessionBinding;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: from kotlin metadata */
        public final DialogueCardSessionBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(DialogueCardSessionBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        /* renamed from: a, reason: from getter */
        public final DialogueCardSessionBinding getBinding() {
            return this.binding;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionListAdapter(HomeViewModel homeViewModel, Function1 function1, Function1 onItemMove) {
        super(new SessionDifferCallback(), (CoroutineContext) null, (CoroutineContext) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(homeViewModel, "homeViewModel");
        Intrinsics.checkNotNullParameter(onItemMove, "onItemMove");
        this.homeViewModel = homeViewModel;
        this.itemClickAction = function1;
        this.onItemMove = onItemMove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final InterfaceC5319a m10892k(C9303p result, C9932m options, InterfaceC5328e interfaceC5328e) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(interfaceC5328e, "<unused var>");
        return new C0007d(result.m15152c(), options, false, false, false, 28, null);
    }

    /* renamed from: m */
    public static final Unit m10893m(SessionListAdapter sessionListAdapter, ViewHolder viewHolder, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        QuestionResp item = sessionListAdapter.getItem(viewHolder.getBindingAdapterPosition());
        if (item != null) {
            sessionListAdapter.homeViewModel.m10871V(item);
        }
        sessionListAdapter.notifyItemChanged(viewHolder.getBindingAdapterPosition(), PayloadKey.f11722b);
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m10894n(SessionListAdapter sessionListAdapter, ViewHolder viewHolder, View it) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(it, "it");
        QuestionResp item = sessionListAdapter.getItem(viewHolder.getBindingAdapterPosition());
        if (item != null && (function1 = sessionListAdapter.itemClickAction) != null) {
            function1.invoke(item);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m10895o(SessionListAdapter sessionListAdapter, ViewHolder viewHolder, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        QuestionResp item = sessionListAdapter.getItem(viewHolder.getBindingAdapterPosition());
        if (item != null) {
            sessionListAdapter.onItemMove.invoke(Long.valueOf(item.getId()));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final boolean m10896p(SessionListAdapter sessionListAdapter, ViewHolder viewHolder, View view) {
        QuestionResp item = sessionListAdapter.getItem(viewHolder.getBindingAdapterPosition());
        if (item != null) {
            sessionListAdapter.homeViewModel.m10863N(item);
        }
        sessionListAdapter.notifyItemChanged(viewHolder.getBindingAdapterPosition(), PayloadKey.f11722b);
        return true;
    }

    /* renamed from: g */
    public final void m10897g() {
        int itemCount = getItemCount();
        for (int i9 = 0; i9 < itemCount; i9++) {
            notifyItemChanged(i9, PayloadKey.f11721a);
        }
    }

    /* renamed from: h */
    public final void m10898h() {
        int itemCount = getItemCount();
        for (int i9 = 0; i9 < itemCount; i9++) {
            notifyItemChanged(i9, PayloadKey.f11723c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int position) {
        String strFetchUpdatedTime;
        StringBuilder sb;
        String str;
        Intrinsics.checkNotNullParameter(holder, "holder");
        QuestionResp item = getItem(holder.getAbsoluteAdapterPosition());
        if (item != null) {
            ShapeableImageView ivHeadPortrait = holder.getBinding().f10379d;
            Intrinsics.checkNotNullExpressionValue(ivHeadPortrait, "ivHeadPortrait");
            String askUserPhoto = item.getAskUserPhoto();
            InterfaceC5328e interfaceC5328eM2823a = C5338l.m2823a(ivHeadPortrait.getContext());
            C9924e.a aVarM17105r = AbstractC9928i.m17105r(new C9924e.a(ivHeadPortrait.getContext()).m17045c(askUserPhoto), ivHeadPortrait);
            String askUserPhoto2 = item.getAskUserPhoto();
            if (askUserPhoto2 != null && StringsKt.endsWith(askUserPhoto2, ".svg", true)) {
                aVarM17105r.m17046d(new InterfaceC5319a.a() { // from class: s6.b3
                    @Override // coil3.decode.InterfaceC5319a.a
                    /* renamed from: a */
                    public final InterfaceC5319a mo10a(C9303p c9303p, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
                        return SessionListAdapter.m10892k(c9303p, c9932m, interfaceC5328e);
                    }
                });
            }
            AbstractC9928i.m17103p(aVarM17105r, R.drawable.dialogue_ic_head_portrait);
            AbstractC9928i.m17090c(aVarM17105r, R.drawable.dialogue_ic_head_portrait);
            interfaceC5328eM2823a.mo2548d(aVarM17105r.m17043a());
            AppCompatImageView ivThumbnail = holder.getBinding().f10384i;
            Intrinsics.checkNotNullExpressionValue(ivThumbnail, "ivThumbnail");
            C5338l.m2823a(ivThumbnail.getContext()).mo2548d(AbstractC9928i.m17105r(new C9924e.a(ivThumbnail.getContext()).m17045c(item.getSnapshot()), ivThumbnail).m17043a());
            String summary = item.getSummary();
            if (summary == null || summary.length() == 0) {
                holder.getBinding().f10388m.setText("无问题描述");
                holder.getBinding().f10388m.setTextColor(ContextCompat.getColor(holder.getBinding().f10388m.getContext(), R.color.dialogue_search_hint_text));
            } else {
                holder.getBinding().f10388m.setText(item.getFormatSummary());
                holder.getBinding().f10388m.setTextColor(ContextCompat.getColor(holder.getBinding().f10388m.getContext(), R.color.dialogue_session_describe_text));
            }
            holder.getBinding().f10385j.setText(item.getClassName());
            holder.getBinding().f10392q.setText(item.getTopicName());
            holder.getBinding().f10386k.setText(item.getAskUserName());
            holder.getBinding().f10389n.setText(String.valueOf(item.getMessages()));
            holder.getBinding().f10390o.setText(item.getOpenCount() + "/" + item.getMembers());
            AppCompatTextView flagReplay = holder.getBinding().f10377b;
            Intrinsics.checkNotNullExpressionValue(flagReplay, "flagReplay");
            flagReplay.setVisibility(item.getSentMessages() > 0 ? 0 : 8);
            View vSplitReplay = holder.getBinding().f10396u;
            Intrinsics.checkNotNullExpressionValue(vSplitReplay, "vSplitReplay");
            vSplitReplay.setVisibility(item.getSentMessages() > 0 ? 0 : 8);
            AppCompatTextView tvClose = holder.getBinding().f10387l;
            Intrinsics.checkNotNullExpressionValue(tvClose, "tvClose");
            tvClose.setVisibility(item.getClosed() ? 0 : 8);
            View vTvClose = holder.getBinding().f10397v;
            Intrinsics.checkNotNullExpressionValue(vTvClose, "vTvClose");
            vTvClose.setVisibility(item.getClosed() ? 0 : 8);
            AppCompatImageView iconNew = holder.getBinding().f10378c;
            Intrinsics.checkNotNullExpressionValue(iconNew, "iconNew");
            iconNew.setVisibility(item.getPrimaryUnRead() > 0 && item.getState() != 2 ? 0 : 8);
            AppCompatTextView appCompatTextView = holder.getBinding().f10393r;
            if (((C9526k0) this.homeViewModel.getFilterConditions().getValue()).m15726l()) {
                strFetchUpdatedTime = item.fetchJoinedTime();
                sb = new StringBuilder();
                str = "加入于";
            } else {
                strFetchUpdatedTime = item.fetchUpdatedTime();
                sb = new StringBuilder();
                str = "更新于";
            }
            sb.append(str);
            sb.append(strFetchUpdatedTime);
            appCompatTextView.setText(sb.toString());
            boolean zContains = ((C9560s2) this.homeViewModel.getHomeUiState().getValue()).m15757j().contains(Long.valueOf(item.getId()));
            holder.getBinding().f10394s.setSelected(zContains);
            AppCompatImageView ivSelect = holder.getBinding().f10383h;
            Intrinsics.checkNotNullExpressionValue(ivSelect, "ivSelect");
            ivSelect.setVisibility(zContains ? 0 : 8);
            AppCompatTextView tvSelect = holder.getBinding().f10391p;
            Intrinsics.checkNotNullExpressionValue(tvSelect, "tvSelect");
            tvSelect.setVisibility(zContains ? 0 : 8);
            LinearLayoutCompat vSelect = holder.getBinding().f10394s;
            Intrinsics.checkNotNullExpressionValue(vSelect, "vSelect");
            vSelect.setVisibility(((C9560s2) this.homeViewModel.getHomeUiState().getValue()).m15754g() ? 0 : 8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder holder, int position, List payloads) {
        String strFetchUpdatedTime;
        StringBuilder sb;
        String str;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, position, payloads);
            return;
        }
        QuestionResp item = getItem(holder.getAbsoluteAdapterPosition());
        if (item != null) {
            holder.getBinding();
            for (Object obj : payloads) {
                if (obj == PayloadKey.f11721a) {
                    LinearLayoutCompat vSelect = holder.getBinding().f10394s;
                    Intrinsics.checkNotNullExpressionValue(vSelect, "vSelect");
                    vSelect.setVisibility(((C9560s2) this.homeViewModel.getHomeUiState().getValue()).m15754g() ? 0 : 8);
                    boolean zContains = ((C9560s2) this.homeViewModel.getHomeUiState().getValue()).m15757j().contains(Long.valueOf(item.getId()));
                    holder.getBinding().f10394s.setSelected(zContains);
                    AppCompatImageView ivSelect = holder.getBinding().f10383h;
                    Intrinsics.checkNotNullExpressionValue(ivSelect, "ivSelect");
                    ivSelect.setVisibility(zContains ? 0 : 8);
                    AppCompatTextView tvSelect = holder.getBinding().f10391p;
                    Intrinsics.checkNotNullExpressionValue(tvSelect, "tvSelect");
                    tvSelect.setVisibility(zContains ? 0 : 8);
                } else if (obj == PayloadKey.f11722b) {
                    boolean zContains2 = ((C9560s2) this.homeViewModel.getHomeUiState().getValue()).m15757j().contains(Long.valueOf(item.getId()));
                    holder.getBinding().f10394s.setSelected(zContains2);
                    AppCompatImageView ivSelect2 = holder.getBinding().f10383h;
                    Intrinsics.checkNotNullExpressionValue(ivSelect2, "ivSelect");
                    ivSelect2.setVisibility(zContains2 ? 0 : 8);
                    AppCompatTextView tvSelect2 = holder.getBinding().f10391p;
                    Intrinsics.checkNotNullExpressionValue(tvSelect2, "tvSelect");
                    tvSelect2.setVisibility(zContains2 ? 0 : 8);
                } else if (obj == PayloadKey.f11723c) {
                    AppCompatTextView appCompatTextView = holder.getBinding().f10393r;
                    if (((C9526k0) this.homeViewModel.getFilterConditions().getValue()).m15726l()) {
                        strFetchUpdatedTime = item.fetchJoinedTime();
                        sb = new StringBuilder();
                        str = "加入于";
                    } else {
                        strFetchUpdatedTime = item.fetchUpdatedTime();
                        sb = new StringBuilder();
                        str = "更新于";
                    }
                    sb.append(str);
                    sb.append(strFetchUpdatedTime);
                    appCompatTextView.setText(sb.toString());
                } else if (obj == PayloadKey.f11724d) {
                    AppCompatImageView iconNew = holder.getBinding().f10378c;
                    Intrinsics.checkNotNullExpressionValue(iconNew, "iconNew");
                    iconNew.setVisibility(item.getState() != 2 ? 0 : 8);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DialogueCardSessionBinding dialogueCardSessionBindingM9935c = DialogueCardSessionBinding.m9935c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(dialogueCardSessionBindingM9935c, "inflate(...)");
        final ViewHolder viewHolder = new ViewHolder(dialogueCardSessionBindingM9935c);
        viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: s6.x2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return SessionListAdapter.m10896p(this.f16738a, viewHolder, view);
            }
        });
        LinearLayoutCompat vSelect = viewHolder.getBinding().f10394s;
        Intrinsics.checkNotNullExpressionValue(vSelect, "vSelect");
        AbstractC8136b.m13040h(vSelect, new Function1() { // from class: s6.y2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SessionListAdapter.m10893m(this.f16750a, viewHolder, (View) obj);
            }
        });
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        AbstractC8136b.m13040h(itemView, new Function1() { // from class: s6.z2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SessionListAdapter.m10894n(this.f16762a, viewHolder, (View) obj);
            }
        });
        AppCompatImageView ivMore = viewHolder.getBinding().f10382g;
        Intrinsics.checkNotNullExpressionValue(ivMore, "ivMore");
        AbstractC8136b.m13040h(ivMore, new Function1() { // from class: s6.a3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SessionListAdapter.m10895o(this.f16530a, viewHolder, (View) obj);
            }
        });
        return viewHolder;
    }
}
