package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import com.zykj.base.BaseViewModel;
import com.zykj.study.bean.DeleteSubBatchReq;
import com.zykj.study.bean.DeleteSubSingReq;
import com.zykj.study.bean.FreeSubscribeReq;
import com.zykj.study.repository.SubscribeRepository;
import kotlin.jvm.internal.AbstractC9133u;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ManagementSubscribeViewModel extends BaseViewModel {

    /* renamed from: a */
    public final SubscribeRepository f14204a;

    /* renamed from: b */
    public MutableLiveData f14205b;

    /* renamed from: c */
    public MutableLiveData f14206c;

    /* renamed from: d */
    public FreeSubscribeReq f14207d;

    public ManagementSubscribeViewModel(SubscribeRepository subscribeRepository) {
        AbstractC9133u.m16133g(subscribeRepository, "subscribeRepository");
        this.f14204a = subscribeRepository;
        this.f14205b = new MutableLiveData(0);
        this.f14206c = new MutableLiveData(0);
        this.f14207d = new FreeSubscribeReq(0L, null, null, null, null, 0, 20);
    }

    /* renamed from: b */
    public final Object m12185b(DeleteSubBatchReq deleteSubBatchReq, InterfaceC9324c interfaceC9324c) {
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new ManagementSubscribeViewModel$deleteBatchSubscribe$2(this, deleteSubBatchReq, null), interfaceC9324c);
    }

    /* renamed from: c */
    public final Object m12186c(DeleteSubSingReq deleteSubSingReq, InterfaceC9324c interfaceC9324c) {
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new ManagementSubscribeViewModel$deleteSingSubscribe$2(this, deleteSubSingReq, null), interfaceC9324c);
    }

    /* renamed from: d */
    public final InterfaceC9266c m12187d() {
        return CachedPagingDataKt.cachedIn(this.f14204a.m10399e(this.f14207d), ViewModelKt.getViewModelScope(this));
    }

    /* renamed from: e */
    public final FreeSubscribeReq m12188e() {
        return this.f14207d;
    }

    /* renamed from: f */
    public final MutableLiveData m12189f() {
        return this.f14206c;
    }

    /* renamed from: g */
    public final Object m12190g(long j10, InterfaceC9324c interfaceC9324c) {
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new ManagementSubscribeViewModel$getOtherStudents$2(this, j10, null), interfaceC9324c);
    }

    /* renamed from: h */
    public final Object m12191h(long j10, InterfaceC9324c interfaceC9324c) {
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new ManagementSubscribeViewModel$getSelfGroup$2(this, j10, null), interfaceC9324c);
    }

    /* renamed from: i */
    public final Object m12192i(long j10, InterfaceC9324c interfaceC9324c) {
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new ManagementSubscribeViewModel$getSubscribeTab$2(this, j10, null), interfaceC9324c);
    }

    /* renamed from: j */
    public final MutableLiveData m12193j() {
        return this.f14205b;
    }

    /* renamed from: k */
    public final void m12194k(FreeSubscribeReq freeSubscribeReq) {
        AbstractC9133u.m16133g(freeSubscribeReq, "<set-?>");
        this.f14207d = freeSubscribeReq;
    }

    /* renamed from: l */
    public final void m12195l() {
        this.f14205b.setValue(Integer.valueOf(this.f14204a.m10403k()));
    }
}
