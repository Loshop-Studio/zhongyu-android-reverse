package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* renamed from: com.umeng.analytics.filter.a */
/* loaded from: classes2.dex */
public class C3322a extends EventList {

    /* renamed from: a */
    private C3325d f1603a;

    /* renamed from: b */
    private Object f1604b;

    public C3322a(String str, String str2) {
        super(str, str2);
        this.f1604b = new Object();
    }

    @Override // com.umeng.analytics.filter.EventList
    public void eventListChange() {
        if (TextUtils.isEmpty(this.mEventList)) {
            return;
        }
        synchronized (this.f1604b) {
            this.f1603a = null;
            this.f1603a = new C3325d(false, this.mEventList);
        }
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean zM2818a;
        if (TextUtils.isEmpty(this.mEventList)) {
            return false;
        }
        synchronized (this.f1604b) {
            if (this.f1603a == null) {
                this.f1603a = new C3325d(false, this.mEventList);
            }
            zM2818a = this.f1603a.m2818a(str);
        }
        return zM2818a;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z3) {
        AnalyticsConfig.CLEAR_EKV_BL = z3;
    }
}
