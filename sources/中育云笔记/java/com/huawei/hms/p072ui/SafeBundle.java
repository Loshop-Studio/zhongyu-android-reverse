package com.huawei.hms.p072ui;

import android.os.Bundle;
import com.huawei.hms.base.p070ui.LogUtil;

/* loaded from: classes5.dex */
public class SafeBundle {

    /* renamed from: a */
    public final Bundle f11797a;

    public SafeBundle() {
        this(new Bundle());
    }

    public boolean containsKey(String str) {
        try {
            return this.f11797a.containsKey(str);
        } catch (Throwable unused) {
            LogUtil.m8414e("SafeBundle", "containsKey exception. key:");
            return false;
        }
    }

    public Object get(String str) {
        try {
            return this.f11797a.get(str);
        } catch (Exception e10) {
            LogUtil.m8415e("SafeBundle", "get exception: " + e10.getMessage(), true);
            return null;
        }
    }

    public Bundle getBundle() {
        return this.f11797a;
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public String getString(String str) {
        try {
            return this.f11797a.getString(str);
        } catch (Throwable th) {
            LogUtil.m8415e("SafeBundle", "getString exception: " + th.getMessage(), true);
            return "";
        }
    }

    public boolean isEmpty() {
        try {
            return this.f11797a.isEmpty();
        } catch (Exception unused) {
            LogUtil.m8414e("SafeBundle", "isEmpty exception");
            return true;
        }
    }

    public int size() {
        try {
            return this.f11797a.size();
        } catch (Exception unused) {
            LogUtil.m8414e("SafeBundle", "size exception");
            return 0;
        }
    }

    public String toString() {
        return this.f11797a.toString();
    }

    public SafeBundle(Bundle bundle) {
        this.f11797a = bundle == null ? new Bundle() : bundle;
    }

    public int getInt(String str, int i10) {
        try {
            return this.f11797a.getInt(str, i10);
        } catch (Throwable th) {
            LogUtil.m8415e("SafeBundle", "getInt exception: " + th.getMessage(), true);
            return i10;
        }
    }

    public String getString(String str, String str2) {
        try {
            return this.f11797a.getString(str, str2);
        } catch (Exception e10) {
            LogUtil.m8415e("SafeBundle", "getString exception: " + e10.getMessage(), true);
            return str2;
        }
    }
}
