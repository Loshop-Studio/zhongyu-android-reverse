package com.zykj.insight.p044ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.AppUtils;
import com.umeng.analytics.pro.C3335ai;
import com.zykj.http.bean.HeaderBean;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.message.server.bean.ServerInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p128u1.InterfaceC4609g;
import p132v1.C4628b;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR+\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m5175d2 = {"Lcom/zykj/insight/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/zykj/message/server/bean/ServerInfo;", "serverInfo", "", "f", C3335ai.f1663aD, "Lcom/zykj/http/bean/HeaderLiveData;", C3335ai.f1705at, "Lcom/zykj/http/bean/HeaderLiveData;", "headLiveData", "Lu1/g;", "b", "Lu1/g;", NotificationCompat.CATEGORY_SERVICE, "Lv1/b;", "<set-?>", "Landroidx/compose/runtime/MutableState;", "d", "()Lv1/b;", "e", "(Lv1/b;)V", "mainState", "<init>", "(Lcom/zykj/http/bean/HeaderLiveData;Lu1/g;)V", "app_release"}, m5176k = 1, m5177mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/zykj/insight/ui/MainViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,60:1\n76#2:61\n102#2,2:62\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/zykj/insight/ui/MainViewModel\n*L\n32#1:61\n32#1:62,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MainViewModel extends ViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final HeaderLiveData headLiveData;

    /* renamed from: b, reason: from kotlin metadata */
    public final InterfaceC4609g service;

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableState mainState;

    public MainViewModel(HeaderLiveData headLiveData, InterfaceC4609g service) {
        Intrinsics.checkNotNullParameter(headLiveData, "headLiveData");
        Intrinsics.checkNotNullParameter(service, "service");
        this.headLiveData = headLiveData;
        this.service = service;
        this.mainState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C4628b(null, 1, null), null, 2, null);
    }

    /* renamed from: c */
    public final void m4620c() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$getDongNiUrl$1(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final C4628b m4621d() {
        return (C4628b) this.mainState.getValue();
    }

    /* renamed from: e */
    public final void m4622e(C4628b c4628b) {
        this.mainState.setValue(c4628b);
    }

    /* renamed from: f */
    public final void m4623f(ServerInfo serverInfo) {
        Intrinsics.checkNotNullParameter(serverInfo, "serverInfo");
        this.headLiveData.setValue(new HeaderBean(AppUtils.getAppPackageName(), String.valueOf(AppUtils.getAppVersionCode()), serverInfo.m4654b(), serverInfo.m4656e(), null, 16, null));
    }
}
