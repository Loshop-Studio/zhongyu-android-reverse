package com.zykj.lib.login.p062ui.main;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import com.zykj.base.BaseViewModel;
import com.zykj.lib.login.proto.ServerBean;
import com.zykj.lib.login.proto.UserBean;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class LoginViewModel extends BaseViewModel {

    /* renamed from: a */
    public final DataStore f9927a;

    /* renamed from: b */
    public final DataStore f9928b;

    public LoginViewModel(DataStore serverDataStore, DataStore userDataStore) {
        AbstractC9133u.m16133g(serverDataStore, "serverDataStore");
        AbstractC9133u.m16133g(userDataStore, "userDataStore");
        this.f9927a = serverDataStore;
        this.f9928b = userDataStore;
    }

    /* renamed from: a */
    public final void m9293a() {
        BaseViewModel.launchData$default(this, null, null, new LoginViewModel$exitLogin$1(this, null), 3, null);
    }

    /* renamed from: b */
    public final DataStore m9294b() {
        return this.f9927a;
    }

    /* renamed from: c */
    public final DataStore m9295c() {
        return this.f9928b;
    }

    /* renamed from: d */
    public final Object m9296d(ServerBean serverBean, InterfaceC9324c interfaceC9324c) {
        Object objUpdateData = this.f9927a.updateData(new LoginViewModel$setServerBean$2(serverBean, null), interfaceC9324c);
        return objUpdateData == AbstractC9434a.m17291f() ? objUpdateData : C8736p.f16368a;
    }

    /* renamed from: e */
    public final Object m9297e(UserBean userBean, InterfaceC9324c interfaceC9324c) {
        Object objUpdateData = this.f9928b.updateData(new LoginViewModel$setUserBean$2(userBean, null), interfaceC9324c);
        return objUpdateData == AbstractC9434a.m17291f() ? objUpdateData : C8736p.f16368a;
    }
}
