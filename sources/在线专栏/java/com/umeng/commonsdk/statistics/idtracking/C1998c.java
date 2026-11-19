package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.common.C1991a;
import com.umeng.commonsdk.utils.C2026b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.c */
/* loaded from: classes.dex */
public class C1998c extends AbstractC1996a {

    /* renamed from: a */
    private static final String f9393a = "idfa";

    /* renamed from: b */
    private Context f9394b;

    public C1998c(Context context) {
        super(f9393a);
        this.f9394b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC1996a
    /* renamed from: f */
    public String mo7689f() {
        String strM7624a = FieldManager.allow(C2026b.f9619w) ? C1991a.m7624a(this.f9394b) : null;
        return strM7624a == null ? "" : strM7624a;
    }
}
