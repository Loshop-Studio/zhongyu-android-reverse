package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.bm */
/* loaded from: classes4.dex */
public final class C6464bm extends AbstractC6484m implements Cloneable {

    /* renamed from: c */
    static ArrayList<String> f4832c;

    /* renamed from: a */
    public String f4833a = "";

    /* renamed from: b */
    public ArrayList<String> f4834b = null;

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4497a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4496a(C6483l c6483l) throws UnsupportedEncodingException {
        c6483l.m4579a(this.f4833a, 0);
        ArrayList<String> arrayList = this.f4834b;
        if (arrayList != null) {
            c6483l.m4580a((Collection) arrayList, 1);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4495a(C6482k c6482k) {
        this.f4833a = c6482k.m4560b(0, true);
        if (f4832c == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            f4832c = arrayList;
            arrayList.add("");
        }
        this.f4834b = (ArrayList) c6482k.m4555a((C6482k) f4832c, 1, false);
    }
}
