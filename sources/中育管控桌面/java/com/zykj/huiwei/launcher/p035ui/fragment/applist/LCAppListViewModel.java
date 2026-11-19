package com.zykj.huiwei.launcher.p035ui.fragment.applist;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;", "Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;", "appList", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zykj/huiwei/launcher/bean/resp/AppData;", "a", "Lkotlinx/coroutines/flow/Flow;", "b", "()Lkotlinx/coroutines/flow/Flow;", "lCFilterAppList", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class LCAppListViewModel extends BaseAppListViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final Flow lCFilterAppList;

    public LCAppListViewModel(MutableStateFlow appList) {
        Intrinsics.checkNotNullParameter(appList, "appList");
        this.lCFilterAppList = FlowKt.mapLatest(appList, new LCAppListViewModel$lCFilterAppList$1(this, null));
    }

    /* renamed from: b, reason: from getter */
    public final Flow getLCFilterAppList() {
        return this.lCFilterAppList;
    }
}
