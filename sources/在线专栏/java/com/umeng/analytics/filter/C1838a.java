package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* renamed from: com.umeng.analytics.filter.a */
/* loaded from: classes.dex */
public class C1838a extends EventList {

    /* renamed from: a */
    private C1841d f8195a;

    /* renamed from: b */
    private Object f8196b;

    public C1838a(String str, String str2) {
        super(str, str2);
        this.f8196b = new Object();
    }

    @Override // com.umeng.analytics.filter.EventList
    protected void eventListChange() {
        if (TextUtils.isEmpty(this.mEventList)) {
            return;
        }
        synchronized (this.f8196b) {
            this.f8195a = null;
            this.f8195a = new C1841d(false, this.mEventList);
        }
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean zM6741a;
        if (TextUtils.isEmpty(this.mEventList)) {
            return false;
        }
        synchronized (this.f8196b) {
            if (this.f8195a == null) {
                this.f8195a = new C1841d(false, this.mEventList);
            }
            zM6741a = this.f8195a.m6741a(str);
        }
        return zM6741a;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z3) {
        AnalyticsConfig.CLEAR_EKV_BL = z3;
    }
}
