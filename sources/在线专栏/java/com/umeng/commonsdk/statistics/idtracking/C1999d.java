package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.d */
/* loaded from: classes.dex */
public class C1999d extends AbstractC1996a {

    /* renamed from: a */
    private static final String f9395a = "idmd5";

    /* renamed from: b */
    private Context f9396b;

    public C1999d(Context context) {
        super("idmd5");
        this.f9396b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC1996a
    /* renamed from: f */
    public String mo7689f() {
        return DeviceConfig.getDeviceIdUmengMD5(this.f9396b);
    }
}
