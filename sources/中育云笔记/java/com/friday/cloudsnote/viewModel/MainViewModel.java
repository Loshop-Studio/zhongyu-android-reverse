package com.friday.cloudsnote.viewModel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.UserDao;
import com.friday.common.network.StudentSession;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p110d2.InterfaceC8919i;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class MainViewModel extends BaseViewModel {

    /* renamed from: b */
    public final UserDao f5510b;

    /* renamed from: c */
    public final StudentSession f5511c;

    /* renamed from: d */
    public final InterfaceC8919i f5512d;

    public MainViewModel(UserDao userDao, StudentSession studentSession, InterfaceC8919i ezyService) {
        AbstractC9979u.m20294g(userDao, "userDao");
        AbstractC9979u.m20294g(studentSession, "studentSession");
        AbstractC9979u.m20294g(ezyService, "ezyService");
        this.f5510b = userDao;
        this.f5511c = studentSession;
        this.f5512d = ezyService;
    }

    /* renamed from: g */
    public final void m4736g(UserInfo output) {
        AbstractC9979u.m20294g(output, "output");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$setUserInfo$1(output, this, null), 3, null);
    }

    /* renamed from: h */
    public final void m4737h(ServerInfo serverInfo) {
        this.f5511c.m5368l(serverInfo);
    }

    /* renamed from: i */
    public final void m4738i() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$uploadLog$1(this, null), 3, null);
    }
}
