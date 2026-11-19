package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* renamed from: com.umeng.analytics.filter.b */
/* loaded from: classes2.dex */
public class C3323b extends EventList {

    /* renamed from: a */
    private C3325d f1605a;

    /* renamed from: b */
    private Object f1606b;

    public C3323b(String str, String str2) {
        super(str, str2);
        this.f1606b = new Object();
    }

    @Override // com.umeng.analytics.filter.EventList
    public void eventListChange() {
        if (TextUtils.isEmpty(this.mEventList)) {
            return;
        }
        synchronized (this.f1606b) {
            this.f1605a = null;
            this.f1605a = new C3325d(true, this.mEventList);
        }
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean zM2818a;
        if (TextUtils.isEmpty(this.mEventList)) {
            return true;
        }
        synchronized (this.f1606b) {
            if (this.f1605a == null) {
                this.f1605a = new C3325d(true, this.mEventList);
            }
            zM2818a = this.f1605a.m2818a(str);
        }
        return zM2818a;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z3) {
        AnalyticsConfig.CLEAR_EKV_WL = z3;
    }
}
