package com.umeng.commonsdk.statistics.idtracking;

import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.k */
/* loaded from: classes2.dex */
public class C3490k extends AbstractC3480a {

    /* renamed from: a */
    private static final String f2832a = "serial";

    public C3490k() {
        super(f2832a);
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3480a
    /* renamed from: f */
    public String mo3766f() {
        return DeviceConfig.getSerial();
    }
}
