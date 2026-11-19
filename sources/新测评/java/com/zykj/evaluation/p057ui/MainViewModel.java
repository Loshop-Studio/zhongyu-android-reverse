package com.zykj.evaluation.p057ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.zykj.evaluation.p057ui.MainViewModel;
import com.zykj.evaluation.upload.OssTaskManger;
import com.zykj.http.bean.HeaderBean;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\"8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m13558d2 = {"Lcom/zykj/evaluation/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/http/bean/HeaderBean;", "headerBeanFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/zykj/lib/error/code/ErrorCode;", "unauthorizedFlow", "Lcom/zykj/message/server/bean/UserInfo;", "_userFlow", "Lcom/zykj/evaluation/upload/OssTaskManger;", "workManger", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;)V", "Lcom/zykj/message/server/bean/ServerInfo;", "serverInfo", "", "g", "(Lcom/zykj/message/server/bean/ServerInfo;)V", "userInfo", "h", "(Lcom/zykj/message/server/bean/UserInfo;)V", "i", "()V", "a", "Lkotlinx/coroutines/flow/MutableStateFlow;", "d", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "b", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "e", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "c", "Lcom/zykj/evaluation/upload/OssTaskManger;", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "f", "()Lkotlinx/coroutines/flow/StateFlow;", "userFlow", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/zykj/evaluation/ui/MainViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,106:1\n230#2,5:107\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/zykj/evaluation/ui/MainViewModel\n*L\n45#1:107,5\n*E\n"})
/* loaded from: classes4.dex */
public final class MainViewModel extends ViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final MutableStateFlow headerBeanFlow;

    /* renamed from: b, reason: from kotlin metadata */
    public final MutableSharedFlow unauthorizedFlow;

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableStateFlow _userFlow;

    /* renamed from: d, reason: from kotlin metadata */
    public final OssTaskManger workManger;

    /* renamed from: e, reason: from kotlin metadata */
    public final StateFlow userFlow;

    public MainViewModel(MutableStateFlow headerBeanFlow, MutableSharedFlow unauthorizedFlow, MutableStateFlow _userFlow, OssTaskManger workManger) {
        Intrinsics.checkNotNullParameter(headerBeanFlow, "headerBeanFlow");
        Intrinsics.checkNotNullParameter(unauthorizedFlow, "unauthorizedFlow");
        Intrinsics.checkNotNullParameter(_userFlow, "_userFlow");
        Intrinsics.checkNotNullParameter(workManger, "workManger");
        this.headerBeanFlow = headerBeanFlow;
        this.unauthorizedFlow = unauthorizedFlow;
        this._userFlow = _userFlow;
        this.workManger = workManger;
        this.userFlow = FlowKt.stateIn(FlowKt.distinctUntilChangedBy(_userFlow, new Function1() { // from class: s5.q3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainViewModel.m9083j((UserInfo) obj);
            }
        }), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, CoroutineLiveDataKt.DEFAULT_TIMEOUT, 0L, 2, null), new UserInfo());
    }

    /* renamed from: j */
    public static final Long m9083j(UserInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.m10602a();
    }

    /* renamed from: d, reason: from getter */
    public final MutableStateFlow getHeaderBeanFlow() {
        return this.headerBeanFlow;
    }

    /* renamed from: e, reason: from getter */
    public final MutableSharedFlow getUnauthorizedFlow() {
        return this.unauthorizedFlow;
    }

    /* renamed from: f, reason: from getter */
    public final StateFlow getUserFlow() {
        return this.userFlow;
    }

    /* renamed from: g */
    public final void m9087g(ServerInfo serverInfo) {
        Object value;
        Intrinsics.checkNotNullParameter(serverInfo, "serverInfo");
        MutableStateFlow mutableStateFlow = this.headerBeanFlow;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HeaderBean.copy$default((HeaderBean) value, null, null, serverInfo.m10595a(), serverInfo.m10597c(), null, 19, null)));
    }

    /* renamed from: h */
    public final void m9088h(UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$update$2(this, userInfo, null), 3, null);
    }

    /* renamed from: i */
    public final void m9089i() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$uploadLog$1(this, null), 3, null);
    }
}
