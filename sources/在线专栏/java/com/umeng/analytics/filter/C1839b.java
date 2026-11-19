package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* renamed from: com.umeng.analytics.filter.b */
/* loaded from: classes.dex */
public class C1839b extends EventList {

    /* renamed from: a */
    private C1841d f8197a;

    /* renamed from: b */
    private Object f8198b;

    public C1839b(String str, String str2) {
        super(str, str2);
        this.f8198b = new Object();
    }

    @Override // com.umeng.analytics.filter.EventList
    protected void eventListChange() {
        if (TextUtils.isEmpty(this.mEventList)) {
            return;
        }
        synchronized (this.f8198b) {
            this.f8197a = null;
            this.f8197a = new C1841d(true, this.mEventList);
        }
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean zM6741a;
        if (TextUtils.isEmpty(this.mEventList)) {
            return true;
        }
        synchronized (this.f8198b) {
            if (this.f8197a == null) {
                this.f8197a = new C1841d(true, this.mEventList);
            }
            zM6741a = this.f8197a.m6741a(str);
        }
        return zM6741a;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z3) {
        AnalyticsConfig.CLEAR_EKV_WL = z3;
    }
}
