package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.C3510b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.l */
/* loaded from: classes2.dex */
public class C3491l extends AbstractC3480a {

    /* renamed from: a */
    private static final String f2833a = "utdid";

    /* renamed from: b */
    private Context f2834b;

    public C3491l(Context context) {
        super(f2833a);
        this.f2834b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3480a
    /* renamed from: f */
    public String mo3766f() {
        try {
            if (FieldManager.allow(C3510b.f3025u)) {
                return (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", Context.class).invoke(null, this.f2834b);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
