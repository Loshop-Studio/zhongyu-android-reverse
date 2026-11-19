package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.d */
/* loaded from: classes2.dex */
public class C3483d extends AbstractC3480a {

    /* renamed from: a */
    private static final String f2803a = "idmd5";

    /* renamed from: b */
    private Context f2804b;

    public C3483d(Context context) {
        super("idmd5");
        this.f2804b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3480a
    /* renamed from: f */
    public String mo3766f() {
        return DeviceConfig.getDeviceIdUmengMD5(this.f2804b);
    }
}
