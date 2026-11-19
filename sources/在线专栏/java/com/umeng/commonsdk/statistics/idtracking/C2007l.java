package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.p071ut.device.UTDevice;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.C2026b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.l */
/* loaded from: classes.dex */
public class C2007l extends AbstractC1996a {

    /* renamed from: a */
    private static final String f9425a = "utdid";

    /* renamed from: b */
    private Context f9426b;

    public C2007l(Context context) {
        super("utdid");
        this.f9426b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC1996a
    /* renamed from: f */
    public String mo7689f() {
        try {
            if (FieldManager.allow(C2026b.f9617u)) {
                return (String) UTDevice.class.getMethod("getUtdid", Context.class).invoke(null, this.f9426b);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
