package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.g */
/* loaded from: classes2.dex */
public class C3486g extends AbstractC3480a {

    /* renamed from: a */
    private static final String f2819a = "mac";

    /* renamed from: b */
    private Context f2820b;

    public C3486g(Context context) {
        super(f2819a);
        this.f2820b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3480a
    /* renamed from: f */
    public String mo3766f() {
        try {
            return DeviceConfig.getMac(this.f2820b);
        } catch (Exception e4) {
            if (AnalyticsConstants.UM_DEBUG) {
                e4.printStackTrace();
            }
            UMCrashManager.reportCrash(this.f2820b, e4);
            return null;
        }
    }
}
