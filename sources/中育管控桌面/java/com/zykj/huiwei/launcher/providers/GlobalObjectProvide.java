package com.zykj.huiwei.launcher.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.zykj.huiwei.launcher.bean.BaseAppInfo;
import com.zykj.huiwei.launcher.proto.C6063a;
import com.zykj.huiwei.launcher.proto.C6075m;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;", "", "<init>", "()V", "Landroidx/lifecycle/MutableLiveData;", "Lcom/zykj/huiwei/launcher/proto/m;", "provideUserLiveDataBean", "()Landroidx/lifecycle/MutableLiveData;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;", "provideAppList", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/huiwei/launcher/proto/a;", "provideServerLiveDataBean", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class GlobalObjectProvide {
    public static final int $stable = 0;

    @Singleton
    public final MutableStateFlow<List<BaseAppInfo>> provideAppList() {
        return StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
    }

    @Singleton
    public final MutableLiveData<C6063a> provideServerLiveDataBean() {
        return new MutableLiveData<>();
    }

    @Singleton
    public final MutableLiveData<C6075m> provideUserLiveDataBean() {
        return new MutableLiveData<>();
    }
}
