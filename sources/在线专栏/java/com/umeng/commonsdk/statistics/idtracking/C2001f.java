package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.f */
/* loaded from: classes.dex */
public class C2001f extends AbstractC1996a {

    /* renamed from: a */
    private static final String f9409a = "imei";

    /* renamed from: b */
    private Context f9410b;

    public C2001f(Context context) {
        super("imei");
        this.f9410b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC1996a
    /* renamed from: f */
    public String mo7689f() {
        return DeviceConfig.getImeiNew(this.f9410b);
    }
}
