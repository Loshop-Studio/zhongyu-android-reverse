package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.g */
/* loaded from: classes.dex */
public class C2002g extends AbstractC1996a {

    /* renamed from: a */
    private static final String f9411a = "mac";

    /* renamed from: b */
    private Context f9412b;

    public C2002g(Context context) {
        super(f9411a);
        this.f9412b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC1996a
    /* renamed from: f */
    public String mo7689f() {
        try {
            return DeviceConfig.getMac(this.f9412b);
        } catch (Exception e4) {
            if (AnalyticsConstants.UM_DEBUG) {
                e4.printStackTrace();
            }
            UMCrashManager.reportCrash(this.f9412b, e4);
            return null;
        }
    }
}
