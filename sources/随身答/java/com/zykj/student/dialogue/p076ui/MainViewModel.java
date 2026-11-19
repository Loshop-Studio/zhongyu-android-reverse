package com.zykj.student.dialogue.p076ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;
import com.zykj.student.dialogue.upload.OssTaskManger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/zykj/http/bean/HeaderLiveData;", "headerLiveData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfoFlow", "Lcom/zykj/student/dialogue/upload/OssTaskManger;", "ossTaskManger", "<init>", "(Lcom/zykj/http/bean/HeaderLiveData;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/student/dialogue/upload/OssTaskManger;)V", "Lcom/zykj/message/server/bean/ServerInfo;", "serverInfo", "", "d", "(Lcom/zykj/message/server/bean/ServerInfo;)V", "userInfo", "e", "(Lcom/zykj/message/server/bean/UserInfo;)V", "f", "()V", "a", "Lcom/zykj/http/bean/HeaderLiveData;", "c", "()Lcom/zykj/http/bean/HeaderLiveData;", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/student/dialogue/upload/OssTaskManger;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class MainViewModel extends ViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final HeaderLiveData headerLiveData;

    /* renamed from: b, reason: from kotlin metadata */
    public final MutableStateFlow userInfoFlow;

    /* renamed from: c, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    public MainViewModel(HeaderLiveData headerLiveData, MutableStateFlow userInfoFlow, OssTaskManger ossTaskManger) {
        Intrinsics.checkNotNullParameter(headerLiveData, "headerLiveData");
        Intrinsics.checkNotNullParameter(userInfoFlow, "userInfoFlow");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        this.headerLiveData = headerLiveData;
        this.userInfoFlow = userInfoFlow;
        this.ossTaskManger = ossTaskManger;
    }

    /* renamed from: c, reason: from getter */
    public final HeaderLiveData getHeaderLiveData() {
        return this.headerLiveData;
    }

    /* renamed from: d */
    public final void m9998d(ServerInfo serverInfo) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$updateServerInfo$1(serverInfo, this, null), 3, null);
    }

    /* renamed from: e */
    public final void m9999e(UserInfo userInfo) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$updateUserInfo$1(userInfo, this, null), 3, null);
    }

    /* renamed from: f */
    public final void m10000f() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$uploadLog$1(this, null), 3, null);
    }
}
