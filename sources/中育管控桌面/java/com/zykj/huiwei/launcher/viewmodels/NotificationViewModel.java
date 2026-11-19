package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import com.zykj.base.BaseViewModel;
import com.zykj.huiwei.launcher.ext.ViewModelExtKt;
import com.zykj.huiwei.launcher.repository.NotificationRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\rJ\u0019\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001b8\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b&\u0010 R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u001b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b#\u0010 R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001eR\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0%8\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b.\u0010)¨\u00061"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;", "Lcom/zykj/base/BaseViewModel;", "Lcom/zykj/huiwei/launcher/repository/NotificationRepository;", "notificationRepository", "Landroidx/datastore/core/DataStore;", "Lcom/zykj/huiwei/launcher/proto/a;", "serverBean", "<init>", "(Lcom/zykj/huiwei/launcher/repository/NotificationRepository;Landroidx/datastore/core/DataStore;)V", "", "id", "", "g", "(J)V", "messageId", "l", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;", "i", "()Lkotlinx/coroutines/flow/Flow;", "a", "Lcom/zykj/huiwei/launcher/repository/NotificationRepository;", "b", "Landroidx/datastore/core/DataStore;", "j", "()Landroidx/datastore/core/DataStore;", "Landroidx/lifecycle/MutableLiveData;", "", "c", "Landroidx/lifecycle/MutableLiveData;", "k", "()Landroidx/lifecycle/MutableLiveData;", "swipeRefreshShowing", "Lcom/zykj/huiwei/launcher/bean/resp/NoticeBean;", "d", "_noticeDetail", "Landroidx/lifecycle/LiveData;", "e", "Landroidx/lifecycle/LiveData;", "f", "()Landroidx/lifecycle/LiveData;", "noticeDetail", "", "creatorName", "createTime", "h", "_onWithdraw", "onWithdraw", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class NotificationViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final NotificationRepository notificationRepository;

    /* renamed from: b, reason: from kotlin metadata */
    public final DataStore serverBean;

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableLiveData swipeRefreshShowing;

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableLiveData _noticeDetail;

    /* renamed from: e, reason: from kotlin metadata */
    public final LiveData noticeDetail;

    /* renamed from: f, reason: from kotlin metadata */
    public final MutableLiveData creatorName;

    /* renamed from: g, reason: from kotlin metadata */
    public final MutableLiveData createTime;

    /* renamed from: h, reason: from kotlin metadata */
    public final MutableLiveData _onWithdraw;

    /* renamed from: i, reason: from kotlin metadata */
    public final LiveData onWithdraw;

    public NotificationViewModel(NotificationRepository notificationRepository, DataStore serverBean) {
        Intrinsics.checkNotNullParameter(notificationRepository, "notificationRepository");
        Intrinsics.checkNotNullParameter(serverBean, "serverBean");
        this.notificationRepository = notificationRepository;
        this.serverBean = serverBean;
        this.swipeRefreshShowing = new MutableLiveData();
        MutableLiveData mutableLiveData = new MutableLiveData();
        this._noticeDetail = mutableLiveData;
        this.noticeDetail = mutableLiveData;
        this.creatorName = new MutableLiveData();
        this.createTime = new MutableLiveData();
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        this._onWithdraw = mutableLiveData2;
        this.onWithdraw = mutableLiveData2;
    }

    /* renamed from: d, reason: from getter */
    public final MutableLiveData getCreateTime() {
        return this.createTime;
    }

    /* renamed from: e, reason: from getter */
    public final MutableLiveData getCreatorName() {
        return this.creatorName;
    }

    /* renamed from: f, reason: from getter */
    public final LiveData getNoticeDetail() {
        return this.noticeDetail;
    }

    /* renamed from: g */
    public final void m6178g(long id) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationViewModel$getNoticeDetail$1(this, id, null), 3, null);
    }

    /* renamed from: h, reason: from getter */
    public final LiveData getOnWithdraw() {
        return this.onWithdraw;
    }

    /* renamed from: i */
    public final Flow m6180i() {
        return CachedPagingDataKt.cachedIn(this.notificationRepository.m5427d(), ViewModelKt.getViewModelScope(this));
    }

    /* renamed from: j, reason: from getter */
    public final DataStore getServerBean() {
        return this.serverBean;
    }

    /* renamed from: k, reason: from getter */
    public final MutableLiveData getSwipeRefreshShowing() {
        return this.swipeRefreshShowing;
    }

    /* renamed from: l */
    public final void m6183l(long messageId) {
        ViewModelExtKt.m5322e(this, this.notificationRepository.m5429g(messageId), null, null, null, null, 30, null);
    }
}
