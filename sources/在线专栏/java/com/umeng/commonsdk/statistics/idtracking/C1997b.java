package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.b */
/* loaded from: classes.dex */
public class C1997b extends AbstractC1996a {

    /* renamed from: a */
    private static final String f9391a = "android_id";

    /* renamed from: b */
    private Context f9392b;

    public C1997b(Context context) {
        super(f9391a);
        this.f9392b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC1996a
    /* renamed from: f */
    public String mo7689f() {
        return DeviceConfig.getAndroidId(this.f9392b);
    }
}
