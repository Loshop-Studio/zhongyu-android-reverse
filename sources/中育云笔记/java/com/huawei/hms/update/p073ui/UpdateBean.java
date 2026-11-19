package com.huawei.hms.update.p073ui;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class UpdateBean implements Serializable {

    /* renamed from: c */
    public boolean f11804c;

    /* renamed from: d */
    public boolean f11805d;

    /* renamed from: e */
    public String f11806e;

    /* renamed from: f */
    public int f11807f;

    /* renamed from: g */
    public String f11808g;

    /* renamed from: h */
    public String f11809h;

    /* renamed from: i */
    public ArrayList f11810i;

    /* renamed from: j */
    public boolean f11811j = true;

    /* renamed from: a */
    public static Object m8745a(Object obj) {
        return obj;
    }

    public String getClientAppId() {
        return (String) m8745a(this.f11808g);
    }

    public String getClientAppName() {
        return (String) m8745a(this.f11809h);
    }

    public String getClientPackageName() {
        return (String) m8745a(this.f11806e);
    }

    public int getClientVersionCode() {
        return ((Integer) m8745a(Integer.valueOf(this.f11807f))).intValue();
    }

    public boolean getResolutionInstallHMS() {
        return this.f11805d;
    }

    public ArrayList getTypeList() {
        return (ArrayList) m8745a(this.f11810i);
    }

    public boolean isHmsOrApkUpgrade() {
        return ((Boolean) m8745a(Boolean.valueOf(this.f11804c))).booleanValue();
    }

    public boolean isNeedConfirm() {
        return ((Boolean) m8745a(Boolean.valueOf(this.f11811j))).booleanValue();
    }

    public void setClientAppId(String str) {
        this.f11808g = str;
    }

    public void setClientAppName(String str) {
        this.f11809h = str;
    }

    public void setClientPackageName(String str) {
        this.f11806e = str;
    }

    public void setClientVersionCode(int i10) {
        this.f11807f = i10;
    }

    public void setHmsOrApkUpgrade(boolean z10) {
        this.f11804c = z10;
    }

    public void setNeedConfirm(boolean z10) {
        this.f11811j = z10;
    }

    public void setResolutionInstallHMS(boolean z10) {
        this.f11805d = z10;
    }

    public void setTypeList(ArrayList arrayList) {
        this.f11810i = arrayList;
    }
}
