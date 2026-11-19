package com.huawei.hms.common.internal;

import android.app.Activity;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes5.dex */
public class ClientSettings {

    /* renamed from: a */
    public String f11534a;

    /* renamed from: b */
    public String f11535b;

    /* renamed from: c */
    public List f11536c;

    /* renamed from: d */
    public String f11537d;

    /* renamed from: e */
    public List f11538e;

    /* renamed from: f */
    public String f11539f;

    /* renamed from: g */
    public SubAppInfo f11540g;

    /* renamed from: h */
    public WeakReference f11541h;

    /* renamed from: i */
    public boolean f11542i;

    /* renamed from: j */
    public String f11543j;

    /* renamed from: k */
    public boolean f11544k;

    public ClientSettings(String str, String str2, List<Scope> list, String str3, List<String> list2) {
        this.f11534a = str;
        this.f11535b = str2;
        this.f11536c = list;
        this.f11537d = str3;
        this.f11538e = list2;
    }

    public List<String> getApiName() {
        return this.f11538e;
    }

    public String getAppID() {
        return this.f11537d;
    }

    public String getClientClassName() {
        return this.f11535b;
    }

    public String getClientPackageName() {
        return this.f11534a;
    }

    public Activity getCpActivity() {
        WeakReference weakReference = this.f11541h;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public String getCpID() {
        return this.f11539f;
    }

    public String getInnerHmsPkg() {
        return this.f11543j;
    }

    public List<Scope> getScopes() {
        return this.f11536c;
    }

    public SubAppInfo getSubAppID() {
        return this.f11540g;
    }

    public boolean isHasActivity() {
        return this.f11542i;
    }

    public boolean isUseInnerHms() {
        return this.f11544k;
    }

    public void setApiName(List<String> list) {
        this.f11538e = list;
    }

    public void setAppID(String str) {
        this.f11537d = str;
    }

    public void setClientClassName(String str) {
        this.f11535b = str;
    }

    public void setClientPackageName(String str) {
        this.f11534a = str;
    }

    public void setCpActivity(Activity activity) {
        this.f11541h = new WeakReference(activity);
        this.f11542i = true;
    }

    public void setCpID(String str) {
        this.f11539f = str;
    }

    public void setInnerHmsPkg(String str) {
        this.f11543j = str;
    }

    public void setScopes(List<Scope> list) {
        this.f11536c = list;
    }

    public void setSubAppId(SubAppInfo subAppInfo) {
        this.f11540g = subAppInfo;
    }

    public void setUseInnerHms(boolean z10) {
        this.f11544k = z10;
    }

    public ClientSettings(String str, String str2, List<Scope> list, String str3, List<String> list2, SubAppInfo subAppInfo) {
        this(str, str2, list, str3, list2);
        this.f11540g = subAppInfo;
    }
}
