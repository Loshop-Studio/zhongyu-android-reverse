package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.analytics.pro.C1851ai;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.h */
/* loaded from: classes.dex */
public class C2003h extends AbstractC1996a {

    /* renamed from: a */
    private static final String f9413a = "newumid";

    /* renamed from: b */
    private Context f9414b;

    public C2003h(Context context) {
        super(f9413a);
        this.f9414b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC1996a
    /* renamed from: f */
    public String mo7689f() {
        return UMEnvelopeBuild.imprintProperty(this.f9414b, C1851ai.f8319g, null);
    }
}
