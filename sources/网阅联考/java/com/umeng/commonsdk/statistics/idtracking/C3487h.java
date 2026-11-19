package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.h */
/* loaded from: classes2.dex */
public class C3487h extends AbstractC3480a {

    /* renamed from: a */
    private static final String f2821a = "newumid";

    /* renamed from: b */
    private Context f2822b;

    public C3487h(Context context) {
        super(f2821a);
        this.f2822b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3480a
    /* renamed from: f */
    public String mo3766f() {
        return UMEnvelopeBuild.imprintProperty(this.f2822b, C3335ai.f1727g, null);
    }
}
