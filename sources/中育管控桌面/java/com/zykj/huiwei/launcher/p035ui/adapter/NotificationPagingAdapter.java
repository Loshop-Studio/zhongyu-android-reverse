package com.zykj.huiwei.launcher.p035ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDirections;
import androidx.navigation.ViewKt;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.huiwei.launcher.bean.resp.MessageInfo;
import com.zykj.huiwei.launcher.bean.resp.Parameter;
import com.zykj.huiwei.launcher.bean.resp.SenderInfo;
import com.zykj.huiwei.launcher.callback.MessageInfoDiffCallback;
import com.zykj.huiwei.launcher.databinding.HwItemNotificationBinding;
import com.zykj.huiwei.launcher.p035ui.adapter.NotificationPagingAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p057f4.AbstractC6340m0;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;", "Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;", "", "", "readMessageIdList", "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "e", "(Landroid/view/ViewGroup;I)Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;", "holder", RequestParameters.POSITION, "", "c", "(Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;I)V", "a", "Ljava/util/List;", "NotificationViewHolder", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class NotificationPagingAdapter extends PagingDataAdapter<MessageInfo, NotificationViewHolder> {

    /* renamed from: a, reason: from kotlin metadata */
    public final List readMessageIdList;

    @StabilityInferred(parameters = 0)
    @Metadata(m7879d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;", "binding", "<init>", "(Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;)V", "Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;", "item", "", "b", "(Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;)V", "Lkotlin/Function0;", "callback", "c", "(Lkotlin/jvm/functions/Function0;)V", "a", "Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
    public static final class NotificationViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: from kotlin metadata */
        public final HwItemNotificationBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationViewHolder(HwItemNotificationBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        /* renamed from: d */
        public static final void m5615d(Function0 function0, View view) {
            function0.invoke();
        }

        /* renamed from: b */
        public final void m5616b(MessageInfo item) {
            Intrinsics.checkNotNullParameter(item, "item");
            HwItemNotificationBinding hwItemNotificationBinding = this.binding;
            hwItemNotificationBinding.setMessageInfo(item);
            hwItemNotificationBinding.executePendingBindings();
        }

        /* renamed from: c */
        public final void m5617c(final Function0 callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.binding.setClickListener(new View.OnClickListener() { // from class: a4.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NotificationPagingAdapter.NotificationViewHolder.m5615d(callback, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationPagingAdapter(List readMessageIdList) {
        super(new MessageInfoDiffCallback(), (CoroutineContext) null, (CoroutineContext) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(readMessageIdList, "readMessageIdList");
        this.readMessageIdList = readMessageIdList;
    }

    /* renamed from: d */
    public static final Unit m5611d(MessageInfo messageInfo, NotificationPagingAdapter notificationPagingAdapter, NotificationViewHolder notificationViewHolder) {
        String fullName;
        AbstractC6340m0.b bVar = AbstractC6340m0.f7710a;
        long id = messageInfo.getId();
        Parameter parameter = messageInfo.getParameter();
        long id2 = parameter != null ? parameter.getId() : 0L;
        SenderInfo senderInfo = messageInfo.getSenderInfo();
        if (senderInfo == null || (fullName = senderInfo.getFullName()) == null) {
            fullName = "";
        }
        NavDirections navDirectionsM6474a = bVar.m6474a(id, id2, fullName, messageInfo.getCreationTime());
        View itemView = notificationViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewKt.findNavController(itemView).navigate(navDirectionsM6474a);
        messageInfo.setRead(true);
        if (!notificationPagingAdapter.readMessageIdList.contains(Long.valueOf(messageInfo.getId()))) {
            notificationPagingAdapter.readMessageIdList.add(Long.valueOf(messageInfo.getId()));
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final NotificationViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final MessageInfo item = getItem(position);
        if (item != null) {
            holder.m5616b(item);
            holder.m5617c(new Function0() { // from class: a4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotificationPagingAdapter.m5611d(item, this, holder);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public NotificationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        HwItemNotificationBinding hwItemNotificationBindingInflate = HwItemNotificationBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(hwItemNotificationBindingInflate, "inflate(...)");
        return new NotificationViewHolder(hwItemNotificationBindingInflate);
    }
}
