package com.zykj.huiwei.launcher.p035ui.fragment.applist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.base.BaseViewModel;
import com.zykj.huiwei.launcher.api.HomeService;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;", "Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;", "appList", "Lcom/zykj/huiwei/launcher/api/HomeService;", "api", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/huiwei/launcher/api/HomeService;)V", "", "d", "()V", "a", "Lcom/zykj/huiwei/launcher/api/HomeService;", "Lcom/zykj/huiwei/launcher/bean/resp/DisableAppInfo;", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "huiWeiDisableAppList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zykj/huiwei/launcher/bean/resp/AppData;", "c", "Lkotlinx/coroutines/flow/Flow;", "e", "()Lkotlinx/coroutines/flow/Flow;", "huiWeiFilterAppList", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class HuiWeiAppListViewModel extends BaseAppListViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final HomeService api;

    /* renamed from: b, reason: from kotlin metadata */
    public final MutableStateFlow huiWeiDisableAppList;

    /* renamed from: c, reason: from kotlin metadata */
    public final Flow huiWeiFilterAppList;

    public HuiWeiAppListViewModel(MutableStateFlow appList, HomeService api) {
        Intrinsics.checkNotNullParameter(appList, "appList");
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.huiWeiDisableAppList = MutableStateFlow;
        this.huiWeiFilterAppList = FlowKt.flowCombine(appList, MutableStateFlow, new HuiWeiAppListViewModel$huiWeiFilterAppList$1(this, null));
    }

    /* renamed from: d */
    public final void m6002d() {
        BaseViewModel.launchData$default(this, null, null, new HuiWeiAppListViewModel$getAppList$1(this, null), 3, null);
    }

    /* renamed from: e, reason: from getter */
    public final Flow getHuiWeiFilterAppList() {
        return this.huiWeiFilterAppList;
    }
}
