package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class DisconnectInfo implements InterfaceC7278e {

    @InterfaceC9271a
    public List<String> apiNameList;

    @InterfaceC9271a
    public List<Scope> scopeList;

    public DisconnectInfo() {
    }

    public List<String> getApiNameList() {
        return this.apiNameList;
    }

    public List<Scope> getScopeList() {
        return this.scopeList;
    }

    public DisconnectInfo(List<Scope> list, List<String> list2) {
        this.scopeList = list;
        this.apiNameList = list2;
    }
}
