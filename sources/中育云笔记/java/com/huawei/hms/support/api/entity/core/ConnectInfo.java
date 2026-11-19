package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class ConnectInfo implements InterfaceC7278e {

    /* renamed from: a */
    @InterfaceC9271a
    private List<String> f11738a;

    /* renamed from: b */
    @InterfaceC9271a
    private List<Scope> f11739b;

    /* renamed from: c */
    @InterfaceC9271a
    private String f11740c;

    /* renamed from: d */
    @InterfaceC9271a
    private String f11741d;

    public ConnectInfo() {
    }

    public List<String> getApiNameList() {
        return this.f11738a;
    }

    public String getFingerprint() {
        return this.f11740c;
    }

    public List<Scope> getScopeList() {
        return this.f11739b;
    }

    public String getSubAppID() {
        return this.f11741d;
    }

    public void setApiNameList(List<String> list) {
        this.f11738a = list;
    }

    public void setFingerprint(String str) {
        this.f11740c = str;
    }

    public void setScopeList(List<Scope> list) {
        this.f11739b = list;
    }

    public void setSubAppID(String str) {
        this.f11741d = str;
    }

    public ConnectInfo(List<String> list, List<Scope> list2, String str, String str2) {
        this.f11738a = list;
        this.f11739b = list2;
        this.f11740c = str;
        this.f11741d = str2;
    }
}
